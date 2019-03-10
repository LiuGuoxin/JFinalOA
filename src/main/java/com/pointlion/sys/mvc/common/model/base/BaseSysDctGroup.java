package com.pointlion.sys.mvc.common.model.base;

import java.util.List;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;
import com.pointlion.sys.mvc.common.model.SysDctGroup;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysDctGroup<M extends BaseSysDctGroup<M>> extends Model<M> implements IBean {

	private List<SysDctGroup> children;
	
	public List<SysDctGroup> getChildren() {
		return children;
	}
	public void setChildren(List<SysDctGroup> children) {
		this.children = children;
	}
	
	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public void setKey(java.lang.String key) {
		set("key", key);
	}
	
	public java.lang.String getKey() {
		return getStr("key");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setParentId(java.lang.String parentId) {
		set("parent_id", parentId);
	}
	
	public java.lang.String getParentId() {
		return getStr("parent_id");
	}

	public void setDes(java.lang.String des) {
		set("des", des);
	}
	
	public java.lang.String getDes() {
		return getStr("des");
	}

	public void setSort(java.lang.Long sort) {
		set("sort", sort);
	}

	public java.lang.Long getSort() {
		return get("sort");
	}
}