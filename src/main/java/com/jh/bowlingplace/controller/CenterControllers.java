package com.jh.bowlingplace.controller;
import com.jh.bowlingplace.domain.CenterDomain;
import com.jh.bowlingplace.service.CenterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/center")
public class CenterControllers {

    private final CenterService centerService;

    public CenterControllers(CenterService centerService) {
        this.centerService = centerService;
    }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @GetMapping
    public List<CenterDomain> getList() {
        return centerService.getList();
    }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @GetMapping("/{centerId}")
    public CenterDomain get(@PathVariable int centerId) {
        return centerService.get(centerId);
    }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @PostMapping
    public void save(@RequestBody CenterDomain centerDomain) {
        centerService.save(centerDomain);
    }
    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @PutMapping
    public void update(@RequestBody CenterDomain centerDomain) {
        centerService.update(centerDomain);
    }
    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @DeleteMapping
    public void delete(@RequestBody List<Integer> centerIds) {
        for(int centerId : centerIds) {
            centerService.delete(centerId);
        }
    }
}
