package com.pointlion.sys.mvc.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysMobileMessage<M extends BaseSysMobileMessage<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public void setToUserid(java.lang.String toUserid) {
		set("to_userid", toUserid);
	}
	
	public java.lang.String getToUserid() {
		return getStr("to_userid");
	}

	public void setToUsername(java.lang.String toUsername) {
		set("to_username", toUsername);
	}
	
	public java.lang.String getToUsername() {
		return getStr("to_username");
	}

	public void setToName(java.lang.String toName) {
		set("to_name", toName);
	}
	
	public java.lang.String getToName() {
		return getStr("to_name");
	}

	public void setToMobile(java.lang.String to_mobile) {
		set("to_mobile", to_mobile);
	}
	
	public java.lang.String getToMobile() {
		return getStr("to_mobile");
	}
	
	public void setMessage(java.lang.String message) {
		set("message", message);
	}
	
	public java.lang.String getMessage() {
		return getStr("message");
	}

	public void setSendTime(java.lang.String sendTime) {
		set("send_time", sendTime);
	}
	
	public java.lang.String getSendTime() {
		return getStr("send_time");
	}

	public void setType(java.lang.String type) {
		set("type", type);
	}
	
	public java.lang.String getType() {
		return getStr("type");
	}

	public void setMessagePlatfrom(java.lang.String messagePlatfrom) {
		set("message_platfrom", messagePlatfrom);
	}
	
	public java.lang.String getMessagePlatfrom() {
		return getStr("message_platfrom");
	}

	public void setSendId(java.lang.String send_id) {
		set("send_id", send_id);
	}
	
	public java.lang.String getSendId() {
		return getStr("send_id");
	}
	
	public void setIfSuccess(java.lang.String if_success) {
		set("if_success", if_success);
	}
	
	public java.lang.String getIfSuccess() {
		return getStr("messagif_successe_platfrom");
	}
	
	public void setCode(java.lang.String code) {
		set("code", code);
	}
	
	public java.lang.String getCode() {
		return getStr("code");
	}
	
	public void setResDes(java.lang.String res_des) {
		set("res_des", res_des);
	}
	
	public java.lang.String getResDes() {
		return getStr("res_des");
	}
	
	public void setFailList(java.lang.String fail_list) {
		set("fail_list", fail_list);
	}
	
	public java.lang.String getFailList() {
		return getStr("fail_list");
	}
}