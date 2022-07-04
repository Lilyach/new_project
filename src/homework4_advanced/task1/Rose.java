package homework4_advanced.task1;

public class Rose extends Plant implements Bloomable, Smellable {
    @Override
    public void smell() {
        System.out.println("роза пахнет");
    }

    @Override
    public void bloom() {
        System.out.println("роза цветет");
    }
}
