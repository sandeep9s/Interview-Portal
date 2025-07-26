
CREATE DATABASE IF NOT EXISTS interview_portal;
USE interview_portal;

CREATE TABLE interviews (
    id INT AUTO_INCREMENT PRIMARY KEY,
    participant VARCHAR(100) NOT NULL,
    start_time DATETIME NOT NULL,
    end_time DATETIME NOT NULL
);
