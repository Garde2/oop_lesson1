package Products;

public class Yogurt extends Product {
    private final String temperature;
    private final Integer volume;

    public Yogurt(String name, Integer cost, String temperature, Integer volume) {
        super(name, cost);

        this.temperature = temperature;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + temperature + ", " + volume;
    }
}