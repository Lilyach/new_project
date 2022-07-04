package homework4_advanced.task1;

public class Spruce extends Tree implements Smellable {
    private boolean hasCones;

    public Spruce(boolean hasCones) {
        this.hasCones = hasCones;
    }

    @Override
    public void smell() {
        System.out.println("ель пахнет");
    }
}
