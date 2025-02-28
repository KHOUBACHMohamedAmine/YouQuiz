package com.youcode.youquiz.services;

import com.youcode.youquiz.models.dto.ValidationDto;
import com.youcode.youquiz.payload.ValidationDtoResponse;

import java.util.List;

public interface ValidationService {

    ValidationDto save(ValidationDto validationDto);

    ValidationDto update(Long id, ValidationDto validationDto);

    void delete(Long id);

    ValidationDtoResponse findByID(Long id);

    List<ValidationDtoResponse> getAll();
}
