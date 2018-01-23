package com.pointlion.sys.mvc.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseActReProcdef<M extends BaseActReProcdef<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("ID_", id);
	}

	public java.lang.String getId() {
		return get("ID_");
	}

	public void setRev(java.lang.Integer rev) {
		set("REV_", rev);
	}

	public java.lang.Integer getRev() {
		return get("REV_");
	}

	public void setCategory(java.lang.String category) {
		set("CATEGORY_", category);
	}

	public java.lang.String getCategory() {
		return get("CATEGORY_");
	}

	public void setName(java.lang.String name) {
		set("NAME_", name);
	}

	public java.lang.String getName() {
		return get("NAME_");
	}

	public void setKey(java.lang.String key) {
		set("KEY_", key);
	}

	public java.lang.String getKey() {
		return get("KEY_");
	}

	public void setVersion(java.lang.Integer version) {
		set("VERSION_", version);
	}

	public java.lang.Integer getVersion() {
		return get("VERSION_");
	}

	public void setDeploymentId(java.lang.String deploymentId) {
		set("DEPLOYMENT_ID_", deploymentId);
	}

	public java.lang.String getDeploymentId() {
		return get("DEPLOYMENT_ID_");
	}

	public void setResourceName(java.lang.String resourceName) {
		set("RESOURCE_NAME_", resourceName);
	}

	public java.lang.String getResourceName() {
		return get("RESOURCE_NAME_");
	}

	public void setDgrmResourceName(java.lang.String dgrmResourceName) {
		set("DGRM_RESOURCE_NAME_", dgrmResourceName);
	}

	public java.lang.String getDgrmResourceName() {
		return get("DGRM_RESOURCE_NAME_");
	}

	public void setDescription(java.lang.String description) {
		set("DESCRIPTION_", description);
	}

	public java.lang.String getDescription() {
		return get("DESCRIPTION_");
	}

	public void setHasStartFormKey(java.lang.Integer hasStartFormKey) {
		set("HAS_START_FORM_KEY_", hasStartFormKey);
	}

	public java.lang.Integer getHasStartFormKey() {
		return get("HAS_START_FORM_KEY_");
	}

	public void setHasGraphicalNotation(java.lang.Integer hasGraphicalNotation) {
		set("HAS_GRAPHICAL_NOTATION_", hasGraphicalNotation);
	}

	public java.lang.Integer getHasGraphicalNotation() {
		return get("HAS_GRAPHICAL_NOTATION_");
	}

	public void setSuspensionState(java.lang.Integer suspensionState) {
		set("SUSPENSION_STATE_", suspensionState);
	}

	public java.lang.Integer getSuspensionState() {
		return get("SUSPENSION_STATE_");
	}

	public void setTenantId(java.lang.String tenantId) {
		set("TENANT_ID_", tenantId);
	}

	public java.lang.String getTenantId() {
		return get("TENANT_ID_");
	}

}
