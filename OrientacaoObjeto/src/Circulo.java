

import java.lang.Math;


class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}


class Circulo {
    private Ponto centro;
    private double raio;

    public Circulo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }


    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }


    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }



    public static void main(String[] args) {

        Ponto centro = new Ponto(0, 0);


        Circulo circulo = new Circulo(centro, 5);


        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
    }
}
