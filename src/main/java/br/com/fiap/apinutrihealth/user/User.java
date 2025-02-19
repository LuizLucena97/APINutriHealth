package br.com.fiap.apinutrihealth.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "nh_users")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String bio;
    String email;
    String password;
    String avatar;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}