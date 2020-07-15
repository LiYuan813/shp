package cn.shp.oa.view.action;

import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.shp.oa.base.BaseAction;
import cn.shp.oa.domain.PageBean;
import cn.shp.oa.domain.Role;
import cn.shp.oa.domain.User;
import cn.shp.oa.service.RoleService;

@Controller
@Scope("prototype")
public class RoleAction extends BaseAction<Role> {

	private String fileName;
	private String filePath;
	private String excelPath;
	
	/**列表*/
	public String list() throws Exception {
        List<Role>  roleList=roleService.findAll();
        ActionContext.getContext().put("roleList", roleList);
        //准备分页信息
        PageBean pageBean=roleService.getPageBeanById(pageNum,pageSize);
        ActionContext.getContext().getValueStack().push(pageBean);
		return "list";
	}
	/**删除*/
	public String delete() throws Exception {
		
		roleService.delete(model.getId());

		return "toList";
	}

	/**添加页面*/
	public String addUI() throws Exception {

		return "saveUI";
	}
	/**添加*/
	public String add() throws Exception {

		//封装到对象中
		//Role role=new Role();
		//role.setName(model.getName());
		//role.setDescription(model.getDescription());
		//保存到数据库中
		//roleService.save(role);
		roleService.save(model);
		return "toList";
	}
	/**修改页面*/
	public String editUI() throws Exception {
		
		//准备回显数据
		Role role=roleService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(role);

		return "saveUI";
	}
	/**修改*/
	public String edit() throws Exception {
		
		//1.从数据库中获取原对象
		Role role=roleService.getById(model.getId());
		//设置要修改的属性
		role.setName(model.getName());
		role.setDescription(model.getDescription());
		role.setArmLength(model.getArmLength());
		role.setInstallationDate(model.getInstallationDate());
		role.setLocation(model.getLocation());
		role.setRemarks(model.getRepairYear());
		role.setWarrantyDeadine(model.getWarrantyDeadine());
		role.setRemarks(model.getRemarks());
		//3.更新到数据库
		roleService.update(role);

		return "toList";
	}
	
	/**导出页面*/
	public String importUI() throws Exception {

		return "importUI";
	}
	/**导出Excel*/
	public String importExcel() throws Exception {
		List<Role> roleList = roleService.findAll();
		if(filePath!=null&&fileName!=null){
			roleService.importExcel(filePath,fileName,roleList);
			return "toList";
		}
		else {
			addFieldError("importExcel", "请添加名称或路径！");
			return "importUI";
		}
			
		
	}
	/****导入表格页面***/
	public String exportUI() throws Exception {

		return "exportUI";
	}
	/**导入Excel*/
	public String exportExcel() throws Exception {
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		if(excelPath!=null) {
			roleService.readExcelData(excelPath);

			out.println("<script>alert('保存成功！');</script>");
			return "toList";
		}
		else {
			out.println("<script>alert('保存失败！');</script>");
			return "exportUI";
		}
						
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getExcelPath() {
		return excelPath;
	}
	public void setExcelPath(String excelPath) {
		this.excelPath = excelPath;
	}
	
	
}
