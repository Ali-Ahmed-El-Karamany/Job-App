package com.app.JobApp.service;

import com.app.JobApp.model.JobPost;
import com.app.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost newJobPost){
        repo.addJob(newJobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }

}
