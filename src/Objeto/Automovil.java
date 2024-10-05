package Objeto;

public class Automovil {

    // Lo que esta en el ejercicio
    // Definir los atributos
    public String marca;
    public int modelo;
    public int motor;
    public tipoCombustible tipoCombustible;
    public tipoAutomovil tipoAutomovil;
    public int numeroPuertas;
    public int cantidadAsientos;
    public int velocidadMaxima;
    public tipoColor color;
    public int velocidadActual = 0;

    // Definicion de numeraciones
    public enum tipoCombustible {
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
    }

    public enum tipoAutomovil {
        CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }

    public enum tipoColor {
        BLANC0, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
    }

    // Crear constructor
    public Automovil(String marca, int modelo, int motor,
            tipoCombustible tipoCombustible, tipoAutomovil tipoAutomovil, 
            int numeroPuertas, int cantidadAsientos, int velocidadMaxima, 
            tipoColor color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = 0; // La velocidad es cero

    }

    // Definir metodos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public tipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(tipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public tipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(tipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public tipoColor getColor() {
        return color;
    }

    public void setColor(tipoColor color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    // Metodo incrementa la velocidad de el automovil
    public void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad < velocidadMaxima) {
            // Si incrementoVelocidad no supera velocidadMaxima
            velocidadActual = velocidadActual + incrementoVelocidad;
        } else { // De otra manera no se puede incrementar la velocidad
            System.out.println("No se puede incrementar una velocidad "
                    + "superior a la velocidad maxima del automovil");
        }
    }

    // Metodo decrementar la velocidad de el automovil
    public void desacelerar(int decrementoVelocidad) {
        if ((velocidadActual - decrementoVelocidad) > 0) {
            // La velocidad actual no debe alcanzar un valor negativo
            velocidadActual = velocidadActual - decrementoVelocidad;
        } else { // De otra manera no se puede decrementar la velocidad
            System.out.println("No se puede decrementar a "
                    + "una velocidad negativa");
        }
    }

    // Metodo para que la velocidadActual sea en cero 
    public void frenar() {
        velocidadActual = 0;
    }

    // Metodo tiempo tarda un automovil en recorrer la distancia
    public double calcularTiempoLlegada(int distancia) {
        return distancia / velocidadActual;
    }

}
