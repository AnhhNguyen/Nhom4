package com.example.Api;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface NhanVienDao extends JpaRepository<NhanVien, Integer>{

}
