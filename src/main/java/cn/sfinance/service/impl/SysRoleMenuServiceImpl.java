package cn.sfinance.service.impl;

import cn.sfinance.dao.SysRoleMenuDao;
import cn.sfinance.model.SysRoleMenu;
import cn.sfinance.service.SysRoleMenuService;
import cn.sfinance.utils.MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class SysRoleMenuServiceImpl implements SysRoleMenuService {

	@Autowired
	private SysRoleMenuDao<SysRoleMenu> sysRoleMenuDao;

	@Override
	public Serializable insertSysRoleMenu(SysRoleMenu data){
		return sysRoleMenuDao.save(data);
	}
	@Override
	public boolean updateSysRoleMenu(SysRoleMenu data){
		return sysRoleMenuDao.saveOrUpdate(data);
	}
	@Override
	public int deleteSysRoleMenu(Integer roleId){
		return sysRoleMenuDao.deleteSysRoleMenu(roleId);
	}
	@Override
	public SysRoleMenu getSysRoleMenu(Integer Id){
		SysRoleMenu data = sysRoleMenuDao.get(SysRoleMenu.class, Id);
		return data;
	}
	
	/**
	 * 获取角色菜单
	 */
	@Override
	public List<MenuVo> getMenus(Integer roleId, Integer pmenuId) {
		List<MenuVo> menuVoList = new ArrayList<MenuVo>();
		if (roleId != null) {
			for (Map<String, Object> menu : sysRoleMenuDao.secondMenus(roleId, pmenuId)) {
				MenuVo menuVo = new MenuVo();
				menuVo.setMenuId(menu.get("menuId").toString());
				menuVo.setMenuName(menu.get("menuName").toString());
				menuVo.setMenuIcon(menu.get("menuIcon").toString());
				menuVo.setMenuAction(menu.get("menuAction").toString());
				List<MenuVo> childrenList = new ArrayList<MenuVo>();
				for (Map<String, Object> childrenMenu : sysRoleMenuDao.secondMenus(roleId, Integer.parseInt(menu.get("menuId").toString()))) {
					MenuVo childrenMenuVo = new MenuVo();
					childrenMenuVo.setMenuId(childrenMenu.get("menuId").toString());
					childrenMenuVo.setMenuName(childrenMenu.get("menuName").toString());
					childrenMenuVo.setMenuIcon(childrenMenu.get("menuIcon").toString());
					childrenMenuVo.setMenuAction(childrenMenu.get("menuAction").toString());
					childrenList.add(childrenMenuVo);
				}
				menuVo.setChildren(childrenList);
				menuVoList.add(menuVo);
			}
		}
		return menuVoList;
	}
	
	/**
	 * 检查角色权限
	 */
	@Override
	public List<Map<String, Object>> rolePrivilege(Integer roleId){
		return sysRoleMenuDao.rolePrivilege(roleId);
	}
}
