package cn.shp.oa.domain;
/**
 * �豸��Ϣ����
 * @author wyj
 *
 */
public class Role {
	private Long id;
	private String name;//�����ͺ�
	private String description;//ϵ�к�
	private String installationDate;//��װ����
	private String warrantyDeadine;//���޽�ֹ����
	private String location;//�ص�
	private String armLength;//�۳�
	private String repairYear;//ά������
	private String remarks;//��ע
	
	
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
