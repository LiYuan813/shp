package cn.shp.oa.domain;
/**
 * 设备信息管理
 * @author wyj
 *
 */
public class Role {
	private Long id;
	private String name;//机器型号
	private String description;//系列号
	private String installationDate;//安装日期
	private String warrantyDeadine;//保修截止日期
	private String location;//地点
	private String armLength;//臂长
	private String repairYear;//维修日期
	private String remarks;//备注
	
	
	public String getInstallationDate() {
		return installationDate;
	}
	public void setInstallationDate(String installationDate) {
		this.installationDate = installationDate;
	}
	public String getWarrantyDeadine() {
		return warrantyDeadine;
	}
	public void setWarrantyDeadine(String warrantyDeadine) {
		this.warrantyDeadine = warrantyDeadine;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getArmLength() {
		return armLength;
	}
	public void setArmLength(String armLength) {
		this.armLength = armLength;
	}
	public String getRepairYear() {
		return repairYear;
	}
	public void setRepairYear(String repairYear) {
		this.repairYear = repairYear;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
