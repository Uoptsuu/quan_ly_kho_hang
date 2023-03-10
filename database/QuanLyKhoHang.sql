CREATE DATABASE quan_ly_kho_hang
GO
USE quan_ly_kho_hang

GO
CREATE FUNCTION AUTO_IDSP()
RETURNS VARCHAR(5)
AS
BEGIN
	DECLARE @ID VARCHAR(5)
	IF (SELECT COUNT(ma_sp) FROM SanPham) = 0
		SET @ID = '0'
	ELSE
		SELECT @ID = MAX(RIGHT(ma_sp, 3)) FROM SanPham
		SELECT @ID = CASE
			WHEN @ID >= 0 and @ID < 9 THEN 'SP00' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 9 and @ID < 99 THEN 'SP0' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 99 THEN 'SP' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
		END
	RETURN @ID
END 
GO
CREATE TABLE SanPham 
(
    ma_sp VARCHAR(5) CONSTRAINT KC_SP PRIMARY KEY CONSTRAINT IDSP DEFAULT DBO.AUTO_IDSP(),
	ten_sp VARCHAR(200) NOT NULL,
	loai_sp VARCHAR(10) NOT NULL,
    hang VARCHAR(100) NOT NULL,
	mau_sac VARCHAR(30) NOT NULL,
	kieu_dang VARCHAR(30) NOT NULL,
	chat_lieu VARCHAR(30) NOT NULL,
	gia_nhap BIGINT NOT NULL,
    gia_xuat BIGINT NOT NULL,
	don_vi VARCHAR(15) NOT NULL
);

GO
CREATE FUNCTION AUTO_IDCH()
RETURNS VARCHAR(5)
AS
BEGIN
	DECLARE @ID VARCHAR(5)
	IF (SELECT COUNT(ma_ch) FROM CuaHang) = 0
		SET @ID = '0'
	ELSE
		SELECT @ID = MAX(RIGHT(ma_ch, 3)) FROM CuaHang
		SELECT @ID = CASE
			WHEN @ID >= 0 and @ID < 9 THEN 'CH00' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 9 and @ID < 99 THEN 'CH0' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 99 THEN 'CH' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
		END
	RETURN @ID
END 
GO

CREATE TABLE CuaHang 
(
    ma_ch VARCHAR(5) CONSTRAINT KC_CH PRIMARY KEY CONSTRAINT IDCH DEFAULT DBO.AUTO_IDCH(),
    ten_ch VARCHAR(200) NOT NULL,
    sdt VARCHAR(10) NOT NULL,
    dia_chi VARCHAR(150) NOT NULL
); 

GO
CREATE FUNCTION AUTO_IDND()
RETURNS VARCHAR(3)
AS
BEGIN
	DECLARE @ID VARCHAR(3)
	IF (SELECT COUNT(ma_nd) FROM NguoiDung) = 0
		SET @ID = '0'
	ELSE
		SELECT @ID = MAX(RIGHT(ma_nd, 2)) FROM NguoiDung
		SELECT @ID = CASE
			WHEN @ID >= 0 and @ID < 9 THEN 'N0' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 9 THEN 'N' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
		END
	RETURN @ID
END 
GO

CREATE TABLE NguoiDung
(
    ma_nd VARCHAR(3) CONSTRAINT KC_ND PRIMARY KEY CONSTRAINT IDND DEFAULT DBO.AUTO_IDND(),
	chuc_vu VARCHAR(50) NOT NULL,
	mat_khau VARCHAR(20) NOT NULL,
    ten_nd VARCHAR(200) NOT NULL,
    sdt VARCHAR(10) NOT NULL,
    dia_chi VARCHAR(150) NOT NULL,
    ngay_sinh DATE NOT NULL,
    gioi_tinh BIT NOT NULL,
	can_cuoc VARCHAR(12) NOT NULL
);

GO
CREATE FUNCTION AUTO_IDNCC()
RETURNS VARCHAR(5)
AS
BEGIN
	DECLARE @ID VARCHAR(5)
	IF (SELECT COUNT(ma_ncc) FROM NhaCungCap) = 0
		SET @ID = '0'
	ELSE
		SELECT @ID = MAX(RIGHT(ma_ncc, 2)) FROM NhaCungCap
		SELECT @ID = CASE
			WHEN @ID >= 0 and @ID < 9 THEN 'NCC0' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 9 THEN 'NCC' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
		END
	RETURN @ID
END 
GO

CREATE TABLE NhaCungCap
(
    ma_ncc VARCHAR(5) CONSTRAINT KC_NCC PRIMARY KEY CONSTRAINT IDNCC DEFAULT DBO.AUTO_IDNCC(),
    ten_ncc VARCHAR(200) NOT NULL,
    sdt VARCHAR(10) NOT NULL,
    dia_chi VARCHAR(150) NOT NULL
);

GO
CREATE FUNCTION AUTO_IDPX()
RETURNS VARCHAR(5)
AS
BEGIN
	DECLARE @ID VARCHAR(5)
	IF (SELECT COUNT(ma_phieu_xuat) FROM PhieuXuat) = 0
		SET @ID = '0'
	ELSE
		SELECT @ID = MAX(RIGHT(ma_phieu_xuat, 3)) FROM PhieuXuat
		SELECT @ID = CASE
			WHEN @ID >= 0 and @ID < 9 THEN 'PX00' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 9 and @ID < 99 THEN 'PX0' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 99 THEN 'PX' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
		END
	RETURN @ID
END 
GO

