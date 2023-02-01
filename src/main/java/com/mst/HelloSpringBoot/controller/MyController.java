package com.mst.HelloSpringBoot.controller;

import com.mst.HelloSpringBoot.entities.Course;
import com.mst.HelloSpringBoot.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class MyController {
    @Autowired
    CourseServiceImpl courseService;

    @GetMapping("/")
    public ResponseEntity<List<Course>> getAllCourses(){
        return new ResponseEntity<>(courseService.getALlCourses(), HttpStatus.OK);
    }
    @PostMapping("/")
    public ResponseEntity<String> addCourse(@RequestBody Course course){
        return new ResponseEntity<>(courseService.addCourse(course),HttpStatus.CREATED);
    }

    @DeleteMapping("/")
    public ResponseEntity<String> deleteCourse(){
        return new ResponseEntity<>(courseService.deleteAllCourses(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable int id){
        return new ResponseEntity<>(courseService.getCourseById(id),HttpStatus.OK);
    }


    @PutMapping("/{id}")
    public ResponseEntity<String> updateCourse(@PathVariable int id,@RequestBody Course course){
        return new ResponseEntity<>(courseService.updateCourse(id,course),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable int id){
        return new ResponseEntity<>(courseService.deleteCourseById(id),HttpStatus.OK);
    }
}
