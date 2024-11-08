package com.dulewski.firstheks.user.dto;

import java.math.BigDecimal;


public record UserResponse(int id, String login, int publicRepos, BigDecimal prestigePoints) {
}
