/*
 * Copyrigth (c) 2018, All right reserved
 * Written by tauf21, email : taufik.amary@gmail.com
 * Github : tauf21
 */

package program;
import java.util.*;
/**
 *
 * @author Taufik Amaryansyah
 */
public class Sorting extends Mahasiswa{
    
    public void sortNim() {
        if (Mahasiswas.isEmpty()) {
            System.out.println("Data masih kosong");
        }else{
        Collections.sort(Mahasiswas, new Comparator<Mahasiswa>(){
            @Override
            public int compare(Mahasiswa t, Mahasiswa t1) {
                return t.getNim().compareTo(t1.getNim());
            }
            
        });
        
        int i=1;
        for (Mahasiswa mahasiswa : Mahasiswas) {
            System.out.println("Data ke - " + i++);
            System.out.println("Nim: " + mahasiswa.nim);
            System.out.println("Nama: " + mahasiswa.nama);
            System.out.println("IPK: " + mahasiswa.ipk);
        }
        }
    }
    
    public void sortNama() {
        if (Mahasiswas.isEmpty()) {
            System.out.println("Data masih kosong");
        }else{
        Collections.sort(Mahasiswas, new Comparator<Mahasiswa>(){
            @Override
            public int compare(Mahasiswa t, Mahasiswa t1) {
                return t.getNama().compareTo(t1.getNama());
            }
            
        });
        
        int i=1;
        for (Mahasiswa mahasiswa : Mahasiswas) {
            System.out.println("Data ke - " + i++);
            System.out.println("Nim: " + mahasiswa.nim);
            System.out.println("Nama: " + mahasiswa.nama);
            System.out.println("IPK: " + mahasiswa.ipk);
        }
        }
    }
    
    public void sortIpk() {
        if (Mahasiswas.isEmpty()) {
            System.out.println("Data masih kosong");
        }else{
        Collections.sort(Mahasiswas, new Comparator<Mahasiswa>(){
            @Override
            public int compare(Mahasiswa t, Mahasiswa t1) {
                return t.getIpk().compareTo(t1.getIpk());
            }
            
        });
        
        int i=1;
        for (Mahasiswa mahasiswa : Mahasiswas) {
            System.out.println("Data ke - " + i++);
            System.out.println("Nim: " + mahasiswa.nim);
            System.out.println("Nama: " + mahasiswa.nama);
            System.out.println("IPK: " + mahasiswa.ipk);
        }
        }
    }

}
