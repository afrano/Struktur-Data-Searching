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
public class Binary {
    public static void main(String[] args) {
        int[] data = {23,56,45,12,67,86,43,66,99,25,61,5,78,76,33,63,5,8,15,20};
   // int cari = 99;
  int cari = 63;
  //  int cari = 20;              
        Arrays.sort(data);
        Searching search = new Searching();
        System.out.println("Setelah diurutkan:");
        search.cetak(data);
        //LAKUKAN PENCARIAN DENGAN BINARY SEARCH
        int a = search.binarySearch(data, cari);
        if (a >= 0) {
            System.out.println("Data ditemukan di indeks ke:" + a);
        } else {
            System.out.println("Data tidak ditemukan");
        }    }}
