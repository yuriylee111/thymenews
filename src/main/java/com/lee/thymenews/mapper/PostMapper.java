package com.lee.thymenews.mapper;

import com.lee.thymenews.dto.PostDto;
import com.lee.thymenews.entity.Post;

import java.util.stream.Collectors;

public class PostMapper {

    public static PostDto mapToPostDto(Post post) {
        return PostDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .content(post.getContent())
                .description(post.getDescription())
                .url(post.getUrl())
                .createdOn(post.getCreatedOn())
                .updatedOn(post.getUpdatedOn())
                .commentDtos(post.getComments().stream()
                        .map(CommentMapper::mapToCommentDto)
                        .collect(Collectors.toSet()))
                .build();
    }

    public static Post mapToPost(PostDto postDto) {
        return Post.builder()
                .id(postDto.getId())
                .title(postDto.getTitle())
                .content(postDto.getContent())
                .description(postDto.getDescription())
                .url(postDto.getUrl())
                .createdOn(postDto.getCreatedOn())
                .updatedOn(postDto.getUpdatedOn())
                .build();
    }
}
