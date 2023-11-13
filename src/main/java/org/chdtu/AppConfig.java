package org.chdtu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public UserSettings settingsAdminUser() {
        UserSettings userSettings = new UserSettings();
        userSettings.setAvatarUrl("https://example.com/img.png");
        return userSettings;
    }

    @Bean
    public User adminUser() {
        User user = new User();
        user.setUsername("admin");
        user.setSettings(settingsAdminUser());
        return user;
    }

    @Bean
    public DonationConfig firstDonationConfig() {
        DonationConfig donationConfig = new DonationConfig();
        donationConfig.setName("базовий конфіг");
        donationConfig.setSumFrom(100F);
        donationConfig.setTextColor("#FFF");
        donationConfig.setUser(adminUser());
        return donationConfig;
    }

    @Bean
    public PaymentMethod monoPayment() {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.setName("монобанка");
        paymentMethod.setTax(0.0F);
        return paymentMethod;
    }

    @Bean
    public Donation firstDonation() {
        Donation donation = new Donation();
        donation.setUsername("Kozak1337");
        donation.setText("дякую за твій контент.");
        donation.setSum(101.5F);
        donation.setConfig(firstDonationConfig());
        donation.setPaymentMethod(monoPayment());
        return donation;
    }
}
