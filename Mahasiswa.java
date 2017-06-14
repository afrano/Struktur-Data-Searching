/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

/**
 *
 * @author basisb16
 */
public class Mahasiswa implements Comparable {
    
    private String nim;
    private String nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
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

    @Override
    public int compareTo(Object o) {
       Mahasiswa mhs  = (Mahasiswa) o;
      int x = this.getNim().compareTo(mhs.getNim());//< -1 >1
      return x;
    }
    
}
