package com.dulewski.firstheks.user;

/*
Napisz rest API ktore pozwala na zapis użytkownika do bazy h2.
API powinno przyjmować tylko nazwę użytkownika, która zostanie
wykorzystana do pobrania użytkownika z Githuba przy wykorzystaniu
GitHub API. Zapisany w bazie użytkownik powinien miec informacje na
temat loginu, liczby repozytoriów oraz punktów prestiżu obliczanych
za pomocą wzoru "liczba repozytoriów/waga + 1/liczba obserwujacych".
Waga jest zmienna typu całkowitego która jest określona w propertisach.
Wynik zaokrąglij do 2 miejsc po przecinku.
 */

import com.dulewski.firstheks.user.dto.GitUserResponse;
import com.dulewski.firstheks.user.dto.UserResponse;
import com.dulewski.firstheks.user.infrastructure.UserProperties;
import com.dulewski.firstheks.user.infrastructure.gituser.GitUsersPort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserFacade {

        private final UserRepository userRepository;
        private final GitUsersPort usersPort;
        private final UserFactory userFactory;
        private final UserProperties properties;

        public UserResponse getPrestigePointsAndSaveUser(String username) {
            GitUserResponse user = usersPort.getUser(username);
            UserEntity userEntity = userFactory.createUserEntity(user);
            userEntity.calculatePrestigePoints(user.getFollowers(), properties.getWeightValue());
            UserEntity entity = userRepository.save(userEntity);
            return userFactory.createUserResponse(entity);
        }


}
