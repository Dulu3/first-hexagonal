package com.dulewski.firstheks.user.infrastructure;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
@Getter
@Setter
public class UserProperties {
    public int weightValue; //weight.value=2

    public UserProperties(int weightValue){
        this.weightValue = weightValue;
    }
}
