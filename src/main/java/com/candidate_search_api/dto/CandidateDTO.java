package com.candidate_search_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CandidateDTO {
    private String fullName;
    private String email;
}
