package org.example.app.entity;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "balance")
    private Double balance;
}
