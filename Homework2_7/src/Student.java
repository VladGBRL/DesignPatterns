public class Student implements Observer{
    private String nume;
    private String status;

    public Student(String nume) {
        this.nume = nume;
        this.status = null;
    }

    public void update(String nume, String status) {
        this.status = status;
        System.out.println("Studentul " + this.nume + " a fost actualizat cu statusul: " + this.status);
    }
}
