package com.beasthr10.lldproject2.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gate extends BaseModel{
    private GateType gateType;
    private int gateNumber;
    private Operator currentOperator;
    private GateStatus gateStatus;

    public Gate(GateType gateType, int gateNumber, Operator currentOperator) {
        this.gateType = gateType;
        this.gateNumber = gateNumber;
        this.currentOperator = currentOperator;
        this.gateStatus = GateStatus.ACTIVE; // Default status
    }


}
