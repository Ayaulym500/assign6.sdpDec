//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BMW BMW = new BasicModel();
        System.out.println(BMW.engine() + " $" + BMW.price());
        BMW = new Engine(BMW);
        BMW = new Airconditioner(BMW);
        System.out.println(BMW.engine() + " $" + BMW.price());
    }
}
