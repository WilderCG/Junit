package banco;

public class Cuenta {
	
							//defino dos variables para alojar el n�mero de cuenta y el saldo
	private String numero; //numero de la cuenta bancaria
	private float saldo; // saldo de la cuenta bancaria en euros
	private float xx;

	
	
	
	public Cuenta (String numCta, float saldoCta) {     //creo el constructor que tendr� dos par�metros numCta y saldo Cta 
		numero=numCta;                                  //asi cuando lo llame, cada uno de los valores de los par�metros ir�
		saldo=saldoCta;									//a las variables que hemos definido antes.
	}
			
		
	public String getNumero() {
		return numero;								//creo los getter y setter m�todos que me sirven
	}												//para obtener e introducir valores respectivamente
													//se hace desde Source-generate getters...
	
	public void setNumero(String numCta) {
		this.numero = numCta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldoCta) {
		this.saldo = saldoCta;
	}
	
	public void ingresarDinero (float importe) {
		saldo= saldo+importe;
	}
	
	public void extraerDinero (float importe) {
		// saldo= saldo-importe;
		
	if (saldo-importe <0)
			throw new java.lang.ArithmeticException ("Saldo Negativo");
		else saldo=saldo-importe;    
		
		
	}	
	
	public void mostrarCuenta () {
		System.out.println("El numero de cuenta es: " + getNumero() );
		System.out.println("El saldo es: " + getSaldo() + "€");
	}	
	
	
}
