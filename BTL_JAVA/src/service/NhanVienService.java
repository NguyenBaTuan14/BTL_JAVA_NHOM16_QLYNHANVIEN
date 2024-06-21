/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.NhanVien;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class NhanVienService implements InterfaceService<NhanVien> {

	public static List<NhanVien> nhanViens = new ArrayList<>();

	@Override
	public void insert(NhanVien t) {
		this.nhanViens.add(t);
	}

	@Override
	public void update(int index, NhanVien t) {
		this.nhanViens.set(index, t);
	}

	@Override
	public void delete(NhanVien t) {
		this.nhanViens.remove(t);
	}

	@Override
	public List<NhanVien> selectAll() {
		return this.nhanViens;
	}

	@Override
	public NhanVien selectMa(String ma) {
		for (NhanVien nv : nhanViens) {
			if (nv.getMa().equalsIgnoreCase(ma)) {
				return nv;
			}
		}
		return null;
	}

	@Override
	public List<NhanVien> selectName(String name) {
		List<NhanVien> ketQua = new ArrayList<>();
		for (NhanVien nv : nhanViens) {
			if (nv.getHoTen().equalsIgnoreCase(name)) {
				ketQua.add(nv);
			}
		}
		return ketQua;
	}

	@Override
	public void sortMa() {
		nhanViens.sort((o1, o2) -> {
			return o1.getMa().compareToIgnoreCase(o2.getMa());
		});
	}

	public void sortTen() {
		nhanViens.sort((o1, o2) -> {
			String name1 = o1.getHoTen().substring(o1.getHoTen().lastIndexOf(" "));
			String name2 = o2.getHoTen().substring(o2.getHoTen().lastIndexOf(" "));
			return name1.compareToIgnoreCase(name2);
		});
	}

	@Override
	public List<NhanVien> searchByMa(List<NhanVien> listNV, String nv) {
		List<NhanVien> listSearch = new ArrayList<>();
		for (int i = 0; i < listNV.size(); i++) {
			if (listNV.get(i).getMa().contains(nv)) {
				listSearch.add(listNV.get(i));
			}
		}
		return listSearch;
	}

	@Override
	public List<NhanVien> searchByName(List<NhanVien> listNV, String ten) {
		List<NhanVien> listSearch = new ArrayList<>();
		for (int i = 0; i < listNV.size(); i++) {
			if (listNV.get(i).getHoTen().contains(ten)) {
				listSearch.add(listNV.get(i));
			}
		} 
		return listSearch;
	}

	public static void ghiDuLieu() {
		try {
			FileOutputStream fos = new FileOutputStream("NhanVien.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(NhanVienService.nhanViens);
			fos.close();
			oos.close();
		} catch (Exception e) {
		}
	}

	public static void binaryOutputFile() throws IOException {
		FileOutputStream of = new FileOutputStream("NhanVien.bin");
		DataOutputStream out = new DataOutputStream(of);

		for (int j = 0; j < NhanVienService.nhanViens.size(); j++) {
			out.writeUTF(NhanVienService.nhanViens.get(j).getMa());
			out.writeUTF(NhanVienService.nhanViens.get(j).getHoTen());
			out.writeInt(NhanVienService.nhanViens.get(j).getNamSinh());
			out.writeBoolean(NhanVienService.nhanViens.get(j).isGioiTinh());
			out.writeUTF(NhanVienService.nhanViens.get(j).getSdt());
			out.writeUTF(NhanVienService.nhanViens.get(j).getCccd());
			out.writeUTF(NhanVienService.nhanViens.get(j).getDiaChi());

		}
		out.close();

	}

	public static void binaryInputFile(String maNV, String hoTen, int namSinh, boolean gioiTinh, String sdt,
			String cccd, String diaChi) throws IOException {
		FileInputStream inf = new FileInputStream("NhanVien.bin");
		DataInputStream in = new DataInputStream(inf);
		String ma, ten;
		int namsinh;
		boolean gioitinh;
		String Sdt, Cccd, diachi;
		
		ma = in.readUTF();
		ten = in.readUTF();
		namsinh = in.readInt();
		gioitinh = in.readBoolean();
		Sdt = in.readUTF();
		Cccd = in.readUTF();
		diachi = in.readUTF();
			
		
		in.close();
	}
}
