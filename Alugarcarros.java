package br.lasalle.oop.trab1;

public class Alugarcarros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro carro1= new Carro();
		carro1.tipo='a';
		carro1.cor="Azul";
		carro1.placa="FIM0B83";
		carro1.combustivel=100;
		carro1.segurado=false;
		carro1.alugado=false;
		
		
		
		Motorista cliente=new Motorista();
		cliente.nome="joão";
		cliente.cnh_tipo='a';
		cliente.cpf=123;
	
		
		carro1.assegurar();
		cliente.alugar_carro(carro1.alugado);
		
		
	}

}
