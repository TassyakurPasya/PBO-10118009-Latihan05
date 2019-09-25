/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambingglobal;

/**
 *
 * @author Lenovo
 * Nama : Tassyakur Pasya
 * Kelas : IF-01
 * NIM : 10118009
 * Matkul : PBO-01
 */
public class KambingGlobal {
   //variabel jumlahKambing menjadi variabel instance
    int jumlahKambing = 88;
    
    // Method untuk menampilkan jumlah kambing 
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: "+ jumlahKambing);
    }
    public void tambahKambing() {
        jumlahKambing = jumlahKambing+ 5;
        System.out.println("Jumlah kambing setelah ditambah: "+jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //menampilkan jumlah kambing yang ada saat program pertama x berjalan 
        kambingSusu.getJumlahKambing();
        
        //Menampilkan satu kambing 
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada 
        kambingSusu.getJumlahKambing();
                
    }
    
}
