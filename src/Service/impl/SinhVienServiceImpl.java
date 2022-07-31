/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Model.SinhVien;
import Repository.SinhVienRepository;
import Service.SinhVienService;
import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public class SinhVienServiceImpl implements SinhVienService{
    private SinhVienRepository lstRepo = new SinhVienRepository();

    
    
    @Override
    public ArrayList<SinhVien> getList() {
        return lstRepo.getListDB();
    }

    @Override
    public Boolean Add(SinhVien sinhVien) {
        return lstRepo.Add(sinhVien);
    }

    @Override
    public Boolean Update(String maSV, SinhVien sinhVien) {
        return lstRepo.Update(maSV, sinhVien);
    }

    @Override
    public Boolean Delete(String MaSV) {
        return lstRepo.Delete(MaSV);
    }

    @Override
    public Boolean checkMaSV(String maSv) {
        return lstRepo.checkMaSV(maSv);
    }



    
}
