package com.youcode.youquiz.services;

import com.youcode.youquiz.models.dto.TempoQuizDto;

public interface TempoQuizService {

    TempoQuizDto save(TempoQuizDto tempoQuizDto);

    void delete(Long questionID, Long quizID);

    TempoQuizDto update(Long id, TempoQuizDto tempoQuizDto);
}
