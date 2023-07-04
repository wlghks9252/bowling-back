package com.jh.bowlingplace.controller;

import com.jh.bowlingplace.domain.GoodsDomain;
import com.jh.bowlingplace.service.GoodsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsControllers {
    private final GoodsService goodsService;

    public GoodsControllers(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @GetMapping
    public List<GoodsDomain> getList() {
        return goodsService.getList();
    }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @GetMapping("/by{centerId}")
    public List<GoodsDomain> getGoodsListByCenterId(@PathVariable int centerId) {
        return goodsService.getGoodsListByCenterId(centerId);
    }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @GetMapping("/{capsuleId}")
    public GoodsDomain get(@PathVariable int capsuleId) {
        return goodsService.get(capsuleId);
    }

    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @PostMapping
    public void save(@RequestBody GoodsDomain goodsDomain) {
        goodsService.save(goodsDomain);
    }


    @CrossOrigin(origins = "http://175.197.92.213:11002")
    @DeleteMapping("/{goodsId}")
    public void delete(@PathVariable int goodsId) {
            goodsService.delete(goodsId);
    }
}
