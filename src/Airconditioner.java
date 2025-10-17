public class Airconditioner  extends BMWDec{
    public Airconditioner(BMW decoratedCar) {
        super(decoratedCar);
    }
    public String engine() {
        return decoratedCar.engine() + ",powerfull air conditioner system ";
    }
    public int price() {
        return decoratedCar.price()+ 5000;
    }

}
