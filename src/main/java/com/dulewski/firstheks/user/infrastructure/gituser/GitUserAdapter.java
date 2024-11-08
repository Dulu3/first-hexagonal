package com.dulewski.firstheks.user.infrastructure.gituser;

import com.dulewski.firstheks.user.exception.GitException;
import com.dulewski.firstheks.user.dto.GitUserResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
class GitUserAdapter implements GitUsersPort {

    private static final String GIT_API_URL = "https://api.github.com/users/";
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public GitUserAdapter(){
        this.httpClient = HttpClient.newHttpClient();
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public GitUserResponse getUser(String username) throws GitException {
        var request = HttpRequestBuilder(username);
        try{
            HttpResponse<String> response =
                    httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                return objectMapper.readValue(response.body(), GitUserResponse.class);
            } else {
                throw new GitException("Cannot fetch user data:" + response.statusCode());
            }
        }catch (Exception e){
            throw new GitException(e.getMessage());
        }

    }

    private HttpRequest HttpRequestBuilder(String username) {
        return HttpRequest.newBuilder()
                .uri(URI.create(GIT_API_URL + username))
                .GET()
                .build();

    }
}
