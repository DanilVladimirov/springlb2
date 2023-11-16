package org.chdtu;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "adminSettings")
    public UserSettings settingsAdminUser() {
        UserSettings userSettings = new UserSettings();
        userSettings.setAvatarUrl("https://example.com/img.png");
        return userSettings;
    }

    @Bean(name = "adminUser")
    public User adminUser(@Qualifier("adminSettings") UserSettings settings) {
        User user = new User();
        user.setUsername("admin");
        user.setSettings(settings);
        return user;
    }

    @Bean(name = "firstDonationConfig")
    public DonationConfig firstDonationConfig(@Qualifier("adminUser") User user) {
        DonationConfig donationConfig = new DonationConfig();
        donationConfig.setName("базовий конфіг");
        donationConfig.setSumFrom(100F);
        donationConfig.setTextColor("#FFF");
        donationConfig.setUser(user);
        return donationConfig;
    }

    @Bean(name = "monoMethod")
    public PaymentMethod monoPayment() {
        MonobankPaymentMethod monobankPaymentMethod = new MonobankPaymentMethod();
        monobankPaymentMethod.setTax(0.0F);
        return monobankPaymentMethod;
    }

    @Bean(name = "liqpayMethod")
    public PaymentMethod liqpayPayment() {
        LiqpayPaymentMethod liqpayPaymentMethod = new LiqpayPaymentMethod();
        liqpayPaymentMethod.setTax(0.0F);
        return liqpayPaymentMethod;
    }

    @Bean
    public Donation firstDonation(
            @Qualifier("firstDonationConfig") DonationConfig config,
            @Qualifier("monoMethod") PaymentMethod paymentMethod
    ) {
        Donation donation = new Donation();
        donation.setUsername("Kozak1337");
        donation.setText("дякую за твій контент.");
        donation.setSum(101.5F);
        donation.setConfig(config);
        donation.setPaymentMethod(paymentMethod);
        return donation;
    }

    @Bean
    public Donation secondDonation(
            @Qualifier("firstDonationConfig") DonationConfig config,
            @Qualifier("liqpayMethod") PaymentMethod paymentMethod
    ) {
        Donation donation = new Donation();
        donation.setUsername("Taras Shevchenko");
        donation.setText("дяка.");
        donation.setSum(110.5F);
        donation.setConfig(config);
        donation.setPaymentMethod(paymentMethod);
        return donation;
    }
}
