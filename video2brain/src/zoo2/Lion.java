package zoo2;

public class Lion implements Animal {
    @Override
    public void feed() {
        System.out.println("Lion eats meat and roars to warn you not to try to take its kill...");
    }

    @Override
    public void pet() {
        System.out.println("Lion roars as you approach and you decide not to try it...");
    }
}
