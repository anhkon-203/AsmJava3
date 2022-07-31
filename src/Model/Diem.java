/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author anhkon
 */
public class Diem {

    private String ten_sv;
    private String maSV;
    private float tiengAnh;
    private float tinHoc;
    private float GDTC;
    private float diemTB;

    public Diem() {
    }

    public Diem(String maSV, float tiengAnh, float tinHoc, float GDTC, float diemTB) {
        this.maSV = maSV;
        this.tiengAnh = tiengAnh;
        this.tinHoc = tinHoc;
        this.GDTC = GDTC;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public float getTiengAnh() {
        return tiengAnh;
    }

    public void setTiengAnh(float tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    public float getTinHoc() {
        return tinHoc;
    }

    public void setTinHoc(float tinHoc) {
        this.tinHoc = tinHoc;
    }

    public float getGDTC() {
        return GDTC;
    }

    public void setGDTC(float GDTC) {
        this.GDTC = GDTC;
    }

    public float getDiemTB() {
        diemTB = (tiengAnh + tinHoc + GDTC) / 3;
        return diemTB;

    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public Diem(String ten_sv) {
        this.ten_sv = ten_sv;
    }

    public String getTen_sv() {
        return ten_sv;
    }

    public void setTen_sv(String ten_sv) {
        this.ten_sv = ten_sv;
    }

}
