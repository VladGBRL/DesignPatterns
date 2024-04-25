public class Main {
    public static void main(String[] args) {
        // Creăm un prelungitor
        Prelungitor prelungitor = new Prelungitor();

        // Cream cateva aparate electrice si le atasam prelungitorului
        AparatElectric aparat1 = new AparatElectric("Frigider");
        AparatElectric aparat2 = new AparatElectric("Televizor");
        AparatElectric aparat3 = new AparatElectric("Aparat de cafea");

        prelungitor.attach(aparat1);
        prelungitor.attach(aparat2);
        prelungitor.attach(aparat3);

        // Băgăm prelungitorul în priză
        prelungitor.plugIn();

        // Scoatem prelungitorul din priză
        prelungitor.unplug();
    }
}