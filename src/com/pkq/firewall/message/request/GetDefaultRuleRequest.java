package com.pkq.firewall.message.request;

import com.pkq.firewall.common.Constant;

public class GetDefaultRuleRequest {
	String msgType = Constant.GetDefaultRuleRequest; //消息类型
	String host;
	String ruleType;
	String direction;
	
	public String getHost() {
		return host;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
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
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

}
