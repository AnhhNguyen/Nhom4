package com.Kiemtra2812.Kiemtra2812;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

public class CongNhanService {

	@Autowired
	CongNhanDAO service;
	
	public List<CongNhan> getAll(){
		return service.findAll();
	}
	
	public void insertOne(CongNhan congNhan) {
		service.save(congNhan);
	}
	
	public void deleteOne(Integer maCn) {
		service.delete(maCn);
	}
	
	public void updateOne(CongNhan congNhan) {
		service.save(congNhan);
	}
	
	public List<CongNhan> searchCongNhanTheoTenVaDiaChi(String tenCn, String diaChi) {
		CongNhan congNhan = new CongNhan();
		congNhan.setTenCn(tenCn);
		congNhan.setDiaChi(diaChi);
		ExampleMatcher exampleMatcher = ExampleMatcher.matching().withIgnorePaths("tenCn").withIgnorePaths("ngaySinh")
				.withIgnorePaths("soGioLam").withIgnorePaths("ngayBDLam").withIgnorePaths("thuocNhom");
		List<CongNhan> congNhans = service.findAll(Example.of(congNhan, exampleMatcher));
		return congNhans;
	}
}
