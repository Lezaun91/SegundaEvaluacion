package Poo.banco;

import java.util.Arrays;

public class Cuenta {
    private String iban;
    private double saldo;
    private boolean activa;
    private String[] dniTitulares;

    public Cuenta(String iban, double saldo, boolean activa, String[] dniTitulares) {
        this.iban = iban;
        this.saldo = saldo;
        this.activa = activa;
        this.dniTitulares = dniTitulares;
    }

    //si los atributos son private, solamente pueden ser leidos desde esta misma clase
    //para ellos se utilizan dos metodos
    //get--> para "leer" desde otra clase

    //getters
    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isActiva() {
        return activa;
    }

    public String[] getDniTitulares() {
        return dniTitulares;
    }

    //setters


    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setSaldo(double saldo) {
        this.saldo = 5000000;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public void setDniTitulares(String[] dniTitulares) {
        this.dniTitulares = dniTitulares;
    }

    @Override
    public String toString() {

        String atributosObjeto;
        if (this.activa ==true){
            atributosObjeto= iban + " - " + saldo + " € " +
                    " activa - " + Arrays.toString(dniTitulares) +
                    '}';

        }else {
            atributosObjeto= iban + " - " + saldo + " € " +
                    "no activa - " + Arrays.toString(dniTitulares) +
                    '}';

        }
        return atributosObjeto;
    }
    public void imprimirCuenta(){
        System.out.println(this.toString());

    }
}
