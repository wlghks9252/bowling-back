package com.jh.bowlingplace.service;

import com.jh.bowlingplace.domain.GoodsDomain;
import com.jh.bowlingplace.repository.GoodsRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GoodsService {

    private final GoodsRepository goodsRepository;

    public GoodsService(GoodsRepository goodsRepository) {
        this.goodsRepository = goodsRepository;
    }

    public List<GoodsDomain> getList() {
        return goodsRepository.getList();
    }
    public List<GoodsDomain> getGoodsListByCenterId(int capsuleId) {
        return goodsRepository.getGoodsListByCenterId(capsuleId);
    }

    public GoodsDomain get(int capsuleId) {
        return goodsRepository.get(capsuleId);
    }

    public void save(GoodsDomain goodsDomain) {
            goodsRepository.save(goodsDomain);
    }
    public void delete(int goodsId) {
        goodsRepository.delete(goodsId);
    }
}
