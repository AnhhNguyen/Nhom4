package com.Kiemtra2812.Kiemtra2812;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class Controllermain {

	@Autowired
	CongNhanService service;
	
	@RequestMapping(value="/getAllCongNhan")
	public List<CongNhan> getAll(){
		return service.getAll();
	}
	
	@RequestMapping(value="/insertOne")
	public boolean insertOne(@RequestBody CongNhan congNhan ) {
		service.insertOne(congNhan);
		return true;
	}
	
	@RequestMapping(value="/deleteOne")
	public boolean deleteOne(@RequestBody CongNhan congNhan) {
		service.deleteOne(congNhan.getMaCn());
		return true;
	}
	
	@RequestMapping(value="/updateOne")
	public boolean updateOne(@RequestBody CongNhan congNhan) {
		service.updateOne(congNhan);
		return true;
	}
	
}
