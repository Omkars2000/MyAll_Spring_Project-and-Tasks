package org.jspider.taskcourseapi.service;

import org.jspider.taskcourseapi.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@Service
public class CourseService {
    List<Course> courseList=new ArrayList<>();
    {
        courseList.add(new Course("1CCA1","JAVA","AKSHAYSIR",80));
        courseList.add(new Course("1EJA","J2EE","AKSHAYSIR",40));
        courseList.add(new Course("1CDA","SQL","YEKTAMAM",55));
        courseList.add(new Course("1CCA2","JAVA","ISHAMAM",80));
    }

    public List<Course>getAllCourse() {
        return courseList;
    }

    public Course getByBatchCode(String batchCode) {
         return courseList.get(getIndexByBatchCode(batchCode));
    }

    public int getIndexByBatchCode(String batchCode){
        for (int i = 0; i < courseList.size(); i++) {
            Course c1=courseList.get(i);
            if(c1.getBatchCode().equals(batchCode)){
                return i;
            }
        }
        return -1;
    }

    public HashSet<String> getNameOfAllFaculty() {
        HashSet<String >names=new HashSet<>();
        for (int i = 0; i < courseList.size() ; i++) {
            Course c1= courseList.get(i);
            names.add(c1.getFaculty());
        }
        return names;
    }

    public List<String> getAllBatchCodeSpecificF(String faculty) {
        List<String >batchCode=new ArrayList<>();
        for (int i = 0; i < courseList.size() ; i++) {
            Course c1= courseList.get(i);
            if(c1.getFaculty().equals(faculty)){
                batchCode.add(c1.getBatchCode());
            }
        }
        return batchCode;
        }


    public List<Course> getMoreT50() {
        List<Course> courses=new ArrayList<>();
        for (int i = 0; i < courseList.size(); i++) {
            Course c1= courseList.get(i);
            if(c1.getTotalClasses()>50){
                courses.add(c1);
            }
        }
        return courses;
    }

    public void addCoures(Course c) {
        courseList.add(c);
    }

    public void deleteCourse(String batchCode) {
        courseList.remove(getIndexByBatchCode(batchCode));
    }
}

