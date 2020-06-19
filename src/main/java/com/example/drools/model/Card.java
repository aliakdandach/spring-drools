package com.example.drools.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Card {
    private String name;
    private String type;
    private Integer maxLoading;
    private Integer fees;
    private Integer limits;
}
