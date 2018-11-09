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
public class Mahasiswa {
    public String nim;
    public String nama;
    public Float ipk;
    public static List<Mahasiswa> Mahasiswas = new ArrayList<>();

    public Mahasiswa() {
       
    }
    
    public Mahasiswa(String nim, String nama, Float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public Float getIpk() {
        return ipk;
    }

    public void setIpk(Float ipk) {
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
