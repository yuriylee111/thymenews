package com.lee.thymenews.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

    private Long id;

    @NotEmpty(message = "Title should not be empty!")
    private String title;

    private String url;

    @NotEmpty(message = "Description should not be empty!")
    private String description;

    @NotEmpty(message = "Content should not be empty!")
    private String content;

    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

    private Set<CommentDto> commentDtos;
}
