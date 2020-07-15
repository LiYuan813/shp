package cn.shp.oa.view.action;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.shp.oa.base.BaseAction;
import cn.shp.oa.domain.PageBean;
import cn.shp.oa.domain.WarehouseManagement;
@Controller
@Scope("prototype")
public class WarehouseManagementAction extends BaseAction<WarehouseManagement> {

	/**�б�*/
	public String list() throws Exception {	
        //��ҳ
		PageBean pageBean=warehouseManagementService.getPageBeanById(pageNum,pageSize);
        ActionContext.getContext().getValueStack().push(pageBean);
		return "list";		
	}
	/**���*/
	public String add() throws Exception {
		warehouseManagementService.save(model);
		return "toList";		
	}
	/**���ҳ��*/
	public String addUI() throws Exception {		
		return "saveUI";		
	}
	/**ɾ��*/
	public String delete() throws Exception {		
		warehouseManagementService.delete(model.getId());
		return "toList";		
	}
	/**�޸�*/
	public String edit() throws Exception {	
		WarehouseManagement warehouseManagement=warehouseManagementService.getById(model.getId());
		warehouseManagement.setBrand(model.getBrand());
		warehouseManagement.setDate(model.getDate());
		warehouseManagement.setGoodsId(model.getGoodsId());
		warehouseManagement.setModel(model.getModel());
		warehouseManagement.setName(model.getName());
		warehouseManagement.setNumberOfRecipients(model.getNumberOfRecipients());
		warehouseManagement.setOperator(model.getOperator());
		warehouseManagement.setOrderNumber(model.getOrderNumber());
		warehouseManagement.setDeliverer(model.getDeliverer());
		warehouseManagement.setReceiver(model.getReceiver());
		warehouseManagement.setSpecification(model.getSpecification());
		warehouseManagement.setStorageLocation(model.getStorageLocation());
		warehouseManagement.setTermOfValidity(model.getTermOfValidity());
		warehouseManagement.setTotalPrice(model.getTotalPrice());
		warehouseManagement.setTypesOfGoods(model.getTypesOfGoods());
		warehouseManagement.setUnit(model.getUnit());
		warehouseManagement.setWarningQuantity(model.getWarningQuantity());
		warehouseManagementService.update(warehouseManagement);
		return "toList";		
	}
	/**�޸�ҳ��*/
	public String editUI() throws Exception {
		WarehouseManagement warehouseManagement=warehouseManagementService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(warehouseManagement);
		return "saveUI";		
	}
	
	/**����ҳ��*/
	public String importUI() throws Exception {

		return "importUI";
	}
	/**��������**/
	public String exportUI() throws Exception {

		return "exportUI";
	}
	/**�������*/
	public String exportData() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		if(this.getFilePath()!=null&&this.getFileName()!=null) {
					   List<WarehouseManagement> warehouseManagementList=warehouseManagementService.findAll();
		   warehouseManagementService.readDataToExcelFile(filePath,fileName,warehouseManagementList);
		   out.println("<script>alert('����ɹ���');</script>");
            return"toList";
		}else {
			out.println("<script>alert('����ʧ�ܣ�');</script>");
			return"exportUI";
		}

						
	}
	/**������*/
	public String exportExcel() throws Exception {
		
			warehouseManagementService.readExcelData(excelPath);
			return "toList";
						
	}

	
}
