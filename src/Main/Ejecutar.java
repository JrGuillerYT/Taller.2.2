package Main;

import Objeto.Automovil;
import Objeto.Automovil.tipoAutomovil;
import Objeto.Automovil.tipoColor;
import Objeto.Automovil.tipoCombustible;

public class Ejecutar {

    public static void main(String[] args) {

        Automovil A_1 = new Automovil("Ford", 2018, 3,
                tipoCombustible.DIESEL,
                tipoAutomovil.EJECUTIVO, 5, 6, 250,
                tipoColor.NEGRO);

        System.out.println("Marca = " + A_1.getMarca());
        System.out.println("Modelo = " + A_1.getModelo());
        System.out.println("Motor = " + A_1.getMotor());
        System.out.println("Tipo de Combustible = " + A_1.getTipoCombustible());
        System.out.println("Tipo de Automóvil = " + A_1.getTipoAutomovil());
        System.out.println("Número de Puertas = " + A_1.getNumeroPuertas());
        System.out.println("Cantidad de Asientos = " + A_1.getCantidadAsientos());
        System.out.println("Velocidad maxima = " + A_1.getVelocidadMaxima());
        System.out.println("Color = " + A_1.getColor());

        A_1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + A_1.getVelocidadActual());
        A_1.acelerar(20);
        System.out.println("Velocidad actual = " + A_1.getVelocidadActual());

        A_1.desacelerar(50);
        System.out.println("Velocidad actual = " + A_1.getVelocidadActual());

        A_1.frenar();
        System.out.println("Velocidad actual = " + A_1.getVelocidadActual());
        System.out.println("No se puede decrementar a una velocidad negativa");
    }
}
