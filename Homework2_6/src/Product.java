public class Product {
    private int id;
    private String name;
    private double priceUSD;

    public Product(int id, String name, double priceUSD) {
        this.id = id;
        this.name = name;
        this.priceUSD = priceUSD;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceUSD() {
        return priceUSD;
    }

    public void setPriceUSD(double priceUSD) {
        this.priceUSD = priceUSD;
    }
}
