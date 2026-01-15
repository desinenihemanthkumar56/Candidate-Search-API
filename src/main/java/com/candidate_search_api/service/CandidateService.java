package com.candidate_search_api.service;

import com.candidate_search_api.dto.CandidateDTO;
import com.candidate_search_api.repository.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CandidateService {

    private final CandidateRepository candidateRepository;

    public List<CandidateDTO> searchByFullName(String fullName) {
        return candidateRepository.findByFullNameExact(fullName);
    }
}
