package cn.shp.oa.domain;
/**
 * ������
 * @author wyj
 *
 */

public class MeasureRoom {
	private Long id;
	private String measureRoom;
	private String remarks;//��ע
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMeasureRoom() {
		return measureRoom;
	}
	public void setMeasureRoom(String measureRoom) {
		this.measureRoom = measureRoom;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	

}
