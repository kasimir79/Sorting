/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg67;
import java.util.*;

/**
 *
 * @author _
 */
public class Main {
    public void schimba(int []sursa ,int [] destinatie ){
        int i;
        for(i=0;i<sursa.length;i++)
             destinatie[i]=sursa[i];
}
    public void tipareste (){
        System.out.println("Meniu");
        System.out.println("1-read data");
        System.out.println("2-sorting by insertion");
        System.out.println("3-sorting by selection  ");
        System.out.println("4-bubble sorting ");
        System.out.println("5-shell sorting ");
        System.out.println("6-print data");
        System.out.println("7-exit");
    }
     
     
    public static void main(String[] args) {
        int i=0,optiune=0;
        boolean dateCitite=false;
        Main o = new Main ();
        Scanner S=new Scanner(System.in);
        int []tab =new int [10];
        int []tablou =new int[10];
         Sortare obiect =new Sortare ();
        
         
         do{
         o.tipareste();
         System.out.println("Select the option ");
          optiune =S.nextInt();
         
         switch (optiune){
             case 1: {
                 int optiune2=2;
                 do{
                 if(dateCitite==false){ 
                     System .out.println("write  10 integers separated by ENTER ");
                     for(i=0;i<tab.length;i++)
                        tab[i]=S.nextInt();
                     dateCitite=true;
                      o.schimba(tab, tablou);
                 }
                 else {
                     System.out.println("The array contains valid values  ?(1-YES/2-NO)");
                      optiune2=S.nextInt();
                      if(optiune2==1)
                        dateCitite=false;
                 }
                 }while (optiune2 !=2);
                    
                  break;
             }
             case 2: {
                 if(dateCitite){
                    obiect.insertie(tab);
                    System.out.println("sorting by insertion");
                    for(i=0;i<tab.length;i++)
                       System.out.print(tab[i]+" ");
                     o.schimba(tablou, tab);
                      System.out.println();
                 }
                 else System.out.println("The list dosen't contain data.Choose option  1");
                 break;
             }
             case 3:{
                 if(dateCitite){
                    obiect.selectie(tab);
                    System.out.println("sorting by selection");
                    for(i=0;i<tab.length;i++)
                       System.out.print(tab[i]+" ");
                     o.schimba(tablou, tab);
                      System.out.println();
                 }
                 else System.out.println("The list dosen't contain data.Choose option  1");
                  break;
             }
             case 4:{
                 if(dateCitite){
                    obiect.bubbleSort(tab);
                    System.out.println("bubble sorting");
                    for(i=0;i<tab.length;i++)
                       System.out.print(tab[i]+" ");
                     o.schimba(tablou, tab);
                     System.out.println();
                 }
                 else System.out.println("The list dosen't contain data.Choose option  1");
                 break;
             }
             case 5 :{
                 if(dateCitite){
                    obiect.shellSort(tab);
                    System.out.println("shell sorting");
                    for(i=0;i<tab.length;i++)
                       System.out.print(tab[i]+" ");
                     o.schimba(tablou, tab);
                 }
                 else System.out.println("The list dosen't contain data.Choose option  1");
                 break;
             } 
             case 6 :{
                 System.out.println("Unsorted array");
                 for(i=0;i<tab.length;i++)
                    System.out.print(tab[i] + " ");
                 break;
             }
             case 7 :{
                 System.out.println("Exit");
                 break;
             }
             default : System.out.println("Wrong option");
             
         }
         }while (optiune !=7);
         S.close();
       
      
       
       
      
       
       
    }
    
}
