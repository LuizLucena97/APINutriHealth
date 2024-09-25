package br.com.fiap.apinutrihealth.post.dto;

import br.com.fiap.apinutrihealth.post.Post;
import br.com.fiap.apinutrihealth.user.User;

import java.time.LocalDateTime;

public record PostRequest(String text) {
    public Post toModel(User user) {
        return Post.builder()
                .text(text)
                .createdAt(LocalDateTime.now())
                .user(user)
                .build();
    }
}