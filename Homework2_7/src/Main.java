public class Main {
    public static void main(String[] args) {
        Curs cursProgramare = new Curs("Programare Java");

        Student student1 = new Student("John");
        Student student2 = new Student("Alice");
        Student student3 = new Student("Bob");

        cursProgramare.addObserver(student1);
        cursProgramare.addObserver(student2);
        cursProgramare.addObserver(student3);

        cursProgramare.prezenta();
        System.out.println();
        cursProgramare.prezenta();
    }
}