package com.joogil.billy.db.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Reservation extends BaseEntity {

    @ManyToOne
    @NotNull
    private Member member;

    @Column(length = 100)
    @NotNull
    private String name;

    @NotNull
    private LocalDateTime startAt;

    @NotNull
    private LocalDateTime finishAt;

    private LocalDateTime rentAt;

    private LocalDateTime returnAt;

    @CreatedDate
    private LocalDateTime createdAt;
}
