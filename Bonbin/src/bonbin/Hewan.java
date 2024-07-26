/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonbin;

/**
 *
 * @author hafidzxp
 */
public class Hewan {
    
    public String Paru_paru = "paru - paru";
    public String Insang = "insang";
    private String Nama = "paus";
    
    
   public Hewan(){
       System.out.println("aku hewan");
   }
   public void makan(){
      System.out.println("hewan ini bisa makan"); 
   }
   
   public String getNama(){
       return this.Nama;
   }
   
   public void setNama(String Nama){
       this.Nama = Nama;
   }
}
