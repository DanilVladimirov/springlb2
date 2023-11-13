package org.chdtu;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class UserSettings {
    private String avatarUrl;

    public UserSettings() {
        System.out.println("UserSettings bean is created");
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @PostConstruct
    public void init(){
        System.out.println("Class UserSettings: init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class UserSettings: destroy method");
    }
}
