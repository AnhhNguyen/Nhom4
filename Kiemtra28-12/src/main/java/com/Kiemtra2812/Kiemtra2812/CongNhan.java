package com.Kiemtra2812.Kiemtra2812;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CongNhan {

	public Integer maCn;
	public String tenCn;
	public String diaChi;
	public String ngaySinh;
	public String soGioLam;
	public String ngayBDLam;
	public String thuocNhom;
	
	
	
	public CongNhan(String tenCn, String diaChi, String ngaySinh, String soGioLam, String ngayBDLam, String thuocNhom) {
		super();
		this.tenCn = tenCn;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
		this.soGioLam = soGioLam;
		this.ngayBDLam = ngayBDLam;
		this.thuocNhom = thuocNhom;
	}
	public CongNhan() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getMaCn() {
		return maCn;
	}
	public void setMaCn(Integer maCn) {
		this.maCn = maCn;
	}
	public String getTenCn() {
		return tenCn;
	}
	public void setTenCn(String tenCn) {
		this.tenCn = tenCn;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getSoGioLam() {
		return soGioLam;
	}
	public void setSoGioLam(String soGioLam) {
		this.soGioLam = soGioLam;
	}
	public String getNgayBDLam() {
		return ngayBDLam;
	}
	public void setNgayBDLam(String ngayBDLam) {
		this.ngayBDLam = ngayBDLam;
	}
	public String getThuocNhom() {
		return thuocNhom;
	}
	public void setThuocNhom(String thuocNhom) {
		this.thuocNhom = thuocNhom;
	}
	
	
	
}
