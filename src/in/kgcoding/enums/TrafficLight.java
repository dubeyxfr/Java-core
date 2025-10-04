package in.kgcoding.enums;

public enum TrafficLight {
    RED("Stop"),GREEN("Go"),YELlOW("Caution");
    public final String action;

    TrafficLight(String action) {
        this.action = action;
    }
}
