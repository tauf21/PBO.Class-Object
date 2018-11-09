/*
 * Copyrigth (c) 2018, All right reserved
 * Written by tauf21, email : taufik.amary@gmail.com
 * Github : tauf21
 */
package program;

import java.util.Scanner;

/**
 *
 * @author Taufik Amaryansyah
 */
public class Main {


    public static void inputData() {
        Input in = new Input();
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan Nim   : ");
        String nim = s.nextLine();
        System.out.print("Masukan Nama  : ");
        String nama = s.nextLine();
        System.out.print("Masukan Ipk   : ");
        Float ipk = s.nextFloat();
        in.IsiData(nim, nama, ipk);
    }

    public static void MenuSort(){
     int pilih=0;   
     do{
        System.out.println("Tugas tentang class-object");
        System.out.println("--------------------------");
        System.out.println("1. Sort by NIM");
        System.out.println("2. Sort by Nama");
        System.out.println("3. Sort by IPK");
        System.out.println("4. Kembali ke awal");
        System.out.print("pilih : ");
        Scanner s = new Scanner(System.in);
        Sorting sort = new Sorting();
        pilih = s.nextInt();
        switch(pilih){
        case 1:
            sort.sortNim();
            break;
        case 2:
            sort.sortNama();
            break;
        case 3:
            sort.sortIpk();
            break;
        case 4:
            MenuUtama();
            break;
        }
    }while(pilih <= 4);
        System.out.println("Error 404");
        System.exit(0);
    }
    
    public static void MenuUtama() {
        Output out = new Output();
        int pilih = 0;
        do {
            System.out.println("");
            System.out.println("Tugas tentang class-object");
            System.out.println("--------------------------");
            System.out.println("1. Input data");
            System.out.println("2. Tampil data");
            System.out.println("3. Sorting data");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            Scanner s = new Scanner(System.in);
            pilih = s.nextInt();
            switch (pilih) {
                case 1:
                    inputData();
                    break;
                case 2:
                    out.tampilData();
                    break;
                case 3:
                    MenuSort();
                    break;
            }
        } while (pilih <= 3);
        System.exit(0);
    }

    public static void main(String[] args) {
        MenuUtama();
    }
    
}
