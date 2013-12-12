package br.edu.sr.ifes.mpn.teste;

import org.junit.Before;
import org.junit.Test;

import br.edu.sr.ifes.mpn.business.engine.EngineRuleDSL;
import br.edu.sr.ifes.mpn.model.Account;
import br.edu.sr.ifes.mpn.model.Address;
import br.edu.sr.ifes.mpn.model.Customer;

public class TesteValidationRule2 {

	private EngineRuleDSL engineRule = new EngineRuleDSL();
	private final String DSLRFile = "validation2.dslr";
	private final String DSLFile = "validation2.dsl";
	
	
	@Before
	public void before()
	{
		engineRule.config(DSLRFile,DSLFile);
	}
	
	@Test
	public void ownerRequired()
	{
		 Account account = new Account();
		 account.setNumber(666);
		 account.setBalance(100);
		 engineRule.addObject(account);
		 engineRule.FireRules();
		 engineRule.dispose();
	}
}
