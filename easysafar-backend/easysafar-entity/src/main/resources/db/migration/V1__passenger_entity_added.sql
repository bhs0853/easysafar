CREATE TABLE passenger
(
    id            VARCHAR(36) PRIMARY KEY ,
    created_at    DATETIME     NOT NULL,
    updated_at    DATETIME     NOT NULL,
    name          VARCHAR(50) NOT NULL,
    email         VARCHAR(50) NOT NULL UNIQUE,
    mobile_number VARCHAR(10) NOT NULL UNIQUE,
    password      VARCHAR(30) NOT NULL
);