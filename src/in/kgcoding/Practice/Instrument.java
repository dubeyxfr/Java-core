package in.kgcoding.Practice;

// Interface
// Interface
public interface Instrument {
    void play();  // abstract method
}

// Class implementing the interface
class Guitar implements Instrument {

    @Override
    public void play() {
        System.out.println("Playing the Guitar 🎸");
    }
}
