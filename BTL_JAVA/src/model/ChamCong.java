/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;


public class ChamCong implements Serializable{
    private String ma;
    private String hoTen;
    private String gioVaoSang;
    private String gioRaSang;
    private String gioVaoChieu;
    private String gioRaChieu;
    private String ngayCham;
    private String gioLamNgay;
    private String gioLamThang;

    public ChamCong() {
    }

	public ChamCong(String ma, String hoTen, String gioVaoSang, String gioRaSang, String gioVaoChieu, String gioRaChieu,
			String ngayCham, String gioLamNgay, String gioLamThang) {
		
		this.ma = ma;
		this.hoTen = hoTen;
		this.gioVaoSang = gioVaoSang;
		this.gioRaSang = gioRaSang;
		this.gioVaoChieu = gioVaoChieu;
		this.gioRaChieu = gioRaChieu;
		this.ngayCham = ngayCham;
		this.gioLamNgay = gioLamNgay;
		this.gioLamThang = gioLamThang;
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

	public String getGioVaoSang() {
		return gioVaoSang;
	}

	public void setGioVaoSang(String gioVaoSang) {
		this.gioVaoSang = gioVaoSang;
	}

	public String getGioRaSang() {
		return gioRaSang;
	}

	public void setGioRaSang(String gioRaSang) {
		this.gioRaSang = gioRaSang;
	}

	public String getGioVaoChieu() {
		return gioVaoChieu;
	}

	public void setGioVaoChieu(String gioVaoChieu) {
		this.gioVaoChieu = gioVaoChieu;
	}

	public String getGioRaChieu() {
		return gioRaChieu;
	}

	public void setGioRaChieu(String gioRaChieu) {
		this.gioRaChieu = gioRaChieu;
	}

	public String getNgayCham() {
		return ngayCham;
	}

	public void setNgayCham(String ngayCham) {
		this.ngayCham = ngayCham;
	}

	public String getGioLamNgay() {
		return gioLamNgay;
	}

	public void setGioLamNgay(String gioLamNgay) {
		this.gioLamNgay = gioLamNgay;
	}

	public String getGioLamThang() {
		return gioLamThang;
	}

	public void setGioLamThang(String gioLamThang) {
		this.gioLamThang = gioLamThang;
	}
	
	
	public Object[] getObject() {
        return new Object[]{ma, hoTen, gioVaoSang, gioRaSang,gioVaoChieu,gioRaChieu, ngayCham, gioLamNgay, gioLamThang};
    }

    
}
