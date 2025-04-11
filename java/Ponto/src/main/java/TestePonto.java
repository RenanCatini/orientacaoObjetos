public class TestePonto {

    public static void main(String[] args) {

        Ponto primeiroPonto = new Ponto(200,200);
        Ponto segundoPonto = new Ponto(400,230);

        System.out.println("Coordenadas do primeiro ponto(x,y): (" + primeiroPonto.getX()
            + "," + primeiroPonto.getY() + ")");

        System.out.println("Coordenadas do segundo ponto(x,y): (" + segundoPonto.getX()
                + "," + segundoPonto.getY() + ")");


        Ponto outraRefSegundoPonto = segundoPonto;
        System.out.println("\nCriação de uma segunda referencia para o segundo ponto, chamada outraRefSegundoPonto");


        System.out.println("\nExibindo o conteúdo de todas as referências.\n");
        System.out.println("Coordenadas do primeiro ponto(x,y): (" + primeiroPonto.getX()
                + "," + primeiroPonto.getY() + ")");

        System.out.println("Coordenadas do segundo ponto(x,y): (" + segundoPonto.getX()
                + "," + segundoPonto.getY() + ")");

        System.out.println("Coordenadas do objeto apontado pela referencia outraRefSegundoPonto(x,y): ("
                + outraRefSegundoPonto.getX() + "," + outraRefSegundoPonto.getY() + ")");


        System.out.println("\nAlterando as coordenadas de segundo ponto para (840, 350)\n");
        segundoPonto.setX(840);
        segundoPonto.setY(350);

        System.out.println("Coordenadas do primeiro ponto(x,y): (" + primeiroPonto.getX()
                + "," + primeiroPonto.getY() + ")");

        System.out.println("Coordenadas do segundo ponto(x,y): (" + segundoPonto.getX()
                + "," + segundoPonto.getY() + ")");

        System.out.println("Coordenadas do objeto apontado pela referencia outraRefSegundoPonto(x,y): ("
                + outraRefSegundoPonto.getX() + "," + outraRefSegundoPonto.getY() + ")");

    }
}
