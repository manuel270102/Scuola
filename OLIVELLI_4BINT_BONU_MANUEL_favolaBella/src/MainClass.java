
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
	public static void main (String [] args) throws IOException, InterruptedException {

		System.out.println("Inserisci il nome del protagonista");

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		String nome = tastiera.readLine();

		//Nuova Persona di classe preesistente

		Persona u1=new Persona(nome,41 );
		System.out.println("\nOggi " + u1.nome +" dovresti andare in palestra a allenarti un po\n");
		System.out.println("Te la senti di andare di andare in palestra?\n [1]: Si\n [2]: No\n");
		int bho;
		float peso1 = 0;
		int si = 0;
		int c = 0;
		bho = Integer.valueOf(tastiera.readLine());			
		System.out.println("Inserisci il tuo peso in KG");
		peso1 = Integer.valueOf(tastiera.readLine());
		if(bho == 1) {
			//Nuovo Palestrato di classe preesistente 

			Palestrato p1 = new Palestrato(120);
			do {
				//Ciclo Allenamento
				
				System.out.println(u1.nome +" Te la senti di stare in palestra ancora un po?\n [1]: Si\n [2]: No\n\n");
				c ++;
				si = Integer.valueOf(tastiera.readLine());
				System.out.println("Il tuo peso è aumentato di 0.1 KG");
				peso1 += 0.100;
				if(c == 4) {
					System.out.println("\nLa stanchezza inizia a farsi sentire\n\nSEI TROPPO STANCO PER ANDARE AVANTI!!\n\n");
					break;
				}
			}while(si == 1 );
			System.out.println("Il tuo peso ora equivale a " + peso1 + "\n\n");
		}
		else {		
			System.out.println("Decidi di andare a dormire e provare ad andare il giorno dopo\n\n");
			System.out.println("BUONGIORNO\n\n");
			System.out.println("Oggi decidi di andare in palestra perche non ti puoi peermettere di peredre troppi allenamenti\n");
	
			System.out.println("Inserisci il tuo peso in KG");
		peso1 = Integer.valueOf(tastiera.readLine());

		//Nuovo Palestrato di classe preesistente 

		Palestrato p1 = new Palestrato(120);

		//Ciclo Allenamento

		do {
			System.out.println(u1.nome +" Te la senti di stare in palestra ancora un po?\n [1]: Si\n [2]: No");
			c ++;
			si = Integer.valueOf(tastiera.readLine());
			System.out.println("Il tuo peso è aumentato di 0.1 KG");
			peso1 += 0.100;
			if(c == 4) {
				System.out.println("\nLa stanchezza inizia a farsi sentire\n\nSEI TROPPO STANCO PER ANDARE AVANTI!!\n\n");
				break;
			}
		}while(si == 1 || c == 5);
		System.out.println("Il tuo peso ora equivale a " + peso1 + "\n\n");
			
		}
		





		System.out.println("Esci da paletra e torni a casa\n\n");
		System.out.println("Vai in camera e vedi il tuo cane sdraiato su un tappetino \n");
		System.out.println("Inserisci il nome del tuo amato Cane\n\n");

		//Nuovo Cane di classe preesistente 

		String nomeCane = tastiera.readLine();
		Cane c1 =new Cane(nomeCane,2);
		System.out.println("il tuo Cane vedendoti inizia a scodinzolare sembra felice");
		System.out.println("Dato che sei indeciso su l motivo per cui il tuo cane sta scodinzolando decidi di tirare un dado per decidere cosa fare");
		System.out.println(" [1] :dai da mangiare al cane");
		System.out.println(" [2] :porta a spasso il tuo cane");
		System.out.println(" [3] :porta il tuo cane a giocare");

		//Nuovo Dado di classe preesistente 

		Dado d1 = new Dado(3);

		//Metdodo lanciadado 


		int d = d1.LanciaDado();
		Thread.sleep(700);
		System.out.print(".\n");
		Thread.sleep(700);
		System.out.print(".\n");
		Thread.sleep(700);
		System.out.print(".\n");
		Thread.sleep(700);
		System.out.print(".\n");

		//Scelta di cosa fare con il cane

		if(d == 1){ 
			System.out.println("\nDecidi di dare d mangiare al tuo cane");
			c1.mangia();
			System.out.println("Il tuo cane dopo aver mangiato 100 grammi di cibo pesa : "+ c1.peso * 10 + " KG");
		}
		if(d == 2){ 
			System.out.println("\nDecidi di portare a spasso il tuo Cane");
		}
		if(d == 3) {
			System.out.println("\nDecidi di portare a giocare il tuo cane nel parco");
			System.out.println("" + c1.nome + " mentre giocavate ha morso una persona di passaggio ferendola ad una gamba");	
			System.out.println("Sei stato fortunato \nLa persona ha deciso di non sporgere denuncia \nUna volta risolta la faccenda decidi di riportare a casa " +c1.nome);	

		}
		else {
			System.out.println("Decidi di restare a casa con il tuo cane per fargli compagnia");
		}

		System.out.println("Ti accorgi di avere perso la cognizione del tempo e decidi di guardare l'orario\n\n");

		//Nuova Ora di classe preesistente

		Ora o1 = new Ora(20,12,10);

		//Metodo orario

		o1.orario();
		System.out.println("\nDopo aver visto l'orario decidi ti ricordi di dover passare per il bancomat più vicino e ti incammini\n"); 

		//Nuovo Contocorrente di classe prteesistente

		Contocorrente C1 = new Contocorrente();
		System.out.println("Ecco che si apre la schermata del bancomat");
		C1.deposito( (float) (Math.random()*4000));
		do {
			System.out.println("Selezionare l'operazione desiderata\n [1]:Deposita\n [2]:Ritira\n [3]:Visualizza Saldo\n [4]:Ultimo Movimento\n [5]:Esci\n");
			d = Integer.valueOf(tastiera.readLine());

			//Scelta di cosa fare con il bancomat


			if (d == 1) {
				System.out.println("Inserire la cifra che si desidera Depositare");
				//Metodo deposito
				C1.deposito(Integer.valueOf(tastiera.readLine()));
			}else {
				if(d==2) {
					if(C1.saldo == 0) {
						System.out.println("Saldo pari a '0' impossibile prelevare");
					}else{
						System.out.println("Inserire la cifra da prelevare");
						//Metodo Prelievo
						C1.prelievo(Float.valueOf(tastiera.readLine()));
					}
				}else {
					if(d == 3) {
						//Metodo Visualizza saldo 
						C1.VisualizzaSaldo();
					}else {
						if(d == 4){
							//Metodo Visualizza ultimo movimento
							C1.VisualizzaUltimoMovimento();
						}
					} 
				}
			}


		}while(!(d == 5));
		System.out.println("Dopo aver interagito con il bamcomat decidi di tornare a casa\n");
		System.out.println("Ti ricordi improvvisamente che domani è il tuo anniversario di fidanzamento\n");
		System.out.println("Ti si pone una scelta\n[1]: Andare a prendere il regalo alla tua ragazza all' istatnte\n[2]: Non andare a comprarle il regalo sapendo che il giorno dopo te ne dimenticherai\n");
		int scelta1 ;
		scelta1 = Integer.valueOf(tastiera.readLine());

		//Scelta regalo

		if( scelta1 == 1) {
			System.out.println("Ti avvii verso la gioielleria quando ti si pone un altra scelta\n [1]: Comprarle una collana\n [2]: Comprarle un bracciale\n [3]: Comprarle degli orecchini\n\n");
			int scelta2 ;
			int scelta3 = 0;
			scelta2 = Integer.valueOf(tastiera.readLine());

			//Scelta Regalo2

			if(scelta2 == 1) {
				System.out.println("Decidi di comprarle una collana spendendo 319 $\n");
				System.out.println("La commessa ti chiede come desideri pagare\n[1]: Pagamento con carta\n[2]: Pgamento con contanti$\n");

				//Scelta Pagamento

				scelta3 =Integer.valueOf(tastiera.readLine());
				if(scelta3 == 1) {
					System.out.println("Decidi di effettuare un pagamento con carta\n");
					C1.prelievo(319);
				}
				else {
					System.out.println("Decidi di effettuare un pagamento con contanti");
				}

			}
			if(scelta2 == 2) {
				System.out.println("Decidi di comprarle un bracciale spendendo 189 $\n");
				System.out.println("La commessa ti chiede come desideri pagare\n[1]: Pagamento con carta\n[2]: Pgamento con contanti$\n");
				if(scelta3 == 1) {
					System.out.println("Decidi di effettuare un pagamento con carta\n");
					C1.prelievo(189);
				}
				else {
					System.out.println("Decidi di effettuare un pagamento con contanti");
				}

			}
			if(scelta2 == 3) {
				System.out.println("Decidi di comprarle degli orecchini spendendo 170 $\n");
				System.out.println("La commessa ti chiede come desideri pagare\n[1]: Pagamento con carta\n[2]: Pgamento con contanti$\n");

				if(scelta3 == 1) {
					System.out.println("Decidi di effettuare un pagamento con carta\n");
					C1.prelievo(170);
				}
				else {
					System.out.println("Decidi di effettuare un pagamento con contanti");
				}
			}

		}
		else {
			System.out.println("Decidi di fare finta di nulla e non andare a comprare il regalo alla tua ragazza");
		}
		System.out.println("Esci dal negozio salutando\n\n");
		System.out.println("Decidi di tornare a casa perche ti ritieni piu che soddisfatto");
		System.out.println("Tornando a casa noti che il tuo telefono vibra all'interno della tua tasca\n");
		System.out.println("Togli il telefono dalla tasca e noti una notifica della banca che dice:\n\nIl tuo saldo attuale equivale a" + C1.saldo+"$");
		System.out.println("Oggi "+u1.nome+"sedi esausto e decidi di andare a dormire \n");
		System.out.println("Vai a salutare " + c1.nome + "e te ne vai nel letto\n\n");
		System.out.println("THE END");

	}
}

