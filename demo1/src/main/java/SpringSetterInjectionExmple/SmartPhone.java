package SpringSetterInjectionExmple;

public class SmartPhone implements Mobile{
    private SimCard sim;

    public void setSim(SimCard sim) {
        this.sim = sim;
    }

    @Override
    public void getType() {
        System.out.println("Mobile type is SmartPhone");
    }

    @Override
    public void getSim() {
       sim.getCompany();
    }
}
