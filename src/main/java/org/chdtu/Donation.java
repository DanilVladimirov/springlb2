package org.chdtu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Donation {
    private String username;
    private String text;
    private Float sum;
    private DonationConfig config;
    private PaymentMethod paymentMethod;

    public Donation(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        System.out.println("Donation bean is created");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Float getSum() {
        return sum;
    }

    public void setSum(Float sum) {
        this.sum = sum;
    }

    public DonationConfig getConfig() {
        return config;
    }
    @Autowired
    public void setConfig(DonationConfig config) {
        this.config = config;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    @PostConstruct
    public void init(){
        System.out.println("Class Donation: init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class Donation: destroy method");
    }
}
