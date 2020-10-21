
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bintang.Ilham
 */
public class PerhitunganUlangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int benar, soal;
        Scanner input = new Scanner(System.in);
        
        System.out.println("============= Menghitung Nilai Ulangan =============");
        
        System.out.println("Masukkan Jumlah Soal Ulangan = ");
        soal = input.nextInt();
        
        System.out.println("Masukkan Jumlah Jawaban Yang Benar = ");
        benar = input.nextInt();
        
        int nilai =(benar*100)/soal;
        System.out.println("====================================================");
        System.out.println("Nilai Ulanganmu Adalah : " + nilai);
    }
    
}
  