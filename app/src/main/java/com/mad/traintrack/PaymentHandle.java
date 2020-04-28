package com.mad.traintrack;

public class PaymentHandle {

    private String cardID;
    private Integer cardNo;
    private Integer cvv;
    private String date;
    private String name;

    public PaymentHandle() {
    }

    public PaymentHandle(String cardID,Integer cardNo, Integer cvv, String date, String name) {
        this.cardID = cardID;
        this.cardNo = cardNo;
        this.cvv = cvv;
        this.date = date;
        this.name = name;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public Integer getCardNo() {
        return cardNo;
    }

    public void setCardNo(Integer cardNo) {
        this.cardNo = cardNo;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}