package Products;

public class Milk extends Product {
    private final String temperature;
    private final Integer volume;

    public Milk(String name, Integer cost, String temperature, Integer volume) {
        super(name, cost);

        this.temperature = temperature;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + temperature + ", " + volume;
    }
}