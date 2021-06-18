package com.demoblaze.automation.models;

public class Data {
    private String userName, password, categories, component;

    public Data(String userName, String password, String component, String categories) {
        this.userName = userName;
        this.password = password;
        this.categories= categories;
        this.component = component;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getCategories() {
        return categories;
    }

    public String getComponent() {
        return component;
    }
}
