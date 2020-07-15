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
	/**�б�*/
	public String list() throws Exception {	
		List<MeasureRoom> measureRoomList=measureRoomService.findAll();
		ActionContext.getContext().put("measureRoomList", measureRoomList);
		return "list";		
	}
	/**���*/
	public String add() throws Exception {	
		measureRoomService.save(model);
		return "toList";		
	}
	/**���ҳ��*/
	public String addUI() throws Exception {		
		return "saveUI";		
	}
	/**ɾ��*/
	public String delete() throws Exception {
		measureRoomService.delete(model.getId());
		return "toList";		
	}
	/**�޸�*/
	public String edit() throws Exception {	
		MeasureRoom measureRoom=measureRoomService.getById(model.getId());
		measureRoom.setMeasureRoom(model.getMeasureRoom());
		measureRoomService.update(measureRoom);
		return "toList";		
	}
	/**�޸�ҳ��*/
	public String editUI() throws Exception {
		MeasureRoom measureRoom=measureRoomService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(measureRoom);
		return "saveUI";		
	}


}
