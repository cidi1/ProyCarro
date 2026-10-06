package Negocios;

public class MainCarro {
    // PARA CREAR EL METODO MAIN SE DIGITA EL PSVM
    static void main() {
        Carro c1= new Carro();
        Carro c2 = new Carro();
        /*
        c1.potencia =2;
        c1.velocidad =60;
         */
        // PRINTS SOUT= PRINT SOUTF= PRINTF
        c1.setPotencia(2);
        c1.setVelocidad(60);
        c2.setVelocidad(-100);
        c2.setPotencia(-5);

        System.out.println("La potencia del carro 1 es: " + c1.getPotencia() + " y la velocidad es " + c1.getVelocidad());
        System.out.println("La potencia del carro 2 es: " + c2.getPotencia() + " y la velocidad es " + c2.getVelocidad());
        c1.acelerar();
        c1.acelerar();
        c1.frenar();

        //System.out.println("La potencia del carro es: "+c1.potencia+" y la velocidad es "+c1.velocidad);
    }
}
