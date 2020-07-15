package cn.shp.oa.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 权限
 * @author wyj
 *
 */

public class Privilege {
	private Long id;//主键
	private String name;//权限名称
	private String url;
	//权限与user的关系似乎是多对多
	private Set<User> users= new HashSet<User>();
	private Privilege parent;//上级权限
	private Set<Privilege> children= new HashSet<Privilege>();//下级权限
	//构造函数
	public Privilege() {
		
	}
	public Privilege(String name, String url, Privilege parent) {
		this.name = name;
		this.url = url;
		this.parent = parent;
	}
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Privilege getParent() {
		return parent;
	}
	public void setParent(Privilege parent) {
		this.parent = parent;
	}
	public Set<Privilege> getChildren() {
		return children;
	}
	public void setChildren(Set<Privilege> children) {
		this.children = children;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	
}