CREATE TABLE PhieuXuat
(
    ma_phieu_xuat VARCHAR(5) CONSTRAINT KC_PX PRIMARY KEY CONSTRAINT IDPX DEFAULT DBO.AUTO_IDPX(),
    ngay_tao DATE DEFAULT CONVERT(DATE,GETDATE()),
    ma_ch VARCHAR(5) NOT NULL,
    ma_nd VARCHAR(3) NOT NULL,
	trang_thai BIT DEFAULT 0,
	ngay_xuat DATE,
    CONSTRAINT PK_PX_CH FOREIGN KEY (ma_ch) REFERENCES CuaHang(ma_ch),
    CONSTRAINT PK_PX_ND FOREIGN KEY (ma_nd) REFERENCES NguoiDung(ma_nd)
);

CREATE TABLE ChiTietPhieuXuat
(
    ma_phieu_xuat VARCHAR(5),
    ma_sp VARCHAR(5),
    so_luong INT NOT NULL,
	CONSTRAINT KC_CTPX PRIMARY KEY (ma_phieu_xuat, ma_sp),
    CONSTRAINT PK_CTPX_PX FOREIGN KEY (ma_phieu_xuat) REFERENCES PhieuXuat(ma_phieu_xuat),
    CONSTRAINT PK_CTPX_SP FOREIGN KEY (ma_sp) REFERENCES SanPham(ma_sp)
);

GO
CREATE FUNCTION AUTO_IDDSP()
RETURNS VARCHAR(5)
AS
BEGIN
	DECLARE @ID VARCHAR(5)
	IF (SELECT COUNT(ma_day) FROM DaySP) = 0
		SET @ID = '0'
	ELSE
		SELECT @ID = MAX(RIGHT(ma_day, 2)) FROM DaySP
		SELECT @ID = CASE
			WHEN @ID >= 0 and @ID < 9 THEN 'DSP0' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 9 THEN 'DSP' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
		END
	RETURN @ID
END 
GO

CREATE TABLE DaySP
(
    ma_day VARCHAR(5) CONSTRAINT KC_D PRIMARY KEY CONSTRAINT IDDSP DEFAULT DBO.AUTO_IDDSP(),
	suc_chua INT NOT NULL,
	khu VARCHAR(15) NOT NULL,
);
  
CREATE TABLE ChiTietDay
(
	ma_sp VARCHAR(5),
    ma_day VARCHAR(5),
	so_luong INT NOT NULL,
	ghi_chu VARCHAR(200),
	CONSTRAINT KC_CTD PRIMARY KEY (ma_sp, ma_day),
    CONSTRAINT PK_CTD_SP FOREIGN KEY (ma_sp) REFERENCES SanPham(ma_sp),
    CONSTRAINT PK_CTD_D FOREIGN KEY (ma_day) REFERENCES DaySP(ma_day)
);
GO
CREATE FUNCTION AUTO_IDPN()
RETURNS VARCHAR(5)
AS
BEGIN
	DECLARE @ID VARCHAR(5)
	IF (SELECT COUNT(ma_phieu_nhap) FROM PhieuNhap) = 0
		SET @ID = '0'
	ELSE
		SELECT @ID = MAX(RIGHT(ma_phieu_nhap, 3)) FROM PhieuNhap
		SELECT @ID = CASE
			WHEN @ID >= 0 and @ID < 9 THEN 'PN00' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 9 and @ID < 99 THEN 'PN0' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 99 THEN 'PN' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
		END
	RETURN @ID
END
GO

CREATE TABLE PhieuNhap
(
    ma_phieu_nhap VARCHAR(5) CONSTRAINT KC_PN PRIMARY KEY CONSTRAINT IDPN DEFAULT DBO.AUTO_IDPN(),
    ngay_tao DATE DEFAULT CONVERT(DATE,GETDATE()),
	ma_ncc VARCHAR(5) NOT NULL,
    ma_nd VARCHAR(3) NOT NULL,
	trang_thai BIT DEFAULT 0,
	ngay_nhap DATE,
	ghi_chu varchar(200),
    CONSTRAINT PK_PN_NCC FOREIGN KEY (ma_ncc) REFERENCES NhaCungCap(ma_ncc),
    CONSTRAINT PK_PN_ND FOREIGN KEY (ma_nd) REFERENCES NguoiDung(ma_nd)
);

CREATE TABLE ChiTietPhieuNhap
(
    ma_phieu_nhap VARCHAR(5),
    ma_sp VARCHAR(5),
    so_luong INT NOT NULL,
	CONSTRAINT KC_CTPN PRIMARY KEY (ma_phieu_nhap, ma_sp),
    CONSTRAINT PK_PN FOREIGN KEY (ma_phieu_nhap) REFERENCES PhieuNhap(ma_phieu_nhap),
    CONSTRAINT PK_SP FOREIGN KEY (ma_sp) REFERENCES SanPham(ma_sp)
);

GO
CREATE OR ALTER VIEW viewDay
AS 
(select ma_day, suc_chua, khu,
(case when (select sum(so_luong) from ChiTietDay where ChiTietDay.ma_day = DaySP.ma_day group by ma_day) is not null then suc_chua-(select sum(so_luong) from ChiTietDay where ChiTietDay.ma_day = DaySP.ma_day group by ma_day) else suc_chua end) AS trong 
from DaySP);
GO

GO
CREATE OR ALTER VIEW viewPhieuXuat
AS
select PhieuXuat.ma_phieu_xuat, ngay_tao, ma_ch, ma_nd, trang_thai, ngay_xuat, (select sum(so_luong*gia_xuat) from ChiTietPhieuXuat join SanPham on ChiTietPhieuXuat.ma_sp=SanPham.ma_sp where ma_phieu_xuat=PhieuXuat.ma_phieu_xuat) as gia_tri_xuat from PhieuXuat;
GO

