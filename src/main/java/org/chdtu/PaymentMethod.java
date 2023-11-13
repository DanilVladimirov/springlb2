package org.chdtu;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class PaymentMethod {
    private String name;
    private Float tax;

    public PaymentMethod() {
        System.out.println("PaymentMethod bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }

    @PostConstruct
    public void init(){
        System.out.println("Class PaymentMethod: init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class PaymentMethod: destroy method");
    }
}
