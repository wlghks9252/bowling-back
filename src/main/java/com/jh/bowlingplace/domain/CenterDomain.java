package com.jh.bowlingplace.domain;

import lombok.Data;
import lombok.NonNull;

import java.time.LocalTime;
@Data
public class CenterDomain {
    private int centerId;
    private String centerName;
    private LocalTime startTime;
    private LocalTime endTime;
    private String centerAddress;
    private String centerTel;
    private double centerLat;
    private double centerLon;
    private int norPrice;
    private int memPrice;

}