GO
CREATE OR ALTER VIEW viewPhieuNhap
AS
select PhieuNhap.ma_phieu_nhap, ngay_tao, ma_ncc, ma_nd, trang_thai, ngay_nhap, case when ma_ncc = 'NCC00' then (select sum(so_luong*gia_xuat) from ChiTietPhieuNhap join SanPham on ChiTietPhieuNhap.ma_sp=SanPham.ma_sp where ma_phieu_nhap=PhieuNhap.ma_phieu_nhap) else (select sum(so_luong*gia_nhap) from ChiTietPhieuNhap join SanPham on ChiTietPhieuNhap.ma_sp=SanPham.ma_sp where ma_phieu_nhap=PhieuNhap.ma_phieu_nhap) end as gia_tri_nhap, ghi_chu from PhieuNhap;
GO

GO
CREATE OR ALTER VIEW viewCuaHang
as
select CuaHang.ma_ch,CuaHang.ten_ch,sdt,dia_chi,(select count(ma_ch) from viewPhieuXuat where viewPhieuXuat.ma_ch = CuaHang.ma_ch and trang_thai = 1) as so_phieu_da_xuat, (select count(ma_ch) from viewPhieuXuat where viewPhieuXuat.ma_ch = CuaHang.ma_ch and trang_thai = 0) as so_phieu_chua_xuat, (SELECT sum(gia_tri_xuat) from viewPhieuXuat where viewPhieuXuat.ma_ch = CuaHang.ma_ch and trang_thai = 1) as tong_gia_tri_xuat from CuaHang
GO

GO
CREATE OR ALTER VIEW viewNhaCungCap
as
select NhaCungCap.ma_ncc,NhaCungCap.ten_ncc,sdt,dia_chi,(select count(ma_ncc) from viewPhieuNhap where viewPhieuNhap.ma_ncc = NhaCungCap.ma_ncc and trang_thai = 1) as so_phieu_da_nhap, (select count(ma_ncc) from viewPhieuNhap where viewPhieuNhap.ma_ncc = NhaCungCap.ma_ncc and trang_thai = 0) as so_phieu_chua_nhap, (SELECT sum(gia_tri_nhap) from viewPhieuNhap where viewPhieuNhap.ma_ncc = NhaCungCap.ma_ncc and trang_thai = 1) as tong_gia_tri_nhap from NhaCungCap
GO

GO
CREATE OR ALTER VIEW viewSanPham
AS
select ma_sp, ten_sp, loai_sp, hang, mau_sac, kieu_dang, chat_lieu, gia_nhap, gia_xuat, don_vi,(select sum(so_luong) from ChiTietDay where ChiTietDay.ma_sp = SanPham.ma_sp group by ma_sp) as so_luong_ton from SanPham
GO

INSERT INTO DaySP
(ma_day,suc_chua,khu)
VALUES
('DSP01',100,'Xe dap'),
('DSP02',100,'Xe dap'),
('DSP03',100,'Xe dap'),
('DSP04',100,'Xe dap'),
('DSP05',100,'Xe dap'),
('DSP06',100,'Xe dap'),
('DSP07',100,'Xe dap'),
('DSP08',100,'Xe dap'),
('DSP09',100,'Xe dap'),
('DSP10',100,'Xe dap'),

('DSP11',50,'Phu tung'),
('DSP12',50,'Phu tung'),
('DSP13',50,'Phu tung'),
('DSP14',50,'Phu tung'),
('DSP15',50,'Phu tung')

INSERT INTO SanPham
(ma_sp,ten_sp,loai_sp,hang,mau_sac,kieu_dang,chat_lieu,gia_nhap,gia_xuat,don_vi)
VALUES
('SP001','Xe dap Giant Escape 3 D 2022','Xe dap','Giant','De','Duong pho','Khung nhom',8400000,10500000,'Chiec'),
('SP002','Xe dap Twitter Leopard RS30 2022','Xe dap','Twitter','Bac','The thao','Khung cacbon 18K',10400000,13000000,'Chiec'),
('SP003','Xe dap Twitter R10 RS22 2022','Xe dap','Twitter','Bac','Dua','Khung hop kim cacbon NANO',13192000,16490000,'Chiec'),
('SP004','Xe dap Twitter Sniper Pro C 2021','Xe dap','Twitter','Den','Dua','Khung cacbon 18K',12712000,15890000,'Chiec'),
('SP005','Xe dap Giant Roam 4 Disc 2022','Xe dap','Giant','Xanh','Dia hinh','Khung hop kim nhom',9272000,11590000,'Chiec'),
('SP006','Xe dap Giant Ineed Esspresso 2023','Xe dap','Giant','Trang','The thao','Khung hop kim nhom',8400000,10500000,'Chiec'),
('SP007','Xe dap Giant Ineed Esspresso 2023','Xe dap','Giant','Vang','The thao','Khung hop kim nhom',8400000,10500000,'Chiec'),
('SP008','Xe dap Galaxy T5 Size 26 2022','Xe dap','Galaxy','Trang do','Dia hinh','Khung hop kim nhom',2872000,3590000,'Chiec'),
('SP009','Xe dap Galaxy CT9 Duke 600 vanh 24 2022','Xe dap','Galaxy','Den do','Dia hinh','Khung hop kim nhom',3192000,3990000,'Chiec'),
('SP010','Xe dap Galaxy MT16 Size 24 2022','Xe dap','Galaxy','Den tim','The thao','Khung hop kim thep',3032000,3790000,'Chiec'),
('SP011','Xe dap Chevaux Fuku','Xe dap','Chevaux','Xanh la','Gap','Khung hop kim nhom',5440000,6800000,'Chiec'),
('SP012','Xe dap Mypallas M246','Xe dap','Mypallas','Trang','Gap','Khung hop kim thep',4640000,5800000,'Chiec'),
('SP013','Xe dap Trinx Junior 1.0','Xe dap','Trinx','Cam','Tre em','Khung thep cuong luc',2800000,3500000,'Chiec'),
('SP014','Xe dap Trinx M114 2022','Xe dap','Trinx','Xam xanh duong','Tre em','Khung hop kim nhom 6061',4000000,5000000,'Chiec'),
('SP015','Xe dap tro luc Gaint XTC 1 E+','Xe dap','Giant','Xanh','Tro luc','Khung hop kim nhom',9272000,11590000,'Chiec'),
('SP016','Xe dap dien Gaint Elem 133S','Xe dap','Giant','Den','Dien','Khung hop kim nhom',18880000,23600000,'Chiec'),

