USE QUAN_LY_SINH_VIEN;
-- Hiển thị số lượng sinh viên ở từng nơi
SELECT ADDRESS, COUNT(STUDENTID) AS 'SỐ LƯỢNG HỌC VIÊN'
FROM STUDENT
GROUP BY ADDRESS;
-- Tính điểm trung bình các môn học của mỗi học viên
SELECT S.STUDENTID, S.STUDENTNAME, AVG(MARK) AS DIEM_TRUNG_BINH
FROM STUDENT AS S
JOIN MARK AS M
ON S.STUDENTID = M.STUDENTID
GROUP BY S.STUDENTID, S.STUDENTNAME;
-- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15
SELECT S.STUDENTID, S.STUDENTNAME, AVG(MARK) AS DIEM_TRUNG_BINH
FROM STUDENT AS S
JOIN MARK AS M
ON S.STUDENTID = M.STUDENTID
GROUP BY S.STUDENTID, S.STUDENTNAME
HAVING AVG(MARK)>15;
-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
SELECT S.STUDENTID, S.STUDENTNAME, AVG(MARK) AS DIEM_TRUNG_BINH
FROM STUDENT AS S
JOIN MARK AS M
ON S.STUDENTID = M.STUDENTID
GROUP BY S.STUDENTID, S.STUDENTNAME
HAVING AVG(MARK) >= ALL (SELECT AVG(MARK) FROM MARK GROUP BY MARK.STUDENTID);