package cn.shp.oa.domain;
/**
 * ά�޼�¼
 * @author wyj
 *
 */

public class MaintenanceRecords {
	
	private Long id;
	private String measurementRoom;//������
	private String testingArm;//�������
	private String testingArmId;//������ۺ�
	private String problemTime;//���ⷢ��ʱ��
	private String problemDescription;//��������
	private String solution;//�������
	private String attachment;//ά�޻�����ı�����������
	private String troubleshootingTime;//BBAC����ʦ���ϴ���ʱ��
	private String startTime;//��Ӧ��ά�޿�ʼʱ��
	private String waitedTime;//��Ӧ��ά�޵ȴ�ʱ��
	private String finishTime;//��Ӧ��ά�޽���ʱ��
	private String totalTime;//��Ӧ�̴�ά��ʱ��
	private String confirmTime;//BBACȷ��ʱ��
	private String confirmPerson;//BBACȷ����
	private String remarks;//��ע
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
