package com.jh.bowlingplace.repository;
import com.jh.bowlingplace.domain.CapsuleDomain;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CapsuleRepository {
    List<CapsuleDomain> getList();

    CapsuleDomain get(int capsuleId);

    void save(CapsuleDomain capsuleDomain);

    void update(CapsuleDomain capsuleDomain);

    void delete(int capsuleId);

}
