/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg67;

/**
 *
 * @author _
 */
public class Sortare implements MetodeDeSortare{
     public void insertie( int [] tab)  {
         int i,j,k;
         for(i=1;i<tab.length; i++)
             for(j=i;j>0&&tab[j]<tab[j-1];j--){
                 k=tab[j];
                 tab[j]=tab[j-1];
                 tab[j-1]=k;
                 
             }
         
     }
     public void selectie( int [] tab) 
     {
        int i,j,k,min;
        for(i=0;i<tab.length;i++){
            k=i;
           for(j=i+1;j<tab.length;j++)
               if(tab[j]<tab[k]) k=j;
           if(i!=k){
               min=tab[k];
               tab[k]=tab[i];
               tab[i]=min;
           }
        }
        
        
     }
     public void bubbleSort( int [] tab) {
         boolean aux =true; 
         int i ,sort;
         while (aux){
             aux =false;
             for (i=0;i<tab.length-1;i++)
                 if(tab[i+1]<tab[i]){
                     sort=tab[i+1];
                     tab[i+1]=tab[i];
                     tab[i]=sort;
                     aux=true;
                 }
                     
         }
         
     }
     public void shellSort( int [] tab) {
         int increment = tab.length / 2;
	while (increment > 0) {
		for (int i = increment; i < tab.length; i++) { 
			int j = i;
			int temp = tab[j];
			while (j >= increment && tab[j - increment] > temp) {
				tab[j] = tab[j - increment];
				j = j - increment;
			}
			tab[j] = temp;
		}
		if (increment == 2) {
			increment = 1;
		} else {
			increment *= (5.0 / 11);
		}
	}
}
}    
    

