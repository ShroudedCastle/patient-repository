package com.rwj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientRepositoryController {

    @RequestMapping(
            value = "/search/{email}",
            method = RequestMethod.GET
    )
    public String searchPatientEmail() {

        return "Email Search!";
    }

    @RequestMapping(
            value = "/search/{lastName}/{dob}",
            method = RequestMethod.GET
    )
    public String searchPatientNameDOB() {

        return "Last Name & DoB Search!";
    }
}
