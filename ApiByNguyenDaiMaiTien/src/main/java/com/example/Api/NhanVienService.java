package com.example.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

@Service
public class NhanVienService {
	@Autowired
	NhanVienDao daoNv;
//	1. Tạo các api sau
//	a. liệt kê tất cả các thông tin của thực thể
	public List<NhanVien> getAllNhanVien() {
		return daoNv.findAll();
	}

//	b. thêm mới 1 thực thể
	public void addOneNhanVien(NhanVien nhanVien) {
		daoNv.save(nhanVien);
	}

//	c. xóa 1 thực thể
	public void deleteOneNhanVien(Integer maNv) {
		daoNv.deleteById(maNv);
	}

//	d. chỉnh sửa 1 thực thể
	public void updateOneNhanVien(NhanVien nhanVien) {
		daoNv.save(nhanVien);
	}

//	e. tìm kiếm các thực thể theo 1 lúc 2 thuộc tính ví dụ: tenSV, diaChi(tên và địa chỉ giống nhau)
	public List<NhanVien> searchNhanVienTheoTenVaDiaChi(String tenNv, String address) {
		NhanVien nhanVien = new NhanVien();
		nhanVien.setTenNv(tenNv);
		nhanVien.setAddress(address);
		ExampleMatcher exampleMatcher = ExampleMatcher.matching().withIgnorePaths("maNv").withIgnorePaths("tuoi")
				.withIgnorePaths("soPhone").withIgnorePaths("email").withIgnorePaths("gioiTinh");
		List<NhanVien> nhanViens = daoNv.findAll(Example.of(nhanVien, exampleMatcher));
		return nhanViens;
	}
}
