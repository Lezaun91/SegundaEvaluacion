package Poo.ejercicios.ejercicio16banco;

public class Cuenta {
    /*a. Crea una clase Cuenta, con tres atributos:
    i. código, de tipo String
    ii. balance, de tipo float
    iii. propietario, de tipo Usuario*/
    private String codigo;
    private float balance;
    private Usuario propietario;

    public Cuenta(String codigo, float balance, Usuario propietario) {
        this.codigo = codigo;
        this.balance = balance;
        this.propietario = propietario;
    }

    public void setCodigo(String codigo) {

        this.codigo = codigo;
    }

    public void setBalance(float balance) {

        this.balance = balance;
    }

    public void setPropietario(Usuario propietario) {
        this.propietario = propietario;
    }

    public String getCodigo() {
        return codigo;
    }

    public float getBalance() {
        return balance;
    }

    public Usuario getPropietario() {
        return propietario;
    }



    @Override
    public String toString() {
        return "Cuenta codigo = " +
                 codigo +
                " balance = " + balance +
                " propietario " + propietario ;
    }
}
