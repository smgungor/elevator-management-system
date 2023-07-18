
import java.math.MathContext;
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
public class Kontrol implements Runnable{
    Bilgi bilgi;
    
    int toplamKuyruk;
    
    public static boolean[] calisanAsansor = new boolean[5];
    
    public Kontrol(Bilgi bilgi){
        this.bilgi = bilgi;
        toplamKuyruk=0;     
    }
    
    @Override
    public void run() {
        
        calisanAsansor[0] = true;
        for(int i=1;i<5;i++){
            calisanAsansor[i] = false;
        }
                        
        while(true){
            
            toplamKuyruk = 0;
            
            for(int i=0;i<5;i++){
                toplamKuyruk += bilgi.katlar.get(i).size();
            }
            
            int asansor_sayisi=(int) Math.ceil((double)toplamKuyruk/(double)20.0);
            
            /*System.out.println("Asansor Sayisi : " + asansor_sayisi);
            System.out.println("Toplam Kuyruk : " + toplamKuyruk);*/
            
            
            switch(asansor_sayisi){  
                case 1:
                    //calisanAsansor[0] = true;
                    calisanAsansor[1] = false;                    
                    calisanAsansor[2] = false;
                    calisanAsansor[3] = false;
                    calisanAsansor[4] = false;
                    break;
                case 2:
                    //System.out.println("İkinci asansor calisiyor!!!!!!!!!!!!!!!!");                    
                    calisanAsansor[1] = true;                    
                    calisanAsansor[2] = false;
                    calisanAsansor[3] = false;
                    calisanAsansor[4] = false;                    
                    break;
                case 3:                    
                    calisanAsansor[1] = true;
                    calisanAsansor[2] = true;
                    calisanAsansor[3] = false;
                    calisanAsansor[4] = false;                    
                    break;
                case 4:                    
                    calisanAsansor[1] = true;
                    calisanAsansor[2] = true;
                    calisanAsansor[3] = true;
                    calisanAsansor[4] = false;                    
                    break;
                case 5:                    
                    calisanAsansor[1] = true;
                    calisanAsansor[2] = true;
                    calisanAsansor[3] = true;
                    calisanAsansor[4] = true;                    
                    break;
            }
            
            
        }
        
    }
    
}
