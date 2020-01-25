
public class Dado {
	public int numFacce;
	public int res;

	public Dado(int nFacce) {
		numFacce = nFacce;
		res = 0;

	}

	public int LanciaDado() {
		res = (int) (Math.random() * numFacce + 1);
		return res;
	}



}
