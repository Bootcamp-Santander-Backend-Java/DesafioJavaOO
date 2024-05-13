package com.paulo.desafio.iphone.usuario;

import com.paulo.desafio.iphone.aparelho.IPhoneDio;
import com.paulo.desafio.iphone.funcoes.Internet;
import com.paulo.desafio.iphone.funcoes.Music;
import com.paulo.desafio.iphone.funcoes.Phone;

public class IPhoneUsuario {

	public static void main(String[] args) {
		
		
		Internet safari = new IPhoneDio();
		safari.atualizarPagina();
		safari.adicinarNovaAba();
		safari.exibirPagina();
		
		Music iPod  = new IPhoneDio();
		iPod.play();
		iPod.pause();
		iPod.selecionarMusica();
		
		Phone phone = new IPhoneDio();
		phone.ligar();
		phone.atender();
		phone.iniciarCorreioDeVoz();

	}

}
