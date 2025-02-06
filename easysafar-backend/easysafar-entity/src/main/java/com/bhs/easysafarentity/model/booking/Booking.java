package com.bhs.easysafarentity.model.booking;

import com.bhs.easysafarentity.model.BaseModel;
import com.bhs.easysafarentity.model.driver.Driver;
import com.bhs.easysafarentity.model.location.ExactLocation;
import com.bhs.easysafarentity.model.passenger.Passenger;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseModel {

    @ManyToOne
    public Passenger passenger;

    @ManyToOne
    public Driver driver;

    @ManyToOne
    public ExactLocation startLocation;

    @ManyToOne
    public ExactLocation endLocation;

    @Column(name = "status", nullable = false)
    @Enumerated(value = EnumType.STRING)
    public BookingStatus status;

}
