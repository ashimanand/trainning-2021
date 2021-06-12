package com.anand.rws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anand.rws.services.dto.Candidate;
import com.anand.rws.services.repository.CandidateRepository;

import antlr.collections.List;

@RestController
public class JobSeekerService {
	
	@Autowired
	CandidateRepository repo;
	
	@GetMapping(path="jobseeker")
	public Candidate name(@RequestParam String name) {
		
		
		return new Candidate(name, 30, 2011);
		
		
		
	}
	
	@GetMapping(path="jobseekers")
	public java.util.List<com.anand.rws.services.entity.Candidate> data() {
		
		
		return repo.findAll();
		
		
		
	}

}
