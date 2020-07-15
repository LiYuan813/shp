package cn.shp.oa.domain;
/**
 * 维修记录
 * @author wyj
 *
 */

public class MaintenanceRecords {
	
	private Long id;
	private String measurementRoom;//测量室
	private String testingArm;//待测机臂
	private String testingArmId;//待测机臂号
	private String problemTime;//问题发生时间
	private String problemDescription;//问题描述
	private String solution;//解决方案
	private String attachment;//维修或更换的备件及备件号
	private String troubleshootingTime;//BBAC工程师故障处理时长
	private String startTime;//供应商维修开始时间
	private String waitedTime;//供应商维修等待时间
	private String finishTime;//供应商维修结束时间
	private String totalTime;//供应商纯维修时间
	private String confirmTime;//BBAC确认时间
	private String confirmPerson;//BBAC确认人
	private String remarks;//备注
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMeasurementRoom() {
		return measurementRoom;
	}
	public void setMeasurementRoom(String measurementRoom) {
		this.measurementRoom = measurementRoom;
	}
	public String getTestingArm() {
		return testingArm;
	}
	public void setTestingArm(String testingArm) {
		this.testingArm = testingArm;
	}
	public String getTestingArmId() {
		return testingArmId;
	}
	public void setTestingArmId(String testingArmId) {
		this.testingArmId = testingArmId;
	}
	public String getProblemTime() {
		return problemTime;
	}
	public void setProblemTime(String problemTime) {
		this.problemTime = problemTime;
	}
	public String getProblemDescription() {
		return problemDescription;
	}
	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public String getTroubleshootingTime() {
		return troubleshootingTime;
	}
	public void setTroubleshootingTime(String troubleshootingTime) {
		this.troubleshootingTime = troubleshootingTime;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getWaitedTime() {
		return waitedTime;
	}
	public void setWaitedTime(String waitedTime) {
		this.waitedTime = waitedTime;
	}
	public String getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}
	public String getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}
	public String getConfirmTime() {
		return confirmTime;
	}
	public void setConfirmTime(String confirmTime) {
		this.confirmTime = confirmTime;
	}
	public String getConfirmPerson() {
		return confirmPerson;
	}
	public void setConfirmPerson(String confirmPerson) {
		this.confirmPerson = confirmPerson;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
