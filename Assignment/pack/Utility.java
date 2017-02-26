
package pack;
import java.io.*;
import java.util.*;

public class Utility {
        public static void main(String args[]) {
        String girls[]={"Sophia","Emma","Olivia","Ava","Mia","Isabella","Riley"};
        String boys[]={"Jackson","Aiden","Lucas","Liam","Noah","Ethan","Mason","Caden","Oliver","Elijah","Grayson","Jacob"};
        String g_type[]={"chossy","normal","desperate"};
        String b_type[]={"miser","generous","geeks"};
                
        Random r=new Random();
        try {
    
             BufferedWriter bw = new BufferedWriter(new FileWriter("Girl.csv"));
             for(int i=0;i<7;i++) {
             bw.write(girls[i]+","+r.nextInt(6)+","+r.nextInt(11)+","+r.nextInt(1000)+","+g_type[r.nextInt(3)]);
             bw.newLine();
             }
            
             bw.close();
             
             
        }
        catch (IOException ex) {
        System.out.println("could not write in file");
        }
              
        try {
             BufferedWriter bw = new BufferedWriter(new FileWriter("Boy.csv"));
        
             for(int i=0;i<12;i++) {
             bw.write(boys[i]+","+r.nextInt(6)+","+r.nextInt(11)+","+r.nextInt(1000)+","+r.nextInt(6)+","+b_type[r.nextInt(3)]);
             bw.newLine();
             }
             bw.close();
        
        
        }   
        catch (IOException ex) {
            System.out.println("could not write in file");
        }
                
}
}
