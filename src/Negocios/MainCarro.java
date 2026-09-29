package Negocios;

public class MainCarro {
    // PARA CREAR EL METODO MAIN SE DIGITA EL PSVM
    static void main() {
        Carro c1= new Carro();
        c1.potencia =2;
        c1.velocidad =60;
        // PRINTS SOUT= PRINT SOUTF= PRINTF
        System.out.println("La potencia del carro es: "+c1.potencia+" y la velocidad es "+c1.velocidad);
        c1.acelerar();
        c1.acelerar();
        c1.frenar();
        System.out.println("La potencia del carro es: "+c1.potencia+" y la velocidad es "+c1.velocidad);
    }
}
