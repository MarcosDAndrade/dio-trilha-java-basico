package Iphone.Iphone1;

import Iphone.Midia.ReprodutorMusical;
import Iphone.Navegacao.navegadorInternet;
import Iphone.Telefone.aparelhoTelefonico;

public class Sistema implements ReprodutorMusical, navegadorInternet, aparelhoTelefonico{

	
	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("LIGANDO");
	}
	
	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("ATENDENDO IPHONE");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("INICIANDO CORREIO DE VOZ");
	}

	@Override
	public void exibirPágina() {
		// TODO Auto-generated method stub
		System.out.println("ABRINDO NOVA PAGINA");
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("ADICIONANDO NOVA ABA");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("ATUALIZANDO PÁGINA....");
		System.out.println("PÁGINA ATUALIZADA");
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("TOCANDO A MÚSICA");
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("PAUSANDO A MÚSICA");
	}

	@Override
	public void selecionarMusica() {
		// TODO Auto-generated method stub
		System.out.println("SELECIONANDO MUSICA");
	}

	

	

}
