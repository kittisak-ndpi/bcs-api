package com.buu.bcs.repository.impl;

import com.buu.bcs.entity.QuestionEntity;
import com.buu.bcs.repository.QuestionRepository;

import java.util.Optional;

public class QuestionRepositoryImpl implements QuestionRepository {

    @Override
    public <S extends QuestionEntity> S save(S s) {
        return null;
    }

    @Override
    public <S extends QuestionEntity> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<QuestionEntity> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<QuestionEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<QuestionEntity> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(QuestionEntity questionEntity) {

    }

    @Override
    public void deleteAll(Iterable<? extends QuestionEntity> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
