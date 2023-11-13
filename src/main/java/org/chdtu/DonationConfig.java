package org.chdtu;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class DonationConfig {
    private String name;
    private Float sumFrom;
    private String textColor;

    private User user;

    public DonationConfig() {
        System.out.println("DonationConfig bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSumFrom() {
        return sumFrom;
    }

    public void setSumFrom(Float sumFrom) {
        this.sumFrom = sumFrom;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @PostConstruct
    public void init(){
        System.out.println("Class DonationConfig: init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class DonationConfig: destroy method");
    }
}
