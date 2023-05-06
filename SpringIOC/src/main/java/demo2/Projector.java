package demo2;

public class Projector implements Machine {
    @Override
    public void getType() {
        System.out.println("Machine name is Projector");
    }

    @Override
    public void getPrice() {
        System.out.println("Machine price is 700000");
    }
}
