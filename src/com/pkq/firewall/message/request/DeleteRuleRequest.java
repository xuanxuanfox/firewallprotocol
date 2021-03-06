package com.pkq.firewall.message.request;

import com.pkq.firewall.common.Constant;

/**
 * 删除规则请求消息
 * @author fox
 *
 */
public class DeleteRuleRequest {
	String msgType = Constant.DelRule; //消息类型
	String host;
	String direction;
	String id;
	String protocol;
	String port;
	
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}

}
