package com.jh.bowlingplace.repository;
import com.jh.bowlingplace.domain.ClubDomain;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClubRepository {
    List<ClubDomain> getList();

    ClubDomain get(int clubId);

    List<ClubDomain> getClubListByCenterId(int centerId);

    void save(ClubDomain clubDomain);

    void update(ClubDomain clubDomain);

    void delete(int clubId);

}
