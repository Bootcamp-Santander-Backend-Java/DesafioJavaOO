package com.paulo.desafio.iphone.aparelho;

import com.paulo.desafio.iphone.funcoes.Internet;
import com.paulo.desafio.iphone.funcoes.Music;
import com.paulo.desafio.iphone.funcoes.Phone;

public class IPhoneDio implements Internet, Music, Phone  {

	@Override
	public void ligar() {
		
		System.out.println(">>> LIGANDO PARA CONTATO >>> ");
		
	}

	@Override
	public void atender() {
		
		System.out.println(">>> ATENDENDO TELEFONE >>>"); 
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		
		System.out.println("<<< INICIANDO CORREIO DE VOZ >>>");
		
	}

	@Override
	public void play() {
		
		System.out.println("<<< INICIANDO MÙSICA >>>");
		
	}

	@Override
	public void pause() {
		
		System.out.println("<<< PAUSANDO  MÙSICA >>>");
				
	}

	@Override
	public void selecionarMusica() {
		System.out.println("<<< SELECIONANDO MÙSICA >>>");
		
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("<<< EXIBINDO PAGINA WEB >>>");
		
	}

	@Override
	public void atualizarPagina() {
		
		System.out.println("<<< ATUALIZANDO PAGINA WEB >>>");
		
	}

	@Override
	public void adicinarNovaAba() {
		
		System.out.println("<<< ADICIONANDO NOVA ABA >>>");
		
	}
	
	

}
