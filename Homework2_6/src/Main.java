public class Main {
    public static void main(String[] args) {
        // Creăm un obiect de tip Product
        Product product = new Product(1, "Laptop", 1000.0);

        // Specificăm rata de schimb
        double exchangeRate = 4.0; // presupunem că 1 USD = 4 lei

        // Convertim obiectul Product într-unul de tip Produs
        Produs produs = ProductAdapter.ProductToProdus(product, exchangeRate);

        // Afisăm detaliile obiectului Produs
        System.out.println("Produs:");
        System.out.println("ID: " + produs.getId());
        System.out.println("Nume: " + produs.getNume());
        System.out.println("Preț (lei): " + produs.getPretLei());

        // Convertim obiectul Produs înapoi într-unul de tip Product
        Product convertedProduct = ProductAdapter.ProdusToProduct(produs, exchangeRate);

        // Afisăm detaliile obiectului Product convertit
        System.out.println("\nProduct convertit:");
        System.out.println("ID: " + convertedProduct.getId());
        System.out.println("Nume: " + convertedProduct.getName());
        System.out.println("Preț (USD): " + convertedProduct.getPriceUSD());
    }
}
