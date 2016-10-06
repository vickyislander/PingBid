package com.pingbid.databaseRepositories;

import com.pingbid.databaseModel.Contact;
import com.pingbid.databaseModel.Lead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by rvignesh on 9/28/2016.
 */

@Repository
public interface LeadRepository extends JpaRepository<Lead,Integer> {

    List<Contact> findByLeadIDOrderById(String leadid);
}
