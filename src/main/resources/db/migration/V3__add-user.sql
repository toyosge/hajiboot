CREATE TABLE users (username VARCHAR(100) NOT NULL PRIMARY KEY, encoded_password VARCHAR(255));
INSERT INTO users (username, encoded_password) VALUES ('user1', '$2a$10$VOHXw.bz3gOtMZ9bNJ9euuY4VQKsVojqbmRA1ErtRHoqTpiuWvRnO' /*demo*/);
INSERT INTO users (username, encoded_password) VALUES ('user2', '$2a$10$60bPCzCz5kxbbIFPBjUaH.a6bHD2fa/E4JnA2EERBEEnVpufL8p02' /*demo*/);
ALTER TABLE customers ADD username VARCHAR(100) NOT NULL DEFAULT 'user1';
ALTER TABLE customers ADD CONSTRAINT FK_CUSTOMERS_USERNAME FOREIGN KEY (username) REFERENCES users;