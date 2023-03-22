package com.doctor.registerdoc.dao;

import com.doctor.registerdoc.model.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface DocDAO extends CrudRepository<Doctor,Long> {
}
