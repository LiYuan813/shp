package cn.shp.oa.base;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.shp.oa.service.DayService;
import cn.shp.oa.service.MaintainPlanService;
import cn.shp.oa.service.MaintenancePlanService;
import cn.shp.oa.service.MaintenanceRecordsService;
import cn.shp.oa.service.MeasureRoomService;
import cn.shp.oa.service.MonthService;
import cn.shp.oa.service.OutboundManagementService;
import cn.shp.oa.service.PrivilegeService;
import cn.shp.oa.service.RoleService;
import cn.shp.oa.service.TPMWenTiService;
import cn.shp.oa.service.TotalInventoryService;
import cn.shp.oa.service.UserService;
import cn.shp.oa.service.WarehouseManagementService;
import cn.shp.oa.service.WeekService;

public abstract class BaseAction<T> extends ActionSupport implements  ModelDriven<T> {
	
	
	//==================modelDriven��֧��======================
	protected T model;
	public BaseAction(){
		try {
			ParameterizedType pt=(ParameterizedType)this.getClass().getGenericSuperclass();
			Class<T> clazz= (Class<T>) pt.getActualTypeArguments()[0];//��ȡ��һ�����Ͳ�������ʵ����
		    model =clazz.newInstance();
		}
		catch(Exception e){
			throw new RuntimeException (e);
		}
	}
	public T getModel() {
		return model;
	}
    //==================Serviceʵ��������=======================
	@Resource
	protected MaintainPlanService maintainPlanService;
	@Resource
	protected MaintenanceRecordsService maintenanceRecordsService;
	@Resource
	protected RoleService roleService;
	@Resource
	protected UserService userService;
	@Resource
	protected PrivilegeService privilegeService;
	@Resource
	protected MeasureRoomService measureRoomService;
	@Resource
	protected MaintenancePlanService maintenancePlanService;
	@Resource
	protected OutboundManagementService outboundManagementService;
	@Resource
	protected WarehouseManagementService warehouseManagementService;
	@Resource
	protected TotalInventoryService totalInventoryService;

	@Resource
	protected TPMWenTiService tPMWenTiService;
	@Resource
	protected MonthService monthService;
	@Resource
	protected DayService dayService;
	
	@Resource 
	protected WeekService weekService;
    //==================��ҳ�õĲ���=======================
	
	protected int pageSize=10;//ÿҳ��ʾ������
	protected int pageNum=1;//��ǰҳ
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	//==================���뵼��Excel�Ĳ���=======================
	protected String excelPath;
	protected String filePath;
	protected String  fileName;
	public String getExcelPath() {
		return excelPath;
	}
	public void setExcelPath(String excelPath) {
		this.excelPath = excelPath;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}
