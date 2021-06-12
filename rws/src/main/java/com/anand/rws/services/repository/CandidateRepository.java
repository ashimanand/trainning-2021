	package com.anand.rws.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anand.rws.services.entity.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Long>{

}
