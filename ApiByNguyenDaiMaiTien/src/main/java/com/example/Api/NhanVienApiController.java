package com.example.Api;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/apii")
public class NhanVienApiController {
	@Autowired
	NhanVienService service;
//	1. Tạo các api sau
//	a. liệt kê tất cả các thông tin của thực thể
	@RequestMapping(value="/listnhanvien")
	public List<NhanVien> getAllNhanVien(){
		return service.getAllNhanVien();
	}
//	b. thêm mới 1 thực thể
	@RequestMapping(value="/addonenhanvien")
	public boolean addOneNhanVien(@RequestBody NhanVien nhanVien) {
		service.addOneNhanVien(nhanVien);
		return true;
	}
//	c. xóa 1 thực thể
	@RequestMapping(value="/deleteonenhanvien")
	public boolean deleteOneNhanVien(@RequestBody NhanVien nhanVien) {
		service.deleteOneNhanVien(nhanVien.getMaNv());
		return true;
	}
//	d. chỉnh sửa 1 thực thể
	@RequestMapping(value="/updateonenhanvien")
	public boolean updateOneNhanVien(@RequestBody NhanVien nhanVien) {
		service.updateOneNhanVien(nhanVien);
		return true;
	}
//	e. tìm kiếm các thực thể theo 1 lúc 2 thuộc tính ví dụ: tenSV, diaChi(tên và địa chỉ giống nhau)
	@RequestMapping(value="/timkiemnhanvien")
	public ResponseEntity<?> searchNhanVienTheoTenVaDiaChi(@Valid @RequestBody NhanVien nhanVien, Error errors){
//		return service.searchNhanVienTheoTenVaDiaChi(nhanVien.tenNv, nhanVien.address);
		AjaxBody result = new AjaxBody();

//		if (errors.hasErrors()) {
//
//            result.setMsg(errors.getAllErrors().stream().map(x -> x.getDefaultMessage()).collect(Collectors.joining(",")));
//            return ResponseEntity.badRequest().body(result);
//
//        }
        List<NhanVien> nhanViens = service.searchNhanVienTheoTenVaDiaChi(nhanVien.tenNv, nhanVien.address);
        if (nhanViens.isEmpty()) {
            result.setMsg("no user found!");
        } else {
            result.setMsg("success");
        }
        result.setResult(nhanViens);

        return ResponseEntity.ok(result);
	}
}
