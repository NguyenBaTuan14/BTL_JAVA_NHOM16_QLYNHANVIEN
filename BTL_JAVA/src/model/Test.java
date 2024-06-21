package model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class Test {
	public static void main(String[] args) {
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
			System.out.println(TaiKhoan.taiKhoans);

		} catch (Exception e) {
		}
	}
}
