package com.microservices.accounts.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Getter
@Setter
@ToString
public class BaseEntity {
    @Column(updatable = false)
    private LocalDateTime created_at;

    @Column(updatable = false)
    private String created_by;

    @Column(insertable = false)
    private LocalDateTime updated_at;

    @Column(insertable = false)
    private String updated_by;

}
