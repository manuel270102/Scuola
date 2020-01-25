


public class Contocorrente {
	public float saldo; 
	public float ultimo_movimento;
	public static float deposito;
	public static float prelievo;


	public Contocorrente() {
		saldo = 0;
	
	}

	public Contocorrente(float s) {
		saldo = saldo + s;
		System.out.println("Il tuo saldo è: " + saldo);
	}


	public void VisualizzaSaldo() {
		System.out.println("Saldo disponibile: " + saldo);
	}


	public void deposito(float d) {
		saldo = saldo + d;
		ultimo_movimento = 1;
	}


	public void prelievo(float p) {
		saldo = saldo - p;
		ultimo_movimento = 2;
	}


	public void VisualizzaUltimoMovimento() {
		if(ultimo_movimento == 1) {
			System.out.println("L'ultimo movimento è stato un deposito");
		}else {
			System.out.println("L'ultimo movimento è stato un prelievo");
		}
	}
}