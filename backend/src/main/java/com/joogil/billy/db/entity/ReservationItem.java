package com.joogil.billy.db.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class ReservationItem extends BaseEntity {

    @ManyToOne
    @NotNull
    private Reservation reservation;

    @ManyToOne
    @NotNull
    private Item item;
}
