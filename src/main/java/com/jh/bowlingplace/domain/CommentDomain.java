package com.jh.bowlingplace.domain;

import lombok.Data;


@Data
public class CommentDomain {
    private int centerId;
    private int comNo;
    private String comId;
    private String comPw;
    private String comContent;

}
