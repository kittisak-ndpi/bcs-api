package com.buu.bcs.repository.impl;

import com.buu.bcs.entity.QuestionTopicEntity;
import com.buu.bcs.repository.QuestionRepository;
import com.buu.bcs.repository.QuestionTopicRepository;

import java.util.Optional;

public class QuestionTopicRepositoryImpl implements QuestionTopicRepository {

    @Override
    public <S extends QuestionTopicEntity> S save(S s) {
        return null;
    }

    @Override
    public <S extends QuestionTopicEntity> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<QuestionTopicEntity> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<QuestionTopicEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<QuestionTopicEntity> findAllById(Iterable<String> iterable) {
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
    public void delete(QuestionTopicEntity questionEntity) {

    }

    @Override
    public void deleteAll(Iterable<? extends QuestionTopicEntity> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
