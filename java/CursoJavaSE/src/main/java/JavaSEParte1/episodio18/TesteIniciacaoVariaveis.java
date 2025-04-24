package episodio18;

public class TesteIniciacaoVariaveis {
    byte vb;
    short vs;
    int vi;
    long vl;
    String vString;
    float vFloat;
    double vDouble;
    char vChar;


    void metodo1() {
        boolean vBoolean = true;
        System.out.println(vb);
        System.out.println(vs);
        System.out.println(vi);
        System.out.println(vl);
        System.out.println(vString);
        System.out.println(vFloat);
        System.out.println(vDouble);
        System.out.println(vBoolean);
        System.out.println(vChar);

    }

    public static void main(String[] args) {
        TesteIniciacaoVariaveis t = new TesteIniciacaoVariaveis();
        t.metodo1();

    }

}
