package demo2;

public class Laptop implements Machine{
    @Override
    public void getType() {
        System.out.println("Machine name is Laptop");
    }

    @Override
    public void getPrice() {
        System.out.println("Machine price is 54000");
    }
}
