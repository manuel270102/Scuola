

public class Ora {

	public int ore;
	public int minuti;
	public int secondi;

	public Ora() {
		ore = 0;
		minuti = 0;
		secondi = 0;

	}

	public Ora(int o, int m, int s) {
		ore=o;
		minuti=m;
		secondi=s;

	}

	public void aumentaOra() {
		ore++;
		if (ore == 23) {
			ore = 0;
		}

	}

	public void aumentaMinuti() {
		minuti ++;
		if (minuti == 60) {
			minuti = 0;
		}
	}

	public void aumentaSecondi() {
		secondi ++;
		if (secondi == 60) {
			secondi = 0;
		}
	}

	public int calcolaSecondi() {
		int risultato=0;
		risultato = risultato + ore*60*60;
		risultato = risultato + minuti*60;
		risultato = risultato + secondi;

		return risultato;
	}
	
	public void orario() {
		System.out.println(ore+":"+minuti+":"+secondi);
		
	}
}
