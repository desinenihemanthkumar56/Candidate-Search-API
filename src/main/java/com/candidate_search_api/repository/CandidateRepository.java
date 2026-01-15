package com.candidate_search_api.repository;

import com.candidate_search_api.dto.CandidateDTO;
import com.candidate_search_api.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {

    @Query("""
        SELECT new com.candidate_search_api.dto.CandidateDTO(c.fullName, c.email)
        FROM Candidate c
        WHERE c.fullName = :fullName
    """)
    List<CandidateDTO> findByFullNameExact(@Param("fullName") String fullName);
}
