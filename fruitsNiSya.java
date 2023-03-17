import java.util.ArrayList;

public class fruitsNiSya {
    private static fruitsNiSya myfruits;
    private ArrayList<String> fruits;

    public fruitsNiSya(){
        fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Guava");
        fruits.add("Banana");
        fruits.add("Mango");

    }

    public static fruitsNiSya singleton(){
        if (myfruits==null || myfruits.fruits.size()==0)
            myfruits = new fruitsNiSya();
        return myfruits;
    }

    public String getFruits(){
        if (fruits.size()>0)
        return fruits.remove(0);
        return "No fruit";
    }
}
