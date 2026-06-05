package com.app.spring_boot_rest.repo;


import com.app.spring_boot_rest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(
                    1,
                    "Java Developer",
                    "We are looking for a skilled Java Developer with strong experience in core and advanced Java. The ideal candidate should be proficient in building scalable backend systems, RESTful APIs, and working with modern frameworks. Experience with databases, performance optimization, and clean code practices is highly valued.",
                    2,
                    List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
            new JobPost(
                    2,
                    "Frontend Developer",
                    "Seeking a creative Frontend Developer with experience in building responsive and user-friendly web interfaces. The candidate should be comfortable working with modern JavaScript frameworks and have a good eye for UI/UX design.",
                    1,
                    List.of("HTML", "CSS", "JavaScript", "React")),

            new JobPost(
                    3,
                    "Backend Developer",
                    "Looking for a Backend Developer to design and develop robust server-side applications. The candidate should have experience with APIs, databases, and system architecture, with a focus on performance and scalability.",
                    2,
                    List.of("Java", "Spring Boot", "REST APIs", "MySQL")),
            new JobPost(
                    4,
                    "DevOps Engineer",
                    "We are hiring a DevOps Engineer to streamline our development and deployment processes. The ideal candidate should have experience with CI/CD pipelines, cloud platforms, and containerization technologies.",
                    3,
                    List.of("Docker", "Kubernetes", "Jenkins", "AWS")),
            new JobPost(
                    5,
                    "Mobile App Developer",
                    "Seeking a Mobile App Developer with experience in building high-quality Android or cross-platform applications. The candidate should be familiar with mobile UI design, performance optimization, and API integration.",
                    2,
                    List.of("Android", "Kotlin", "Flutter", "REST APIs"))
    ));

    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost newJobPost){
        jobs.add(newJobPost);
    }

    public JobPost getJob(int postId) {
        for(JobPost job : jobs){
            if(job.getPostId() == postId)
                return job;
        }
        return null;
    }


    public void updateJob(JobPost jobPost) {
        for(JobPost job : jobs){
            if(job.getPostId() == jobPost.getPostId()){
                job.setPostProfile(jobPost.getPostProfile());
                job.setPostDesc(jobPost.getPostDesc());
                job.setReqExperience(jobPost.getReqExperience());
                job.setPostTechStack(jobPost.getPostTechStack());
            }
        }

    }

    public void deleteJob(int postId) {
        for(JobPost job : jobs){
            if(job.getPostId() == postId)
                jobs.remove(job);
        }
    }
}
