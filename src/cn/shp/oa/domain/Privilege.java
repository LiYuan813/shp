package cn.shp.oa.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Ȩ��
 * @author wyj
 *
 */

public class Privilege {
	private Long id;//����
	private String name;//Ȩ������
	private String url;
	//Ȩ����user�Ĺ�ϵ�ƺ��Ƕ�Զ�
	private Set<User> users= new HashSet<User>();
	private Privilege parent;//�ϼ�Ȩ��
	private Set<Privilege> children= new HashSet<Privilege>();//�¼�Ȩ��
	//���캯��
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
