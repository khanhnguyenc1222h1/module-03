CREATE VIEW customer_views AS
SELECT customerNumber, customerName, phone
FROM CUSTOMERS;

-- hiển thị view
SELECT * FROM customer_views;

-- CẬP NHẬT VIEW 
CREATE OR REPLACE VIEW customer_views AS
SELECT customerNumber, customerName, contactFirstName ,contactLastName  phone
FROM customers
WHERE city = 'Nantes'; 

-- xóa view
DROP VIEW customer_views;