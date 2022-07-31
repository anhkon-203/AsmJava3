/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.Diem;
import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public interface DiemService {

    public ArrayList<Diem> getlstTop3();

    public Boolean Them(Diem d, String maSV);

    public Boolean Update(String maSV, Diem d);

    public Boolean delete(String maSV);

}
