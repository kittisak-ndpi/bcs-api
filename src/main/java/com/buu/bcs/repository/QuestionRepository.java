package com.buu.bcs.repository;

import com.buu.bcs.entity.QuestionEntity;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<QuestionEntity, String> {
}
