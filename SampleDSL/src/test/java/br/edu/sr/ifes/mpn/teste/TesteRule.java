package br.edu.sr.ifes.mpn.teste;

import org.junit.Before;
import org.junit.Test;

import br.edu.sr.ifes.mpn.business.engine.EngineRuleDSL;
import br.edu.sr.ifes.mpn.model.Customer;

public class TesteRule {

	private EngineRuleDSL engineRule = new EngineRuleDSL();
	private final String DSLRFile = "simple.dslr";
	private final String DSLFile = "simple.dsl";
	
	
	@Before
	public void before()
	{
		engineRule.config(DSLRFile,DSLFile);
	}
	
	@Test
	public void sampleTest()
	{
		 Customer customer = new Customer();
		 customer.setFirstName("David");
		 engineRule.addObject(customer);
		 engineRule.FireRules();
		 engineRule.dispose();
	}
	
	
	
}
