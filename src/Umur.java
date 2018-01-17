/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Muhammad Muizuddin
 */
import java.util.Scanner;
public class Umur {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int umur;
        String nama;
        
        System.out.println("Sila masukkan nama anda: ");
        nama = input.nextLine();
        System.out.println("Sila masukkan umur: ");
        umur = input.nextInt();
        
        if(umur<=44){
        System.out.println("anda masih muda dan cantik");    
        }
        else if(umur>45){
        System.out.println("Anda sudah tua dan perlukan rehat");
        }
    }
}
        
        