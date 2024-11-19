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
public class testGV {
    public static void main(String[] args) {
       
         Scanner s = new Scanner(System.in);
        int x ;
        System.out.print("so luong giang vien ");
        int n = Integer.parseInt(s.nextLine());
       while(n != 0)
       {
           while (true) {               
               try {
               System.out.println("nhap 1 de tham mot giao vien huu");
               System.out.println("nhap 2 de them mot giang vien huu co");
               x = Integer.parseInt(s.nextLine());
               switch (x) {
               case 1:
                   GVCoHuu a = new GVCoHuu();
                   a.nhap();
                   a.in();
                   break;
               case 2:
                    GVThingGiang b = new GVThingGiang();
                    b.nhap();
                    b.in();
                    break;
               case 0:
                   return;
               default:
                   System.out.println("vui long nhap lai ");
                   continue;
           }
              n--;
              break;
           }catch (Exception e) {
               
               System.out.println("nhap sai du lieu ");
           } 
           }
       }
    }
}
