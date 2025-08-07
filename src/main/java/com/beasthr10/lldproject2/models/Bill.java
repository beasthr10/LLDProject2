package com.beasthr10.lldproject2.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
public class Bill extends BaseModel{
    private Date exitTime;
    private double amount;
    private Ticket ticket;
    private Gate gate;
    private Operator generatedBy;
    private BillStatus billStatus;
    private List<Payment> payments;
    private FeesCalculatorStrategyType feesCalculatorStrategyType;

    public Bill(Ticket ticket,Operator generatedBy) {
        this.payments = new ArrayList<>();
        this.ticket = ticket;
        this.generatedBy = generatedBy;
        this.feesCalculatorStrategyType = FeesCalculatorStrategyType.STRAIGHT_FARE;
        this.billStatus = BillStatus.IN_PROGRESS;
        this.exitTime = new Date();
    }

}
