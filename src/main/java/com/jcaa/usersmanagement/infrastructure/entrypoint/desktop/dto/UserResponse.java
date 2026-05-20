package com.jcaa.usersmanagement.infrastructure.entrypoint.desktop.dto;

// Regla 2 / Regla 15: DTO de salida inmutable como `record`.
public record UserResponse(
    String id, String name, String email, String role, String status) {
}
