package com.mst.HelloSpringBoot.controller;

import com.mst.HelloSpringBoot.entities.Course;
import com.mst.HelloSpringBoot.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class MyController {
    @Autowired
    CourseServiceImpl courseService;

    @GetMapping("/")
    public List<Course> getAllCourses(){
        return courseService.getALlCourses();
    }
    @PostMapping("/")
    public String addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @DeleteMapping("/")
    public String deleteCourse(){
        return courseService.deleteAllCourses();
    }
    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable int id){
        return courseService.getCourseById(id);
    }


    @PutMapping("/{id}")
    public String updateCourse(@PathVariable int id,@RequestBody Course course){
        return courseService.updateCourse(id,course);
    }

    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable int id){
        return courseService.deleteCourseById(id);
    }
}
