package com.bogdanov.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

import java.util.Collection;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Quest implements AbstaractEntity {
    private Long id;
    private Long authorId;
    private String name;
    private String text;
    private Long startQuestionId;
    private final Collection<User> players = new ArrayList<>();
    private final Collection<Question> qustions = new ArrayList<>();

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
