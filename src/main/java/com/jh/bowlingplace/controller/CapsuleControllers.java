package com.jh.bowlingplace.controller;

import com.jh.bowlingplace.domain.CapsuleDomain;
import com.jh.bowlingplace.service.CapsuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/capsule")
public class CapsuleControllers {
    private final CapsuleService capsuleService;

    public CapsuleControllers(CapsuleService capsuleService) {
        this.capsuleService = capsuleService;
    }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @GetMapping
    public List<CapsuleDomain> getList() {
        return capsuleService.getList();
    }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @GetMapping("/{capsuleId}")
    public CapsuleDomain get(@PathVariable int capsuleId) {
        return capsuleService.get(capsuleId);
    }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @PostMapping
    public void save(@RequestBody CapsuleDomain capsuleDomain ) {
        capsuleService.save(capsuleDomain);
    }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @PutMapping
    public void update(@RequestBody CapsuleDomain capsuleDomain) {
        capsuleService.update(capsuleDomain);
    }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @DeleteMapping
    public void delete(@RequestBody List<Integer> capsuleIds) {
        for(int capsuleId : capsuleIds) {
            capsuleService.delete(capsuleId);
        }
    }
}
