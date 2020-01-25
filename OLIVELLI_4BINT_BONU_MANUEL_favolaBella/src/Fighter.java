import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fighter {
	public int strenght;
	public int life;
	public int weight;
	public String name;

	public Fighter(String h, int f) {
		name = h;
		strenght = (int) (Math.random() * 40 + 30);
		weight = (int) (Math.random() * 70 + 20);
		life = (int) (Math.random() * 200 + 55);
		;
	}

	// Attaccco Pugile
	public void attack(Fighter Fx) throws InterruptedException {
		int chose = (int) (Math.random() * 2 + 1);

		// Controllo Forza
		int real_strenght = strenght + weight;
		if (real_strenght > 100) {

			// Scelta Calcio-Pugno
			if (chose == 1) {
				int fist = (int) (Math.random() * 20 + 1);
				System.out.println(this.name + " Sferra un pugno potentissimo all'avversasario infliggendo danno pari a " + fist + "\n");
				Fx.life -= fist;
				real_strenght -= 20;
			} else {
				int kick = (int) (Math.random() * 35 + 1);
				System.out.println(this.name + " Sferra un calcio potentissimo all'avversasario infliggendo danno pari a " + kick + "\n");
				Fx.life -= kick;
				real_strenght -= 20;
			}
		} else {
			// Scelta Calcio-Pugno
			if (chose == 1) {
				int fist = (int) (Math.random() * 15 + 1);
				System.out.println(this.name + " Sferra un pugno di discreta potenza all'avversasario infliggendo danno pari a "+ fist + "\n");
				Fx.life -= fist;
				real_strenght += 5;
			} else {
				int kick = (int) (Math.random() * 25 + 1);
				System.out.println(this.name + " Sferra un calcio di discreta potenza all'avversasario infliggendo danno pari a "+ kick + "\n");
				Fx.life -= kick;
				real_strenght += 5;
			}

		}
	}

	// Difesa Pugile
	public void defende(Fighter Fx) {
		int defende = (int) (Math.random() * 5 + 1);
		if (defende > 3) {
			int break_guard = (int) (Math.random() * 2 + 1);
			int break_guard_damage = (int) (Math.random() * 10 + 1);
			if (break_guard == 1) {
				System.out.println(this.name + " E' riuscito a spezzare la guardia avversaria e a contrattaccare\n");
				System.out.println("\nCon il contrattacco " + this.name + " riesce a infliggere danno pari a " + break_guard_damage + "\n");
				System.out.println("Ora la vita di " + Fx.name + " equivale a " + Fx.life + "\n");
				Fx.life -= break_guard_damage;
			} else {
				System.out.println(this.name + " riesce a difendersi e recuperare fiato e 10 di vita\n");
				System.out.println("Ora la vita di " + this.name + " equivale a " + this.life + "\n");
				this.life += 10;
			}
		} else {
			System.out.println(this.name + " Non riesce a difendersi\n");
			System.out.println("Ora la vita di " + this.name + " equivale a " + this.life + "\n");		
		}

	}

	public static void main(String[] args) throws IOException, InterruptedException {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);

		// Pugile P1
		System.out.println("Inserisci il nome del primo combattente\nNOME:");
		String nome = tastiera.readLine();
		Fighter P1 = new Fighter(nome, 10);
		System.out.println("\nLa vita del primo combattente equivale a " + P1.life + "\n\n");

		// Pugile P2
		System.out.println("Inserisci il nome del secondo combattente\nNOME:");
		String nome2 = tastiera.readLine();
		Fighter P2 = new Fighter(nome2, 10);
		System.out.println("\nLa vita del secondo combattente equivale a " + P2.life + "\n\n");

		// Inizio Combattimneto
		System.out.print("\n");
		Thread.sleep(700);
		System.out.print(".\n");
		Thread.sleep(700);
		System.out.print(".\n");
		Thread.sleep(700);
		System.out.print(".\n");
		Thread.sleep(700);
		System.out.print(".\n");

		System.out.println("\nGONG!\n");
		System.out.println("Lo scontro ha inizo!\n\n");
		System.out.print("I combattenti si avvicinano e\n\n");
		Thread.sleep(700);
		System.out.print(".\n");
		Thread.sleep(700);
		System.out.print(".\n");
		Thread.sleep(700);
		System.out.print(".\n");
		Thread.sleep(700);
		System.out.print(".\n");

		// Primo attacco
		int first_attack = (int) (Math.random() * 2 + 1);

		// Attacco P1
		if (first_attack == 1) {
			System.out.println("Ecco che " + P1.name + " avanza per attaccare\n");
			P1.attack(P2);
			P2.defende(P1);

			// Attacco P2
		} else {
			System.out.println("Ecco che " + P2.name + " avanza per attaccare\n");
			P2.attack(P1);
			P1.defende(P2);

		}
		while (P1.life > 0 && P2.life > 0) {

			P1.attack(P2);
			if (P2.life <= 0) {
				break;
			}

			Thread.sleep(1000);
			System.out.print(".\n");
			Thread.sleep(1000);
			System.out.print(".\n");
			Thread.sleep(1000);
			System.out.print(".\n");
			Thread.sleep(1000);
			System.out.print(".\n\n");

			P2.defende(P1);
			Thread.sleep(1000);
			System.out.print(".\n");
			Thread.sleep(1000);
			System.out.print(".\n");
			Thread.sleep(1000);
			System.out.print(".\n");
			Thread.sleep(1000);
			System.out.print(".\n\n");
			P2.attack(P1);
			if (P1.life <= 0) {
				break;
			}
			Thread.sleep(1000);
			System.out.print(".\n");
			Thread.sleep(1000);
			System.out.print(".\n");
			Thread.sleep(1000);
			System.out.print(".\n");
			Thread.sleep(1000);
			System.out.print(".\n\n");
			P1.defende(P2);
			Thread.sleep(1000);
			System.out.print(".\n");
			Thread.sleep(1000);
			System.out.print(".\n");
			Thread.sleep(1000);
			System.out.print(".\n");
			Thread.sleep(1000);
			System.out.print(".\n\n");
		}
		if(P1.life <= 0) {
			System.out.print(P1.name + " cade a terra senza forze\n");
			System.out.print("Parte il conteggio da parte del deirettore di gara e\n\n");
			Thread.sleep(1000);
			System.out.print("1\n");
			Thread.sleep(1000);
			System.out.print("2\n");
			Thread.sleep(1000);
			System.out.print("3\n\n");
			System.out.print(P2.name + " E' IL VINCITORE!!");

		}else {
			System.out.print(P2.name + " cade a terra senza forze\n");
			System.out.print("Parte il conteggio da parte del deirettore di gara e\n\n");
			Thread.sleep(1200);
			System.out.print("1\n");
			Thread.sleep(1200);
			System.out.print("2\n");
			Thread.sleep(1200);
			System.out.print("3\n\n");
			System.out.print(P1.name + " E' IL VINCITORE!!");

		}

	}

}
