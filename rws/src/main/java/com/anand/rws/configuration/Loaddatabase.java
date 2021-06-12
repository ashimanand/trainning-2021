package com.anand.rws.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.anand.rws.services.entity.Candidate;
import com.anand.rws.services.repository.CandidateRepository;

@Configuration
public class Loaddatabase {
	
	// private static final Logger log = LoggerFactory.getLogger(Loaddatabase.class);

	  @Bean
	  CommandLineRunner initDatabase( CandidateRepository repository) {

	    return args -> {
	   System.out.println("Preloading " + repository.save(new Candidate("Bilbo Baggins", "burglar")));
	   System.out.println("Preloading " + repository.save(new Candidate("Frodo Baggins", "thief")));
	    };
	  }

}
