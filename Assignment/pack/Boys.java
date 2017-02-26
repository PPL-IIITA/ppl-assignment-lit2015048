package pack;

public class Boys {
    
    String name;
    int attractiveness;
    int intelligence;
    int budget;
    String type;
    int min_attractivenss;
    String status;
    
    public void set_attributes(String name,int attractiveness,int intelligence,int budget,int min_attractiveness,String type)
    {
        this.name=name;
        this.attractiveness=attractiveness;
        this.intelligence=intelligence;
        this.budget=budget;
        this.type=type;
        status="single";
        this.min_attractivenss=min_attractiveness;
    }
    
    
}
