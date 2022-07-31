/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.SinhVien;
import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public interface SinhVienService {

    public ArrayList<SinhVien> getList();

    public Boolean Add(SinhVien sinhVien);

    public Boolean Update(String maSV, SinhVien sinhVien);

    public Boolean Delete(String MaSV);
    
    public Boolean checkMaSV(String maSv);
    
   
}
