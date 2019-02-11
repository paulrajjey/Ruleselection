package com.myspace.ruleselection;

import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.AgendaEventListener;
import org.kie.api.event.rule.AgendaGroupPoppedEvent;
import org.kie.api.event.rule.AgendaGroupPushedEvent;
import org.kie.api.event.rule.BeforeMatchFiredEvent;
import org.kie.api.event.rule.MatchCancelledEvent;
import org.kie.api.event.rule.MatchCreatedEvent;
import org.kie.api.event.rule.RuleFlowGroupActivatedEvent;
import org.kie.api.event.rule.RuleFlowGroupDeactivatedEvent;

public class AgentaLister implements AgendaEventListener {

	@Override
	public void afterMatchFired(AfterMatchFiredEvent event) {
		// TODO Auto-generated method stub
		System.out.println( "Rule executed " + event.getMatch().getRule().getName());

	}

	@Override
	public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void agendaGroupPopped(AgendaGroupPoppedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void agendaGroupPushed(AgendaGroupPushedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeMatchFired(BeforeMatchFiredEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void matchCancelled(MatchCancelledEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void matchCreated(MatchCreatedEvent arg0) {
		// TODO Auto-generated method stub

	}

}
