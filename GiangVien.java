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
public abstract class GiangVien {
    private String hoTen;
    private String diaChi;
    private int loai;
    public void nhap()
    {
        Scanner s = new Scanner(System.in);
        System.out.print(" ho ten giang vien : ");
        hoTen = s.nextLine();
        System.out.print("dai chi cua giang vien : ");
        diaChi = s.nextLine();
        System.out.print("nhap 1 la gv thing giang 0 la gv huu co : ");
        loai = Integer.parseInt(s.nextLine());
    }

    public GiangVien() {
    }

    public GiangVien(String hoTen, String diaChi, int loai) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loai = loai;
    }
    
    public abstract double tinhLuong();

    @Override
    public String toString() {
        return "GiangVien{" + "hoTen=" + hoTen + ", diaChi=" + diaChi + ", loai=" + loai + '}';
    }
    
    public void in()
    {
        System.out.println("ho ten : " + hoTen);
        System.out.println("dai chi : " + diaChi);
        System.out.println("loai giang vien : " + ((loai == 1)?"giang vien thing giang" : "giang vien huu co"));
        System.out.print("luong thang : ");
    }
}
