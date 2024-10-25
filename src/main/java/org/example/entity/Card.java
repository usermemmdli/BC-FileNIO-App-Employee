package org.example.entity;

public class Card {
    private String Number;
    private String CvvNumber;
    private String Balance;

    public String getBalance() {
        return Balance;
    }

    public Card setBalance(String balance) {
        Balance = balance;
        return this;
    }

    public String getNumber() {
        return Number;
    }

    public Card setNumber(String number) {
        Number = number;
        return this;
    }

    public String getCvvNumber() {
        return CvvNumber;
    }

    public Card setCvvNumber(String CvvNumber) {
        this.CvvNumber = CvvNumber;
        return this;
    }

    @Override
    public String toString() {
        return "Card{" +
                "Number='" + Number + '\'' +
                ", CvvNumber='" + CvvNumber + '\'' +
                ", Balance='" + Balance + '\'' +
                '}' + " " + super.toString();
    }
}
