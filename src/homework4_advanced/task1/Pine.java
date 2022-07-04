package homework4_advanced.task1;

public class Pine extends Tree implements Smellable {
    private boolean hasCones;

    public Pine (boolean hasCones) {
        this.hasCones = hasCones;
    }

    @Override
    public void smell() {
        System.out.println("сосна пахнет");
    }
}
