CREATE TABLE car
(
    id                  VARCHAR(36) PRIMARY KEY,
    created_at          DATETIME NOT NULL,
    updated_at          DATETIME NOT NULL,
    registration_number VARCHAR(10) NOT NULL UNIQUE,
    manufacturer        ENUM('VOLKSWAGEN', 'SKODA', 'HONDA', 'TOYOTA', 'TATA', 'MAHINDRA', 'SUZUKI', 'HYUNDAI') NULL,
    model               VARCHAR(20) NOT NULL,
    type                ENUM('SEDAN', 'SUV', 'HATCHBACK', 'XL', 'ECONOMY', 'LUXURY') NULL
);

CREATE TABLE driver
(
    id             VARCHAR(36) PRIMARY KEY,
    created_at     DATETIME NOT NULL,
    updated_at     DATETIME NOT NULL,
    name           VARCHAR(50) NOT NULL,
    email          VARCHAR(50) NOT NULL UNIQUE,
    mobile_number  VARCHAR(10) NOT NULL UNIQUE,
    password       VARCHAR(30) NOT NULL,
    car_id         VARCHAR(36),
    rating         DOUBLE NULL,
    license_number VARCHAR(50) NOT NULL
);