package com.jh.bowlingplace.service;

import com.jh.bowlingplace.domain.ClubDomain;
import com.jh.bowlingplace.repository.ClubRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClubService {

    private final ClubRepository clubRepository;

    public ClubService(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    public List<ClubDomain> getList() {
        return clubRepository.getList();
    }

    public ClubDomain get(int clubId) {
        return clubRepository.get(clubId);
    }
    public List<ClubDomain> getClubListByCenterId(int centerId) {
        return clubRepository.getClubListByCenterId(centerId);
    }
    public void save(ClubDomain clubDomain) {
        clubRepository.save(clubDomain);
    }

    public void update(ClubDomain clubDomain) {
        clubRepository.update(clubDomain);
    }

    public void delete(int clubId) {
        clubRepository.delete(clubId);
    }
}
