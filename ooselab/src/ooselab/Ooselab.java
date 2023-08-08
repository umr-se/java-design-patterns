
package ooselab;

import java.util.Arrays;
import java.util.Scanner;


public class Ooselab {
    
    static void Doctor(){
        System.out.println("Available Doctor :  02");
        
    }
    static void Patients(){
        int id[] = {32,17}; 
        String name[] = {"Dr Vikram","Dr Rekha"}; 
        String specialist[] = {"Physician","Child"}; 
        String timing[] = {"10:20","10:20"}; 
        String qualification[] = {"MBBs,MD","BDM"}; 
        
        int n = id.length;  
        int m= name.length;
        int o= specialist.length;
        int p= timing.length;
        int q= qualification.length;

        

         int newArr[] = new int[n+1];  
         int newArr2[] = new int[m+1];  
         int newArr3[] = new int[o+1];  
         int newArr4[] = new int[p+1];  
         int newArr5[] = new int[q+1];  
         System.out.println("Insert Id");
 Scanner scan =new Scanner(System.in);
        int value= scan.nextInt();  
for(int i = 0; i<n; i++) {  
newArr[i] = id[i];  
}  
newArr[n] = value;  
System.out.println(Arrays.toString(id));  




   System.out.println("Insert Name");
 Scanner scan2 =new Scanner(System.in);
        String value2= scan.nextLine();  


for(int i = 0; i<m; i++) {  

}  
newArr2[m] = value; 
System.out.println(Arrays.toString(name)); 

System.out.println(Arrays.toString(newArr));  
    }
     static void NewEntry(){
         System.out.println("");}

    public static void main(String[] args) {
        System.out.println("Welcome to hospital management system");
        System.out.println("Getting data of ");
        System.out.println("1: Doctor   2: Patients   3: New Entry");
        Scanner scan =new Scanner(System.in);
        int input= scan.nextInt();
        if(input==1){
            Doctor();
        }
         if(input==2){
             Patients();
        }
          if(input==3){
              NewEntry();
        }
          else{
              System.out.println("invalid command");
          
          }
        
    }
    
}
