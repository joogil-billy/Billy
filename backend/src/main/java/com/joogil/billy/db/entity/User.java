package com.joogil.billy.db.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class User extends BaseEntity {
    @NotNull
    private String email;

    @NotNull
    private String password;

    @Column(length = 100)
    @NotNull
    private String name;

    private String profileImgUrl;

    @Column(length = 11)
    private String phoneNumber;

    private LocalDate birth;

    @CreatedDate
    private LocalDateTime regDatetime;
}
