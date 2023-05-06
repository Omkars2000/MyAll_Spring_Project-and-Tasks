package demo1;

public class FeaturePhone implements Mobile {
    private  SimCard sim;

    public void setSim(SimCard sim) {
        this.sim = sim;
    }

    @Override
    public void getType() {
        System.out.println("Mobile type is FeaturePhone");
    }

    @Override
    public void getSim() {
       sim.getCompany();
    }
}
