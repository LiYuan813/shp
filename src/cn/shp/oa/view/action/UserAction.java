package cn.shp.oa.view.action;

import java.util.HashSet;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.shp.oa.base.BaseAction;
import cn.shp.oa.domain.PageBean;
import cn.shp.oa.domain.Privilege;
import cn.shp.oa.domain.User;


@Controller
@Scope("prototype")
public class UserAction extends BaseAction<User> {

	private Long[] privilegeIds;

	/** �б� */
	public String list() throws Exception {
		// ׼����ҳ��Ϣ
		PageBean pageBean = userService.getPageBeanById(pageNum, pageSize);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "list";
	}

	/** ��� */
	public String add() throws Exception {
		// ���ó�ʼ����Ϊ1234
		String md5Digest = DigestUtils.md5Hex("1234");
		model.setPassword(md5Digest);
		userService.save(model);
		return "toList";
	}

	/** ���ҳ�� */
	public String addUI() throws Exception {
		return "saveUI";
	}

	/** ɾ�� */
	public String delete() throws Exception {
		userService.delete(model.getId());
		return "toList";
	}

	/** �޸� */
	public String edit() throws Exception {
		User user = userService.getById(model.getId());
		user.setName(model.getName());
		user.setDepartment(model.getDepartment());
		user.setPassword(model.getPassword());
		userService.update(user);
		return "toList";
	}

	/** �޸�ҳ�� */
	public String editUI() throws Exception {
		User user = userService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(user);
		return "saveUI";
	}

	/** ��ʼ������Ϊ1234 */
	public String initPassword() throws Exception {
		User user = userService.getById(model.getId());
		// ��ʼ����������Ϊ1234
		String md5Digest = DigestUtils.md5Hex("1234");
		user.setPassword(md5Digest);
		userService.update(user);
		return "toList";
	}

	/** ��½ҳ�� **/
	public String loginUI() throws Exception {
		return "loginUI";
	}

	/** ��½ **/
	public String login() throws Exception {
		User user = userService.findByLoginNameAndPassword(model.getName(), model.getPassword());
		if (user == null) {
			addFieldError("login", "�û������������");

			return "loginUI";
		} else {
			// ��½�û�
			ActionContext.getContext().getSession().put("user", user);
			return "toIndex";
		}
	}

	/** ע�� **/
	public String logout() throws Exception {
		ActionContext.getContext().getSession().remove("user");
		return "logout";
	}

	/** ����Ȩ�� */
	public String setPrivilege() throws Exception {
		// 1.�����ݿ��л�ȡԭ����
		User user = userService.getById(model.getId());
		// 2.����Ҫ�޸ĵ�����
		List<Privilege> privilegeList = privilegeService.getByIds(privilegeIds);
		user.setPrivileges(new HashSet<Privilege>(privilegeList));
		// 3.���µ����ݿ�
		userService.update(user);
		return "toList";
	}

	/** ����Ȩ��ҳ�� */
	public String setPrivilegeUI() throws Exception {
		User user = userService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(user);
		if (user.getPrivileges() != null) {
			privilegeIds = new Long[user.getPrivileges().size()];
			int index = 0;
			for (Privilege piv : user.getPrivileges()) {
				privilegeIds[index++] = piv.getId();
			}
		}
		List<Privilege> privilegeList = privilegeService.findAll();
		ActionContext.getContext().put("privilegeList", privilegeList);
		return "setPrivilegeUI";
	}

	public Long[] getPrivilegeIds() {
		return privilegeIds;
	}

	public void setPrivilegeIds(Long[] privilegeIds) {
		this.privilegeIds = privilegeIds;
	}
	

			

}
