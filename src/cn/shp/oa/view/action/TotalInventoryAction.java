package cn.shp.oa.view.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.shp.oa.base.BaseAction;
import cn.shp.oa.domain.PageBean;
import cn.shp.oa.domain.TotalInventory;

@Controller
@Scope("prototype")
public class TotalInventoryAction extends BaseAction<TotalInventory> {
	
	/**�б�*/
	public String list() throws Exception {	
		List<TotalInventory> totalInventoryList=totalInventoryService.findAll();
		ActionContext.getContext().put("totalInventoryList", totalInventoryList);
		
		 PageBean pageBean=totalInventoryService.getPageBeanById(pageNum,pageSize);
		 ActionContext.getContext().getValueStack().push(pageBean);
		return "list";		
	}
	/**���*/
	public String add() throws Exception {	
		totalInventoryService.save(model);
		return "toList";		
	}
	/**���ҳ��*/
	public String addUI() throws Exception {		
		return "saveUI";		
	}
	/**ɾ��*/
	public String delete() throws Exception {
		totalInventoryService.delete(model.getId());
		return "toList";		
	}
	/**�޸�*/
	public String edit() throws Exception {	
		
		TotalInventory 	totalInventory=totalInventoryService.getById(model.getId());
		totalInventory.setBrand(model.getBrand());
		totalInventory.setModel(model.getModel());
		totalInventory.setName(model.getName());
		totalInventory.setOrderNumber(model.getOrderNumber());
		totalInventory.setRemarks(model.getRemarks());
		totalInventory.setSpecification(model.getSpecification());
		totalInventory.setStorageLocation(model.getStorageLocation());
		totalInventory.setTermOfValidity(model.getTermOfValidity());
		totalInventory.setTotal(model.getTotal());
		totalInventory.setTotalPrice(model.getTotalPrice());
		totalInventory.setType(model.getType());
		totalInventory.setUnit(model.getUnit());
		totalInventory.setWarningQuantity(model.getWarningQuantity());
		totalInventoryService.update(totalInventory);
		return "toList";		
	}
	/**�޸�ҳ��*/
	public String editUI() throws Exception {	
		TotalInventory 	totalInventory=totalInventoryService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(totalInventory);
		return "saveUI";		
	}


}
