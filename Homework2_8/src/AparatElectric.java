public class AparatElectric implements Observer{
    private String nume;

    public AparatElectric(String nume) {
        this.nume = nume;
    }

    // Metoda care este apelată atunci când este notificat
    @Override
    public void update(String message) {
        System.out.println(nume + ": " + message);
    }
}