('SP017','Ban dap Gineyea','Phu tung','Gineyea','Den','.','nhua',2400000,3000000,'Thung'),
('SP018','Bo va xam Sahoo','Phu tung','Sahoo','Den','.','.',400000,500000,'Thung'),
('SP019','Bom xe dap Stanlays','Phu tung','Stanlays','Vang','.','.',2000000,2500000,'Thung'),
('SP020','Tui treo khung xe dap B-Soul','Phu tung','B-Soul','Vang','.','canvas',1600000,2000000,'Thung'),
('SP021','Mu bao hiem xe dap Gaint GX5','Phu tung','Gaint','Vang','Thoi trang','.',3440000,4300000,'Thung'),
('SP022','Mu bao hiem xe dap Gaint X7','Phu tung','Gaint','Vang','.','.',4080000,5100000,'Thung'),
('SP023','Yen day SR Selle Royal Lookin silicon','Phu tung','Gineyea','Den','.','nhua',4240000,5300000,'Thung'),
('SP024','Bo va xam Suka','Phu tung','Suka','Den','.','.',400000,500000,'Thung'),
('SP025','Bom xe dap Nobita','Phu tung','Nobita','Vang','.','.',2000000,2500000,'Thung'),
('SP026','Tui treo khung xe dap Chaien','Phu tung','Chaien','Vang','.','canvas',1600000,2000000,'Thung')

INSERT INTO ChiTietDay
(ma_day,ma_sp,so_luong,ghi_chu)
VALUES
('DSP01','SP001',12,'3 xe bi xuoc'),
('DSP01','SP002',14,null),
('DSP01','SP003',26,null),
('DSP01','SP008',27,null),

('DSP02','SP001',17,null),
('DSP02','SP002',19,null),
('DSP02','SP005',14,null),

('DSP03','SP001',21,null),
('DSP03','SP004',31,null),
('DSP03','SP005',40,null),
('DSP03','SP007',8,null),

('DSP04','SP016',22,null),
('DSP04','SP008',15,null),
('DSP04','SP006',28,null),

('DSP05','SP015',24,null),
('DSP05','SP016',14,null),
('DSP05','SP006',17,null),

('DSP06','SP006',21,null),
('DSP06','SP002',23,null),
('DSP06','SP007',28,null),

('DSP07','SP007',23,null),
('DSP07','SP009',31,null),
('DSP07','SP014',20,null),

('DSP08','SP013',27,null),
('DSP08','SP004',19,null),
('DSP08','SP009',14,null),
('DSP08','SP015',26,null),

('DSP09','SP010',22,null),
('DSP09','SP011',32,null),
('DSP09','SP012',32,null),
('DSP09','SP014',14,null),

('DSP10','SP010',22,null),
('DSP10','SP003',30,null),
('DSP10','SP011',18,null),
('DSP10','SP012',18,null),
('DSP10','SP013',10,null),

('DSP11','SP017',11,null),
('DSP11','SP022',11,null),
('DSP11','SP019',10,null),

('DSP12','SP018',10,null),
('DSP12','SP017',3,null),
('DSP12','SP022',9,null),
('DSP12','SP024',7,null),
('DSP12','SP026',5,null),

('DSP13','SP019',12,null),
('DSP13','SP020',10,null),
('DSP13','SP018',2,null),
('DSP13','SP025',7,null),
('DSP13','SP024',13,null),

('DSP14','SP020',10,null),
('DSP14','SP021',11,null),
('DSP14','SP023',13,null),
('DSP14','SP025',12,null),

('DSP15','SP021',6,null),
('DSP15','SP018',8,null),
('DSP15','SP023',7,null),
('DSP15','SP025',8,null),
('DSP15','SP026',10,null)

INSERT INTO NguoiDung
(ma_nd,can_cuoc,chuc_vu,mat_khau,ten_nd,sdt,dia_chi,ngay_sinh,gioi_tinh)
VALUES
('N01','026302008567','Quan ly','1','Nguyen Nhat Minh','0832208168','Ha Noi','2002-7-8',0),
('N02','026302002589','Nhan vien tiep nhan','1','Le Thanh Duy','0832204567','Ha Noi','2002-5-6',1),
('N03','026302002586','Nhan vien kiem ke','1','Bui Huy Thanh','0948905215','Hai Duong','2002-9-9',1),
('N04','026302002535','Nghi viec','1','Trinh Tien Dung','098179589','Ha Nam','2002-4-5',1),
('N05','023465345643','Nhan vien tiep nhan','1','Nguyen Van A','083223535','Ha Noi','2002-5-6',1),
('N06','023534545345','Nhan vien kiem ke','1','Tran Thi B','093454735','Hai Duong','2002-9-9',0)

