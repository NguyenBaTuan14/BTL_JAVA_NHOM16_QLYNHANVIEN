/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class NhanVien implements Serializable{

    private String ma, hoTen;
    private int namSinh;
    private boolean gioiTinh;
    private String sdt, cccd, diaChi;

    public NhanVien() {
    }

    public NhanVien(String ma, String hoTen, int namSinh, boolean gioiTinh, String sdt, String cccd, String diaChi) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.cccd = cccd;
        this.diaChi = diaChi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Object[] getObject() {
        return new Object[]{ma, hoTen, namSinh, gioiTinh == true ? "Nam" : "Nữ", sdt, cccd, diaChi};
    }

    @Override
    public String toString() {
        return "NhanVien{" + "ma=" + ma + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", gioiTinh=" + gioiTinh + ", sdt=" + sdt + ", cccd=" + cccd + ", diaChi=" + diaChi + '}';
    }
    
}
