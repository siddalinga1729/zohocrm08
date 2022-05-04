package com.zohocrm8.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm8.Repositories.LeadRepository;
import com.zohocrm8.entities.Lead;
@Service
public class LeadServicesImpl implements LeadSerives {
@Autowired
private LeadRepository leadRepo;//class downcasting is done here
	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
	}
	@Override
	public List<Lead> getAllLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}
	@Override
	public Lead getById(int id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
	@Override
	public void deleteLead(int id) {
		leadRepo.deleteById(id);
	}

}
