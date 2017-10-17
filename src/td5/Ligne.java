/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td5;

/**
 *
 * @author zhanghuakai
 */
public class Ligne {
    private Tache tache;
    private Tache tachesuivante;
    private Frequence frequence;
    
    public Ligne(Tache t, Tache ts, Frequence f){
        tache=t;
        tachesuivante=ts;
        frequence=f;
    }
    
    public Tache get_tahce(){
        return tache; 
    }
    
    public Tache get_tahcesuivante(){
        return tachesuivante; 
    }
    
    public Frequence get_frequence(){
        return frequence; 
    }
}
