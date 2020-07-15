package cn.shp.oa.view.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.shp.oa.base.BaseAction;
import cn.shp.oa.domain.PageBean;
import cn.shp.oa.domain.TPMWenTi;

@Controller
@Scope("prototype")
public class ProblemAction extends BaseAction<TPMWenTi> {

	public String list() throws Exception{
		List<TPMWenTi> tPMWenTiList=tPMWenTiService.findAll();
        ActionContext.getContext().put("tPMWenTiList", tPMWenTiList);
        //׼����ҳ��Ϣ
        PageBean pageBean=tPMWenTiService.getPageBeanById(pageNum,pageSize);
        ActionContext.getContext().getValueStack().push(pageBean);
		return "list";
	}
	/**ɾ��*/
	public String delete() throws Exception {
		
		tPMWenTiService.delete(model.getId());

		return "toList";
	}
	/**���ҳ��*/
	public String addUI() throws Exception {

		return "saveUI";
	}
	/**���*/
	public String add() throws Exception {

		tPMWenTiService.save(model);
		return "toList";
	}
	/**�޸�ҳ��*/
	public String editUI() throws Exception {
		
		//׼����������
		TPMWenTi tPMWenTi=tPMWenTiService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(tPMWenTi);

		return "saveUI";
	}
	/**�޸�*/
	public String edit() throws Exception {
		
		//1.�����ݿ��л�ȡԭ����
		TPMWenTi tPMWenTi=tPMWenTiService.getById(model.getId());
		//����Ҫ�޸ĵ�����
		tPMWenTi.setNumber(model.getNumber());
		tPMWenTi.setPerson1(model.getPerson1());
		tPMWenTi.setDate(model.getDate());
		tPMWenTi.setDescription(model.getDescription());
		tPMWenTi.setReason(model.getReason());
		tPMWenTi.setMeasures(model.getMeasures());
		tPMWenTi.setTime1(model.getTime1());
		tPMWenTi.setPerson2(model.getPerson2());
		tPMWenTi.setTime2(model.getTime2());
		//3.���µ����ݿ�
		tPMWenTiService.update(tPMWenTi);

		return "toList";
	}
}

