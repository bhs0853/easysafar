package com.bhs.easysafarentity.model.car;

import com.bhs.easysafarentity.model.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car extends BaseModel {

    @Column(name = "registration_number", nullable = false)
    public String registrationNumber;

    @Column(name = "manufacturer", nullable = false)
    @Enumerated(value = EnumType.STRING)
    public Manufacturer manufacturer;

    @Column(name = "model", nullable = false)
    public String model;

    @Column(name = "type", nullable = false)
    @Enumerated(value = EnumType.STRING)
    public CarType type;

}
