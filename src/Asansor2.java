
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
public class Asansor2 implements Runnable{
    Bilgi bilgi;
    Kontrol kontrol;
    
    
    static ArrayList<Integer> gidilecekKat = new ArrayList<Integer>();
    static ArrayList<Integer> call = new ArrayList<Integer>();        
    static int katNo = 0;    
    
    
    public Asansor2(Bilgi bilgi) {
       this.bilgi = bilgi;   
       this.kontrol = new Kontrol(bilgi);
    }
    
    @Override
    public void run() {
        while(true){
            
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(MainAsansor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //System.out.println(kontrol.calisanAsansor[1]);
            if(kontrol.calisanAsansor[1] == true || gidilecekKat.size() > 0){
                
                synchronized(bilgi.lock1){

                    
                    //Şu an bulundugu katta baska kata gidecek musteri varsa onu asansore al
                    while(gidilecekKat.size()<10 && bilgi.katlar.get(katNo).size()>0 && kontrol.calisanAsansor[1]){
                        gidilecekKat.add(bilgi.katlar.get(katNo).get(0));
                        bilgi.katlar.get(katNo).remove(0);
                        if(katNo==0){
                            bilgi.kat_kisi[katNo]--;
                        }
                    }
                    


                    //Asansor icini kontrol et hidilecek hedefleri call'a ekle
                    for(int i=0;i<5;i++){
                        boolean br = false;
                        for(int j=0;j<call.size();j++){
                            if(call.get(j)==i){
                                br = true;
                                continue;
                            }
                        }
                        if(br){
                            continue;
                        }
                        for(int j=0;j<gidilecekKat.size();j++){
                            if(gidilecekKat.get(j)==i){
                                call.add(i);
                                break;  
                            }  
                        }
                    }



                    //Hangi katta sifira gidecek varsa o kati hedefe ekle
                    for(int i=0;i<5;i++){

                        boolean br = false;

                        if(i==katNo){
                            continue;
                        }

                        for(int j=0;j<call.size();j++){
                            if(call.get(j)==i){
                                br=true;
                                break;
                            }
                        }

                        if(br){
                            continue;
                        }

                        if(bilgi.katlar.get(i).size()>0){
                            call.add(i);
                        }

                    }

                    /*if(call.size()>0)
                    System.out.println("---------geldi-------"+call.get(0));*/

                    haraket();   
                }      
                /*System.out.println("katNo:"+katNo+" asansordeki kisi sayisi:"+gidilecekKat.size());
                System.out.println("kat 0:"+bilgi.kat_kisi[0]);
                System.out.println("kat 1:"+bilgi.kat_kisi[1]);
                System.out.println("kat 2:"+bilgi.kat_kisi[2]);
                System.out.println("kat 3:"+bilgi.kat_kisi[3]);
                System.out.println("kat 4:"+bilgi.kat_kisi[4]);
                System.out.println("kat 0:"+bilgi.katlar.get(0));
                System.out.println("kat 1:"+bilgi.katlar.get(1));
                System.out.println("kat 2:"+bilgi.katlar.get(2));
                System.out.println("kat 3:"+bilgi.katlar.get(3));
                System.out.println("kat 4:"+bilgi.katlar.get(4));*/
            }   
            
        }  
            
            
    }
    
    public void haraket(){
        if(call.size()>0){
            int a=0;
            if(call.get(0)>katNo){
                katNo++;
               if(katNo==call.get(0)){
                   call.remove(0);
               }
                for(int i=0;i<gidilecekKat.size();i++){
                    if(katNo==gidilecekKat.get(i)){
                        gidilecekKat.remove(i);
                        i--;
                        bilgi.kat_kisi[katNo]++;
                    }
                }
                
            }
            else if(call.get(0)<katNo){
                katNo--;
                if(katNo==call.get(0)){
                   call.remove(0);
                }
                if(katNo==0){
                    while(gidilecekKat.size()>0){
                        gidilecekKat.remove(0);
                    }
                }
            }
        }
    }
}
