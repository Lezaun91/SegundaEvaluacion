package Poo.Edificio;

public class Edificio {
    //las caracteristicas son los ATRIBUTOS,los guardamos en variables
    //NO LOS INICIALIZAMOS->ESO LO HAREMOS CON EL METODO CONSTRUCTOR
    private int numeroPlantas;
    private double area;
    private int añoConstruccion;


    //LOS METODOS QUE PONGEMOS AQUI SERAN LAS FUNCIONALIDADES QUE VA A TENER UN OBJETO DE ESA CLASE

    //hay un metodo que SIEMPRE SIEMPRE SIEMPRE existe.
    //Es el metodo CONSTRUCTOR
    //Aunque tu no lo escribas, se va a crear implicitamente (constructor por defecto)
    //nosotros normalmente lo declararemos porque
    // EL CONSTRUCTOR SIRVE PARA CREAR OBJETOS DE LA CLASE E INICIALIZAR LOS VALORES DE SUS ATRIBUTOS
    //Es un metodo que  SE LLAMA IGUAL QUE LA CLASE, INCLUIDA LA MAYUSCULAS QUE TENGA EL NOMBRE DE LA CLASE

    public Edificio(int numeroPlantas, double area, int añoConstruccion){
        this.añoConstruccion = añoConstruccion;//este objeto (this) >que estoy creando va a tener como año de coonstruccion el
        //el que ponga en la llamada
        this.area = area;
        this.numeroPlantas = numeroPlantas;
    }

    public int getNumeroPlantas() {
        return numeroPlantas;
    }

    public void setNumeroPlantas(int numeroPlantas) {
        this.numeroPlantas = numeroPlantas;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getAñoConstruccion() {
        return añoConstruccion;
    }

    public void setAñoConstruccion(int añoConstruccion) {
        this.añoConstruccion = añoConstruccion;
    }
}
