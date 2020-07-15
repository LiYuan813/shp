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
	
	/**�б�*/
	public String list() throws Exception {
        List<Role>  roleList=roleService.findAll();
        ActionContext.getContext().put("roleList", roleList);
        //׼����ҳ��Ϣ
        PageBean pageBean=roleService.getPageBeanById(pageNum,pageSize);
        ActionContext.getContext().getValueStack().push(pageBean);
		return "list";
	}
	/**ɾ��*/
	public String delete() throws Exception {
		
		roleService.delete(model.getId());

		return "toList";
	}

	/**���ҳ��*/
	public String addUI() throws Exception {

		return "saveUI";
	}
	/**���*/
	public String add() throws Exception {

		//��װ��������
		//Role role=new Role();
		//role.setName(model.getName());
		//role.setDescription(model.getDescription());
		//���浽���ݿ���
		//roleService.save(role);
		roleService.save(model);
		return "toList";
	}
	/**�޸�ҳ��*/
	public String editUI() throws Exception {
		
		//׼����������
		Role role=roleService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(role);

		return "saveUI";
	}
	/**�޸�*/
	public String edit() throws Exception {
		
		//1.�����ݿ��л�ȡԭ����
		Role role=roleService.getById(model.getId());
		//����Ҫ�޸ĵ�����
		role.setName(model.getName());
		role.setDescription(model.getDescription());
		role.setArmLength(model.getArmLength());
		role.setInstallationDate(model.getInstallationDate());
		role.setLocation(model.getLocation());
		role.setRemarks(model.getRepairYear());
		role.setWarrantyDeadine(model.getWarrantyDeadine());
		role.setRemarks(model.getRemarks());
		//3.���µ����ݿ�
		roleService.update(role);

		return "toList";
	}
	
	/**����ҳ��*/
	public String importUI() throws Exception {

		return "importUI";
	}
	/**����Excel*/
	public String importExcel() throws Exception {
		List<Role> roleList = roleService.findAll();
		if(filePath!=null&&fileName!=null){
			roleService.importExcel(filePath,fileName,roleList);
			return "toList";
		}
		else {
			addFieldError("importExcel", "��������ƻ�·����");
			return "importUI";
		}
			
		
	}
	/****������ҳ��***/
	public String exportUI() throws Exception {

		return "exportUI";
	}
	/**����Excel*/
	public String exportExcel() throws Exception {
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		if(excelPath!=null) {
			roleService.readExcelData(excelPath);

			out.println("<script>alert('����ɹ���');</script>");
			return "toList";
		}
		else {
			out.println("<script>alert('����ʧ�ܣ�');</script>");
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
