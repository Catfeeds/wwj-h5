package com.zww.encode.repository;

import com.zww.encode.pojo.RoomConfigInfoPojo;
import org.springframework.stereotype.Component;

/**
 * 生成config信息Mapper类
 *
 * @author kuang
 * @since 2018.01.29
 * @version 1.0
 */
@Component
public interface ConfigEncodeMapper {

	/**
	 * 获取房间配置信息
	 * @param roomId
	 * @return
	 */
	RoomConfigInfoPojo getRoomConfigInfo(String roomId);
	
}
