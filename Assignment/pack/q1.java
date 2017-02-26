
package pack;
import java.util.*;
public class q1 {
 
    public static void main(String args[])
    {
        Boys b[]=new Boys[12];
        Girls g[]=new Girls[7];
        ReadData rd=new ReadData();
        rd.read(b,g);
        Couple c[]=new Couple[7];
        int k=0;
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<12;j++)
            {
                if(b[j].budget >= g[i].maintenance_budget && b[j].min_attractivenss>=g[i].attractiveness )
                {
                     if (b[j].status.equalsIgnoreCase("single"))
                     {
                        b[j].status="commited";
                        c[k]=new Couple();
                        c[k].cboy=b[j];
                        c[k].cgirl=g[i];
                        k++;
                        break;
                         
                    
                    }
                }
            }
        }
		System.out.println("couples are");
        for(int i=0;i<k;i++)
            System.out.println(c[i].cboy.name +"  and  "+ c[i].cgirl.name);
    }
    
}
