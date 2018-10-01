/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117043.latihan25.ejaannama;

import java.util.Scanner;
/**
 *NAMA                 : Yusrizal Falahan
 * Kelas                : PBO-2 
 * NIM                  : 10117043
 * Deskripsi Program    : Program ini berisi perintah untuk mengeja huruf dari 
 *                        kata yang diinputkan 
 * @author Acer
 */
public class PBO210117043Latihan25ejaannama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nama;
         Scanner masuk = new Scanner (System.in);
        System.out.print("Masukkan Kata : ");nama=masuk.nextInt();
        String kata= masuk.nextLine();
       
        
        for (char x =1; x <= nama; x++){
        System.out.println("kata yang ke-"+x+":"+kata.length());
    }
        
            
        
      
    }
    
}
