package cn.shp.oa.view.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.shp.oa.base.BaseAction;
import cn.shp.oa.domain.MeasureRoom;
@Controller
@Scope("prototype")
public class MeasureRoomAction extends BaseAction<MeasureRoom> {
	/**列表*/
	public String list() throws Exception {	
		List<MeasureRoom> measureRoomList=measureRoomService.findAll();
		ActionContext.getContext().put("measureRoomList", measureRoomList);
		return "list";		
	}
	/**添加*/
	public String add() throws Exception {	
		measureRoomService.save(model);
		return "toList";		
	}
	/**添加页面*/
	public String addUI() throws Exception {		
		return "saveUI";		
	}
	/**删除*/
	public String delete() throws Exception {
		measureRoomService.delete(model.getId());
		return "toList";		
	}
	/**修改*/
	public String edit() throws Exception {	
		MeasureRoom measureRoom=measureRoomService.getById(model.getId());
		measureRoom.setMeasureRoom(model.getMeasureRoom());
		measureRoomService.update(measureRoom);
		return "toList";		
	}
	/**修改页面*/
	public String editUI() throws Exception {
		MeasureRoom measureRoom=measureRoomService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(measureRoom);
		return "saveUI";		
	}


}
