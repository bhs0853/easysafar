package com.bhs.easysafarentity.model.booking;

import com.bhs.easysafarentity.model.BaseModel;
import com.bhs.easysafarentity.model.driver.Driver;
import com.bhs.easysafarentity.model.location.ExactLocation;
import com.bhs.easysafarentity.model.passenger.Passenger;
import com.bhs.easysafarentity.model.review.Review;
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
    private Passenger passenger;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private ExactLocation startLocation;

    @ManyToOne
    private ExactLocation endLocation;

    @Column(name = "status", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private BookingStatus status;

    @OneToOne
    @JoinColumn(name = "review_id", referencedColumnName = "id")
    private Review review;

}
