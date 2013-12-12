package br.edu.sr.ifes.mpn.teste;

import org.junit.Before;
import org.junit.Test;

import br.edu.sr.ifes.mpn.business.engine.EngineRuleDSL;
import br.edu.sr.ifes.mpn.model.Account;
import br.edu.sr.ifes.mpn.model.Address;
import br.edu.sr.ifes.mpn.model.Customer;

public class TesteValidationRule {

	private EngineRuleDSL engineRule = new EngineRuleDSL();
	private final String DSLRFile = "validation.dslr";
	private final String DSLFile = "validation.dsl";
	
	
	@Before
	public void before()
	{
		engineRule.config(DSLRFile,DSLFile);
	}
	
	@Test
	public void addressRequired()
	{
		 Customer customer = new Customer();
		 customer.setFirstName("David");
		 customer.setPhoneNumber("1212121");
		 engineRule.addObject(customer);
		 engineRule.FireRules();
		 engineRule.dispose();
	}
	
	@Test
	public void phoneNumberRequired()
	{
		 Customer customer = new Customer();
		 customer.setFirstName("David");
		 customer.setAddress(new Address());
		 engineRule.addObject(customer);
		 engineRule.FireRules();
		 engineRule.dispose();
	}
	
	@Test
	public void ownerRequired()
	{
		 Account account = new Account();
		 account.setNumber(666);
		 account.setBalance(1000);
		 engineRule.addObject(account);
		 engineRule.FireRules();
		 engineRule.dispose();
	}
	
	
	
}
