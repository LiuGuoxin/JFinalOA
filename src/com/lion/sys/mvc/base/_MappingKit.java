package com.lion.sys.mvc.base;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.lion.sys.mvc.menu.SysMenu;
import com.lion.sys.mvc.user.SysUser;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("sys_menu", "id", SysMenu.class);
	}
}

