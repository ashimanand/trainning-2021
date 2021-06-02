package com.anand.rws.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anand.rws.services.dto.Candidate;

@RestController
public class JobSeekerService {
	
	@GetMapping(path="jobseeker")
	public Candidate name(@RequestParam String name) {
		
		
		return new Candidate(name, 30, 2011);
		
		
		
	}

}
