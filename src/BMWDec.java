public abstract class BMWDec implements BMW{
    protected BMW decoratedCar;

    public BMWDec(BMW decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public String engine() {
        return decoratedCar.engine();
    }

    @Override
    public int price() {
        return decoratedCar.price();
    }
}

