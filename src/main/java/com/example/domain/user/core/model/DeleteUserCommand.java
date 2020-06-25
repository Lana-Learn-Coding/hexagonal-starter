package com.example.domain.user.core.model;

import lombok.Data;

import java.util.UUID;

@Data
public class DeleteUserCommand {
    private UUID userId;

    public void setUserId(UUID userId) {
        this.userId = userId;
    }
}
