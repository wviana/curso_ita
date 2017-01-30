package imc;

public class Paciente {
	double peso;                 // atributos da classe paciente
	double altura;
	double metros;
	
	public Paciente(double peso, double altura , double metros){// construtor da classe paciente
	 this.peso=peso;
	 this.altura=altura;
	 this.metros=metros;

	}

	public double calcularImc(){
		double imc = peso / (altura * (metros));
		return imc;
	}
	
	public String diaginostico(){
		
		return null;
		 
	
	}
}	

	
