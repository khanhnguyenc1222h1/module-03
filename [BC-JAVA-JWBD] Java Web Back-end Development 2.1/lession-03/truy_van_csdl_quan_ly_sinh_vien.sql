USE QUAN_LY_SINH_VIEN;
-- Hiển thị danh sách tất cả các học viên
SELECT * FROM STUDENT;
-- Hiển thị danh sách các học viên đang theo học
SELECT * FROM STUDENT
WHERE STATUS= TRUE;
-- Hiển thị danh sách các môn học có thời gian học nhỏ hơn <10 giờ.
SELECT * FROM SUBJECT
WHERE CREDIT<10;
-- Hiển thị danh sách học viên lớp A1
SELECT S.STUDENTID, S.STUDENTNAME, C.CLASSNAME 
FROM STUDENT S
JOIN CLASS C 
ON S.CLASSID = C.CLASSID
WHERE CLASSNAME = 'A1';
-- Hiển thị 'điểm' 'môn CF' của các học viên.
SELECT S.STUDENTID, S.STUDENTNAME, SUB.SUBNAME, M.MARK  
FROM STUDENT S
JOIN MARK M
ON S.STUDENTID = M.STUDENTID
JOIN SUBJECT SUB 
ON M.SUBID = SUB.SUBID
WHERE SUB.SUBNAME = 'CF';
