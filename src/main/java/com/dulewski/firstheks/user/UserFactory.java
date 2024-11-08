package com.dulewski.firstheks.user;

import com.dulewski.firstheks.user.dto.UserResponse;
import com.dulewski.firstheks.user.exception.GitException;
import com.dulewski.firstheks.user.dto.GitUserResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
class UserFactory {

    public UserEntity createUserEntity(GitUserResponse response) throws GitException {
        return new UserEntity(response.getId(), response.getLogin(), response.getPublicRepos());
    }
    public UserResponse createUserResponse(UserEntity entity){
        return new UserResponse(entity.getId(), entity.getLogin(), entity.getPublicRepos(),entity.getPrestigePoints());
    }

}
