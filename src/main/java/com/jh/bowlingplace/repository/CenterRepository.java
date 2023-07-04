package com.jh.bowlingplace.repository;
import com.jh.bowlingplace.domain.CenterDomain;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CenterRepository {
    List<CenterDomain> getList();

    CenterDomain get(int centerId);

    void save(CenterDomain centerDomain);

    void update(CenterDomain centerDomain);

    void delete(int centerId);
}
