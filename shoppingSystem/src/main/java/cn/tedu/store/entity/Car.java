package cn.tedu.store.entity;

import java.io.Serializable;
import java.util.Date;

public class Car implements Serializable{
	
	private static final long serialVersionUID = 48780833382796799L;
	
	private Integer cid;
	private String cartype;
	private String VIN;
	private String chassisNum;
	private Date produceTime;
	private String engineNum;
	private String engineType;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public String getVIN() {
		return VIN;
	}
	public void setVIN(String vIN) {
		VIN = vIN;
	}
	public String getChassisNum() {
		return chassisNum;
	}
	public void setChassisNum(String chassisNum) {
		this.chassisNum = chassisNum;
	}
	public Date getProduceTime() {
		return produceTime;
	}
	public void setProduceTime(Date produceTime) {
		this.produceTime = produceTime;
	}
	public String getEngineNum() {
		return engineNum;
	}
	public void setEngineNum(String engineNum) {
		this.engineNum = engineNum;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Car [cid=" + cid + ", cartype=" + cartype + ", VIN=" + VIN + ", chassisNum=" + chassisNum
				+ ", produceTime=" + produceTime + ", engineNum=" + engineNum + ", engineType=" + engineType + "]";
	}
	
	
	
	
}
