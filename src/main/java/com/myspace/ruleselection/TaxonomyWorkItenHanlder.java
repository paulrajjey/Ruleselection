package com.myspace.ruleselection;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TaxonomyWorkItenHanlder implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public TaxonomyWorkItenHanlder() {
    }

    public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		// TODO Auto-generated method stub

	}
    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
        
        
        manager.completeWorkItem(workItem.getId(), null);
    
    }

}