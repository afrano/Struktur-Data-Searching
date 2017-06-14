/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

/**
 *
 * @author basisb16
 */
public class JustTestSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("120005", "Slamet");
        Mahasiswa mhs2 = new Mahasiswa("120001", "Joko");

        int x = mhs1.compareTo(mhs2);
        if(x==0){
            System.out.println("kedua mahasiswa mempunyai nim yang sama");}
        else if(x<0){
            System.out.println("NIM "+mhs1.getNama()+" lebih kecil dari NIM "+mhs2.getNama());
        }
        else {
            System.out.println("NIM "+mhs1.getNama()+" lebih besar dari "+mhs2.getNama());}
        }
    }

