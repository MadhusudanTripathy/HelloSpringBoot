package com.mst.HelloSpringBoot.service;

import com.mst.HelloSpringBoot.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getALlCourses();
    public Course getCourseById(int id);
    public String addCourse(Course course);
    public String updateCourse(int id,Course course);
    public String deleteCourseById(int id);
    public String deleteAllCourses();
}
