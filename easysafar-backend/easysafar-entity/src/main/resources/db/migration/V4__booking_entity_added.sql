CREATE TABLE IF NOT EXISTS booking
(
    id             VARCHAR(36)  PRIMARY KEY,
    created_at     DATETIME     NOT NULL,
    updated_at     DATETIME     NOT NULL,
    passenger_id      VARCHAR(36)  NOT NULL,
    driver_id         VARCHAR(36)  NOT NULL,
    start_location_id  VARCHAR(36)  NOT NULL,
    end_location_id    VARCHAR(36)  NOT NULL,
    status         ENUM('SCHEDULED', 'CANCELLED', 'CAB_ARRIVED', 'ASSIGNING_DRIVER', 'IN_RIDE', 'COMPLETED') NULL
);