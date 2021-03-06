package com.pingbid.databaseRepositories;

import com.pingbid.databaseModel.Lead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * Created by rvignesh on 9/28/2016.
 */

@Repository
public interface LeadRepository extends JpaRepository<Lead,Integer> {

    List<Lead> findByLeadIDOrderById(String leadid);

    Lead findOne(Integer id);

    List<Lead> findAll();

    Lead save(Lead lead);

    void delete(Integer id);

    //void evictCache();



}
