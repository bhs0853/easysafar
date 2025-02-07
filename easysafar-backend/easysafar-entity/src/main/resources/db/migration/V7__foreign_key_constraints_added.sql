ALTER TABLE booking
    ADD CONSTRAINT FOREIGN KEY (driver_id) REFERENCES driver (id);

ALTER TABLE booking
    ADD CONSTRAINT FOREIGN KEY (end_location_id) REFERENCES exact_location (id);

ALTER TABLE booking
    ADD CONSTRAINT FOREIGN KEY (passenger_id) REFERENCES passenger (id);

ALTER TABLE booking
    ADD CONSTRAINT FOREIGN KEY (review_id) REFERENCES review (id);

ALTER TABLE booking
    ADD CONSTRAINT FOREIGN KEY (start_location_id) REFERENCES exact_location (id);

ALTER TABLE driver
    MODIFY COLUMN car_id VARCHAR(36) UNIQUE;

ALTER TABLE driver
    ADD CONSTRAINT FOREIGN KEY (car_id) REFERENCES car (id);