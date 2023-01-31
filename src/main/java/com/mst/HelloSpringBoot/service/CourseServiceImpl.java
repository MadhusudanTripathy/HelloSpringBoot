package com.mst.HelloSpringBoot.service;

import com.mst.HelloSpringBoot.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{
    List<Course> courseList;
    HashMap<Integer,Course> courseHashMap;
    public CourseServiceImpl() {
        courseHashMap = new HashMap<>();
        courseHashMap.put(1, new Course(1,"Java Full Stack All In One","Get Java Done"));
        courseHashMap.put(2, new Course(2,"JavaScript A to Z","Get JS Done"));
        courseHashMap.put(3, new Course(3,"Master reactJS","Get React Done"));
    }


    @Override
    public List<Course> getALlCourses() {
        return courseHashMap.values().stream().toList();
    }

    @Override
    public Course getCourseById(int id) {
        return courseHashMap.get(id);
    }

    @Override
    public String addCourse(Course course) {
        courseHashMap.put(course.getId(),course);
        return "New Course Added";
    }

    @Override
    public String updateCourse(int id,Course course) {
        courseHashMap.put(id,course);
        return "Course Updated";
    }

    @Override
    public String deleteCourseById(int id) {
        courseHashMap.remove(id);
        return "Course With id: "+id+" Deleted Succesfully";
    }

    @Override
    public String deleteAllCourses() {
        courseHashMap.clear();
        return "All Courses Deleted Succesfully";
    }
}
