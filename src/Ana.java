
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
public class Ana {

    
    public static void main(String[] args) {
        Bilgi bilgi = new Bilgi();
        
        
        Thread girt = new Thread(new Giris(bilgi));
        Thread cikt = new Thread(new Cikis(bilgi));
        Thread asansort = new Thread(new MainAsansor(bilgi));
        Thread kontrol = new Thread(new Kontrol(bilgi));
        Thread asansort2 = new Thread(new Asansor2(bilgi));
        Thread asansort3 = new Thread(new Asansor3(bilgi));
        Thread asansort4 = new Thread(new Asansor4(bilgi));
        Thread asansort5 = new Thread(new Asansor5(bilgi));
        
        
        //Threadlar Baslatiliyor
        girt.start();
        cikt.start();        
        kontrol.start();
        asansort.start();
        asansort2.start();
        asansort3.start();
        asansort4.start();
        asansort5.start();
        
        while (true) {   
            System.out.println("********************************************************************************************************");
            
            System.out.println("KATLARDAKI KISI SAYISI");
            System.out.println("0. Kat Kisi Sayisi : " + bilgi.kat_kisi[0] + " Kuyruk Saysisi : " + bilgi.katlar.get(0).size());
            System.out.println("1. Kat Kisi Sayisi : " + bilgi.kat_kisi[1] + " Kuyruk Saysisi : " + bilgi.katlar.get(1).size());
            System.out.println("2. Kat Kisi Sayisi : " + bilgi.kat_kisi[2] + " Kuyruk Saysisi : " + bilgi.katlar.get(2).size());
            System.out.println("3. Kat Kisi Sayisi : " + bilgi.kat_kisi[3] + " Kuyruk Saysisi : " + bilgi.katlar.get(3).size());
            System.out.println("4. Kat Kisi Sayisi : " + bilgi.kat_kisi[4] + " Kuyruk Saysisi : " + bilgi.katlar.get(4).size());
            System.out.println("Çıkış sayacı : " + Cikis.cikisSayaci);
            
            //Ana Asansor
            System.out.println("ANA ASANSOR");
            System.out.println("Active : "+Kontrol.calisanAsansor[0]);
            if(Kontrol.calisanAsansor[0]){
                System.out.println("\t\tmode : working");
            }else{
                System.out.println("\t\tmode : idle");
            }
            System.out.println("\t\tInsan Sayisi : " + MainAsansor.gidilecekKat.size());
            System.out.println("\t\tBulundugu Kat : "+ MainAsansor.katNo);
            
            System.out.println("\t\tIcindekiler : "+MainAsansor.gidilecekKat); 
            if(MainAsansor.call.size()>0 ){
                System.out.println("\t\tHedef : " + MainAsansor.call.get(0));
                if(MainAsansor.call.get(0)>MainAsansor.katNo){
                    System.out.println("\t\tDirection : Up");
                }else{
                    System.out.println("\t\tDirection : Down");
                }
            }else{
                System.out.println("\t\tHedef : 0");
            }
           /* if(MainAsansor.call.get(0)>MainAsansor.katNo && MainAsansor.call.size()>0){
                System.out.println("Direction : Up");
            }
            else if(MainAsansor.call.get(0)<MainAsansor.katNo && MainAsansor.call.size()>0){
                System.out.println("Direction : Down");
            }*/
            
            
            //2.Asansor
            System.out.println("2.ASANSOR");
            System.out.println("Active : "+Kontrol.calisanAsansor[1]);
            if(Kontrol.calisanAsansor[1]){
                System.out.println("\t\tmode : working");
            }else{
                System.out.println("\t\tmode : idle");
            }
            System.out.println("\t\tInsan Sayisi : " + Asansor2.gidilecekKat.size());
            System.out.println("\t\tBulundugu Kat : "+ Asansor2.katNo);
            System.out.println("\t\tIcindekiler : "+Asansor2.gidilecekKat);
            if(Asansor2.call.size()>0){
                System.out.println("\t\tHedef : " + Asansor2.call.get(0));
                if(Asansor2.call.get(0)>Asansor2.katNo){
                    System.out.println("\t\tDirection : Up");
                }else{
                    System.out.println("\t\tDirection : Down");
                }
            }else{
                System.out.println("\t\tHedef : 0");
            }
            
            //3.Asansor
            System.out.println("3.ASANSOR");
            System.out.println("Active : "+Kontrol.calisanAsansor[2]);
            if(Kontrol.calisanAsansor[2]){
                System.out.println("\t\tmode : working");
            }else{
                System.out.println("\t\tmode : idle");
            }
            System.out.println("\t\tInsan Sayisi : " + Asansor3.gidilecekKat.size());
            System.out.println("\t\tBulundugu Kat : "+ Asansor3.katNo);
            System.out.println("\t\tIcindekiler : "+Asansor3.gidilecekKat);            
            if(Asansor3.call.size()>0){
                System.out.println("\t\tHedef : " + Asansor3.call.get(0));
                if(Asansor3.call.get(0)>Asansor3.katNo){
                    System.out.println("\t\tDirection : Up");
                }else{
                    System.out.println("\t\tDirection : Down");
                }
            }else{
                System.out.println("\t\tHedef : 0");
            }
            
            
            //4.Asansor
            System.out.println("4.ASANSOR");
            System.out.println("Active : "+Kontrol.calisanAsansor[3]);
            if(Kontrol.calisanAsansor[3]){
                System.out.println("\t\tmode : working");
            }else{
                System.out.println("\t\tmode : idle");
            }
            System.out.println("\t\tInsan Sayisi : " + Asansor4.gidilecekKat.size());
            System.out.println("\t\tBulundugu Kat : "+ Asansor4.katNo);
            System.out.println("\t\tIcindekiler : "+Asansor4.gidilecekKat);
            if(Asansor4.call.size()>0){
                System.out.println("\t\tHedef : " + Asansor4.call.get(0));
                if(Asansor4.call.get(0)>Asansor4.katNo){
                    System.out.println("\t\tDirection : Up");
                }else{
                    System.out.println("\t\tDirection : Down");
                }
            }else{
                System.out.println("\t\tHedef : 0");
            }
            
            
            //5.Asansor
            System.out.println("5.ASANSOR");
            System.out.println("Active : "+Kontrol.calisanAsansor[4]);
            if(Kontrol.calisanAsansor[4]){
                System.out.println("\t\tmode : working");
            }else{
                System.out.println("\t\tmode : idle");
            }
            System.out.println("\t\tInsan Sayisi : " + Asansor5.gidilecekKat.size());
            System.out.println("\t\tBulundugu Kat : "+ Asansor5.katNo);
            System.out.println("\t\tIcindekiler : "+Asansor5.gidilecekKat);
            if(Asansor5.call.size()>0){
                System.out.println("\t\tHedef : " + Asansor5.call.get(0));
                if(Asansor5.call.get(0)>Asansor5.katNo){
                    System.out.println("\t\tDirection : Up");
                }else{
                    System.out.println("\t\tDirection : Down");
                }
            }else{
                System.out.println("\t\tHedef : 0");
            }
            int sayac=0;
            while(sayac<5){
                int sifir=0,bir = 0, iki = 0, uc = 0, dort = 0;

                    for (int i = 0; i < Bilgi.katlar.get(sayac).size(); i++) {
                        
                        if (Bilgi.katlar.get(sayac).get(i)==0){
                            sifir++;
                        }
                        if (Bilgi.katlar.get(sayac).get(i)==1){
                            bir++;
                        }
                        if (Bilgi.katlar.get(sayac).get(i)==2){
                            iki++;
                        }
                        if (Bilgi.katlar.get(sayac).get(i)==3){
                            uc++;
                        }
                        if (Bilgi.katlar.get(sayac).get(i)==4){
                            dort++;
                        }
                    }

                System.out.print(sayac+". Kat : [");
                if(sifir!=0){
                    System.out.print("["+sifir+",0]");
                }
                if(bir!=0){
                    System.out.print("["+bir+",1]");
                }
                if(iki!=0){
                    System.out.print("["+iki+",2]");
                }
                if(uc!=0){
                    System.out.print("["+uc+",3]");
                }
                if(dort!=0){
                    System.out.print("["+dort+",4]");
                }
                System.out.print("]");
                System.out.println("");
                sayac++;
            }
            /*System.out.println("0.Kat :" + Bilgi.katlar.get(0));
            System.out.println("1.Kat :" + Bilgi.katlar.get(1));
            System.out.println("2.Kat :" + Bilgi.katlar.get(2));
            System.out.println("3.Kat :" + Bilgi.katlar.get(3));
            System.out.println("4.Kat :" + Bilgi.katlar.get(4));*/
            
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ana.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //Threadlar Bitmeden Main Threadi Bitirme
        /*try {
            girt.join();
            cikt.join();            
            kontrol.join();
            asansort.join();
            asansort2.join();
            asansort3.join();
            asansort4.join();
            asansort5.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ana.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }
    
}
