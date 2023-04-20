-- truyen tham so dang OUT
DELIMITER //
CREATE PROCEDURE GetCustomersCountByCity(IN in_city VArCHAR(50),OUT total INT)
BEGIN 
SELECT COUNT(customerNumber)
INTO total
FROM customers
WHERE city = in_city ;
END //
DELIMITER ;

-- goi store procedure
CALL GetCustomersCountByCity('Lyon',@total); 
SELECT @total;

-- tham so loai INOUT
DELIMITER //
CREATE PROCEDURE SetCounter(
INOUT counter INT,
IN inc INT
)
BEGIN 
SET counter = counter + inc;
END //
DELIMITER ;

-- goi STORE PROCEDURE
SET @counter = 1;
CALL SetCounter(@counter,1); -- 2
CALL SetCounter(@counter,1); -- 3
CALL SetCounter(@counter,5); -- 8
SELECT @counter; -- 8