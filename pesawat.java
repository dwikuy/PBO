/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihantiket;
import java.util.Scanner;

/**
 *
 * @author PCL-B00-00
 */
public class Latihantiket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
               int total;
              
               String disc;
        System.out.println("             PEMESANAN TIKET PESAWAT              ");
        System.out.println("");
        System.out.println(" Kode Penerbangan.   Nama Maskapai                        Harga Tiket        ");
        System.out.println("............................................");
        System.out.println(" GA168 \t|\Garuda Indonesia      ");
        System.out.println(" Tujuan\t|\tCGK - DPS          =      Rp 1.000.000   ");
        System.out.println(" GA169 \t|\tGaruda Indonesia    ");
        System.out.println(" Tujuan\t|\tDPS - CGK           =      Rp 1.100.000   ");
        System.out.println(" QG101 \t|\tCitilink  ");
        System.out.println(" Tujuan\t|\CGK - YIA             =      RP 800.000   ");
        System.out.println(" QG102 \t|\tCitilink  ");
        System.out.println(" Tujuan\t|\YIA - CGK             =      RP 850.000   ");
        System.out.println("............................................");
//      

       
//        inisialisasi pembayaran awal
         int harga = 0, jumlahtiket, tiketanak, a, b, TotalBayar;
        int GA168 = 1000000, GA169 = 1100000, QG101 = 800000, QG102 = 850000;
        int menu;

        for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
        System.out.println(".................................................");
//        pengguna memasukkan nomor pesanan
        
        System.out.print("Kode Penerbangan : ");
        int inNomor = in.nextInt();
        System.out.println(".................................................");

            switch (inNomor) {
                case 1:
                String Pesanan = " GA168 Garuda Indonesia Rute CGK - DPS   ";
                    System.out.println("Pilihan anda nomor " +inNomor + Pesanan);
                    harga = harga +GA168;
                    break;
                case 2:
                    menu = " GA169 Garuda Indonesia Rute DPS - CGK     ";
                    System.out.println("Pilihan anda nomor " +inNomor + menu);
                    harga = harga +GA169;
                    break;
                case 3:
                    menu = " QG101 Citilink Rute CGK - YIA";
                    System.out.println("Pilihan anda nomor " +inNomor + menu);
                    harga = harga +QG101 ;
                    break;
                case 4:
                    menu = " QG101 Citilink Rute YIA - CGK";
                    System.out.println("Pilihan anda nomor " +inNomor +menu);
                    harga = harga +QG102;
                    break;
            }
            //User diperintahkan untuk memasukkan data apakah dia akan melanjutkan atau tidak
            System.out.print("Jumlah Tiket : ");
            jumlahtiket=scan.nextInt();
            
            
            harga=harga*jumlahtiket+b;
            
            
            System.out.println("Apakah anda mau melanjutkan? Y/T");
            i = scan.next();

        }
       
     
        System.out.println("Total yang harus dibayar =Rp. " +harga );
        System.out.println("Segera Datang Ke Dianmart atau Absenmart untuk melakukan pembayaran ");
        System.out.println("                -TERIMA KASIH-               ");
    
    }
    
}
