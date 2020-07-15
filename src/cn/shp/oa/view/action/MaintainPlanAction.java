package cn.shp.oa.view.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.shp.oa.base.BaseAction;
import cn.shp.oa.domain.MaintainPlan;
import cn.shp.oa.domain.PageBean;
import cn.shp.oa.service.MaintainPlanService;

@Controller
@Scope("prototype")

public class MaintainPlanAction extends BaseAction <MaintainPlan>{
		
	/**�б�*/
	public String list() throws Exception {	
		List<MaintainPlan> maintainPlanList=maintainPlanService.findAll();
		ActionContext.getContext().put("maintainPlanList",maintainPlanList);
		PageBean pageBean=maintainPlanService.getPageBeanById(pageNum,pageSize);
		 ActionContext.getContext().getValueStack().push(pageBean);
		return "list";		
	}
	/**���*/
	public String add() throws Exception {
		maintainPlanService.save(model);
		return "toList";		
	}
	/**���ҳ��*/
	public String addUI() throws Exception {		
		return "saveUI";		
	}
	/**ɾ��*/
	public String delete() throws Exception {	
		maintainPlanService.delete(model.getId());
		return "toList";		
	}
	/**�޸�*/
	public String edit() throws Exception {	

		MaintainPlan  maintainPlan= maintainPlanService.getById(model.getId());
		maintainPlan.setCmmno(model.getCmmno());
		maintainPlan.setCmmtype(model.getCmmtype());
		maintainPlan.setMeasureroom(model.getMeasureroom());
		maintainPlan.setNumber(model.getNumber());
		maintainPlan.setPlan(model.getPlan());
		maintainPlan.setRemarks(model.getRemarks());
		maintainPlan.setXaxis(model.getXaxis());
		maintainPlanService.update(maintainPlan);
		return "toList";		
	}
	/**�޸�ҳ��*/
	public String editUI() throws Exception {
		MaintainPlan  maintainPlan= maintainPlanService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(maintainPlan);
		return "saveUI";		
	}



}
