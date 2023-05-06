package Task1;

public class Hp implements Laptop{
    private RAM ram;
    private GraphicCard card;

    public void setCard(GraphicCard card) {
        this.card = card;
    }

    public Hp(RAM ram) {
        this.ram = ram;
    }
    @Override
    public void getType() {
        System.out.println("Laptop type is Hp");
    }

    @Override
    public void getRam() {
       ram.getType();
    }

    @Override
    public void getGraphicCard() {
        card.getGraphicCard();
    }
}
