
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ONUR
 */
public class Bilgi {
    
    static int kat_kisi[] = new int[5];
    static ArrayList<ArrayList<Integer>> katlar = new ArrayList<>(5);

    
    static Object lock1 = new Object();
    /*static Object lock2 = new Object();
    static Object lock3 = new Object();*/
    
    public Bilgi(){
        
        for(int i=0;i<5;i++){
            kat_kisi[i]=0;
            katlar.add(new ArrayList());
        }
        
    }

    public int[] getKat_kisi() {
        return kat_kisi;
    }

    public void setKat_kisi(int[] kat_kisi) {
        this.kat_kisi = kat_kisi;
    }

}
