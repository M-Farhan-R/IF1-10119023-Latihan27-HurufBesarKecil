/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan27.hurufbesarkecil;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R <farhan.10119023@mahasiswa.unikom.ac.id>
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program :
 *
 */
import java.util.Scanner;
public class IF110119023Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scan.next();
        
        System.out.println();
        System.out.println("=====Hasil Formatting=====");
        System.out.println("Huruf besar : "+kalimat.toUpperCase());
        System.out.println("Huruf kecil : "+kalimat.toLowerCase());
    }

}
