package com.bhs.easysafarentity.model.location;

import com.bhs.easysafarentity.model.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ExactLocation extends BaseModel {

    @Column(name = "latitude", nullable = false)
    public Double latitude;

    @Column(name = "longitude", nullable = false)
    public Double longitude;

}
