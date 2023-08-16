package com.laioffer.twitch.db.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author Leon Cai
 * @project twitch
 * @date 1/24/23
 */
@Table("users")
public record UserEntity(
        @Id Long id,
        String username,
        String firstName,
        String lastName,
        String password
        ) {
}
