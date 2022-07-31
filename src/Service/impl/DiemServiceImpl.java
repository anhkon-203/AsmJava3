/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Model.Diem;
import Repository.DiemRepository;
import Service.DiemService;
import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public class DiemServiceImpl implements DiemService {

    private DiemRepository lstRepo = new DiemRepository();

    @Override
    public ArrayList<Diem> getlstTop3() {
        return lstRepo.getlstTop3();
    }

    @Override
    public Boolean Them(Diem d, String maSV) {
        return lstRepo.Them(d, maSV);
    }

    @Override
    public Boolean Update(String maSV, Diem d) {
        return lstRepo.Update(maSV, d);

    }

    @Override
    public Boolean delete(String maSV) {
        return lstRepo.delete(maSV);
    }

}
