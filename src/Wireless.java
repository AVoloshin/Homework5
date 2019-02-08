public class Wireless extends Portable {
    private String type = "Bluetooth колонка";
    private boolean isWifi;

    public Wireless(int capacity, boolean isWifi) {
        super(capacity);
        this.isWifi = isWifi;
    }
}
