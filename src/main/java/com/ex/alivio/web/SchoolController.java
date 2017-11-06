package com.ex.alivio.web;


import com.ex.alivio.objects.School;

import com.ex.alivio.services.SchoolService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path="/school")
public class SchoolController {

    @Autowired
    SchoolService service;


    @RequestMapping(path="/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllSchools(){
        ObjectMapper mapper = new ObjectMapper();
        List<School> list =  service.findAll();
        String ret = null;

        try{
            ret= mapper.writeValueAsString(list);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
        return ret;
    }
}
