package com.jh.bowlingplace.controller;

import com.jh.bowlingplace.domain.ClubDomain;
import com.jh.bowlingplace.service.ClubService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/club")
public class ClubControllers {
    private final ClubService clubService;

    public ClubControllers(ClubService clubService) {
        this.clubService = clubService;
    }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @GetMapping
    public List<ClubDomain> getList() {
        return clubService.getList();
    }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @GetMapping("/{clubId}")
    public ClubDomain get(@PathVariable int clubId) {
        return clubService.get(clubId);
    }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @GetMapping("/by{centerId}")
    public List<ClubDomain> getClubListByCenterId(@PathVariable int centerId) {
        return clubService.getClubListByCenterId(centerId);
    }

   @CrossOrigin(origins = "http://175.197.92.213:11002")
   @PostMapping
   public void save(@RequestBody ClubDomain clubDomain) {
       clubService.save(clubDomain);
   }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @PutMapping
    public void update(@RequestBody ClubDomain clubDomain) {
        clubService.update(clubDomain);
    }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @DeleteMapping
    public void delete(@RequestBody List<Integer> clubIds) {
        for(int clubId : clubIds) {
            clubService.delete(clubId);
        }
    }
}
