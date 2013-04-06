package zoo2;

public class Sheep implements Animal {
    @Override
    public void feed() {
        System.out.println("Sheep eats grass, munching happily...");
    }

    @Override
    public void pet() {
        System.out.println("Sheep pushes against your leg and head-butts "
                + "your hand for more attention...");
    }
}
