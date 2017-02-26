/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author Prateek Bansal
 */
import java.io.*;
public class ReadData {
    
    void read(Boys boy[],Girls girl[])
    {
        Boys b[]=new Boys[12];
        Girls g[]=new Girls[7];
        
        try {
        BufferedReader br =new BufferedReader(new FileReader("Boy.csv"));
        String lines;
        int i=0;
        try {
        while( (lines = br.readLine()) != null ) {
                String array[]=lines.split(",");
                b[i]=new Boys();
                b[i].set_attributes(array[0],Integer.parseInt(array[1]),Integer.parseInt(array[2]),Integer.parseInt(array[3]),Integer.parseInt(array[4]),array[5]);
               
                boy[i]=b[i];
                i++;
                      
        
        }
        }
        catch (Exception ex)
        {
            System.out.println("error");
        }
        
        }
                      
                
    
        catch (FileNotFoundException  ex)
        {
            System.out.println("file not found");
        }
    
   
        
        
        
        
         try {
        BufferedReader br =new BufferedReader(new FileReader("Girl.csv"));
        String lines;
        int j=0;
        try {
        while( (lines = br.readLine()) != null ) {
                String array[]=lines.split(",");
                g[j]=new Girls();
                g[j].set_attributes(array[0],Integer.parseInt(array[1]),Integer.parseInt(array[2]),Integer.parseInt(array[3]),array[4]);
               
                girl[j]=g[j];
                j++;
                      
        
        }
        }
        catch (Exception ex)
        {
            System.out.println("error");
        }
        
        }
                      
                
    
        catch (FileNotFoundException  ex)
        {
            System.out.println("file not found");
        }
        
}
    
    
    
    
}

