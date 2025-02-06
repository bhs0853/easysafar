CREATE TABLE exact_location
(
    id         VARCHAR(36) PRIMARY KEY,
    created_at DATETIME NOT NULL,
    updated_at DATETIME NOT NULL,
    latitude   DOUBLE NOT NULL,
    longitude  DOUBLE NOT NULL
);