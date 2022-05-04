package com.zohocrm8.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zohocrm8.entities.Lead;

@Service
public interface LeadSerives {
public void saveLead(Lead lead);

public List<Lead> getAllLeads();

public Lead getById(int id);

public void deleteLead(int id);
}
