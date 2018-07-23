package com.kayode.adechinan.sbonop;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class OpenShiftController {

    @GetMapping
    public String index(){
        return "hello openshift";
    }

}
