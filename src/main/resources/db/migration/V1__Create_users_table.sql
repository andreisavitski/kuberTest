-- V1__Create_users_table.sql
CREATE TABLE users (
                       id uuid PRIMARY KEY,
                       login VARCHAR(255) NOT NULL UNIQUE
);