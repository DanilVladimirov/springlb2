package org.chdtu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Donation donation = context.getBean("firstDonation", Donation.class);

        Donation donation2 = context.getBean("secondDonation", Donation.class);

        System.out.println(donation.getText());
        System.out.println(donation2.getText());
    }
}
