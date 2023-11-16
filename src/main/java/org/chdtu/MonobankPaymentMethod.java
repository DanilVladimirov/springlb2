package org.chdtu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MonobankPaymentMethod implements PaymentMethod {
    @Value("${monoPaymentMethod.tax}")
    private Float tax;

    public MonobankPaymentMethod() {
        System.out.println("MonobankPaymentMethod bean is created");
    }

    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }

    @PostConstruct
    public void init(){
        System.out.println("Class MonobankPaymentMethod: init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class MonobankPaymentMethod: destroy method");
    }

    public void makePayment(float sum) {
        System.out.println(
                String.format("[MonobankPayment] Створили оплату на суму %f", sum)
        );
    }
}
