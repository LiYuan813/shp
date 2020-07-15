package cn.shp.oa.view.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.shp.oa.base.BaseAction;
import cn.shp.oa.domain.TPMDay;

@Controller
@Scope("prototype")
public class DayAction extends BaseAction<TPMDay> {
	
	//列表
	public String list() throws Exception {
		List<TPMDay> dayList= dayService.findAll();
		ActionContext.getContext().put("dayList",dayList);
		return"list";
	}
	//修改页面
	public String editUI() throws Exception {
		//准备数据回显

		TPMDay day=dayService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(day);
		return"editUI";
	}
	//修改
	/*
	public String edit() throws Exception {
		TPMDay day=dayService.getById(model.getId());
		//设置要修改的属性
		day.setFirstThing(model.getFirstThing());
		day.setSecondThing(model.getSecondThing());
		day.setThirdThing(model.getThirdThing());
		day.setFourthThing(model.getFourthThing());
		day.setFifthThing(model.getFifthThing());
		day.setSixthThing(model.getSixthThing());
		day.setSeventhThing(model.getSeventhThing());
		day.setEighthThing(model.getEighthThing());
		day.setNinthThing(model.getNinthThing());
		day.setOperator(model.getOperator());
		dayService.update(day);
		return "toList";
	}
	*/

}
