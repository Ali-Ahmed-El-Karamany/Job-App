package com.app.JobApp;


import com.app.JobApp.model.JobPost;
import com.app.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping({"/", "/home"})
    public String home(){
        return "home";
    }

    @GetMapping("/addJob")
    public String addJob(){
        return "addJob";
    }

    @PostMapping("/handleForm")
    public String handleFrom(JobPost newJobPost){
        service.addJob(newJobPost);
        return "success";
    }


    @GetMapping("viewAllJobs")
    public String viewJobs(Model model){
        List<JobPost> jobs = service.getAllJobs();
        model.addAttribute("jobPosts", jobs);
        return"viewAllJobs";
    }

}
