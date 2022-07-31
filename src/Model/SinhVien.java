/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author anhkon
 */
public class SinhVien {
    private String maSv;
    private String ho_ten;
    private String email;
    private String so_dt;
    private int gioi_tinh;
    private String dia_chi;

    public SinhVien() {
    }

    public SinhVien(String maSv, String ho_ten, String email, String so_dt, int gioi_tinh, String dia_chi) {
        this.maSv = maSv;
        this.ho_ten = ho_ten;
        this.email = email;
        this.so_dt = so_dt;
        this.gioi_tinh = gioi_tinh;
        this.dia_chi = dia_chi;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSo_dt() {
        return so_dt;
    }

    public void setSo_dt(String so_dt) {
        this.so_dt = so_dt;
    }

    public int getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(int gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }
    
}
