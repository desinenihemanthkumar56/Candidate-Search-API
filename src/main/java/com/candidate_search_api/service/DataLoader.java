//package com.candidate_search_api.service;
//
//import com.candidate_search_api.entity.Candidate;
//import com.candidate_search_api.repository.CandidateRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//@RequiredArgsConstructor
//public class DataLoader implements CommandLineRunner {
//
//    private final CandidateRepository repo;
//
//    @Override
//    public void run(String... args) {
//        repo.save(Candidate.builder().fullName("hemanth").email("hemanth.1@example.com").build());
//        repo.save(Candidate.builder().fullName("hemanth").email("hemanth_dhk.2@example.com").build());
//        repo.save(Candidate.builder().fullName("hemanth ").email("hemanth.d@example.com").build());
//    }
//}
