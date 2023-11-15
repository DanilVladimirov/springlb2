package org.chdtu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class User {
    private String username;
    private UserSettings settings;

    public User() {
        System.out.println("User bean is created");
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public UserSettings getSettings() {
        return settings;
    }

    public void setSettings(UserSettings settings) {
        this.settings = settings;
    }
    @PostConstruct
    public void init(){
        System.out.println("Class User: init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class User: destroy method");
    }
}
