package cn.shp.oa.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 用户管理
 * @author wyj
 *
 */

public class User {
	private Long id;
	private String name;
	private String department;
	private String password;
	//用户和权限似乎是多对多的关系
	private Set<Privilege> privileges=new HashSet<Privilege>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Privilege> getPrivileges() {
		return privileges;
	}
	public void setPrivileges(Set<Privilege> privileges) {
		this.privileges = privileges;
	}	

}
