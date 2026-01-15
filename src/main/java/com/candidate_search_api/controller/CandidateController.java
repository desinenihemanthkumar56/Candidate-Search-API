package com.candidate_search_api.controller;

import com.candidate_search_api.dto.CandidateDTO;
import com.candidate_search_api.service.CandidateService;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")
@RequiredArgsConstructor
@Validated
public class CandidateController {

    private final CandidateService candidateService;

    @GetMapping
    public List<CandidateDTO> searchCandidates(
            @RequestParam @NotBlank String fullName
    ) {
        return candidateService.searchByFullName(fullName);
    }
}
