package Negocios;

public class Carro {

    private int potencia;
    private double velocidad;

    /*
    mètodos para interpretar informaciòn
    set()
    *siempre* el tipo de retorno es void
    siempre recibe un paràmetro
    paràmetro generalmente es del mismo tipo del atributo
     */
    public void setPotencia(int potencia){
        //Se actualiza solo si el dato es correcto
        if (potencia > 0)
            this.potencia = potencia;
    }

    public void setVelocidad(double velocidad){
        //Se actualiza si el dato es correcto sino se setea
        if (velocidad < 0)
            velocidad = 0;
            this.velocidad = velocidad;
    }

    /*
    metodo para sacar informacion
    get()
    siempre retorna valor
    el tipo de retorno generalmente es el mismo del atributo
     */

    public int getPotencia(){
        return potencia;
    }

    public double getVelocidad(){
        return velocidad;
    }

    public void acelerar(){
        velocidad += potencia;
    }
    void frenar(){
        velocidad /=2;
    }

}