INSERT INTO CuaHang
(ma_ch,ten_ch,sdt,dia_chi)
VALUES
('CH001','Xe dap 88','0981794085','11/255 Hoang Mai'),
('CH002','Xe dap 89','0981798585','99/24 Kim Dong'),
('CH003','Xe dap 24h','0984958585','18/64 Le Trong Tan'),
('CH004','Xe dap 90','0981798584','89/24 Kim Dong'),
('CH005','Xe dap 24/7','0984958584','17/64 Le Trong Tan')

INSERT INTO PhieuXuat
(ma_phieu_xuat,ma_ch,ma_nd,ngay_tao,trang_thai,ngay_xuat)
VALUES
('PX001','CH002','N02','2021-1-4',1,'2021-1-8'),
('PX002','CH003','N05','2021-1-11',1,'2021-1-19'),

('PX003','CH002','N02','2021-2-13',1,'2021-2-15'),

('PX004','CH005','N05','2021-3-19',1,'2021-3-22'),

('PX005','CH004','N05','2021-4-12',1,'2021-4-15'),
('PX006','CH002','N02','2021-7-16',1,'2021-7-18'),
('PX007','CH003','N02','2021-7-17',1,'2021-7-19'),

('PX008','CH001','N02','2022-1-5',1,'2022-1-6'),
('PX009','CH003','N05','2022-1-7',1,'2022-1-9'),
('PX010','CH004','N05','2022-1-16',1,'2022-1-19'),

('PX011','CH002','N02','2022-2-3',1,'2022-2-5'),
('PX012','CH005','N05','2022-2-12',1,'2022-2-13'),

('PX013','CH004','N05','2022-3-12',1,'2022-3-15'),
('PX014','CH002','N02','2022-3-16',1,'2022-3-18'),
('PX015','CH003','N02','2022-3-17',1,'2022-3-19'),

('PX016','CH003','N02','2022-4-5',1,'2022-4-7'),
('PX017','CH004','N05','2022-4-10',1,'2022-4-12'),
('PX018','CH005','N05','2022-4-12',1,'2022-4-13'),
('PX019','CH001','N02','2022-4-22',1,'2022-4-25'),

('PX020','CH002','N05','2022-5-16',1,'2022-5-18'),
('PX021','CH003','N02','2022-5-17',1,'2022-5-19'),

('PX022','CH001','N02','2022-6-5',1,'2022-6-6'),
('PX023','CH003','N05','2022-6-7',1,'2022-6-9'),
('PX024','CH004','N05','2022-6-16',1,'2022-6-19'),

('PX025','CH002','N02','2022-7-3',1,'2022-7-5'),
('PX026','CH005','N05','2022-7-12',1,'2022-7-13'),

('PX027','CH004','N05','2022-8-12',1,'2022-8-15'),
('PX028','CH002','N02','2022-8-16',1,'2022-8-18'),
('PX029','CH003','N02','2022-8-17',1,'2022-8-19'),

('PX030','CH003','N05','2022-9-5',1,'2022-9-7'),
('PX031','CH004','N02','2022-9-10',1,'2022-9-12'),
('PX032','CH005','N05','2022-9-12',1,'2022-9-13'),
('PX033','CH001','N05','2022-9-22',1,'2022-9-25'),
('PX034','CH001','N02','2022-9-25',1,'2022-9-26'),

('PX035','CH002','N02','2022-10-4',1,'2022-10-8'),
('PX036','CH003','N05','2022-10-11',1,'2022-10-19'),
('PX037','CH002','N02','2022-10-13',1,'2022-10-15'),
('PX038','CH005','N05','2022-10-19',1,'2022-10-22'),

('PX039','CH004','N05','2022-11-12',1,'2022-11-15'),
('PX040','CH002','N02','2022-11-16',1,'2022-11-18'),
('PX041','CH003','N02','2022-11-17',1,'2022-11-19'),


('PX042','CH002','N02','2022-12-4',1,'2022-12-8'),
('PX043','CH004','N05','2022-12-18',0,NULL),
('PX044','CH005','N02','2022-12-20',0,NULL)


INSERT INTO ChiTietPhieuXuat
(ma_phieu_xuat,ma_sp,so_luong)
VALUES
('PX001','SP001',12),
('PX001','SP002',14),
('PX001','SP003',15),
('PX001','SP017',6),
('PX001','SP018',5),
('PX001','SP019',10),

('PX002','SP001',16),
('PX002','SP004',18),
('PX002','SP005',17),
('PX002','SP020',8),
('PX002','SP017',7),

('PX003','SP006',26),
('PX003','SP007',16),
('PX003','SP008',21),
('PX003','SP002',22),
('PX003','SP021',10),
('PX003','SP022',11),

('PX004','SP008',12),
('PX004','SP009',14),
('PX004','SP001',15),
('PX004','SP002',25),
('PX004','SP018',10),
('PX004','SP019',4),

('PX005','SP010',15),
('PX005','SP003',14),
('PX005','SP011',16),
('PX005','SP023',5),
('PX005','SP020',6),

('PX006','SP012',10),
('PX006','SP003',20),
('PX006','SP004',22),
('PX006','SP013',24),
('PX006','SP024',4),
('PX006','SP021',3),

('PX007','SP014',26),
('PX007','SP015',16),
('PX007','SP006',14),
('PX007','SP025',5),
('PX007','SP024',6),

