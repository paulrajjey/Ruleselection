package com.myspace.ruleselection;

import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;
import org.kie.api.command.Command;
import org.kie.api.command.KieCommands;
import org.kie.api.KieServices;
import java.util.Arrays;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.RuleContext;
import org.drools.core.spi.ProcessContext;
import java.util.Collection;


/**
 * This class was automatically generated by the data modeler tool.
 */

public class TaxonomyWorkItemHandler implements WorkItemHandler ,java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    private KieSession ksession;
    //private StatelessKieSession ksession;
    
    public TaxonomyWorkItemHandler() {
    }
    
    public TaxonomyWorkItemHandler(KieSession ksession) {
        this.ksession = ksession;
    }

    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
		
	    String  taxonomy = (String) workItem.getParameter("taxonomy");
		String  taxonomyValue = (String) workItem.getParameter("value");
		ProcessContext kcontext = (ProcessContext) workItem.getParameter("param1");
		//KieSession ksession = (KieSession)workItem.getParameter("param1");
		//KieSession ksession = (KieSession) kcontext.getKieRuntime();
			//	).fireAllRules();
		//AgentaFilterImp agenta = new AgentaFilterImp(taxonomy,taxonomyValue);
		//ksession.get
		ksession.setGlobal("Taxonomy", taxonomy);
		ksession.setGlobal("TaxonomyValue", taxonomyValue);
		System.out.println("in workitem handler-taxonomy - > " + taxonomyValue );
	    System.out.println("in workitem handler-taxonomy - > " + taxonomy );

		Collection<?> obj =  ksession.getObjects();
		for(Object o : obj){
		
	        if( o != null){
	           System.out.println("objec is not null---> " );

	        	ksession.insert(o);
	        }
		}
		ksession.fireAllRules();
		   
	    manager.completeWorkItem(workItem.getId(), null);
	}

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		// TODO Auto-generated method stub

	}


}