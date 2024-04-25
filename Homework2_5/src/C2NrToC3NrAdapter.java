public class C2NrToC3NrAdapter extends C3Nr{
    private C2Nr c2Nr;

    public C2NrToC3NrAdapter(C2Nr c2Nr) {
        super(c2Nr.getSum(), 0, 0);
        this.c2Nr = c2Nr;
    }
}
