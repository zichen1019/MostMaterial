package com.zichen.bootstrap.common;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class AuthenticationRealm extends AuthorizingRealm {
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		return null;
	}

	/*@Autowired
	private UserService userService;
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		System.out.println("只有需要认证的时候才会走该方法。");
		//根据自己系统规则的需要编写获取授权信息，这里为了快速入门只获取了用户对应角色的资源url信息  
        String username = (String) arg0.fromRealm(getName()).iterator().next();  
        if (username != null) {
        	SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        	List<String> pers = new ArrayList<String>();
        	User user = userService.selectUserByJoinRole(username);
        	List<Role> roleList = user.getRoleList();
        	Set<String> roleSet = new HashSet<String>(); 
        	for (int i = 0; i < roleList.size(); i++) {
				Role role = roleList.get(i);
				List<Menu> menuList = role.getMenuList();
				for (int j = 0; j < menuList.size(); j++) {
					Menu menu = menuList.get(j);
					if(!"#".equals(menu.getUrl())){
						pers.add(menu.getUrl());
					}
				}
				roleSet.add(role.getRoleCode());
			}
        	if(roleSet != null && !roleSet.isEmpty()){
        		info.setRoles(roleSet);
        	}
        	
            if (pers != null && !pers.isEmpty()) {  
                for (String each : pers) {  
                    //将权限资源添加到用户信息中  
                    info.addStringPermission(each);  
                }
                return info;  
            }  
        }  
		return null;
	}
	
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		// TODO Auto-generated method stub
		UsernamePasswordToken token = (UsernamePasswordToken) arg0;
        // 通过表单接收的用户名  
        String username = token.getUsername();  
        if (username != null && !"".equals(username)) {
        	//获取用户信息
        	Date date = new Date();
        	Long start = date.getTime();
        	User user = userService.getUserByName(username);
        	date = new Date();
        	System.out.println("执行效率毫秒："+(start-date.getTime()));
            if (user != null) {
            	Subject subject = SecurityUtils.getSubject();
            	if("0".equals(user.getState().toString())){
            		throw new LockedAccountException();
            	}
            	subject.getSession().setAttribute(User.SESSION_USER_OBJECT, user);
                return new SimpleAuthenticationInfo(user.getLoginname(), user.getLoginpwd(), getName());
            }  
        }  
		return null;
	}
*/
}