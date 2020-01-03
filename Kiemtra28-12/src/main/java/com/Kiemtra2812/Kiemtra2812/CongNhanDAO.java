package com.Kiemtra2812.Kiemtra2812;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface CongNhanDAO extends JpaRepository<CongNhan, Integer>{

}
