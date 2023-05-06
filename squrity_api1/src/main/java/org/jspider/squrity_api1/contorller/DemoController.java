package org.jspider.squrity_api1.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String getMessage(){
        return "<h1>welcome to app</h1>";
    }

    @GetMapping("/admin")
    public String getInfo(){
        return "<h1>WELCOME ADMIN</h1>";
    }

    @GetMapping("/employee")
    public String getEmp(){
        return "<h1>WELCOME EMPLOYEE</h1>";
    }




}
