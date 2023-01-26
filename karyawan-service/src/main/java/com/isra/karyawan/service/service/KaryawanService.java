/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isra.karyawan.service.service;

import com.isra.karyawan.service.entity.Karyawan;
import com.isra.karyawan.service.repository.KaryawanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author IIISI
 */
@Service
public class KaryawanService {
    @Autowired
    private KaryawanRepository karyawanRepository;
    
    public Karyawan saveKaryawan(Karyawan karyawan){
        return karyawanRepository.save(karyawan);
    }
    
    public Karyawan findKaryawanById(Long karyawanId){
        return karyawanRepository.findByKaryawanId(karyawanId);
    }
}
