package demo;

public class PetrolCar implements Car{
    PetrolEngine engine;

    public PetrolCar(PetrolEngine engine) {
        this.engine = engine;
    }

    public void getType() {
        System.out.println("Car Type is PetrolCar-Car");
    }

    @Override
    public void getEngineInfo() {
        engine.getType();
    }
}
