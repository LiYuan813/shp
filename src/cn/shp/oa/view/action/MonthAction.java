package cn.shp.oa.view.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.shp.oa.base.BaseAction;
import cn.shp.oa.domain.TPMMonth;
import net.sf.json.JSONObject;

@Controller
@Scope("prototype")
public class MonthAction extends BaseAction<TPMMonth>{
	long id=1;
	//列表
	public String list() throws Exception {
		List<TPMMonth> monthList= monthService.findAll();
		ActionContext.getContext().put("monthList",monthList);
		return"list";
	}
	//修改页面
	public String editUI() throws Exception {
		//准备数据回显

		TPMMonth month=monthService.getById(id);
		ActionContext.getContext().getValueStack().push(month);
		return"editUI";
	}
	public String save() throws Exception {
		JSONObject jsonRequest = JSONObject.fromObject(this.getStrResponse());
		TPMMonth month=monthService.getById(id);
		month.setYear(jsonRequest.getString("year"));
		month.setMonth1color1(jsonRequest.getString("month1color1"));
		month.setMonth1operator1(jsonRequest.getString("month1operator1"));
		month.setMonth1color2(jsonRequest.getString("month1color2"));
		month.setMonth1operator2(jsonRequest.getString("month1operator2"));
		month.setMonth1color3(jsonRequest.getString("month1color3"));
		month.setMonth1operator3(jsonRequest.getString("month1operator3"));
		
		month.setMonth2color1(jsonRequest.getString("month2color1"));
		month.setMonth2operator1(jsonRequest.getString("month2operator1"));
		month.setMonth2color2(jsonRequest.getString("month2color2"));
		month.setMonth2operator2(jsonRequest.getString("month2operator2"));
		month.setMonth2color3(jsonRequest.getString("month2color3"));
		month.setMonth2operator3(jsonRequest.getString("month2operator3"));
		
		month.setMonth3color1(jsonRequest.getString("month3color1"));
		month.setMonth3operator1(jsonRequest.getString("month3operator1"));
		month.setMonth3color2(jsonRequest.getString("month3color2"));
		month.setMonth3operator2(jsonRequest.getString("month3operator2"));
		month.setMonth3color3(jsonRequest.getString("month3color3"));
		month.setMonth3operator3(jsonRequest.getString("month3operator3"));
		
		month.setMonth4color1(jsonRequest.getString("month4color1"));
		month.setMonth4operator1(jsonRequest.getString("month4operator1"));
		month.setMonth4color2(jsonRequest.getString("month4color2"));
		month.setMonth4operator2(jsonRequest.getString("month4operator2"));
		month.setMonth4color3(jsonRequest.getString("month4color3"));
		month.setMonth4operator3(jsonRequest.getString("month4operator3"));
		
		month.setMonth5color1(jsonRequest.getString("month5color1"));
		month.setMonth5operator1(jsonRequest.getString("month5operator1"));
		month.setMonth5color2(jsonRequest.getString("month5color2"));
		month.setMonth5operator2(jsonRequest.getString("month5operator2"));
		month.setMonth5color3(jsonRequest.getString("month5color3"));
		month.setMonth5operator3(jsonRequest.getString("month5operator3"));
		
		month.setMonth6color1(jsonRequest.getString("month6color1"));
		month.setMonth6operator1(jsonRequest.getString("month6operator1"));
		month.setMonth6color2(jsonRequest.getString("month6color2"));
		month.setMonth6operator2(jsonRequest.getString("month6operator2"));
		month.setMonth6color3(jsonRequest.getString("month6color3"));
		month.setMonth6operator3(jsonRequest.getString("month6operator3"));
		
		month.setMonth7color1(jsonRequest.getString("month7color1"));
		month.setMonth7operator1(jsonRequest.getString("month7operator1"));
		month.setMonth7color2(jsonRequest.getString("month7color2"));
		month.setMonth7operator2(jsonRequest.getString("month7operator2"));
		month.setMonth7color3(jsonRequest.getString("month7color3"));
		month.setMonth7operator3(jsonRequest.getString("month7operator3"));
		
		month.setMonth8color1(jsonRequest.getString("month8color1"));
		month.setMonth8operator1(jsonRequest.getString("month8operator1"));
		month.setMonth8color2(jsonRequest.getString("month8color2"));
		month.setMonth8operator2(jsonRequest.getString("month8operator2"));
		month.setMonth8color3(jsonRequest.getString("month8color3"));
		month.setMonth8operator3(jsonRequest.getString("month8operator3"));
		
		month.setMonth9color1(jsonRequest.getString("month9color1"));
		month.setMonth9operator1(jsonRequest.getString("month9operator1"));
		month.setMonth9color2(jsonRequest.getString("month9color2"));
		month.setMonth9operator2(jsonRequest.getString("month9operator2"));
		month.setMonth9color3(jsonRequest.getString("month9color3"));
		month.setMonth9operator3(jsonRequest.getString("month9operator3"));
		
		month.setMonth10color1(jsonRequest.getString("month10color1"));
		month.setMonth10operator1(jsonRequest.getString("month10operator1"));
		month.setMonth10color2(jsonRequest.getString("month10color2"));
		month.setMonth10operator2(jsonRequest.getString("month10operator2"));
		month.setMonth10color3(jsonRequest.getString("month10color3"));
		month.setMonth10operator3(jsonRequest.getString("month10operator3"));
		
		month.setMonth11color1(jsonRequest.getString("month11color1"));
		month.setMonth11operator1(jsonRequest.getString("month11operator1"));
		month.setMonth11color2(jsonRequest.getString("month11color2"));
		month.setMonth11operator2(jsonRequest.getString("month11operator2"));
		month.setMonth11color3(jsonRequest.getString("month11color3"));
		month.setMonth11operator3(jsonRequest.getString("month11operator3"));
		
		month.setMonth12color1(jsonRequest.getString("month12color1"));
		month.setMonth12operator1(jsonRequest.getString("month12operator1"));
		month.setMonth12color2(jsonRequest.getString("month12color2"));
		month.setMonth12operator2(jsonRequest.getString("month12operator2"));
		month.setMonth12color3(jsonRequest.getString("month12color3"));
		month.setMonth12operator3(jsonRequest.getString("month12operator3"));
		
		month.setYear1color1(jsonRequest.getString("year1color1"));
		month.setYear1operator1(jsonRequest.getString("year1operator1"));
		month.setYear1color2(jsonRequest.getString("year1color2"));
		month.setYear1operator2(jsonRequest.getString("year1operator2"));
		
		month.setYear2color1(jsonRequest.getString("year2color1"));
		month.setYear2operator1(jsonRequest.getString("year2operator1"));
		month.setYear2color2(jsonRequest.getString("year2color2"));
		month.setYear2operator2(jsonRequest.getString("year2operator2"));
		monthService.update(month);
		return "toList";
	}
	//获取请求体的数据
	public String getStrResponse(){
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest)ctx.get(ServletActionContext.HTTP_REQUEST);   
		InputStream inputStream;
		String strResponse = "";
		try {
		inputStream = request.getInputStream();
		String strMessage = "";
		BufferedReader reader;
		reader = new BufferedReader(new InputStreamReader(inputStream,"utf-8"));
		while ((strMessage = reader.readLine()) != null) {
		strResponse += strMessage;
		}
		reader.close();
		inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return strResponse;
	}


