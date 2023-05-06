package org.jspider.taskcourseapi.controller;

import javafx.geometry.Pos;
import org.jspider.taskcourseapi.service.CourseService;
import org.springframework.web.bind.annotation.*;
import org.jspider.taskcourseapi.model.Course;

import java.util.HashSet;
import java.util.List;

@RestController
public class Controller {
    CourseService service=new CourseService();
    @GetMapping("/courses")
    public List<Course> getAllCourse(){
        return service.getAllCourse();
    }
    @GetMapping("/courses/{batchCode}")
    public Course getByBatchCode(@PathVariable(value = "batchCode") String batchCode){
        return service.getByBatchCode( batchCode);
    }
    @GetMapping("/courses/allfaculty")
    public HashSet<String> getNameOfAllFaculty(){
        return service.getNameOfAllFaculty();
    }
    @GetMapping("/courses/specificF/{f1}")
    public List<String > getAllBatchCodeSpecificF(@PathVariable(value = "f1") String faculty){
        return service.getAllBatchCodeSpecificF(faculty);
    }
    @GetMapping("/courses/more")
    public List<Course> getMore50(){
        return service.getMoreT50();
    }
    @PostMapping("/courses/add")
    public void Add(@RequestBody Course c){
        service.addCoures(c);
    }
    @DeleteMapping("/courses/{batchCode}")
    public void deleteCoure(@PathVariable(value = "batchCode") String batchCode){
         service.deleteCourse(batchCode);
    }

}
