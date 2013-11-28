package br.edu.sr.ifes.mpn.teste;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import br.edu.sr.ifes.mpn.business.engine.EngineRule;
import br.edu.sr.ifes.mpn.model.Account;
import br.edu.sr.ifes.mpn.model.AccountType;
import br.edu.sr.ifes.mpn.model.Address;
import br.edu.sr.ifes.mpn.model.Customer;

public class TesteRule {

	private EngineRule engineRule = new EngineRule();
	
	@Before
	public void before()
	{
		engineRule.config("Rules.drl");
	}
	
	@Test
	public void testandoAddressRequired()
	{
		Customer customer = new Customer();
		customer.setFirstName("Paulo");
		customer.setPhoneNumber("121212");
		
		//Criando adicionando o objeto na maquina de regras
		engineRule.addObject(customer);
		//Criando as regras
		engineRule.FireRules();
		engineRule.dispose();
	}
	
	@Test
	public void testandoPhoneNumber()
	{
		Customer customer = new Customer();
		customer.setAddress(new Address());
		customer.setFirstName("Paulo");
		
		//Criando adicionando o objeto na maquina de regras
		engineRule.addObject(customer);
		//Criando as regras
		engineRule.FireRules();
		engineRule.dispose();
	}
	
	@Test
	public void testandoAccount()
	{
		Account account = new Account();
		account.setBalance(100);
		
		//Criando adicionando o objeto na maquina de regras
		engineRule.addObject(account);
		//Criando as regras
		engineRule.FireRules();
		engineRule.dispose();
	}
	
	@Test
	public void testandoEstudante()
	{
		Customer customer = new Customer();
		DateTime dateTime = new DateTime(1983, 8, 20, 0, 0);

		customer.setDateBirth(dateTime.toDate());
		Account account = new Account();
		account.setBalance(200);
		account.setType(AccountType.Student);
		
		account.setOwner(customer);
		
		customer.getAccounts().add(account);
		
		//Criando adicionando o objeto na maquina de regras
		engineRule.addObject(customer);
		engineRule.addObject(customer.getAccounts());
		//Criando as regras
		engineRule.FireRules();
		engineRule.dispose();
	}
	
	
}
