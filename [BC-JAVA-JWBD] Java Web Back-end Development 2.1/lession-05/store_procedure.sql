-- findAllCustomers() TÊN THỦ TỤC
DELIMITER // -- MỞ Ô LƯU TRỮ
CREATE PROCEDURE findAllCustomers()
BEGIN 
SELECT * FROM customers;
END //
DELIMITER ; -- ĐÓNG Ô LƯU TRỮ

-- HIỂN THỊ PROCEDURE RA XEM

CALL findAllCustomers();


-- XÓA PROCEDUCRE NẾU NÓ ĐÃ TỒN TẠI

DROP PROCEDURE IF EXISTS  `findAllCustomers`//


-- TẠO PROCEDURE VỚI ĐIỀU KIỆN LÀ customerName = 175
DELIMITER //
CREATE PROCEDURE findAllCustomers()
BEGIN 
SELECT * FROM customers 
WHERE customerName = 175;
END //
DELIMITER ;