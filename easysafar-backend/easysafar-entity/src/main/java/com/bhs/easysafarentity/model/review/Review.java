package com.bhs.easysafarentity.model.review;

import com.bhs.easysafarentity.model.BaseModel;
import com.bhs.easysafarentity.model.booking.Booking;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Review extends BaseModel {

    @Column(name = "rating")
    private Double rating;

    @Column(name = "message", nullable = false)
    private String message;

    @OneToOne(mappedBy = "review")
    @JsonIgnoreProperties(value = "review")
    private Booking booking;

}
