package com.pkq.firewall.message.request;
import com.pkq.firewall.common.Constant;
import com.pkq.firewall.model.Rule;

public class AddRuleRequest {
	String msgType = Constant.AddRule; //消息类型
	String host;
	String ruleType;
	Rule rule;
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getRuleType() {
		return ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}
	public Rule getRule() {
		return rule;
	}
	public void setRule(Rule rule) {
		this.rule = rule;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
}
