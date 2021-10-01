package UEC;

public class main {

	public static void main(String[] args) {
		UEC l[] = new UEC[6];
		
		l[0] = new UEC("Pretty Boy", "França", 31, 1.75f, 
						68.9f, 11, 2, 1);
		l[1] = new UEC("Putscript", "USA", 35, 1.65F,
						80.9F, 12, 2, 1);
		l[2] = new UEC("Dead Code", "Austrália", 28, 1.93f,
						81.6f, 13, 0, 2);
		l[3] = new UEC("UF0Cobol", "Brasil", 37, 1.70f,
						119.3f, 5, 4, 3);
		l[4] = new UEC("Nerdaart", "USA", 30, 1.81f,
						105.7f, 12, 2, 3);
		
		l[1].apresentar();
		
		

	}

}
