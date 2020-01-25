import java.io.IOException;

public class Persona {
	public int anni;
	public int vita;
	public float peso;
	public String nome;

	public Persona(String h, int f) {
		nome = h;
		anni = (int) (Math.random() * 40+30);
		peso = (int) (Math.random() * 70 + 20);
		vita = 100;
	}

	public void mangiaAlMc() {
		peso += 10;
	}
	
	

	
	
	
	public void faiLeCorna() {
		int i = 0;
while(i == 0)
	System.out.println("DIO PORCO\n\n");
}
	}



}
