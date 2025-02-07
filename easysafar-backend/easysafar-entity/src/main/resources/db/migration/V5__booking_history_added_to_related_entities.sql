CREATE TABLE driver_booking_history
(
    driver_id          VARCHAR(36) NOT NULL,
    booking_history_id VARCHAR(36) NOT NULL UNIQUE,
    FOREIGN KEY (driver_id) REFERENCES driver(id),
    FOREIGN KEY (booking_history_id) REFERENCES booking(id)
);

CREATE TABLE passenger_booking_history
(
    passenger_id       VARCHAR(36) NOT NULL,
    booking_history_id VARCHAR(36) NOT NULL UNIQUE,
    FOREIGN KEY (passenger_id) REFERENCES passenger(id),
    FOREIGN KEY (booking_history_id) REFERENCES booking(id)
);

