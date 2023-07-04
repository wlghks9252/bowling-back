package com.jh.bowlingplace.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;


@Data
public class CapsuleDomain {
    private int capsuleId;
    private int centerId;
    private String centerName;
    private String capsuleSdate;
    private int capsuleScore;

}
