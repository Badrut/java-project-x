
package bonbin;
public class Bonbin {
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mamalia Singa =  new Mamalia();
        Singa.makan();
        Singa.menyusui();
        Singa.setNama("Singa garong");
        System.out.println(Singa.getNama());
        System.out.println("singa bisa bernafas karena mempunyai "+Singa.Paru_paru);
        System.out.println("Singa juga bisa menyusui karena dia mempunyai susu berjumlah "+Singa.susu);
        
        Mamalia Paus = new Mamalia();
        Paus.makan();
        Paus.menyusui();
        Paus.setNama("Pakussss");
        System.out.println(Pauss.getNama());
        System.out.println("paus bisa bernafas karena mempunyai "+Paus.Paru_paru);
        System.out.println("paus juga bisa menyusui karena dia mempunyai susu berjumlah "+Paus.susu);
        
        Fish Nemo = new Fish();
        Nemo.makan();
        Nemo.setNama("Nemoooooooooooo");
        System.out.println(Nemo.getNama());
        Nemo.berenang();
        System.out.println("nemo bisa bernafas karena mempunyai "+Nemo.Insang);
        System.out.println("nemo bisa berenang karena nemo memiliki "+Nemo.sirip+" sirip");
                
    }
    
}
