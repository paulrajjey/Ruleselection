package com.myspace.ruleselection;

import java.util.Collection;

import org.kie.api.event.process.ProcessCompletedEvent;
import org.kie.api.event.process.ProcessEventListener;
import org.kie.api.event.process.ProcessNodeLeftEvent;
import org.kie.api.event.process.ProcessNodeTriggeredEvent;
import org.kie.api.event.process.ProcessStartedEvent;
import org.kie.api.event.process.ProcessVariableChangedEvent;
import org.kie.api.runtime.KieRuntime;
import org.kie.api.runtime.rule.FactHandle;

public class SessionCleanUpProcessListener implements ProcessEventListener {

	@Override
	public void afterNodeLeft(ProcessNodeLeftEvent event) {
	    KieRuntime kruntime = event.getKieRuntime();
		Collection<FactHandle> factHandles = kruntime.getFactHandles();
	    for (FactHandle nextFactHandle : factHandles) {
	        kruntime.delete(nextFactHandle);
	    }
	    // Reset globals in the knowledge runtime.
	   /* MapGlobalResolver globals = (MapGlobalResolver) kruntime.getGlobals();
	    Entry<String, Object>[] entries = globals.getGlobals();
	    for (Entry<String, Object> nextEntry : entries) {
	        nextEntry.setValue(null);
	    }*/
	}

	@Override
	public void afterNodeTriggered(ProcessNodeTriggeredEvent event) {
		// TODO Auto-generated method stub
		
	    
	  
	}

	@Override
	public void afterProcessCompleted(ProcessCompletedEvent event) {
		 KieRuntime kruntime = event.getKieRuntime();
			Collection<FactHandle> factHandles = kruntime.getFactHandles();
		    for (FactHandle nextFactHandle : factHandles) {
		        kruntime.delete(nextFactHandle);
		    }
		    // Reset globals in the knowledge runtime.
		   /* MapGlobalResolver globals = (MapGlobalResolver) kruntime.getGlobals();
		    Entry<String, Object>[] entries = globals.getGlobals();
		    for (Entry<String, Object> nextEntry : entries) {
		        nextEntry.setValue(null);
		    }*/

	}

	@Override
	public void afterProcessStarted(ProcessStartedEvent event) {
		// TODO Auto-generated method stub
		/*KieSession ksession = (KieSession)event.getKieRuntime();
	    WorkflowProcessInstance pi = (WorkflowProcessInstance)event.getProcessInstance();
		pi.setVariable("ksession", ksession);*/

	}

	@Override
	public void afterVariableChanged(ProcessVariableChangedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeNodeLeft(ProcessNodeLeftEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeNodeTriggered(ProcessNodeTriggeredEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeProcessCompleted(ProcessCompletedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeProcessStarted(ProcessStartedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeVariableChanged(ProcessVariableChangedEvent arg0) {
		// TODO Auto-generated method stub

	}

}
