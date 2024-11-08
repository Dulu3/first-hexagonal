package com.dulewski.firstheks.user.infrastructure.gituser;

import com.dulewski.firstheks.user.dto.GitUserResponse;

public interface GitUsersPort {
    GitUserResponse getUser(String username);
}
