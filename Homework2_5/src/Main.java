//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        C2Nr c2Nr = new C2Nr(1, 3);
        System.out.println("Suma a două numere: " + c2Nr.getSum());

        C3Nr c3Nr = new C3Nr(1, 2, 3);
        System.out.println("Suma a trei numere: " + c3Nr.getSum());

        // Exemplu de utilizare a clasei Adapter pentru conversia de la C2Nr la C3Nr
        C2NrToC3NrAdapter adapter = new C2NrToC3NrAdapter(c2Nr);
        System.out.println("Suma a trei numere după conversie: " + adapter.getSum());
    }
}