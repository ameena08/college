package com.USTassignment.college.controller;

import com.USTassignment.college.entity.college;
import com.USTassignment.college.service.collegeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class collegecontroller {
    @Autowired
    private collegeservice collegeservice;

    @PostMapping("/")
    public college add(@RequestBody college college) {

        return collegeservice.create(college);
    }
    @GetMapping("/get")
    public List<college> getAll() {
        return collegeservice.get();
    }

    @GetMapping("/get/{cId}")
    public college getCollegeById(@PathVariable int cId) {

        return collegeservice.findByCId(cId);
    }
    @GetMapping("/get/{name}")
    public college getCollegeByName(@PathVariable String name) {

        return collegeservice.findByName(name);
    }
//    @PutMapping("/get/{name}")
//    public college getCollegeByName(@PathVariable String name) {
//
//        return collegeservice.findByName(name);
//    }


}
