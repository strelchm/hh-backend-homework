package ru.hh.school.resource.dto;

import org.springframework.lang.Nullable;

public class FavouriteUpdateRequestDto {
    @Nullable
    private String comment; // комментарий

    public FavouriteUpdateRequestDto() {
    }

    public FavouriteUpdateRequestDto(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
