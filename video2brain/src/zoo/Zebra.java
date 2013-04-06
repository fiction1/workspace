package zoo;

public class Zebra extends Animal {
    @Override
    public void feed() {
        System.out.println("Zebra eats grass, looking around anxiously...");
    }
    
    @Override
    public void pet() {
        System.out.println("Zebra looks at you strangely and runs away...");
    }
}
