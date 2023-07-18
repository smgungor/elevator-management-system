
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ONUR
 */
public class Giris implements Runnable {
    Bilgi bilgi;
    
    public Giris(Bilgi bilgi){
        this.bilgi = bilgi;
    }

    
    
    @Override
    public void run() {   
            
            while(true){
                
                int musteri = (int) (Math.random()*10)+1;
                int kat = (int) (Math.random()*4)+1;
                
                bilgi.kat_kisi[0] += musteri;
                
                for(int d=0;d<musteri;d++){
                    bilgi.katlar.get(0).add(kat);
                }
                
                //System.out.println("kac kisi gir:"+bilgi.kat_kisi[0]);                                
                
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Giris.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
    }
    
}
