package br.edu.sr.ifes.mpn.business.engine;

import java.util.ArrayList;
import java.util.List;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.io.impl.ClassPathResource;
import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.rule.FactHandle;

public class EngineRuleDSL {

	private KnowledgeBuilder kbuilder;
	
	private KnowledgeBase kbase;
	
	private StatefulKnowledgeSession ksession;
	
	private List<FactHandle> facts = new ArrayList<FactHandle>();
	
	public void config(String dslr, String dsl){
		
		// Create the Knowledge Builder
        kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        
        kbuilder.add(ResourceFactory.newClassPathResource(dsl), ResourceType.DSL);
        
        kbuilder.add(ResourceFactory.newClassPathResource(dslr), ResourceType.DSLR);
        //Check for errors during the compilation of the rules
        KnowledgeBuilderErrors errors = kbuilder.getErrors();
        if (errors.size() > 0) {
            for (KnowledgeBuilderError error : errors) {
                System.err.println(error);
            }
            throw new IllegalArgumentException("Could not parse knowledge.");
        }

        // Create the Knowledge Base
        kbase = KnowledgeBaseFactory.newKnowledgeBase();
        
        // Add the binary packages (compiled rules) to the Knowledge Base
        kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());

        // Create the StatefulSession using the Knowledge Base that contains
        // the compiled rules
        ksession = kbase.newStatefulKnowledgeSession();
	}
	
	public void addObject(Object object)
	{
		facts.add(ksession.insert(object));
	}
	
	public void FireRules(){
		
		ksession.fireAllRules();
	}
	
	public void dispose(){
		ksession.dispose();
	}
}