('PX008','SP016',12),
('PX008','SP005',13),
('PX008','SP001',14),
('PX008','SP026',3),

('PX009','SP017',10),
('PX009','SP007',20),
('PX009','SP009',10),
('PX009','SP012',12),
('PX009','SP016',16),
('PX009','SP013',17),
('PX009','SP025',5),
('PX009','SP026',3),
('PX009','SP020',4),

('PX010','SP010',14),
('PX010','SP008',24),
('PX010','SP011',22),
('PX010','SP014',25),
('PX010','SP015',12),
('PX010','SP017',3),
('PX010','SP026',4),
('PX010','SP023',5),

('PX011','SP001',12),
('PX011','SP002',14),
('PX011','SP003',15),
('PX011','SP017',6),
('PX011','SP018',5),
('PX011','SP019',10),

('PX012','SP001',16),
('PX012','SP004',18),
('PX012','SP005',17),
('PX012','SP020',8),


('PX013','SP006',26),
('PX013','SP007',16),
('PX013','SP008',21),


('PX014','SP008',12),
('PX014','SP009',14),
('PX014','SP001',15),
('PX014','SP002',25),
('PX014','SP018',10),

('PX015','SP010',15),
('PX015','SP003',14),
('PX015','SP011',16),
('PX015','SP023',5),
('PX015','SP020',6),

('PX016','SP012',10),
('PX016','SP003',20),
('PX016','SP004',22),
('PX016','SP024',4),
('PX016','SP021',3),

('PX017','SP014',26),
('PX017','SP015',16),
('PX017','SP006',14),
('PX017','SP025',5),
('PX017','SP024',6),

('PX018','SP016',12),
('PX018','SP005',13),
('PX018','SP001',14),
('PX018','SP026',3),
('PX018','SP022',5),

('PX019','SP017',10),
('PX019','SP007',20),
('PX019','SP009',10),
('PX019','SP013',17),
('PX019','SP025',5),
('PX019','SP026',3),

('PX020','SP010',14),
('PX020','SP008',24),
('PX020','SP011',22),
('PX020','SP017',3),
('PX020','SP026',4),
('PX020','SP023',5),

('PX021','SP002',14),
('PX021','SP003',15),
('PX021','SP017',6),
('PX021','SP018',5),
('PX021','SP019',10),

('PX022','SP001',16),
('PX022','SP004',18),
('PX022','SP005',17),
('PX022','SP020',8),
('PX022','SP017',7),

('PX023','SP006',26),
('PX023','SP007',16),
('PX023','SP021',10),
('PX023','SP022',11),

('PX024','SP008',12),
('PX024','SP002',25),
('PX024','SP019',4),

('PX025','SP010',15),
('PX025','SP023',5),
('PX025','SP020',6),

('PX026','SP012',10),
('PX026','SP003',20),
('PX026','SP004',22),
('PX026','SP024',4),
('PX026','SP021',3),

('PX027','SP014',26),
('PX027','SP025',5),
('PX027','SP024',6),

('PX028','SP016',12),
('PX028','SP005',13),
('PX028','SP001',14),
('PX028','SP022',5),

('PX029','SP017',10),
('PX029','SP007',20),
('PX029','SP009',10),
('PX029','SP025',5),
('PX029','SP026',3),

('PX030','SP010',14),
('PX030','SP008',24),
('PX030','SP011',22),
('PX030','SP026',4),
('PX030','SP023',5),

('PX031','SP001',12),
('PX031','SP002',14),
('PX031','SP003',15),
('PX031','SP019',10),

('PX032','SP001',16),
('PX032','SP004',18),
('PX032','SP005',17),
('PX032','SP020',8),
('PX032','SP017',7),

('PX033','SP006',26),
('PX033','SP007',16),
('PX033','SP008',21),
('PX033','SP002',22),
('PX033','SP021',10),
('PX033','SP022',11),

('PX034','SP008',12),
('PX034','SP009',14),
('PX034','SP001',15),
('PX034','SP002',25),
('PX034','SP018',10),
('PX034','SP019',4),

('PX035','SP010',15),
('PX035','SP003',14),
('PX035','SP011',16),
('PX035','SP023',5),
('PX035','SP020',6),

('PX036','SP012',10),
('PX036','SP003',20),
('PX036','SP021',4),
('PX036','SP023',3),

('PX037','SP014',26),
('PX037','SP013',16),
('PX037','SP005',14),
('PX037','SP025',5),
('PX037','SP023',6),

('PX038','SP001',12),
('PX038','SP005',15),
('PX038','SP011',9),

('PX039','SP001',16),
('PX039','SP020',8),
('PX039','SP017',7),

('PX040','SP006',26),
('PX040','SP007',16),
('PX040','SP008',21),
('PX040','SP022',11),

('PX041','SP008',12),
('PX041','SP009',14),
('PX041','SP004',26),

('PX042','SP010',45),
('PX042','SP012',10),
('PX042','SP003',20),

('PX043','SP014',10),
('PX043','SP023',6),
('PX043','SP015',16),
('PX043','SP007',16),

('PX044','SP012',26),
('PX044','SP020',2),
('PX044','SP013',26)

INSERT INTO NhaCungCap
(ma_ncc,ten_ncc,sdt,dia_chi)
VALUES
('NCC00','Hoan hang','',''),
('NCC01','Bike 24h','0396421022','105 K10A Nguyen Hien'),
('NCC02','FgBike 24h','0964005166','32 Van Phuc, Ha Dong'),
('NCC03','Bike 2h','0396421023','106 K15A Nguyen Hien'),
('NCC04','FgBike 24/24h','0965005166','39 Van Phuc, Ha Dong')

