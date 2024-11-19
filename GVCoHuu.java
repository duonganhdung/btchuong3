
package giangVien;

import java.util.Scanner;

public class GVCoHuu extends GiangVien {

    private int heSoLuong;
    private double luongCoBan;
    private int thamNien;

    public GVCoHuu(String hoTen, String diaChi, int loai) {
        super(hoTen, diaChi, loai);
    }

    public GVCoHuu(int heSoLuong, double luongCoBan, int thamNien, String hoTen, String diaChi, int loai) {
        super(hoTen, diaChi, loai);
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
        this.thamNien = thamNien;
    }

    public GVCoHuu() {
    }
    
    public void nhap()
    {
        super.nhap();
        Scanner s = new Scanner(System.in);
        System.out.print("he so luong = ");
        heSoLuong = Integer.parseInt(s.nextLine());
        System.out.print("luong co ban = ");
        luongCoBan = Double.parseDouble(s.nextLine());
        System.out.print("tham nien giang vien : ");
        thamNien = Integer.parseInt(s.nextLine());
    }
    public double tinhLuong()
    {
        double phuCap = 0;
        if (thamNien >= 5)
        {
            phuCap = luongCoBan * thamNien / 100;
        }
        return luongCoBan*heSoLuong + phuCap;
    }
    public void in()
    {
        super.in();
        System.out.print(tinhLuong());
        System.out.println("");
        
    }

}
