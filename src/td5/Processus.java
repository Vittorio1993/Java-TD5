/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td5;
import java.util.ArrayList;

/**
 *
 * @author zhanghuakai
 */
public class Processus {
    //private Integer seuil;
    private ArrayList<Tache> lsttache;
    
    
    public Processus(){
        Table tab1=new Table();
        tab1.readeCsv();
        Tache first_tache=tab1.first_tache();
        lsttache.add(first_tache);
        Tache father_tache=tab1.first_tache();
        
        while(){
            
        }
        
        
        
        for(int row=0;row<tab1.get_csvList().size();row++){
             String[] aa=csvList.get(row)[0].split(";");
              if(Integer.parseInt(aa[2])==0){
             t =new Tache((aa[1]));
             System.out.println(aa[1]);
             break;
             }
        }
        
    }
    
    
}
