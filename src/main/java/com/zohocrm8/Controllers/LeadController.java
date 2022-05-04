package com.zohocrm8.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm8.Services.LeadSerives;
import com.zohocrm8.entities.Lead;

@Controller
public class LeadController {
@Autowired
private LeadSerives leadServices;
	
	@RequestMapping("/view")
	public String viewLeadPage() {
		return "create_Lead";
	}
	@RequestMapping("savelead")
	public String saveLead(@ModelAttribute()Lead lead,ModelMap model) {
		leadServices.saveLead(lead);
		model.addAttribute("lead", lead);
		return "view_Lead";
	}
	@RequestMapping("listAllLeads")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadServices.getAllLeads();
		model.addAttribute("leads", leads);
		return "All_Leads";
	}
	@RequestMapping("getById")
	public String getById(@RequestParam("id") int id,ModelMap model) {
		Lead lead=leadServices.getById(id);
		model.addAttribute("lead", lead);
		return "view_Lead";
	}
}
