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
        //准备分页信息
        PageBean pageBean=tPMWenTiService.getPageBeanById(pageNum,pageSize);
        ActionContext.getContext().getValueStack().push(pageBean);
		return "list";
	}
	/**删除*/
	public String delete() throws Exception {
		
		tPMWenTiService.delete(model.getId());

		return "toList";
	}
	/**添加页面*/
	public String addUI() throws Exception {

		return "saveUI";
	}
	/**添加*/
	public String add() throws Exception {

		tPMWenTiService.save(model);
		return "toList";
	}
	/**修改页面*/
	public String editUI() throws Exception {
		
		//准备回显数据
		TPMWenTi tPMWenTi=tPMWenTiService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(tPMWenTi);

		return "saveUI";
	}
	/**修改*/
	public String edit() throws Exception {
		
		//1.从数据库中获取原对象
		TPMWenTi tPMWenTi=tPMWenTiService.getById(model.getId());
		//设置要修改的属性
		tPMWenTi.setNumber(model.getNumber());
		tPMWenTi.setPerson1(model.getPerson1());
		tPMWenTi.setDate(model.getDate());
		tPMWenTi.setDescription(model.getDescription());
		tPMWenTi.setReason(model.getReason());
		tPMWenTi.setMeasures(model.getMeasures());
		tPMWenTi.setTime1(model.getTime1());
		tPMWenTi.setPerson2(model.getPerson2());
		tPMWenTi.setTime2(model.getTime2());
		//3.更新到数据库
		tPMWenTiService.update(tPMWenTi);

		return "toList";
	}
}

