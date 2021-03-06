package searching;

public class Search {
    public void cetak (Object[] data)
    {
        for (int i=0;i<data.length;i++)
            System.out.println(((Mahasiswa)data[i]).getNama()+" | "+((Mahasiswa)data[i]).getNama());
    }
        
public int sequensialSearch(Object[] data,Object cari)
    {   
        System.out.println("SEQUENTIAL SEARCH");
        int i;
        for (i=0;i<data.length;i++)
        {
            System.out.print("Iterasi ke-"+(i+1));
            System.out.println("[idx:"+i+"]");
            if (((Comparable)data[i]).compareTo(cari)==0) {
                System.out.println("Selesai");
                return i;
            }
        }
     
        return -1;   
    
}
public int binarySearch(Object[] data,Object cari)
    {            
        System.out.println("BINARY SEARCH");

        int IndekAwal;
        int IndekAkhir;
        int IndekTengah;
        int iterasi = 0;
                
        IndekAwal = 0;
        IndekAkhir = data.length - 1;
        
        while (IndekAwal<=IndekAkhir)
        {            
            System.out.print("Iterasi ke-" + iterasi++);
            
            //MENCARI TITIK TENGAH
            IndekTengah = (IndekAwal + IndekAkhir)/2;
            System.out.println(" [idx_awal:"+IndekAwal+", idx_akhir:"+IndekAkhir+", idx_tengah:"+IndekTengah+"]");    
            
            //PROSES MEMBAGI DATA MENJADI 2 BAGIAN SAMPAI TERSISA 1 DATA YANG DICARI
            if(((Comparable)data[IndekTengah]).compareTo(cari) == 0)
            {
                return IndekTengah;
            }
            else if(((Comparable)data[IndekTengah]).compareTo(cari) >0)
            {
                IndekAkhir = IndekTengah-1;                
            }
            else
            {
                IndekAwal = IndekTengah+1;
            }    
        }     
        return -1;
    }
}

