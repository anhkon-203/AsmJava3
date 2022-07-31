/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Diem;
import Model.SinhVien;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public class DiemRepository {

    private DBconnection connection;

    public ArrayList<Diem> getlstTop3() {
        ArrayList<Diem> lstTop3 = new ArrayList<>();
        String sql = "	SELECT TOP 3 dbo.SinhVien.maSv,dbo.SinhVien.ho_ten,tieng_anh,tin_hoc,gdtc,(tieng_anh+tin_hoc+gdtc) / 3 AS TB\n"
                + "	FROM dbo.Diem JOIN dbo.SinhVien ON SinhVien.maSv = Diem.maSv\n"
                + "	ORDER BY TB DESC";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Diem d = new Diem();
                d.setMaSV(rs.getString(1));
                d.setTen_sv(rs.getString(2));
                d.setTiengAnh(rs.getFloat(3));
                d.setTinHoc(rs.getFloat(4));
                d.setGDTC(rs.getFloat(5));
                d.setDiemTB(rs.getFloat("TB"));
                lstTop3.add(d);
            }
        } catch (Exception e) {
        }
        return lstTop3;
    }
//
//    public ArrayList<Diem> getListFind(String maSv) {
//        ArrayList<Diem> lstFind = new ArrayList<>();
//        String sql = "SELECT  dbo.SinhVien.maSv,dbo.SinhVien.ho_ten,tieng_anh,tin_hoc,gdtc,(tieng_anh+tin_hoc+gdtc) / 3 AS TB\n"
//                + "	FROM dbo.Diem JOIN dbo.SinhVien ON SinhVien.maSv = Diem.maSv\n"
//                + "	WHERE SinhVien.maSv = ?";
//        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
//            ps.setString(1, maSv);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Diem d = new Diem();
//                d.setMaSv(rs.getString(1));
//                d.setTen(rs.getString(2));
//                d.setTieng_anh(rs.getDouble(3));
//                d.setTin_hoc(rs.getDouble(4));
//                d.setGdtc(rs.getDouble(5));
//                d.setAvg(rs.getDouble("TB"));
//                lstFind.add(d);
//            }
//        } catch (Exception e) {
//        }
//        return lstFind;
//    }

    public Boolean Them(Diem d ,String maSV) {
        String sql = "	INSERT INTO Diem(maSv,tieng_anh,tin_hoc,gdtc) VALUES (?,?,?,?)";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, maSV);
            ps.setFloat(2, d.getTiengAnh());
            ps.setFloat(3, d.getTinHoc());
            ps.setFloat(4, d.getGDTC());
//            d.getAvg();
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean Update(String maSV, Diem d) {
        String sql = "UPDATE dbo.Diem \n"
                + "SET tieng_anh = ? , tin_hoc = ? , gdtc = ?\n"
                + "WHERE maSv = ? ";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setFloat(1, d.getTiengAnh());
            ps.setFloat(2, d.getTinHoc());
            ps.setFloat(3, d.getGDTC());
            ps.setString(4, maSV);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean delete(String maSV) {
        String sql = "DELETE dbo.Diem\n"
                + "	WHERE maSv = ?";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, maSV);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
 
}
