package com.dulewski.firstheks.user;

import com.dulewski.firstheks.user.exception.GitException;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Entity
@Getter
@NoArgsConstructor
class UserEntity {
    @Id
    private int id;
    private String login;
    private int publicRepos;
    private BigDecimal prestigePoints;

    public UserEntity(int id, String login, int publicRepos) {
        this.id = id;
        this.login = login;
        this.publicRepos = publicRepos;
    }

    public void calculatePrestigePoints(Integer followers, Integer weightValue) {
        if (id == 0 || publicRepos == 0 || followers == 0 || weightValue == 0) {
            throw new GitException("Nie dziel przez zero");
        }
        var number = BigDecimal.valueOf(id / weightValue + 1 / followers);
        this.prestigePoints = number.setScale(2, RoundingMode.HALF_UP);
    }
}
