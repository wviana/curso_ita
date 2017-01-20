package curso;

public class Carro {
	
	int potencia;
	int velocidade;
	String nome;

	void acelerar() {
		velocidade += potencia;
	}
	
	void freiar() {
		velocidade = velocidade /2;	
	}
		
	int getVelocidade() {
		return velocidade;
	}
	
	void imprimir() {
		System.out.println("meu carro é " +nome + " está com a velocidade " +getVelocidade()+ "km/h");
	}

}
