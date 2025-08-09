package com.beasthr10.lldproject2.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Operator extends BaseModel{
    private int empId;
    private String name;

    public Operator(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }


}
