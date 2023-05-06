package org.jspiders.courseapi1.service;

import org.jspiders.courseapi1.model.Course;
import org.jspiders.courseapi1.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository repository;

    public void addCourse(Course c){
        repository.save(c);
    }

    public List<Course> getAllCourses() {
        List<Course> courseList=repository.findAll();
        return courseList;
    }

    public void updateCourse(Course c){

        repository.save(c);
    }

    public void deleteCourse(int id){

        repository.deleteById(id);
    }
}
