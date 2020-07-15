/**
 * 库存总量
 */
package cn.shp.oa.domain;

public class TotalInventory {
	private Long id;
	private String type;//物品种类
	private String name;//物品名称
	private String specification;//规格
	private String model;//型号
	private String brand;//品牌
	private String orderNumber;//订货号
	private String total;//总量
	private String unit;//单位
	private String warningQuantity;//预警数量
	private String termOfValidity;//有效期
	private String storageLocation;//存放位置
	private String remarks;//备注
	private String totalPrice;//总价
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getWarningQuantity() {
		return warningQuantity;
	}
	public void setWarningQuantity(String warningQuantity) {
		this.warningQuantity = warningQuantity;
	}
	public String getTermOfValidity() {
		return termOfValidity;
	}
	public void setTermOfValidity(String termOfValidity) {
		this.termOfValidity = termOfValidity;
	}
	public String getStorageLocation() {
		return storageLocation;
	}
	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	

}
