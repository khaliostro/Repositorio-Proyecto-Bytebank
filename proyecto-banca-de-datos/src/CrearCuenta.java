
public class CrearCuenta {

	public static void main(String[] args) {
			//variable       = valor
			// variable 	= 123ffd
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 400;
		//primermaCuenta.pais = "Bolivia"; no compila	
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 400;

		System.out.println(segundaCuenta.saldo);
		//System.out.println(primeraCuenta.agencia);
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if (primeraCuenta.saldo == segundaCuenta.saldo) {
			System.out.println("Son el mismo objeto");
		} else {
			System.out.println("Son diferentes");
		}
	}
}
