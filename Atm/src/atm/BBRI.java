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
public class BBRI extends BankIndonesia {
    
    private int saldo; 
    
    
    public BBRI(){
        super.setBungaPinjaman("AnakeBapak", 0.6); 
    }
    
    public int getSaldo(int pin){
        if(pin == 0001){
            return this.saldo;
        } 
        return 0;
    }
    
    public void setSaldo(int pin, int saldoBaru){
        if(pin == 0001){
            this.saldo = saldoBaru;
        }
    }    
    public void penarikan(int pin, int nominalPenarikan){
        if(pin == 0001){
            if(nominalPenarikan >= 50 && nominalPenarikan <= 10000 && this.saldo > nominalPenarikan){
                
                this.saldo = this.saldo-nominalPenarikan;
            }else{
                System.out.println("transaksi penarikan tidak valid");
            }
    }
    }
    
    public void penyetoran(int pin, int nominalPenyetoran){
        if(pin == 0001){
            if(nominalPenyetoran >= 50 && nominalPenyetoran <= 10000){
                this.saldo = this.saldo+nominalPenyetoran;
            }else{
                System.out.println("penyetoran tidak valid");
            }
        }
    }
}
