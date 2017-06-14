/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

import java.util.Arrays;

/**
 *
 * @author basisb16
 */
public class UjiBinarySearch {
    public static void main(String[] args) {
     
        Mahasiswa[] data = {
            new Mahasiswa("125314102", "Tommy"),
            new Mahasiswa("145314005", "Afrano"),
            new Mahasiswa("145314066", "Albert"),
            new Mahasiswa("145314031", "Donny"),
            new Mahasiswa("145314055", "Christo"),
            new Mahasiswa("145314101", "Jelis"),
            new Mahasiswa("145314108", "Maria"),
            new Mahasiswa("145314082", "Marianus"),
            new Mahasiswa("145314009", "Arie"),
            new Mahasiswa("145314061", "Vivi")};
        String saya,dia ;// just coba
        Mahasiswa cari = new Mahasiswa("145314055", "Christo");

        Arrays.sort(data);
        Search s = new  Search();
  
       int x = s.binarySearch(data, cari);
       if (x >=0) 
          System.out.println("Data ditemukan di indeks ke:"+x);  
       else
          System.out.println("Data tidak ditemukan");      
     
    }
}