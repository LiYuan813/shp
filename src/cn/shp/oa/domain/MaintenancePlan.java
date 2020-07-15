package cn.shp.oa.domain;
/**
 * 保养计划
 * @author wyj
 *
 */

public class MaintenancePlan {
	private Long id;
	private String supplier;
	private String measureroom;
	private String cmmno;
	private String machine;
	private String maintainplan;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getMeasureroom() {
		return measureroom;
	}
	public void setMeasureroom(String measureroom) {
		this.measureroom = measureroom;
	}
	public String getCmmno() {
		return cmmno;
	}
	public void setCmmno(String cmmno) {
		this.cmmno = cmmno;
	}
	public String getMachine() {
		return machine;
	}
	public void setMachine(String machine) {
		this.machine = machine;
	}
	public String getMaintainplan() {
		return maintainplan;
	}
	public void setMaintainplan(String maintainplan) {
		this.maintainplan = maintainplan;
	}
	

}
