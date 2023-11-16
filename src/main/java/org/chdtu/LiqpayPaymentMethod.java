package org.chdtu;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LiqpayPaymentMethod implements PaymentMethod {
    private Float tax;

    public LiqpayPaymentMethod() {
        System.out.println("LiqpayPaymentMethod bean is created");
    }

    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }

    @PostConstruct
    public void init(){
        System.out.println("Class LiqpayPaymentMethod: init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class LiqpayPaymentMethod: destroy method");
    }

    public void makePayment(float sum) {
        System.out.println(
                String.format("[LiqpayPaymentMethod] Створили оплату на суму %f", sum)
        );
    }
}
