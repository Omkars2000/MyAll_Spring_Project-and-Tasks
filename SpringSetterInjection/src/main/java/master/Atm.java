package master;

public class Atm {
    private Printer print;

    public void setPrint(Printer print) {
        this.print = print;
    }
    public void getInfo(int accNo){
        print.printAccountBalance(accNo);
    }

}
