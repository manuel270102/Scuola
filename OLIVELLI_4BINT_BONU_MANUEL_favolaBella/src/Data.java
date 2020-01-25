public class Data {
	public int giorni;
	public int mesi;
	public int anni;

	public Data(int g, int m, int a) {
		giorni = g;
		mesi = m;
		anni = a;
	}

	public void aumentaAnni() {
		anni++;

	}

	public void aumentaMesi() {
		mesi++;
		if (mesi == 12) {
			mesi = 1;
		}

	}

	public void aumentaGiorni() {
		giorni++;
		if(giorni==30) {
			giorni=1;
		}
	}

}





