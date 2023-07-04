package com.jh.bowlingplace.service;

import com.jh.bowlingplace.domain.CapsuleDomain;
import com.jh.bowlingplace.repository.CapsuleRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CapsuleService {

    private final CapsuleRepository capsuleRepository;

    public CapsuleService(CapsuleRepository capsuleRepository) {
        this.capsuleRepository = capsuleRepository;
    }

    public List<CapsuleDomain> getList() {
        return capsuleRepository.getList();
    }

    public CapsuleDomain get(int capsuleId) {
        return capsuleRepository.get(capsuleId);
    }

    public void save(CapsuleDomain capsuleDomain) {
        capsuleRepository.save(capsuleDomain);
    }

    public void update(CapsuleDomain capsuleDomain) {
        capsuleRepository.update(capsuleDomain);
    }
    public void delete(int capsuleId) {
        capsuleRepository.delete(capsuleId);
    }
}
