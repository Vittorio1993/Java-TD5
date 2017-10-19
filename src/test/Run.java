/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import td5.Frequence;
import td5.Ligne;
import td5.Table;
import td5.Tache;

/**
 *
 * @author zhanghuakai
 */
public class Run {
    public static void main(String args[]){
        /*Tache t1=new Tache("A");
        Tache t2=new Tache("B");
        Tache t3=new Tache("C");
        
        Frequence f1=new Frequence(280);
        Frequence f2=new Frequence(42);
        Frequence f3=new Frequence(200);
        Frequence f4=new Frequence(25);
        Frequence f5=new Frequence(0);
        
        Ligne l1=new Ligne(t1,t2,f1);
        Ligne l2=new Ligne(t1,t3,f2);
        Ligne l3=new Ligne(t2,t1,f5);
        Ligne l4=new Ligne(t2,t3,f5);
        Ligne l5=new Ligne(t3,t1,f5);
        Ligne l6=new Ligne(t3,t2,f4);
        
        
        tab1.set_table(l1);
        tab1.set_table(l2);
        tab1.set_table(l3);
        tab1.set_table(l4);
        tab1.set_table(l5);
        tab1.set_table(l6);
        
        tab1.afficher();*/
        Table tab1=new Table();
        tab1.readeCsv();
        Tache first_tache=new Tache("");
        first_tache=tab1.first_tache();
        tab1.next_tache(first_tache);
        
        
        
        
        
        
    }
    
}
