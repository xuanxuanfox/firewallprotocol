package com.pkq.firewall.common;

public class Constant {
	public Constant(){}
	static final public String msgtype_token = "\"msgType\":";
	static final public String AddRule = "a";
	static final public String AddRuleToken = msgtype_token + "\"a\"";
	//---------
	static final public String GetRulesRequest = "g";
	static final public String GetRulesToken = msgtype_token + "\"g\"";
	//---------
	static final public String GetDefaultRuleRequest = "gd";
	static final public String GetDefaultRuleToken = msgtype_token + "\"gd\"";
	//---------
	static final public String DelRule = "d";
	static final public String DelRuleToken = "\"msgType:\""+"\"d\"";
	//---------
	static final public String Action_allow = "allow";
	static final public String Action_deny = "deny";
	//---------
	static final public String Direction_in = "inbound";
	static final public String Direction_out = "outbound";
	//---------
	public final static int SUCESS_CODE=0; 
	public final static String SUCESS_MESSAGE="sucess"; 
	public final static int FALSE_CODE=-1; 

}
