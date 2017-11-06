package com.ex.alivio.dao;

import com.ex.alivio.objects.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolDao extends JpaRepository<School, Integer> {

}
