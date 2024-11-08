package com.dulewski.firstheks.user;

class InMemoryGitRepository extends InMemoryRepository<UserEntity, Integer> implements UserRepository {

    InMemoryGitRepository() {
        super(UserEntity::getId);
    }
}
