package br.com.fiap.apinutrihealth.user.dto;

import br.com.fiap.apinutrihealth.user.User;

public record UserProfileResponse(
        String name,
        String bio,
        String email,
        String avatar
) {
    public UserProfileResponse(User user){
        this(user.getName(), user.getBio(), user.getEmail(), user.getAvatar());
    }
}
