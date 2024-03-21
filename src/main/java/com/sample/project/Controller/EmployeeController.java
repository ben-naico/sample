package com.sample.project.Controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name = "Employee Controller", description = "Endpoints for managing employeee")
@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {

    @GetMapping("/getAll")
    public String getAllEmployeeData(){
        String str = "Hello";
        return  str;
    }
}
