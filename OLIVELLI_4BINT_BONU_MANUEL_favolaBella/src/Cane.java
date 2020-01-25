
public class Cane {
	public String nome;
	public int anni;
	public float peso;
	public int forza;

	public Cane(String h, int f) {
		nome = h;
		anni = 1;
		peso = 0.5f;
		forza = f;

	}

	public void mangia() {
		peso += 0.100;
	}

	public void mangia(int numCrocchette) {
		float pasto = numCrocchette * 0.05f;
		peso += pasto;
	}

	public int quanteCrocchetteperaumentaredi(float aumentoPeso) {
		int numCrocchette = (int) (aumentoPeso / 0.05f);
		return numCrocchette;

	}

	public void caga() {
		int numCrocchette = (int) (Math.random() * (3) + 2);
		peso = numCrocchette * 0.05f;
	}

	public float mordi() {
		float danno = forza * peso;
		return danno;
	}

	public float attacca(int numMorsi, Boolean ha_la_rabbia) {
		float d, dannoTot = 0;
		for (int i = 0; i < numMorsi; i++) {
			d = mordi();
			dannoTot = dannoTot + d;
		}
		if (ha_la_rabbia) {
			dannoTot = dannoTot * 2;
		}
		return dannoTot;
	}


}
