public class Engine extends BMWDec{
    public Engine(BMW decoratedCar) {
        super(decoratedCar);
    }

    public String engine() {
        return decoratedCar.engine() + ",improved version of engine S63TU ";
    }
    public int price() {
        return decoratedCar.price()+ 10000;
    }
}
