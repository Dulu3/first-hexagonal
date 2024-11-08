package com.dulewski.firstheks.user;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

class InMemoryRepository<T, ID> implements JpaRepository<T, ID> {
    private final ConcurrentHashMap<ID, T> map = new ConcurrentHashMap<>();
    private final Function<T, ID> idGetter;

    InMemoryRepository(Function<T, ID> idGetter) {
        this.idGetter = idGetter;
    }

    @Override
    public void flush() {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public <S extends T> S saveAndFlush(S entity) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public <S extends T> List<S> saveAllAndFlush(Iterable<S> entities) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public void deleteAllInBatch(Iterable<T> entities) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<ID> ids) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public void deleteAllInBatch() {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public T getOne(ID id) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public T getById(ID id) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public T getReferenceById(ID id) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public <S extends T> Optional<S> findOne(Example<S> example) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public <S extends T> List<S> findAll(Example<S> example) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public <S extends T> List<S> findAll(Example<S> example, Sort sort) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public <S extends T> Page<S> findAll(Example<S> example, Pageable pageable) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public <S extends T> long count(Example<S> example) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public <S extends T> boolean exists(Example<S> example) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public <S extends T, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public <S extends T> S save(S entity) {
       map.put(idGetter.apply(entity),entity);
       return entity;
    }

    @Override
    public <S extends T> List<S> saveAll(Iterable<S> entities) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public Optional<T> findById(ID id) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public boolean existsById(ID id) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public List<T> findAll() {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public List<T> findAllById(Iterable<ID> ids) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public long count() {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public void deleteById(ID id) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public void delete(T entity) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public void deleteAllById(Iterable<? extends ID> ids) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public void deleteAll(Iterable<? extends T> entities) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public void deleteAll() {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public List<T> findAll(Sort sort) {
        throw new RuntimeException("Unplimented method");
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        throw new RuntimeException("Unplimented method");
    }
}
