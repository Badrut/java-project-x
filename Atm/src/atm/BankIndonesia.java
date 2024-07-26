/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author hafidzxp
 */
public class BankIndonesia {
    
    private double bungaTabungan;
    private double bungaPinjaman;
    
    public double getBungaPinjaman(String password){
        if(password.equals("AnakeBapak")){
            return  this.bungaPinjaman;
        }
        return 0;
    }
    
     public double getBungaTabungan(String password){
        if(password.equals("AnakeBapak")){
            return  this.bungaTabungan;
        }
        return 0;
    }
     
     public void setBungaPinjaman(String password , double bungaPinjamanNew){
          if(password.equals("AnakeBapak")){
            this.bungaPinjaman = bungaPinjamanNew;
        }
     }
     
     public void setBungaTabungan(String password , double bungaTabunganNew){
          if(password.equals("AnakeBapak")){
            this.bungaTabungan = bungaTabunganNew;
        }
     }
     
     public BankIndonesia(){
         this.bungaPinjaman = 0.02;
         this.bungaTabungan = 0.55;
     }
}
