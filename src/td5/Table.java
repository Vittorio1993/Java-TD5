/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td5;

import java.util.ArrayList;


import com.csvreader.CsvReader;
import java.io.IOException;
//import com.csvreader.CsvWriter;
//import org.junit.Test;
//import java.io.IOException;
import java.nio.charset.Charset;



/**
 *
 * @author zhanghuakai
 */
public class Table {
   // private ArrayList<Ligne> lstligne=new ArrayList<>();;
    ArrayList<String[]> csvList = new ArrayList<>();// pour stocker les données de csv
    ArrayList<String> lsttache = new ArrayList<>();
    public Table(){
       
    }
    
    /* public void set_table(Ligne l){
        lstligne.add(l);
    }*/
     
    /*public Tache first_tache(){
        Tache t =new Tache("");
        for (int i=0;i<lstligne.size();i++){
            if(lstligne.get(i).get_frequence().get_nb()==0){
                t=lstligne.get(i).get_tahce();
                break;
            }
        }
       return t; 
    }*/
     public void set_lsttache(){
         
         for(int row=0;row<csvList.size();row++){
             String[] aa=csvList.get(row)[0].split(";");
             for(int i=0; i<csvList.size(); i++){ 
             if(!lsttache.contains(aa[0])){
                 lsttache.add(aa[0]);
             }
         }
         for(int i=0;i<lsttache.size();i++){
             System.out.println(lsttache.get(i));
             
         }
         }        
              
     }
     
     public Tache first_tache(){
        Tache t =new Tache("");
        for(int row=0;row<csvList.size();row++){
              String[] aa=csvList.get(row)[0].split(";");
              if(Integer.parseInt(aa[2])==0){
              t =new Tache((aa[1]));
              System.out.println(aa[1]);
              break;
              }
        }
       return t;        
     }
     
     public Tache next_tache(Tache t){
         Tache nt =new Tache("");
          // ArrayList<String[]> lstnextache = new ArrayList<>();
           int max=0;
           for(int row=0;row<csvList.size();row++){
              String[] aa=csvList.get(row)[0].split(";");
              if(aa[0].equals(t.get_libelle())){
                 
                  if(Integer.parseInt(aa[2])>max){
                      max=Integer.parseInt(aa[2]);
                      nt=new Tache((aa[1]));
                  }
              }
           }
           System.out.println(nt.get_libelle());
           return nt;
     }
    
    /*public Tache next_Tache(Tache t){
        private ArrayList<Ligne>
    }*/
     
     /*public void afficher(){
        for(int i=0;i<lstligne.size();i++){
            System.out.println(lstligne.get(i).get_tahce().get_libelle()+" "+lstligne.get(i).get_tahcesuivante().get_libelle()+" "+lstligne.get(i).get_frequence().get_nb());
        }
    }*/
    public void readeCsv(){  
        try {      
             //用来保存数据  
            String csvFilePath = "C:/Users/zhanghuakai/Desktop/Programmation objet/TD5.csv";  
            CsvReader reader = new CsvReader(csvFilePath,',',Charset.forName("SJIS"));    //一般用这编码读就可以了      

            reader.readHeaders(); // 跳过表头   如果需要表头的话，不要写这句。  

            while(reader.readRecord()){ //逐行读入除表头的数据      
                csvList.add(reader.getValues());  
            }              
            reader.close();  

            for(int row=0;row<csvList.size();row++){
                String  cell = csvList.get(row)[0]; //取得第row行第0列的数据  
                System.out.println(cell);  
                String[] aa=csvList.get(row)[0].split(";");
                System.out.println(aa[2]);
            } 
        }catch(IOException ex){  
            System.out.println(ex);  
        }  
    }  
}
