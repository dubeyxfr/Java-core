package in.kgcoding.Abstration.Birds;

public class Eagle extends Bird {

    public Eagle() {
        super("Eagle");
    }

    @Override
    public void fly() {
        System.out.println(" flies high with great speed and power.");
    }
}

