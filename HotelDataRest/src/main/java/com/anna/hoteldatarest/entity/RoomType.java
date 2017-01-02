package com.anna.hoteldatarest.entity;

import lombok.Getter;

@Getter
public enum RoomType {
    LUX("Lux"),
    BUSINESS_LUX("Business lux"),
    ECONOM("Econom"),
    STANDART("Standart");

    private String type;

    RoomType(String type) {
        this.type = type;
    }
}
