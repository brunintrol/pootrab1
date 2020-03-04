package br.lasalle.oop.trab1;

public class Carro {
	
	char tipo;
	String cor;
	String placa;
	int combustivel;
	Boolean segurado;
	Boolean alugado;
	
	void alugar() {
		if(!alugado) {
			alugado=true;
			System.out.println("alugado com sucesso");
		}
		else System.out.println("carro já alugado");
	}
	
	void assegurar() {
		if(!segurado) {
			segurado=true;
			System.out.println("assegurado com sucesso");
		}
		else System.out.println("carro ja assegurado");
		
	}
	
	void abastecer() {
		if(combustivel<100) {
			combustivel=100;
			System.out.println("carro abastecido com sucesso");
		}
		else System.out.println("carro ja abastecido");
		
	}
	
}
