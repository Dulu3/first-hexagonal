package com.dulewski.firstheks.user;


import com.dulewski.firstheks.user.infrastructure.UserProperties;
import com.dulewski.firstheks.user.infrastructure.gituser.GitUsersPort;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Getter
@Setter
@Configuration
class UserConfig {


    @Bean
    UserFacade gitUserFacade(UserRepository repository, GitUsersPort port, UserPropertiesConfig userPropertiesConfig) {
        UserFactory factory = new UserFactory();
        return new UserFacade(repository, port, factory, userPropertiesConfig.getUserProperties());
    }

     UserFacade createUserFacadeTest(UserRepository repository, GitUsersPort port, UserPropertiesConfig config) {
        UserFactory factory = new UserFactory();
        return new UserFacade(repository, port, factory, config.getUserProperties());
    }

    @Getter
    @Setter
    @Configuration
    @RequiredArgsConstructor
    @EnableConfigurationProperties(UserProperties.class)
     static class UserPropertiesConfig{
        private final UserProperties userProperties;
        //Można dac wiecej
    }

}
