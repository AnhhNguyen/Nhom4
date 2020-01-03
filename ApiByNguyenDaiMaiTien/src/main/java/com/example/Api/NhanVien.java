package com.example.Api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NhanVien {
	public Integer maNv;
	public String tenNv;
	public String gioiTinh;
	public Integer tuoi;
	public String address;
	public String soPhone;
	public String email;
	public NhanVien(Integer maNv, String tenNv, String gioiTinh, Integer tuoi, String address, String soPhone,
			String email) {
		super();
		this.maNv = maNv;
		this.tenNv = tenNv;
		this.gioiTinh = gioiTinh;
		this.tuoi = tuoi;
		this.address = address;
		this.soPhone = soPhone;
		this.email = email;
	}
	public NhanVien() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getMaNv() {
		return maNv;
	}
	public void setMaNv(Integer maNv) {
		this.maNv = maNv;
	}
	public String getTenNv() {
		return tenNv;
	}
	public void setTenNv(String tenNv) {
		this.tenNv = tenNv;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public Integer getTuoi() {
		return tuoi;
	}
	public void setTuoi(Integer tuoi) {
		this.tuoi = tuoi;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSoPhone() {
		return soPhone;
	}
	public void setSoPhone(String soPhone) {
		this.soPhone = soPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
