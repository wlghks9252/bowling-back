package com.jh.bowlingplace.service;
import com.jh.bowlingplace.repository.CenterRepository;
import com.jh.bowlingplace.domain.CenterDomain;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CenterService {

    private final CenterRepository centerRepository;

    public CenterService(CenterRepository centerRepository) {
        this.centerRepository = centerRepository;
    }

    public List<CenterDomain> getList() {
        return centerRepository.getList();
    }

    public CenterDomain get(int centerId) {
        return centerRepository.get(centerId);
    }

    public void save(CenterDomain centerDomain) {
        centerRepository.save(centerDomain);
    }

    public void update(CenterDomain centerDomain) {
        centerRepository.update(centerDomain);
    }

    public void delete(int centerId) {
        centerRepository.delete(centerId);
    }
}
