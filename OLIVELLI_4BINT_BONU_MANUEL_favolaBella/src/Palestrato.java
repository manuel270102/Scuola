
public class Palestrato {
	public float peso;
	public float res;

	public Palestrato(int p) {
		peso = p;
		res = 0;

	}

	public void  Solleva () {
		res = (float) (Math.random()*4000);
	}



}
