/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


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
    private static final long serialVersionUID = 1L;
    
    public static List<ChamCong> chamCongs = new ArrayList<>();

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
	
	@Override
	public String toString() {
		return "ChamCong [ma=" + ma +  "]";
	}

	public static void ghiDuLieu() {
		try {
			FileOutputStream fos = new FileOutputStream("ChamCong.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			try {
				FileInputStream fis = new FileInputStream("NhanVien.bin");
				ObjectInputStream ois = new ObjectInputStream(fis);
				List<NhanVien> nvs = (List<NhanVien>) ois.readObject();
				ChamCong.chamCongs.removeAll(ChamCong.chamCongs);
				for (NhanVien nv : nvs) {
					ChamCong ccm = new ChamCong();
					ccm.setMa(nv.getMa());
					ccm.setHoTen(nv.getHoTen());
					ccm.setGioVaoSang("7:30");
					ccm.setGioRaSang("11:30");
					ccm.setGioVaoChieu("13:30");
					ccm.setGioRaChieu("17:30");
					ccm.setNgayCham("26/06/2024");
					ccm.setGioLamNgay("8");
					ccm.setGioLamThang("208");
					try {
						chamCongs.add(ccm);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				fis.close();
				ois.close();

			} catch (Exception e) {
			}
			
			oos.writeObject(ChamCong.chamCongs);
			fos.close();
			oos.close();
		} catch (Exception e) {
		}
	}

    
}
