package cn.shp.oa.view.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.shp.oa.base.BaseAction;
import cn.shp.oa.domain.OutboundManagement;
import cn.shp.oa.domain.PageBean;

@Controller
@Scope("prototype")
public class OutboundManagementAction extends BaseAction<OutboundManagement> {
	
	/**�б�*/
	public String list() throws Exception {	
		List<OutboundManagement> outboundManagementList=outboundManagementService.findAll();
		ActionContext.getContext().put("outboundManagementList", outboundManagementList);
        PageBean pageBean=outboundManagementService.getPageBeanById(pageNum,pageSize);
        ActionContext.getContext().getValueStack().push(pageBean);
		return "list";		
	}
	/**���*/
	public String add() throws Exception {	
		outboundManagementService.save(model);
		return "toList";		
	}
	/**���ҳ��*/
	public String addUI() throws Exception {		
		return "saveUI";		
	}
	/**ɾ��*/
	public String delete() throws Exception {		
		outboundManagementService.delete(model.getId());
		return "toList";		
	}
	/**�޸�*/
	public String edit() throws Exception {	
		OutboundManagement outboundManagement=outboundManagementService.getById(model.getId());
		outboundManagement.setBrand(model.getBrand());
		outboundManagement.setDate(model.getDate());
		outboundManagement.setGoodsId(model.getGoodsId());
		outboundManagement.setModel(model.getModel());
		outboundManagement.setName(model.getName());
		outboundManagement.setNumberOfRecipients(model.getNumberOfRecipients());
		outboundManagement.setOperator(model.getOperator());
		outboundManagement.setOrderNumber(model.getOrderNumber());
		outboundManagement.setPerson(model.getPerson());
		outboundManagement.setSpecification(model.getSpecification());
		outboundManagement.setStorageLocation(model.getStorageLocation());
		outboundManagement.setTermOfValidity(model.getTermOfValidity());
		outboundManagement.setTotalPrice(model.getTotalPrice());
		outboundManagement.setTypesOfGoods(model.getTypesOfGoods());
		outboundManagement.setUnit(model.getUnit());
		outboundManagement.setUseArea(model.getUseArea());
		outboundManagementService.update(outboundManagement);
		return "toList";		
	}
	/**�޸�ҳ��*/
	public String editUI() throws Exception {
		OutboundManagement outboundManagement=outboundManagementService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(outboundManagement);
		return "saveUI";		
	}


}
