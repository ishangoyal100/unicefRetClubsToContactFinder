//2000 is max capacity but can change by uncommenting. also, make sure infile is named "unicefpreviousschools.txt"
// and the other one is "unicefnewschools.txt"
// go into sheets before hand and remove all duplicates

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Random;

class Retv1
{
    public static void main (String [ ] args) throws IOException
    {

       String token = "";
       File inFile1 = new File("unicefpreviousschools.txt"); //change?
       Scanner allSchools = new Scanner(inFile1);
       
       //String[] arr1 = new String[] {};
       //String[] arr1 = new String[1500];
       //String[] arr1 = new String[6000];
       String[] arr1 = new String[2000];
       
       for (int z = 0; z<2000; z++){
         arr1[z] = "";  
        }
       
       File inFile2 = new File("unicefnewschools.txt"); //change?
       Scanner newSchools = new Scanner(inFile2);
       
       //String[] arr2 = new String[] {};
       //String[] arr2 = new String[1500];
       //String[] arr2 = new String[6000];
       String[] arr2 = new String[2000];
       for (int y = 0; y<2000; y++){
         arr2[y] = "";  
        }
       int count1 = 0;
       int count2 = 0;
            
       while(allSchools.hasNextLine())
         {
         
         token = allSchools.nextLine();
         arr1[count1] = token;
         //System.out.println(arr1[count1]);
         count1++;
        // if (token.equals("10")) {}

    } 
    
    while(newSchools.hasNextLine())
         {
         
         token = newSchools.nextLine();
         arr2[count2] = token;
         count2++;
 
    } 
    
    String tempSchool = "";
    int j = 0;
    boolean leave = false;
    
    for(int i = 0; i<arr2.length; i++){ // < not <= 
        
         tempSchool = arr2[i];
         
         
         while (j<arr1.length && leave == false){
              
             if (arr1[j].equals(tempSchool)){
                 //System.out.println(arr1[j]);
                 arr1[j] = "";
                 leave = true;
                }
             j++;     
         } 
         leave = false;
         j = 0;
    }
     
    
    int counter2 = 0;
    
    for(int x = 0; x<arr1.length; x++){
        if (arr1[x].equals("") == false){
       counter2++;
    }
    }
    
    String[] arr3 = new String[counter2];
    int v = 0;
    
    for(int w = 0; w<arr1.length; w++){
        
        if(arr1[w].equals("") == false){
            arr3[v] = arr1[w];
            v++;
        }
    }
       
       allSchools.close();
       newSchools.close();
        
        PrintWriter outFile = new PrintWriter(new File("SchoolsToContact.txt"));
        
       // Scanner scanner = new Scanner(System.in);
        
        for (int u = 0; u<v; u++){
            outFile.println(arr3[u]);
        }
        
        
        outFile.close();
      
       
      
  
      //  
        //System.out.print("The average number of squirrels observed before spotting a Fox Squirrel at the city park is: ");
        
       // System.out.println(numfoxsqirrels);  
      //  System.out.println(); 
    } 
            
} 








