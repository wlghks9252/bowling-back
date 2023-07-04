package com.jh.bowlingplace.repository;
import com.jh.bowlingplace.domain.GoodsDomain;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsRepository {

    List<GoodsDomain> getList();
    List<GoodsDomain> getGoodsListByCenterId(int centerId);

    GoodsDomain get(int capsuleId);

    void save(GoodsDomain goodsDomain);

    void delete(int goodsId);

}
