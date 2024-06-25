package model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class test {
	static List<ChamCong> listChamCong = new ArrayList<ChamCong>();
	public static void main(String[] args) {
		try {
			docFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(TaiKhoan.taiKhoans);
	}
	public static void docFile() {
		try {
			FileInputStream fis = new FileInputStream("TaiKhoan.bin");
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<TaiKhoan> tks = (List<TaiKhoan>) ois.readObject();
			TaiKhoan.taiKhoans.removeAll(TaiKhoan.taiKhoans);
			for (TaiKhoan tk : tks) {
				TaiKhoan.taiKhoans.add(tk);
			}
			fis.close();
			ois.close();

		} catch (Exception e) {
		}
	}

}
