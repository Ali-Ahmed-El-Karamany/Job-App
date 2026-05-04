package com.app.JobApp;


import com.app.JobApp.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {

    @GetMapping({"/", "/home"})
    public String home(){
        return "home";
    }

    @GetMapping("/addJob")
    public String addJob(){
        return "addJob";
    }

    @PostMapping("/handleForm")
    public String handleFrom(JobPost jobPost){
        return "success";
    }

}
