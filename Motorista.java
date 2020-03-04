package br.lasalle.oop.trab1;

public class Motorista {
	
	String nome;
	char cnh_tipo;
	int cpf;
	Boolean dirigindo;
	
	void alugar_carro(Boolean alugado) {
		if(alugado) {
			System.out.println("carro já alugado, escolha outro");
		}
		else {
			alugado=true;
			System.out.println("carro alugado com sucesso");
		}
	}
	
	void dirigir() {
		if(dirigindo) {
			System.out.println("Motorista ja dirigindo");
		}
		else {
			dirigindo=true;
			System.out.println("Motorista começou a dirigir");
		}
	}
	
}
