package com.bhs.easysafarentity.model.driver;

import com.bhs.easysafarentity.model.BaseModel;
import com.bhs.easysafarentity.model.booking.Booking;
import com.bhs.easysafarentity.model.car.Car;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver extends BaseModel implements UserDetails {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "mobile_number", nullable = false)
    private String mobileNumber;

    @Column(name = "password", nullable = false)
    private String password;

    @OneToOne
    @JoinColumn(name = "car_id", referencedColumnName = "id")
    @JsonIgnoreProperties(value = "driver")
    private Car car;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "license_number", nullable = false)
    private String licenseNumber;

    @OneToMany
    private List<Booking> bookingHistory;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

}
