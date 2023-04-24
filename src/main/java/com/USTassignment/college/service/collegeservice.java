package com.USTassignment.college.service;

import com.USTassignment.college.entity.college;
import com.USTassignment.college.repository.collegerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class collegeservice {

    @Autowired
    private collegerepository collegeRepository;

    public college addCollege(college college) {
        // Implement your logic to add a college
        // e.g., setting additional attributes, validating data, etc.
        return collegeRepository.save(college);
    }

    public List<college> getAllColleges() {
        // Implement your logic to retrieve all colleges
        return collegeRepository.findAll();
    }

    public college getCollegeById(Long id) {
        // Implement your logic to retrieve a college by id
        return collegeRepository.findById(id).orElse(null);
    }

    public college getCollegeByName(String name) {
        // Implement your logic to retrieve a college by name
        return collegeRepository.findByName(name);
    }

    public college updateCollegeName(Long id, String name) {
        // Implement your logic to update the name of a college by id
        college college = collegeRepository.findById(id).orElse(null);
        if (college != null) {
            college.setName(name);
            return collegeRepository.save(college);
        }
        return null;
    }

    public void deleteCollege(Long id) {
        // Implement your logic to delete a college by id
        collegeRepository.deleteById(id);
    }


}
