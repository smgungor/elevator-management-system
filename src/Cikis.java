
import java.util.Random;
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
public class Cikis implements Runnable{
    Bilgi bilgi;
    Random random = new Random();
    static int cikisSayaci = 0;
    public Cikis(Bilgi bilgi){
        this.bilgi = bilgi;
    }
    
    
    
    @Override
    public void run() {
        while(true){
            int katno = random.nextInt(4)+1;
            int kacKisiCikacak = random.nextInt(5)+1;
            
            
                if(kacKisiCikacak<=bilgi.kat_kisi[katno]){
                    for(int i=0;i<kacKisiCikacak;i++){
                        bilgi.katlar.get(katno).add(0);
                        bilgi.kat_kisi[katno]--;
                    }
                }
                else{
                    while(bilgi.kat_kisi[katno]>0){
                        bilgi.katlar.get(katno).add(0);
                        bilgi.kat_kisi[katno]--;
                    }
                }
            
            /*else if(katno==2){
                if(kacKisiCikacak<=bilgi.kat_kisi[2]){
                    for(int i=0;i<kacKisiCikacak;i++){
                        bilgi.ikinciKatInsan.add(0);
                        bilgi.kat_kisi[2]--;
                    }
                }
                else{
                    while(bilgi.kat_kisi[2]>0){
                        bilgi.ikinciKatInsan.add(0);
                        bilgi.kat_kisi[2]--;
                    }
                }
            }
            else if(katno==3){
                if(kacKisiCikacak<=bilgi.kat_kisi[3]){
                    for(int i=0;i<kacKisiCikacak;i++){
                        bilgi.ucuncuKatInsan.add(0);
                        bilgi.kat_kisi[3]--;
                    }
                }
                else{
                    while(bilgi.kat_kisi[3]>0){
                        bilgi.ucuncuKatInsan.add(0);
                        bilgi.kat_kisi[3]--;
                    }
                }
            }
            else if(katno==4){
                if(kacKisiCikacak<=bilgi.kat_kisi[4]){
                    for(int i=0;i<kacKisiCikacak;i++){
                        bilgi.dorduncuKatInsan.add(0);
                        bilgi.kat_kisi[4]--;
                    }
                }
                else{
                    while(bilgi.kat_kisi[4]>0){
                        bilgi.dorduncuKatInsan.add(0);
                        bilgi.kat_kisi[4]--;
                    }
                }
            }*/                                    
            
            try {                
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cikis.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
            
            
            
            
            
        }
    }
    
}
