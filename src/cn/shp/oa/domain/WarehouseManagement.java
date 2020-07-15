/**
 * 入库管理
 */

package cn.shp.oa.domain;


public class WarehouseManagement {
	private Long id;//主键
	private String typesOfGoods;//物品种类
	private String name;//物品名称
	private String specification;//规格
	private String model;//型号
	private String brand;//品牌
	private String orderNumber;//订货号
	private String numberOfRecipients;//物品数量
	private String unit;//单位
	private String termOfValidity;//有效期
	private String warningQuantity;//预警数量
	private String storageLocation;//存放位置
	private String date;//入库日期
	private String deliverer;//送货人
	private String receiver;//接收人
	private String operator;//操作人
	private String goodsId;//ID
	private double totalPrice;//物品总价
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTypesOfGoods() {
		return typesOfGoods;
	}
	public void setTypesOfGoods(String typesOfGoods) {
		this.typesOfGoods = typesOfGoods;
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
	public String getNumberOfRecipients() {
		return numberOfRecipients;
	}
	public void setNumberOfRecipients(String numberOfRecipients) {
		this.numberOfRecipients = numberOfRecipients;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getTermOfValidity() {
		return termOfValidity;
	}
	public void setTermOfValidity(String termOfValidity) {
		this.termOfValidity = termOfValidity;
	}
	public String getWarningQuantity() {
		return warningQuantity;
	}
	public void setWarningQuantity(String warningQuantity) {
		this.warningQuantity = warningQuantity;
	}
	public String getStorageLocation() {
		return storageLocation;
	}
	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}


	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDeliverer() {
		return deliverer;
	}
	public void setDeliverer(String deliverer) {
		this.deliverer = deliverer;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	
	

}
