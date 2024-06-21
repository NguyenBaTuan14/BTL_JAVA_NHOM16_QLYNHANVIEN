/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.NhanVien;
import java.util.ArrayList;
import java.util.List;


public interface InterfaceService<T> {

    public void insert(T t);

    public void update(int index, T t);

    public void delete(T t);

    public void sortMa();

    public List<T> selectAll();

    public T selectMa(String ma);

    public List<T> selectName(String name);

    List<NhanVien> searchByMa(List<NhanVien> listNV, String nv);

    List<NhanVien> searchByName(List<NhanVien> listNV, String ten);
}
