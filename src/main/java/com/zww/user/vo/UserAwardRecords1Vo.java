package com.zww.user.vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.zww.constants.SignConstants;

public class UserAwardRecords1Vo {
private String awardId;
	
	private String userId;

    private String prizeId;

    private String prizeName;

    private String prizeNumber;

    private String prizeStatus;

    private String prizeTime;
    
    private Integer value;

    private String courierCompany;

    private String courierNumber;
    
    private String consignee;
    
    private String telephone;
    
    private String address;
    
    private String message  = "";
    
	public String getAwardId() {
		return awardId;
	}

	public void setAwardId(String awardId) {
		this.awardId = awardId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPrizeId() {
		return prizeId;
	}

	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeName() {
		return prizeName;
	}

	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getPrizeNumber() {
		return prizeNumber;
	}

	public void setPrizeNumber(String prizeNumber) {
		this.prizeNumber = prizeNumber;
	}

	public String getPrizeStatus() {
		return prizeStatus;
	}

	public void setPrizeStatus(String prizeStatus) {
		this.prizeStatus = prizeStatus;
	}

	public String getPrizeTime() {
		return prizeTime;
	}

	public void setPrizeTime(String prizeTime) {
		this.prizeTime = prizeTime;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getCourierCompany() {
		return courierCompany;
	}

	public void setCourierCompany(String courierCompany) {
		this.courierCompany = courierCompany;
	}

	public String getCourierNumber() {
		return courierNumber;
	}

	public void setCourierNumber(String courierNumber) {
		this.courierNumber = courierNumber;
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    

	public static List<prizeVo> voToList(UserAwardRecords1Vo vo) {
		
		String status = vo.getPrizeStatus();
		
		// 1-待邮寄;5-已兑换
		if (SignConstants.SIGN_PLUS_ONE.equals(status) || 
				SignConstants.SIGN_PLUS_FIVE.equals(status)) {
			
			List<prizeVo> result = new ArrayList<>(Arrays.asList(
					new prizeVo(vo.getPrizeId(),"编号"),
					new prizeVo(vo.getPrizeStatus(),"状态"),
					new prizeVo(vo.getValue().toString(),"可兑换金币数")
					));
			
			return result;
			
		// 2-待邮寄;3-邮寄中;4-邮寄到
		}else if (SignConstants.SIGN_PLUS_TWO.equals(status) || "3".equals(status) 
				|| SignConstants.SIGN_PLUS_FOUR.equals(status)) {
			
			List<prizeVo> result = new ArrayList<>(Arrays.asList(
					new prizeVo(vo.getPrizeId(),"编号"),
					new prizeVo(vo.getPrizeStatus(),"状态"),
					new prizeVo(vo.getCourierCompany() ,"快递公司"),
					new prizeVo(vo.getCourierNumber(),"快递单号")
					));
			
			return result;
		}
		
		return new ArrayList<>(Arrays.asList(new prizeVo("异常状态", "")));
	}
	
	public static class prizeVo {
		
		private String key;
		
		public prizeVo(String key,String name) {
			this.name = name;
			this.key = key;
			
		}
		private String name;
		
		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}
