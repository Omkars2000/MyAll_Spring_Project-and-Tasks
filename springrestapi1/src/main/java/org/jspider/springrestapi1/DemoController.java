package org.jspider.springrestapi1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {
    @GetMapping("/welcome")
    public String getInfo(){
        return "welcome to REST PLATFORM";
    }
    @RequestMapping("/courses")
    public List<String> getLanguages(){
        List<String> data=new ArrayList<>();
        data.add("JAVA");
        data.add("PYTHON");
        data.add("PHP");
        return data;
    }
}
