package com.zww.user.vo;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.zww.user.pojo.UserAwardRecordsPojo;

public class UserBaseVo {
	private String userId;

    private String userName;

    private int portraitNum;

    private String experience;

    private String balance;
    @JSONField(serialize = false)
    private Integer gold;

    private String inviteCode;

    private String exchangeCode;
    
    private String userLevel;
    
    private int prizeNum;
    
    private int redPacketValue;
    

	public int getRedPacketValue() {
		return redPacketValue;
	}

	public void setRedPacketValue(int redPacketValue) {
		this.redPacketValue = redPacketValue;
	}

	private List<UserAwardRecordsPojo> pictureIds;

	public List<UserAwardRecordsPojo> getPictureIds() {
		return pictureIds;
	}

	public void setPictureIds(List<UserAwardRecordsPojo> pictureIds) {
		this.pictureIds = pictureIds;
	}

	public Integer getGold() {
		return gold;
	}

	public void setGold(Integer gold) {
		this.gold = gold;
	}

	public String getExperience() {
		return experience;
	}

	public String getUserLevel() {
		return userLevel;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}

	public int getPrizeNum() {
		return prizeNum;
	}

	public void setPrizeNum(int prizeNum) {
		this.prizeNum = prizeNum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPortraitNum(int portraitNum) {
		this.portraitNum = portraitNum;
	}

	public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getPortraitNum() {
        return portraitNum;
    }

    public void setPortraitNum(Integer portraitNum) {
        this.portraitNum = portraitNum;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public String getExchangeCode() {
        return exchangeCode;
    }

    public void setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode == null ? null : exchangeCode.trim();
    }

}