INSERT INTO PhieuNhap
(ma_phieu_nhap,ma_ncc,ma_nd,ngay_tao,trang_thai,ngay_nhap,ghi_chu)
VALUES
('PN001','NCC01','N02','2021-1-11',1,'2021-1-15',NULL),
('PN002','NCC02','N05','2021-2-15',1,'2021-2-17',NULL),

('PN003','NCC04','N02','2021-4-5',1,'2021-4-7',NULL),
('PN004','NCC01','N05','2021-4-12',1,'2021-4-14',NULL),
('PN005','NCC02','N02','2021-5-15',1,'2021-5-17',NULL),
('PN006','NCC03','N05','2021-8-25',1,'2021-8-27',NULL),

('PN007','NCC01','N05','2021-9-3',1,'2021-9-5',NULL),
('PN008','NCC02','N02','2021-11-15',1,'2021-11-17',NULL),

('PN009','NCC02','N02','2021-12-5',1,'2021-12-7',NULL),
('PN010','NCC03','N05','2021-12-15',1,'2021-12-17',NULL),

('PN011','NCC01','N02','2022-1-1',1,'2022-1-2',NULL),
('PN012','NCC02','N05','2022-1-5',1,'2022-1-7',NULL),
('PN013','NCC03','N02','2022-1-15',1,'2022-1-17',NULL),
('PN014','NCC04','N05','2022-1-25',1,'2022-1-27',NULL),

('PN015','NCC01','N05','2022-2-13',1,'2022-2-15',NULL),
('PN016','NCC02','N02','2022-2-15',1,'2022-2-17',NULL),

('PN017','NCC03','N02','2022-3-1',1,'2022-3-2',NULL),
('PN018','NCC04','N05','2022-3-15',1,'2022-3-18',NULL),

('PN019','NCC02','N02','2022-4-5',1,'2022-4-7',NULL),
('PN020','NCC03','N05','2022-4-15',1,'2022-4-17',NULL),
('PN021','NCC04','N02','2022-4-25',1,'2022-4-27',NULL),

('PN022','NCC01','N05','2022-5-1',1,'2022-5-2',NULL),
('PN023','NCC02','N02','2022-5-5',1,'2022-5-7',NULL),
('PN024','NCC03','N05','2022-5-15',1,'2022-5-17',NULL),
('PN025','NCC04','N02','2022-5-25',1,'2022-5-27',NULL),
('PN026','NCC01','N05','2022-5-25',1,'2022-5-27',NULL),
('PN027','NCC02','N02','2022-5-28',1,'2022-5-29',NULL),

('PN028','NCC01','N02','2022-6-13',1,'2022-6-15',NULL),

('PN029','NCC03','N02','2022-7-5',1,'2022-7-7',NULL),
('PN030','NCC04','N05','2022-7-8',1,'2022-7-9',NULL),
('PN031','NCC01','N05','2022-7-13',1,'2022-7-15',NULL),
('PN032','NCC02','N02','2022-7-15',1,'2022-7-17',NULL),

('PN033','NCC01','N02','2022-8-1',1,'2022-8-2',NULL),
('PN034','NCC02','N05','2022-8-5',1,'2022-8-7',NULL),
('PN035','NCC03','N02','2022-8-15',1,'2022-8-17',NULL),

('PN036','NCC02','N02','2022-9-5',1,'2022-9-7',NULL),
('PN037','NCC03','N02','2022-9-7',1,'2022-9-8',NULL),
('PN038','NCC04','N05','2022-9-10',1,'2022-9-12',NULL),
('PN039','NCC01','N05','2022-9-13',1,'2022-9-15',NULL),
('PN040','NCC02','N02','2022-9-15',1,'2022-9-17',NULL),

('PN041','NCC01','N02','2022-10-11',1,'2022-10-15',NULL),
('PN042','NCC02','N05','2022-10-15',1,'2022-10-17',NULL),

('PN043','NCC04','N02','2022-11-5',1,'2022-11-7',NULL),
('PN044','NCC01','N05','2022-11-12',1,'2022-11-14',NULL),
('PN045','NCC02','N02','2022-11-15',1,'2022-11-17',NULL),
('PN046','NCC03','N05','2022-11-25',1,'2022-11-27',NULL),

('PN047','NCC01','N05','2022-12-3',1,'2022-12-5',NULL),
('PN048','NCC02','N02','2022-12-15',1,'2022-12-17',NULL),
('PN049','NCC01','N02','2022-12-18',0,NULL,NULL),
('PN050','NCC02','N05','2022-12-20',0,NULL,NULL),
('PN051','NCC00','N01','2022-02-01',1,'2022-02-01','PX042')



INSERT INTO ChiTietPhieuNhap
(ma_phieu_nhap,ma_sp,so_luong)
VALUES
('PN001','SP001',20),
('PN001','SP002',25),
('PN002','SP003',27),
('PN002','SP017',6),
('PN003','SP018',10),
('PN004','SP019',10),

('PN005','SP004',17),
('PN005','SP001',15),
('PN006','SP014',16),
('PN006','SP015',20),
('PN007','SP020',6),
('PN008','SP021',10),

('PN009','SP001',15),
('PN009','SP002',20),
('PN009','SP003',17),
('PN009','SP010',10),

('PN010','SP017',6),
('PN010','SP018',10),
('PN010','SP019',7),
('PN010','SP001',18),
('PN010','SP002',19),

('PN011','SP001',20),
('PN011','SP002',25),
('PN011','SP003',27),
('PN011','SP017',6),
('PN011','SP018',10),
('PN011','SP019',10),

