package curso;

public class Principal {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.nome = "Corsa";
		c1.potencia = 20;
		c1.velocidade = 200;
		
		c1.imprimir();
		c1.acelerar();
		c1.imprimir();
		

	}

}
