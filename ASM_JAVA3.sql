CREATE DATABASE FPL_DaoTao
GO
USE FPL_DaoTao
GO

CREATE TABLE SinhVien(
	maSv NVARCHAR(50) NOT NULL PRIMARY KEY,
	ho_ten NVARCHAR(50),
	email NVARCHAR(50),
	so_dt NVARCHAR(15),
	gioi_tinh BIT,
	dia_chi NVARCHAR(50)
)

	
	DROP TABLE dbo.Diem

CREATE TABLE Diem(
	maSv NVARCHAR(50)PRIMARY KEY,
	tieng_anh FLOAT,
	tin_hoc FLOAT,
	gdtc FLOAT,
	FOREIGN KEY(maSv) REFERENCES dbo.SinhVien(maSv)
)
CREATE TABLE USERS(
	username NVARCHAR(50) NOT NULL PRIMARY KEY,
	password NVARCHAR(50),
	role NVARCHAR(50)
)
INSERT INTO dbo.USERS
(
    username,
    password,
    role
)
VALUES
(   N'anhkon', -- username - nvarchar(50)
    N'123', -- password - nvarchar(50)
    N'GV'  -- role - nvarchar(50)
    )

	SELECT username,password,role
	FROM dbo.USERS

	SELECT maSv,ho_ten,email,so_dt,gioi_tinh,dia_chi
	FROM dbo.SinhVien

	
INSERT INTO dbo.SinhVien
(
    maSv,
    ho_ten,
    email,
    so_dt,
    gioi_tinh,
    dia_chi
)
VALUES
(   N'SV1',  -- maSv - nvarchar(50)
    N'anh',  -- ho_ten - nvarchar(50)
    N'a',  -- email - nvarchar(50)
    N'9',  -- so_dt - nvarchar(15)
    1, -- gioi_tinh - bit
    N'a'   -- dia_chi - nvarchar(50)
    )

	DELETE dbo.SinhVien WHERE maSv = 'SV1'

INSERT INTO dbo.Diem
(
    maSv,
    tieng_anh,
    tin_hoc,
    gdtc
)
VALUES
(   N'SV1', -- maSv - nvarchar(50)
    0,   -- tieng_anh - int
    1,   -- tin_hoc - int
    10    -- gdtc - int
    )


	SELECT TOP 3 tieng_anh,tin_hoc,gdtc,AVG(tieng_anh + tin_hoc + gdtc)
	FROM dbo.Diem
	GROUP BY maSv,tieng_anh,tin_hoc,gdtc
	ORDER BY tieng_anh,tin_hoc,gdtc ASC

	SELECT  dbo.SinhVien.maSv,dbo.SinhVien.ho_ten,tieng_anh,tin_hoc,gdtc,(tieng_anh+tin_hoc+gdtc) / 3 AS AVG
	FROM dbo.Diem JOIN dbo.SinhVien ON SinhVien.maSv = Diem.maSv
	WHERE SinhVien.maSv = 'SV2'

	SELECT * FROM dbo.Diem 

		DELETE dbo.Diem
	WHERE maSv = 'SV2'

	INSERT INTO Diem(maSv,tieng_anh,tin_hoc,gdtc) VALUES ('SV1',9,8,8)


	SELECT  maSv,tieng_anh,tin_hoc,gdtc,(tieng_anh + tin_hoc +gdtc) /3 AS AVG
	FROM dbo.Diem
	WHERE maSv = ?