('PN012','SP004',17),
('PN012','SP001',15),
('PN012','SP014',16),
('PN012','SP015',20),
('PN012','SP020',6),
('PN012','SP021',10),
('PN012','SP022',17),

('PN013','SP005',17),
('PN013','SP002',18),
('PN013','SP003',19),
('PN013','SP006',25),
('PN013','SP007',18),
('PN013','SP023',6),
('PN013','SP024',10),

('PN014','SP025',6),
('PN014','SP026',10),
('PN014','SP017',10),
('PN014','SP008',25),
('PN014','SP004',17),
('PN014','SP009',25),
('PN014','SP005',10),

('PN015','SP010',17),
('PN015','SP011',18),
('PN015','SP006',19),
('PN015','SP012',20),
('PN015','SP018',6),
('PN015','SP019',10),
('PN015','SP020',11),

('PN016','SP014',16),
('PN016','SP015',18),
('PN016','SP013',19),
('PN016','SP021',10),
('PN016','SP022',9),
('PN016','SP023',7),

('PN017','SP012',17),
('PN017','SP016',19),
('PN017','SP007',30),
('PN017','SP022',10),
('PN017','SP023',10),

('PN018','SP024',11),
('PN018','SP025',9),
('PN018','SP026',10),
('PN018','SP001',15),
('PN018','SP002',25),
('PN018','SP008',17),

('PN019','SP001',15),
('PN019','SP002',20),
('PN019','SP003',17),
('PN019','SP010',10),
('PN019','SP011',11),
('PN019','SP013',10),
('PN019','SP020',10),
('PN019','SP021',9),

('PN020','SP017',6),
('PN020','SP018',10),
('PN020','SP019',7),
('PN020','SP001',18),
('PN020','SP002',19),
('PN020','SP009',10),

('PN021','SP001',20),
('PN021','SP002',25),
('PN021','SP018',10),
('PN021','SP019',10),

('PN022','SP004',17),
('PN022','SP001',15),
('PN022','SP014',16),
('PN022','SP021',10),
('PN022','SP022',17),

('PN023','SP005',17),
('PN023','SP002',18),
('PN023','SP007',18),
('PN023','SP023',6),
('PN023','SP024',10),

('PN024','SP025',6),
('PN024','SP026',10),
('PN024','SP004',17),
('PN024','SP009',25),
('PN024','SP005',10),

('PN025','SP010',17),
('PN025','SP011',18),
('PN025','SP018',6),
('PN025','SP019',10),
('PN025','SP020',11),

('PN026','SP014',16),
('PN026','SP015',18),
('PN026','SP013',19),
('PN026','SP022',9),
('PN026','SP023',7),

('PN027','SP012',17),
('PN027','SP022',10),
('PN027','SP023',10),

('PN028','SP024',11),
('PN028','SP025',9),
('PN028','SP026',10),
('PN028','SP001',15),

('PN029','SP001',15),
('PN029','SP010',10),
('PN029','SP020',10),
('PN029','SP021',9),

('PN030','SP017',6),
('PN030','SP018',10),
('PN030','SP019',7),
('PN030','SP009',10),

('PN031','SP017',6),
('PN031','SP018',10),
('PN031','SP019',10),


('PN032','SP020',6),
('PN032','SP021',10),

('PN033','SP005',17),
('PN033','SP002',18),
('PN033','SP003',19),

('PN034','SP004',17),
('PN034','SP009',25),
('PN034','SP005',10),

('PN035','SP010',17), 
('PN035','SP018',6),
('PN035','SP019',10),
('PN035','SP020',11),

('PN036','SP014',16),
('PN036','SP021',10),
('PN036','SP022',9),
('PN036','SP023',7),

('PN037','SP012',17),
('PN037','SP022',10),
('PN037','SP023',10),

('PN038','SP024',11),
('PN038','SP025',9),
('PN038','SP026',10),
('PN038','SP001',15),
('PN038','SP002',25),
('PN038','SP008',17),

('PN039','SP001',15),
('PN039','SP002',20),
('PN039','SP003',17),
('PN039','SP020',10),
('PN039','SP021',9),

('PN040','SP017',6),
('PN040','SP018',10),
('PN040','SP002',19),
('PN040','SP009',10),

('PN041','SP001',20),
('PN041','SP002',25),
('PN041','SP017',6),
('PN041','SP018',10),
('PN041','SP019',10),

('PN042','SP004',17),
('PN042','SP001',15),
('PN042','SP020',6),
('PN042','SP021',10),
('PN042','SP022',17),

('PN043','SP005',17),
('PN043','SP002',18),
('PN043','SP007',18),
('PN043','SP023',6),
('PN043','SP022',10),

('PN044','SP025',6),
('PN044','SP022',10),
('PN044','SP015',10),
('PN044','SP009',25),
('PN044','SP005',10),

('PN045','SP010',17),
('PN045','SP018',6),
('PN045','SP019',10),
('PN045','SP020',11),

('PN046','SP014',16),
('PN046','SP012',18),
('PN046','SP013',19),
('PN046','SP021',10),
('PN046','SP023',7),

('PN047','SP012',17),
('PN047','SP016',19),
('PN047','SP022',10),
('PN047','SP023',10),

('PN048','SP024',11),
('PN048','SP023',9),
('PN048','SP002',25),
('PN048','SP008',17),

('PN049','SP001',15),
('PN049','SP002',20),
('PN049','SP018',10),
('PN049','SP021',9),

('PN050','SP017',6),
('PN050','SP016',10),
('PN050','SP015',7),
('PN050','SP009',10),

('PN051','SP003',10)
