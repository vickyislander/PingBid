package com.pingbid.services;

import com.pingbid.PingbidApplication;
import com.pingbid.databaseModel.Lead;
import com.pingbid.databaseRepositories.ContactRepository;
import com.pingbid.databaseRepositories.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by rvignesh on 10/12/2016.
 */

@Service
public class Leadservice {

    private LeadRepository leadRepository;

    @Autowired

    public Leadservice(LeadRepository leadRepository) {
        this.leadRepository = leadRepository;
    }

    @PostConstruct
    public void init() {
        this.findAll();
        //scheduleUpdateAsync();
    }

    @Cacheable(value = PingbidApplication.CACHE_LEAD,
            key = "#lead.LeadID")
    public List<Lead> findByLeadid(String leadid){
        return leadRepository.findByLeadIDOrderById(leadid);
    }

    @Cacheable(value = PingbidApplication.CACHE_LEAD,
            key = "#lead.id")
    public List<Lead> findAll(){
        return leadRepository.findAll();
    }

    @Cacheable(value = PingbidApplication.CACHE_LEAD,
            key = "#lead.id")
    public Lead findOne(Integer id){
        return leadRepository.findOne(id);
    }

    @CachePut(value = PingbidApplication.CACHE_LEAD,
            key = "#lead.id")
    @Transactional
    public Lead save(Lead lead){
        return leadRepository.save(lead);
    }

    @CachePut(value = PingbidApplication.CACHE_LEAD,
            key = "#lead.id")
    @Transactional
    public Lead update(Lead lead){
        return leadRepository.save(lead);
    }

    @CacheEvict(value = PingbidApplication.CACHE_LEAD,
            key = "#lead.id")
    @Transactional
    public void delete(Integer id){
         leadRepository.delete(id);
    }

    @CacheEvict(value = PingbidApplication.CACHE_LEAD,
            allEntries = true)
    public void evictCache() {

    }




}
