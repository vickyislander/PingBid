package com.pingbid.databaseRepositories;

import com.pingbid.databaseModel.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by rvignesh on 9/28/2016.
 */
@Repository
public interface ContactRepository  extends JpaRepository<Contact, Integer> {

    List<Contact> findBySsn(String ssn);

}
