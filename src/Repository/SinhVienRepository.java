/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Diem;
import Model.SinhVien;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author anhkon
 */
public class SinhVienRepository {

    private DBconnection connection;

    public ArrayList<SinhVien> getListDB() {
        ArrayList<SinhVien> lstSV = new ArrayList<>();
        String sql = "	SELECT maSv,ho_ten,email,so_dt,gioi_tinh,dia_chi\n"
                + "	FROM dbo.SinhVien";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMaSv(rs.getString(1));
                sv.setHo_ten(rs.getString(2));
                sv.setEmail(rs.getString(3));
                sv.setSo_dt(rs.getString(4));
                sv.setGioi_tinh(rs.getInt(5));
                sv.setDia_chi(rs.getString(6));
                lstSV.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstSV;
    }


    public Boolean checkMaSV(String maSv) {
        boolean result = true;
        String sql = "	SELECT *\n"
                + "	FROM dbo.SinhVien\n"
                + "	WHERE maSv = ?";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, maSv);
            ResultSet rs = ps.executeQuery();
            result = rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public Boolean Add(SinhVien sinhVien) {
        String sql = "INSERT INTO dbo.SinhVien\n"
                + "(maSv,ho_ten,email,so_dt,gioi_tinh,dia_chi)\n"
                + "VALUES\n"
                + "(?,?,?,?,?,?)";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, sinhVien.getMaSv());
            ps.setString(2, sinhVien.getHo_ten());
            ps.setString(3, sinhVien.getEmail());
            ps.setString(4, sinhVien.getSo_dt());
            ps.setInt(5, sinhVien.getGioi_tinh());
            ps.setString(6, sinhVien.getDia_chi());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean Delete(String MaSV) {
        String sql = "DELETE dbo.SinhVien\n"
                + "WHERE maSv = ?";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, MaSV);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean Update(String maSV, SinhVien sinhVien) {
        String sql = "UPDATE dbo.SinhVien\n"
                + "SET ho_ten = ?, email = ? ,so_dt = ? ,gioi_tinh = ?, dia_chi = ?\n"
                + "WHERE maSv = ?";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, sinhVien.getHo_ten());
            ps.setString(2, sinhVien.getEmail());
            ps.setString(3, sinhVien.getSo_dt());
            ps.setInt(4, sinhVien.getGioi_tinh());
            ps.setString(5, sinhVien.getDia_chi());
            ps.setString(6, maSV);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
