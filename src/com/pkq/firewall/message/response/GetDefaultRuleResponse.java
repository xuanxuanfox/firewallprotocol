package com.pkq.firewall.message.response;

public class GetDefaultRuleResponse extends Response{
	String policy;
	String direction;

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
}
