public class mainNi {
    String name, fruits;
    public mainNi (String fruitName) {
        this.name =fruitName;
        fruitsNiSya myfruit = fruitsNiSya.singleton();
        fruits = myfruit.getFruits();
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return name;
    }

    public String getFruits() {
        return fruits;
    }

    public static void main (String[] args) {
        for (int i=0; i<10; i++){
            mainNi first = new mainNi ("Singleton " + i);
            System.out.println( first.getName() + " Fruit Name: "+ first.getFruits());
           
        }
    }
}
