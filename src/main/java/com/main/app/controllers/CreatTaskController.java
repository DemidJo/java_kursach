package com.main.app.controllers;

import com.main.app.models.Task;
import com.main.app.repo.TaskRepository;
import com.main.app.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.sql.Date;
import java.util.Calendar;

@Controller
public class CreatTaskController {
    @Autowired
    TaskRepository taskRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/creatTask")
    public String creat() {
        return "task/task-creat";
    }

    @PostMapping("/creatTask")
    public String creatPost(Model model, @RequestParam String name, @RequestParam String fullText, @RequestParam String count, @RequestParam String observer) {

        String currentUserName = SecurityContextHolder.getContext().getAuthentication().getName();

        if (userRepository.findByUsername(observer) == null && !(observer.equals(""))) {
            model.addAttribute("error", "Укажите корректное имя заведующего");
            return "task/task-creat";
        }
        if (name.equals("")) {
            model.addAttribute("error", "Вы не ввели наименование оборудования");
            return "task/task-creat";
        }
        if (count.equals("")) {
            model.addAttribute("error", "Вы не ввели количество оборудования");
            return "task/task-creat";
        }
        if (fullText.equals("")) {
            model.addAttribute("error", "Вы не добавили описание");
            return "task/task-creat";
        }

        Task task = new Task(name, "Подтвержден", currentUserName, fullText, observer, count, new java.sql.Date(Calendar.getInstance().getTime().getTime()), userRepository.findByUsername(currentUserName));
        taskRepository.save(task);
        return "redirect:/personal";
    }
}
