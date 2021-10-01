package UEC;

public class UEC implements UECface{
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public UEC(String no, String na, int id, float al, float pe,
			int vi, int de, int em) {
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.peso = pe;
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String no) {
		this.nome = no;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String na) {
		this.nacionalidade = na;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int id) {
		this.idade = id;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float al) {
		this.altura = al;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float pe) {
		this.peso = pe;
		this.setCategoria();
	}
	
	public void setCategoria() {
		if (getPeso() < 52.2) {
			this.categoria = "Inválido";
		} else if (getPeso() < 70.3) {
			this.categoria = "Leve";
		} else if (getPeso() <= 83.9) {
			this.categoria = "Médio";
		} else if (getPeso() <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}
	
	public String getCategoria() {
		return categoria;
	}
	public int getVitorias() {
		return this.vitorias;
	}
	public void setVitorias(int vi) {
		this.vitorias = vi;
	}
	public int getDerrotas() {
		return this.derrotas;
	}
	public void setDerrotas(int de) {
		this.derrotas = de;
	}
	public int getEmpates() {
		return this.empates;
	}
	public void setEmpates(int em) {
		this.empates = em;
	}
	
	@Override
	public void apresentar() {
		System.out.println("Lutador: " + getNome());
		System.out.println("Nacionalidade: " + getNacionalidade());
		System.out.println("Idade: " + getIdade() + "anos");
		System.out.println("ALtura: " + getAltura());
		System.out.println("Peso: " + getPeso()+"Kg");
		System.out.println("Vitórias: " + getVitorias());
		System.out.println("Derrotas: " + getDerrotas());
		System.out.println("Empates: " + getEmpates());
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void status() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ganharLuta() {
		setVitorias(getVitorias() + 1);
		
	}
	@Override
	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);
		
	}
	@Override
	public void empatarLuta() {
		setEmpates(getEmpates() + 1);
		
	}
	
	@Override
	public void abrirMenu() {
		System.out.println("==========Menu==========");
		
	}
	
	
	
}
