package br.edu.sr.ifes.mpn.teste;

import org.junit.Before;
import org.junit.Test;

import br.edu.sr.ifes.mpn.business.engine.EngineRule;
import br.edu.sr.ifes.mpn.model.Account;

public class TesteRule {

	private EngineRule engineRule = new EngineRule();
	
	@Before
	public void before()
	{
		engineRule.config("Rules.drl");
	}
	
	@Test
	public void testandoBasicRule()
	{
		//Criando um objeto
		Account account = new Account();
		account.setBalance(50);
		//Criando adicionando o objeto na maquina de regras
		engineRule.addObject(account);
		//Criando as regras
		engineRule.FireRules();
		engineRule.dispose();
	}
	
	@Test
	public void testandoNaoBasicRule()
	{
		//Criando um objeto
		Account account = new Account();
		account.setBalance(100);
		//Criando adicionando o objeto na maquina de regras
		engineRule.addObject(account);
		//Criando as regras
		engineRule.FireRules();
		engineRule.dispose();
	}
	
}
