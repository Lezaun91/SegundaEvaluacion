package Poo.coche;

public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;

    private int peso_plataforma;

    private String color;

    private int pesoTotal;

    private boolean asientosCuero, climatizador;


    public Coche(){
        ruedas = 4;
        //this.ruedas = ruedas;
        largo = 2000;
        //this.largo = largo;
        ancho = 300;
        //this.ancho = ancho;
        motor = 1600;
        //this.motor = motor;
        peso_plataforma = 500;
        //this.peso = peso;
    }
    public String dimeDatosGenerales(){//GETTER

    return "La plataforma del vehiculo tiene " + ruedas + " ruedas" +
            " Mide " + largo/1000 + " metros con un ancho de " + ancho +
            " cm \ny un peso de plataforma de " + peso_plataforma + " Kilos" +
            " y un motor de " + motor + " centimetros cubicos";
    }
    public void estableceColor(String color_coche){//SETTER
        //color = "Amarillo";
        color = color_coche;
    }
    public String dimeColor(){

    return "El color del coche es " + color;
    }
    public void configurAsientos(String asientosCuero){//SETTER
        if(asientosCuero.equalsIgnoreCase("Si")){
            this.asientosCuero=true;
        } else {
            this.asientosCuero = false;
        }
    }
    public String dimeAsientos(){//GETTER
        if (asientosCuero== true){
            return "El coche tiene asientos de cuero";
        }else {
            return "El coche tiene asientes de serie";
        }
    }
    public void configurarClimatizador(String climatizador){//SETTER
        if(climatizador.equalsIgnoreCase("si")){
            this.climatizador= true;
        } else{
            this.climatizador= false;
        }

    }
    public String dimeClimatizador(){//GETTER
        if(climatizador==true){
            return "El coche tiene climatizador";
        } else {
            return "El coche no tiene climatizador";
        }
    }
    public String dimePesoCoche(){ //SETTER + GETTER
        int pesoCarroceria = 500;
        pesoTotal = peso_plataforma + pesoCarroceria;

        if (asientosCuero==true){
            pesoTotal = pesoTotal + 50;
        }
        if (climatizador== true){
            pesoTotal= pesoTotal + 20;
        }
        return "El peso del coche es " + pesoTotal;
    }
    public int precioCoche(){//GETTER
        int precioFinal = 10000;

        if (asientosCuero==true){
            precioFinal += 2000;
        }
        if (climatizador==true){
            precioFinal+= 1500;
        }
        return precioFinal;
    }
}
