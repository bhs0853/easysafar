CREATE TABLE IF NOT EXISTS review
(
    id         VARCHAR(36)  PRIMARY KEY,
    created_at DATETIME     NULL,
    updated_at DATETIME     NULL,
    rating     DOUBLE       NULL,
    message    VARCHAR(255) NOT NULL,
    booking_id VARCHAR(36)  NOT NULL UNIQUE,
    FOREIGN KEY (booking_id) REFERENCES booking(id)
);

ALTER TABLE booking
    ADD COLUMN review_id VARCHAR(36) NOT NULL UNIQUE;

ALTER TABLE booking
    ADD CONSTRAINT FOREIGN KEY (review_id) REFERENCES review(id);