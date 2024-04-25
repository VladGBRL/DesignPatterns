public class Produs {
    private int id;
    private String nume;
    private double pretLei;

    public Produs(int id, String nume, double pretLei) {
        this.id = id;
        this.nume = nume;
        this.pretLei = pretLei;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPretLei() {
        return pretLei;
    }

    public void setPretLei(double pretLei) {
        this.pretLei = pretLei;
    }
}
