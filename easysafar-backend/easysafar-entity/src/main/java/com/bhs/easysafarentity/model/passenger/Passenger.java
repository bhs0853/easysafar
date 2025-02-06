package com.bhs.easysafarentity.model.passenger;

import com.bhs.easysafarentity.model.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Passenger extends BaseModel implements UserDetails {

    @Column(name = "name", nullable = false)
    public String name;

    @Column(name = "email", nullable = false)
    public String email;

    @Column(name = "mobile_number", nullable = false)
    public String mobileNumber;

    @Column(name = "password", nullable = false)
    private String password;

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
