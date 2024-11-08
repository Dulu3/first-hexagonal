package com.dulewski.firstheks.user.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class GitUserResponse {
    private int id;
    private String login;
    @JsonProperty("public_repos")
    private int publicRepos;
    private int followers;

    public GitUserResponse(int i, String piotr, int i1, int i2) {
        this.id = i;
        this.login = piotr;
        this.publicRepos = i1;
        this.followers =i2;
    }
}
