package br.edu.sr.ifes.mpn.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.edu.sr.ifes.mpn.business.engine.EngineRule;
import br.edu.sr.ifes.mpn.model.Person;
import br.edu.sr.ifes.mpn.model.Pet;
import br.edu.sr.ifes.mpn.model.PetType;

public class TesteRule {

	private EngineRule engineRule = new EngineRule();
	
	@Before
	public void before()
	{
		engineRule.config("rules.drl");
	}
	
	@Test
	public void testandoooooo()
	{
		
		 // Create a Person
        Person person = new Person("Jurema");
        // Create a Pet
        Pet pet = new Pet("bola de pelo", "on a limb", PetType.CAT);
        // Set the Pet to the Person
        person.setPet(pet);
		//Criando adicionando o objeto na maquina de regras
		engineRule.addObject(person);
		engineRule.addObject(pet);
		//Criando as regras
		engineRule.FireRules();
		
		Assert.assertEquals(pet.getPosition(), "on the street");
		
		engineRule.dispose();
	}
	
	
	
}
