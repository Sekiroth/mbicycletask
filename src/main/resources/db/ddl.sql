-- Create the Transaction table
CREATE TABLE transaction (
    id INT AUTO_INCREMENT PRIMARY KEY,
    timestamp TIMESTAMP,
    type VARCHAR(255),
    actor VARCHAR(255)
);

-- Create the TransactionData table
CREATE TABLE transaction_data (
    id INT AUTO_INCREMENT PRIMARY KEY,
    t_key VARCHAR(255),
    t_value VARCHAR(255),
    transaction_id INT,
    FOREIGN KEY (transaction_id) REFERENCES transaction(id)
);