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

	/** 列表 */
	public String list() throws Exception {
		// 准备分页信息
		PageBean pageBean = userService.getPageBeanById(pageNum, pageSize);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "list";
	}

	/** 添加 */
	public String add() throws Exception {
		// 设置初始密码为1234
		String md5Digest = DigestUtils.md5Hex("1234");
		model.setPassword(md5Digest);
		userService.save(model);
		return "toList";
	}

	/** 添加页面 */
	public String addUI() throws Exception {
		return "saveUI";
	}

	/** 删除 */
	public String delete() throws Exception {
		userService.delete(model.getId());
		return "toList";
	}

	/** 修改 */
	public String edit() throws Exception {
		User user = userService.getById(model.getId());
		user.setName(model.getName());
		user.setDepartment(model.getDepartment());
		user.setPassword(model.getPassword());
		userService.update(user);
		return "toList";
	}

	/** 修改页面 */
	public String editUI() throws Exception {
		User user = userService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(user);
		return "saveUI";
	}

	/** 初始化密码为1234 */
	public String initPassword() throws Exception {
		User user = userService.getById(model.getId());
		// 初始化密码密码为1234
		String md5Digest = DigestUtils.md5Hex("1234");
		user.setPassword(md5Digest);
		userService.update(user);
		return "toList";
	}

	/** 登陆页面 **/
	public String loginUI() throws Exception {
		return "loginUI";
	}

	/** 登陆 **/
	public String login() throws Exception {
		User user = userService.findByLoginNameAndPassword(model.getName(), model.getPassword());
		if (user == null) {
			addFieldError("login", "用户名或密码错误！");

			return "loginUI";
		} else {
			// 登陆用户
			ActionContext.getContext().getSession().put("user", user);
			return "toIndex";
		}
	}

	/** 注销 **/
	public String logout() throws Exception {
		ActionContext.getContext().getSession().remove("user");
		return "logout";
	}

	/** 设置权限 */
	public String setPrivilege() throws Exception {
		// 1.从数据库中获取原对象
		User user = userService.getById(model.getId());
		// 2.设置要修改的属性
		List<Privilege> privilegeList = privilegeService.getByIds(privilegeIds);
		user.setPrivileges(new HashSet<Privilege>(privilegeList));
		// 3.更新到数据库
		userService.update(user);
		return "toList";
	}

	/** 设置权限页面 */
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