	//修改
	public String edit() throws Exception {
		TPMMonth month=monthService.getById(id);
		month.setYear(model.getYear());
		month.setMonth1color1(model.getMonth1color1());
		month.setMonth1operator1(model.getMonth1operator1());
		month.setMonth1color2(model.getMonth1color2());
		month.setMonth1operator2(model.getMonth1operator2());
		month.setMonth1color3(model.getMonth1color3());
		month.setMonth1operator3(model.getMonth1operator3());
		
		month.setMonth2color1(model.getMonth2color1());
		month.setMonth2operator1(model.getMonth2operator1());
		month.setMonth2color2(model.getMonth2color2());
		month.setMonth2operator2(model.getMonth2operator2());
		month.setMonth2color3(model.getMonth2color3());
		month.setMonth2operator3(model.getMonth2operator3());
		
		month.setMonth3color1(model.getMonth3color1());
		month.setMonth3operator1(model.getMonth3operator1());
		month.setMonth3color2(model.getMonth3color2());
		month.setMonth3operator2(model.getMonth3operator2());
		month.setMonth3color3(model.getMonth3color3());
		month.setMonth3operator3(model.getMonth3operator3());
		
		month.setMonth4color1(model.getMonth4color1());
		month.setMonth4operator1(model.getMonth4operator1());
		month.setMonth4color2(model.getMonth4color2());
		month.setMonth4operator2(model.getMonth4operator2());
		month.setMonth4color3(model.getMonth4color3());
		month.setMonth4operator3(model.getMonth4operator3());
		
		month.setMonth5color1(model.getMonth5color1());
		month.setMonth5operator1(model.getMonth5operator1());
		month.setMonth5color2(model.getMonth5color2());
		month.setMonth5operator2(model.getMonth5operator2());
		month.setMonth5color3(model.getMonth5color3());
		month.setMonth5operator3(model.getMonth5operator3());
		
		month.setMonth6color1(model.getMonth6color1());
		month.setMonth6operator1(model.getMonth6operator1());
		month.setMonth6color2(model.getMonth6color2());
		month.setMonth6operator2(model.getMonth6operator2());
		month.setMonth6color3(model.getMonth6color3());
		month.setMonth6operator3(model.getMonth6operator3());
		
		month.setMonth7color1(model.getMonth7color1());
		month.setMonth7operator1(model.getMonth7operator1());
		month.setMonth7color2(model.getMonth7color2());
		month.setMonth7operator2(model.getMonth7operator2());
		month.setMonth7color3(model.getMonth7color3());
		month.setMonth7operator3(model.getMonth7operator3());
		
		month.setMonth8color1(model.getMonth8color1());
		month.setMonth8operator1(model.getMonth8operator1());
		month.setMonth8color2(model.getMonth8color2());
		month.setMonth8operator2(model.getMonth8operator2());
		month.setMonth8color3(model.getMonth8color3());
		month.setMonth8operator3(model.getMonth8operator3());
		
		month.setMonth9color1(model.getMonth9color1());
		month.setMonth9operator1(model.getMonth9operator1());
		month.setMonth9color2(model.getMonth9color2());
		month.setMonth9operator2(model.getMonth9operator2());
		month.setMonth9color3(model.getMonth9color3());
		month.setMonth9operator3(model.getMonth9operator3());
		
		month.setMonth10color1(model.getMonth10color1());
		month.setMonth10operator1(model.getMonth10operator1());
		month.setMonth10color2(model.getMonth10color2());
		month.setMonth10operator2(model.getMonth10operator2());
		month.setMonth10color3(model.getMonth10color3());
		month.setMonth10operator3(model.getMonth10operator3());
		
		month.setMonth11color1(model.getMonth11color1());
		month.setMonth11operator1(model.getMonth11operator1());
		month.setMonth11color2(model.getMonth11color2());
		month.setMonth11operator2(model.getMonth11operator2());
		month.setMonth11color3(model.getMonth11color3());
		month.setMonth11operator3(model.getMonth11operator3());
		
		month.setMonth12color1(model.getMonth12color1());
		month.setMonth12operator1(model.getMonth12operator1());
		month.setMonth12color2(model.getMonth12color2());
		month.setMonth12operator2(model.getMonth12operator2());
		month.setMonth12color3(model.getMonth12color3());
		month.setMonth12operator3(model.getMonth12operator3());
		
		month.setYear1color1(model.getYear1color1());
		month.setYear1operator1(model.getYear1operator1());
		month.setYear1color2(model.getYear1color2());
		month.setYear1operator2(model.getYear1operator2());
		
		month.setYear2color1(model.getYear2color1());
		month.setYear2operator1(model.getYear2operator1());
		month.setYear2color2(model.getYear2color2());
		month.setYear2operator2(model.getYear2operator2());
		monthService.update(month);
		return "toList";
	}
}
