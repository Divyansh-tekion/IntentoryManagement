package com.inventory.management.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ManagerEntity {
    @Id
    @MongoId
    private String id;
    private String name;
    private String email;
    private String password;
    private String token;
    private String phone;
}
