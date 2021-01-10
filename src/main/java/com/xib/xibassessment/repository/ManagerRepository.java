package com.xib.xibassessment.repository;


import com.xib.xibassessment.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository  extends JpaRepository<Manager, Long> {
}
