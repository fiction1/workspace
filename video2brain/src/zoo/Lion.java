package zoo;

public class Lion extends Animal {
    @Override
    public void feed() {
        System.out.println("Lion eats meat and roars to warn you not to try to take its kill...");
    }

    @Override
    public void pet() {
        System.out.println("Lion roars as you approach and you decide not to try it...");
    }
}
