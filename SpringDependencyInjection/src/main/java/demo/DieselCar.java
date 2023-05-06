package demo;

public class DieselCar implements Car {
    DieselEngine engine;

    public DieselCar(DieselEngine engine) {
        this.engine = engine;
    }

    @Override
    public void getType() {
        System.out.println("Car Type is Diesel-Car");

    }

    @Override
    public void getEngineInfo() {
        engine.getType();
    }
}
