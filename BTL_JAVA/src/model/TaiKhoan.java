/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import service.NhanVienService;

public class TaiKhoan implements Serializable {
	
	public static List<TaiKhoan> taiKhoans = new ArrayList<>();
	
    public static String taiKhoanNho = "", matKhauNho = "";
    private String taiKhoan , matKhau;
    private static final long serialVersionUID = 1L;

    public TaiKhoan() {
    }

    public TaiKhoan(String taiKhoan, String matKhau) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    @Override
	public String toString() {
		return "TaiKhoan [taiKhoan=" + taiKhoan + ", matKhau=" + matKhau + "]";
	}

	public static void ghiDuLieu() {
		try {
			FileOutputStream fos = new FileOutputStream("TaiKhoan.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(TaiKhoan.taiKhoans);
			fos.close();
			oos.close();
		} catch (Exception e) {
		}
	}
}
