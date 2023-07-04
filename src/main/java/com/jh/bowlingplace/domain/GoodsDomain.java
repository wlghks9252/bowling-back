package com.jh.bowlingplace.domain;

import lombok.Data;


@Data
public class GoodsDomain {
    private int goodsId;
    private int centerId;
    private int capsuleId;
    private String goodsName;
    private String capsuleScore;
}
