package com.dulewski.firstheks.user.infrastructure;


import com.dulewski.firstheks.user.UserFacade;
import com.dulewski.firstheks.user.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/git-user-prestige")
@RequiredArgsConstructor
class UserController {

    private final UserFacade service;

    @GetMapping("/{username}")
    public ResponseEntity<UserResponse> getUserPrestigeByUserName(@PathVariable String username) {
        var user = service.getPrestigePointsAndSaveUser(username);
        return ResponseEntity.ok(user);
    }
}
