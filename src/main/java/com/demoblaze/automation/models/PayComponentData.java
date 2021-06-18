package com.demoblaze.automation.models;

public class PayComponentData {
    private String userName, password, name, country,  city, creditCard, month, year;

    public PayComponentData(String userName, String password, String name, String country, String city, String creditCard, String month, String year) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.country = country;
        this.city = city;
        this.creditCard = creditCard;
        this.month = month;
        this.year = year;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }
}
