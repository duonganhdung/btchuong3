/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giangVien;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class GVThingGiang extends GiangVien{
    private int soTiet;
    private double donGia;

    public GVThingGiang(int soTiet, double donGia, String hoTen, String diaChi, int loai) {
        super(hoTen, diaChi, loai);
        this.soTiet = soTiet;
        this.donGia = donGia;
    }

    public GVThingGiang() {
    }
    
    public void nhap()
    {
        super.nhap();
        Scanner s = new Scanner(System.in);
        System.out.print("so tiet = ");
        soTiet = Integer.parseInt(s.nextLine());
        System.out.print("don gia = ");
        donGia = Double.parseDouble(s.nextLine());
    }
    public double tinhLuong()
    {
        double luong = soTiet*donGia - 0.15*soTiet*donGia;
        return luong;
    }
    public void in()
    {
        super.in();
        System.out.print(tinhLuong());
        System.out.println("");
    }
}
