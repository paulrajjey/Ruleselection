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
import com.myspace.ruleselection.Transaction;
import org.kie.api.runtime.StatelessKieSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import com.myspace.ruleselection.AgentaLister;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;


/**
 * This class was automatically generated by the data modeler tool.
 */

public class TaxonomyWorkItemHandler implements WorkItemHandler ,java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    private KieContainer kContainer;
    
    public TaxonomyWorkItemHandler() {
        
        KieServices ks = KieServices.Factory.get();
        kContainer = ks.getKieClasspathContainer();
        
    }
    
    

    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
		
	    String  taxonomy = (String) workItem.getParameter("taxonomy");
		String  taxonomyValue = (String) workItem.getParameter("taxonomyValue");
		List trans = (List) workItem.getParameter("facts");
		
		StatelessKieSession stateless  = kContainer.newStatelessKieSession("rksession");
	 
		stateless.setGlobal("Taxonomy", taxonomy);
		stateless.setGlobal("TaxonomyValue", taxonomyValue);

		stateless.execute(trans);
        Map result = new HashMap();
        result.put("Result",result);
	    manager.completeWorkItem(workItem.getId(), result);
	}

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		// TODO Auto-generated method stub

	}


}