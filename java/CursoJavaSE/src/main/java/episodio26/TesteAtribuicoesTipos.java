package episodio26;

public class TesteAtribuicoesTipos {
    public static void main(String[] args) {
        long varLong1 = 45L;    // Declaração OK
        int varInt1 = (int)varLong1;    // Forçar o compilador colocar o long no int (Down Casting)

        int  varInt2= 34;
        long varLong2 = varInt2;    // Up Casting : Colocar uma variavel de tipo menor numa maior

        int  varInt3= 34;
        long varInt4 = (int)66F;

        long varLong3 = 34L;
        long varLong4 = 45;

        double varDouble1 = 34.56;  // Double por default
        float varFloat1 = (float)varDouble1;    // Pode ocorrer perda de precisao

        double varDouble2 = 45.67F;
        float varFloat2 = (float) 34.678d;

        short a, b, c;
        a = 3;
        b = 4;
        c = (short)(a + b);

    }
}
