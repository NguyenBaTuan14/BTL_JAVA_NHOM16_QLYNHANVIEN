package model;



import java.io.Serializable;

/**
*
* @author DELL
*/
public class ChamCong implements Serializable{
   private String ma;
   private String hoTen;
   private String gioVao;
   private String gioRa;
   private String ngayCham;
   private String gioLamNgay;
   private String gioLamThang;

   public ChamCong() {
   }

   public ChamCong(String ma, String hoTen, String gioVao, String gioRa, String ngayCham, String gioLamNgay, String gioLamThang) {
       this.ma = ma;
       this.hoTen = hoTen;
       this.gioVao = gioVao;
       this.gioRa = gioRa;
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

   public String getGioVao() {
       return gioVao;
   }

   public void setGioVao(String gioVao) {
       this.gioVao = gioVao;
   }

   public String getGioRa() {
       return gioRa;
   }

   public void setGioRa(String gioRa) {
       this.gioRa = gioRa;
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
       return new Object[]{ma, hoTen, gioVao, gioRa, ngayCham, gioLamNgay, gioLamThang};
   }
}

