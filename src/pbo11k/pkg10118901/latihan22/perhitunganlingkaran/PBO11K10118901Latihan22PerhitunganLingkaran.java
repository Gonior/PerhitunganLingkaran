/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan22.perhitunganlingkaran;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author Naniya
 */
public class PBO11K10118901Latihan22PerhitunganLingkaran {
    public static  final float PHI = (float) 3.1416;    
    public static void hitungLingkaran(double d) {
        float r, l, k; 
        r =(float) d/2;
        l =r * r * (float) PHI;
        k =(float) ((float) PHI * d);
        System.out.println("=======Hasil Perhitungan Lingkaran========");
        String rCm,lCm,kCm;
        rCm = Float.toString(r);
        lCm = Float.toString(l);
        kCm = Float.toString(k);
        System.out.println("Jari-jari lingkaran = "+rCm+" cm");
        System.out.println("Luas Lingkaran = "+lCm+" cm");
        System.out.println("Keliling lingkaran = "+kCm+" cm");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float n = 0;
        
        System.out.println("==========Perhitungan Lingkaran==========");
    
        do {
            System.out.print("Masukan nilai diameter lingkaran : ");
        try {
        n = input.nextFloat();
        } catch (Exception e) {
            System.out.println("Nilai diameter tidak sesuai");
            input.next();
        }
        } while( n <= 0);
        hitungLingkaran(n);
            
              
            
        
    }
    
}
