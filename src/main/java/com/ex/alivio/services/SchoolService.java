package com.ex.alivio.services;

import com.ex.alivio.dao.SchoolDao;
import com.ex.alivio.objects.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SchoolService implements Services<School> {

    @Autowired
    SchoolDao dao;

    @Override
    public School findOne(School school) {
        return dao.findOne(school.getSchoolId());
    }

    @Override
    public School insert(School school) {
        return dao.save(school);
    }

    @Override
    public School delete(School school) {
        dao.delete(school);
        return school;
    }

    @Override
    public School update(School school) {
        return dao.save(school);
    }

    public List<School> findAll(){
        return dao.findAll();
    }
}
