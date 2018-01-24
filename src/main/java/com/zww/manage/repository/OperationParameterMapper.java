package com.zww.manage.repository;

import com.zww.manage.pojo.OperationParamteterPojo;
import org.springframework.stereotype.Component;

import java.util.List;

/*
 * 
 * 运行参数设置
 */
@Component
public interface OperationParameterMapper {

	/**
	 * 获得Banner
	 * @return
	 */
	public List<OperationParamteterPojo> queryBannerList();


}
