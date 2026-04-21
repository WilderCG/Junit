package banco;

public class Cuenta {

    //defino dos variables para alojar el numero de cuenta y el saldo
    private String numero; //numero de la cuenta bancaria
    private float saldo; // saldo de la cuenta bancaria en euros

    public Cuenta(String numCta, float saldoCta) {  //creo el constructor que tendra dos parametros numCta y saldo Cta
        numero = numCta;  //asi cuando lo llame, cada uno de los valores de los parametros ira
        saldo = saldoCta;  //a las variables que hemos definido antes.
    }

    public String getNumero() {
        return numero;  //creo los getter y setter metodos que me sirven para obtener e introducir valores respectivamente se hace desde Source-generate getters...
    }

    public void setNumero(String numCta) {
        this.numero = numCta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldoCta) {
        this.saldo = saldoCta;
    }

    public void ingresarDinero(float importe) {
        saldo = saldo + importe;
    }

    public void extraerDinero(float importe) {
        // saldo= saldo-importe;

        if (saldo - importe < 0)
            throw new java.lang.ArithmeticException("Saldo Negativo");
        else saldo = saldo - importe;
    }

    public void mostrarCuenta() {
        System.out.println("El numero de cuenta es: " + getNumero());
        System.out.println("El saldo es: " + getSaldo() + "€");
    }
}
