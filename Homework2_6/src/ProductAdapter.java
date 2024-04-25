public class ProductAdapter {
    public static Produs ProductToProdus(Product product, double exchangeRate) {
        int id = product.getId();
        String nume = product.getName();
        double pretLei = product.getPriceUSD() * exchangeRate; // Convertim prețul în lei

        return new Produs(id, nume, pretLei);
    }

    // Metoda pentru convertirea unui obiect de tip Produs într-unul de tip Product
    public static Product ProdusToProduct(Produs produs, double exchangeRate) {
        int id = produs.getId();
        String name = produs.getNume();
        double priceUSD = produs.getPretLei() / exchangeRate; // Convertim prețul în USD

        return new Product(id, name, priceUSD);
    }
}
