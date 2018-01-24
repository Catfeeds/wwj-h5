package com.zww.manage.service.impl;

import com.zww.manage.pojo.OperationParamteterPojo;
import com.zww.manage.repository.OperationParameterMapper;
import com.zww.manage.service.OperationParameterService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OperationParameterServiceImpl implements OperationParameterService{

	@Autowired
	private OperationParameterMapper operationParameterMapper;
	
	/**
	 * 获得Banner
	 * @return
	 */
	@Override
	public Map<String, Object> getBannerList() {
		
		List<OperationParamteterPojo> list = operationParameterMapper.queryBannerList();
		
		Map<String, Object> map = new HashMap<>();
		
		
		List<String> url = new ArrayList<>();
		List<String> title = new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			url.add(list.get(i).getSpareThree());
			title.add(list.get(i).getSpareTwo());
		}
		
		map.put("url", url);
		map.put("title", title);
		map.put("sign", list.get(0).getSpareOne());
		
		return map;
	}

}
