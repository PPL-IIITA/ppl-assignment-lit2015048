package pack;
public class Girls {
    
    String name;
    int attractiveness;
    int intelligence;
    int maintenance_budget;
    String type;
    String status;
    
    public void set_attributes(String name,int attractiveness,int intelligence,int budget,String type)
    {
        this.name=name;
        this.attractiveness=attractiveness;
        this.intelligence=intelligence;
        this.maintenance_budget=budget;
        this.type=type;
        this.status="single";
        
    }
    
}
