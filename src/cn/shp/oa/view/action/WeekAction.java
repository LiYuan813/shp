package cn.shp.oa.view.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.shp.oa.base.BaseAction;
import cn.shp.oa.domain.TPMWeek;

@Controller
@Scope("prototype")
public class WeekAction extends BaseAction<TPMWeek> {

	long id=1;
	public String list() throws Exception  {
		List<TPMWeek> weekList= weekService.findAll();
		ActionContext.getContext().put("weekList",weekList);
		return"list";
	}
	public String editUI() throws Exception {
		//准备数据回显
		TPMWeek week=weekService.getById(id);
		ActionContext.getContext().getValueStack().push(week);
		return"editUI";
	}
	public String edit() throws Exception {
		TPMWeek week=weekService.getById(id);
		week.setWeek1(model.getWeek1());
		week.setWeek2(model.getWeek2());
		week.setWeek3(model.getWeek3());
		week.setWeek4(model.getWeek4());
		week.setWeek5(model.getWeek5());
		week.setWeek6(model.getWeek6());
		week.setWeek7(model.getWeek7());
		week.setWeek8(model.getWeek8());
		week.setWeek9(model.getWeek9());
		week.setWeek10(model.getWeek10());
		week.setWeek11(model.getWeek11());
		week.setWeek12(model.getWeek12());
		week.setWeek13(model.getWeek13());
		week.setWeek14(model.getWeek14());
		week.setWeek15(model.getWeek15());
		week.setWeek16(model.getWeek16());
		week.setWeek17(model.getWeek17());
		week.setWeek18(model.getWeek18());
		week.setWeek19(model.getWeek19());
		week.setWeek20(model.getWeek20());
		week.setWeek21(model.getWeek21());
		week.setWeek22(model.getWeek22());
		week.setWeek23(model.getWeek23());
		week.setWeek24(model.getWeek24());
		week.setWeek25(model.getWeek25());
		week.setWeek26(model.getWeek26());
		week.setWeek27(model.getWeek27());
		week.setWeek28(model.getWeek28());
		week.setWeek29(model.getWeek29());
		week.setWeek30(model.getWeek30());
		week.setWeek31(model.getWeek31());
		week.setWeek32(model.getWeek32());
		week.setWeek33(model.getWeek33());
		week.setWeek34(model.getWeek34());
		week.setWeek35(model.getWeek35());
		week.setWeek36(model.getWeek36());
		week.setWeek37(model.getWeek37());
		week.setWeek38(model.getWeek38());
		week.setWeek39(model.getWeek39());
		week.setWeek40(model.getWeek40());
		week.setWeek41(model.getWeek41());
		week.setWeek42(model.getWeek42());
		week.setWeek43(model.getWeek43());
		week.setWeek44(model.getWeek44());
		week.setWeek45(model.getWeek45());
		week.setWeek46(model.getWeek46());
		week.setWeek47(model.getWeek47());
		week.setWeek48(model.getWeek48());
		week.setWeek49(model.getWeek49());
		week.setWeek50(model.getWeek50());
		week.setWeek51(model.getWeek51());
		week.setWeek52(model.getWeek52());
		weekService.update(week);
		return "toList";
	}
}
