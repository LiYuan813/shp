package cn.shp.oa.view.action;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.shp.oa.base.BaseAction;
import cn.shp.oa.domain.MaintenancePlan;
import cn.shp.oa.domain.PageBean;

@Controller
@Scope("prototype")

public class MaintenancePlanAction extends BaseAction<MaintenancePlan> {
	
	private String filepath;
	/**列表*/
	public String list() throws Exception {		
		List<MaintenancePlan> maintenancePlanList=maintenancePlanService.findAll();
		ActionContext.getContext().put("maintenancePlanList", maintenancePlanList);
        PageBean pageBean=maintenancePlanService.getPageBeanById(pageNum,pageSize);
        ActionContext.getContext().getValueStack().push(pageBean);
		
		return "list";		
	}
	/**添加*/
	public String add() throws Exception {	
		maintenancePlanService.save(model);
		return "toList";		
	}
	/**添加页面*/
	public String addUI() throws Exception {		
		return "saveUI";		
	}
	/**删除*/
	public String delete() throws Exception {
		maintenancePlanService.delete(model.getId());
		return "toList";		
	}
	/**修改*/
	public String edit() throws Exception {		
		MaintenancePlan maintenancePlan=maintenancePlanService.getById(model.getId());
		maintenancePlan.setSupplier(model.getSupplier());
		maintenancePlan.setMeasureroom(model.getMeasureroom());
		maintenancePlan.setCmmno(model.getCmmno());
		maintenancePlan.setMachine(model.getMachine());
		maintenancePlan.setMaintainplan(model.getMaintainplan());
		maintenancePlanService.update(maintenancePlan);
		return "toList";		
	}
	/**修改页面*/
	public String editUI() throws Exception {	
		MaintenancePlan maintenancePlan=maintenancePlanService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(maintenancePlan);
		return "saveUI";		
	}
	////////////////////////////
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	
	
	/**导入Excel页面*/
	public String importUI() throws Exception {		
		return "importUI";		
	}

	/**导入Excel*/
	public String importExcel() throws Exception {
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		if(filepath!=null) {
			maintenancePlanService.readExcelData(filepath);

			out.println("<script>alert('保存成功！');</script>");
			return "toList";
		}
		else {
			out.println("<script>alert('保存失败！');</script>");
			return "importUI";
		}
						
	}

}
