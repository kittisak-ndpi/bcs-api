package com.buu.bcs.repository.impl;

import com.buu.bcs.entity.ChoiceEntity;
import com.buu.bcs.repository.ChoiceRepository;

import java.util.Optional;

public class ChoiceRepositoryImpl implements ChoiceRepository {

    @Override
    public <S extends ChoiceEntity> S save(S s) {
        return null;
    }

    @Override
    public <S extends ChoiceEntity> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<ChoiceEntity> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<ChoiceEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<ChoiceEntity> findAllById(Iterable<String> iterable) {
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
    public void delete(ChoiceEntity questionEntity) {

    }

    @Override
    public void deleteAll(Iterable<? extends ChoiceEntity> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
