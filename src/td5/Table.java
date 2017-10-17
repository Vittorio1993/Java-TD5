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
public class Table {
    private ArrayList<Ligne> lstligne;
    
    public Table(){
        lstligne=new ArrayList<>();
    }
    
     public void set_table(Ligne l){
        lstligne.add(l);
    }
     
    public Tache first_tache(){
        Tache t =new Tache("");
        for (int i=0;i<lstligne.size();i++){
            if(lstligne.get(i).get_frequence().get_nb()==0){
                t=lstligne.get(i).get_tahce();
                break;
            }
        }
       return t; 
    }
    
    public Tache next_Tache(Tache t){
        private ArrayList<Ligne>
    }
     
    public void afficher(){
        for(int i=0;i<lstligne.size();i++){
            System.out.println(lstligne.get(i).get_tahce().get_libelle()+" "+lstligne.get(i).get_tahcesuivante().get_libelle()+" "+lstligne.get(i).get_frequence().get_nb());
        }
    }

    
}
