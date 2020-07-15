package cn.shp.oa.view.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.shp.oa.base.BaseAction;
import cn.shp.oa.domain.MaintenanceRecords;
import cn.shp.oa.domain.PageBean;
import cn.shp.oa.service.MaintenanceRecordsService;

@Controller
@Scope("prototype")

public class MaintenanceRecordsAction extends BaseAction<MaintenanceRecords> {
	
	/**列表*/
	public String list() throws Exception {	
		List<MaintenanceRecords> maintenanceRecordsList=maintenanceRecordsService.findAll();
		ActionContext.getContext().put("maintenanceRecordsList",maintenanceRecordsList);
        PageBean pageBean=maintenanceRecordsService.getPageBeanById(pageNum,pageSize);
        ActionContext.getContext().getValueStack().push(pageBean);
		return "list";		
	}
	/**添加*/
	public String add() throws Exception {	
		maintenanceRecordsService.save(model);
		return "toList";		
	}
	/**添加页面*/
	public String addUI() throws Exception {		
		return "saveUI";		
	}
	/**删除*/
	public String delete() throws Exception {	
		maintenanceRecordsService.delete(model.getId());		
		return "toList";		
	}
	/**修改*/
	public String edit() throws Exception {	
		MaintenanceRecords maintenanceRecords=maintenanceRecordsService.getById(model.getId());
		maintenanceRecords.setAttachment(model.getAttachment());
		maintenanceRecords.setConfirmPerson(model.getConfirmPerson());
		maintenanceRecords.setConfirmTime(model.getConfirmTime());
		maintenanceRecords.setFinishTime(model.getFinishTime());
		maintenanceRecords.setMeasurementRoom(model.getMeasurementRoom());
		maintenanceRecords.setProblemDescription(model.getProblemDescription());
		maintenanceRecords.setRemarks(model.getRemarks());
		maintenanceRecords.setSolution(model.getSolution());
		maintenanceRecords.setProblemTime(model.getProblemTime());
		maintenanceRecords.setTroubleshootingTime(model.getTroubleshootingTime());
		maintenanceRecords.setWaitedTime(model.getWaitedTime());
		maintenanceRecords.setTotalTime(model.getTotalTime());
		maintenanceRecords.setTestingArm(model.getTestingArm());
		maintenanceRecords.setTestingArmId(model.getTestingArmId());
		maintenanceRecords.setStartTime(model.getStartTime());
		maintenanceRecordsService.update(maintenanceRecords);
		return "toList";		
	}
	/**修改页面*/
	public String editUI() throws Exception {
		//回显数据
		MaintenanceRecords maintenanceRecords=maintenanceRecordsService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(maintenanceRecords);
		return "saveUI";		
	}

}
