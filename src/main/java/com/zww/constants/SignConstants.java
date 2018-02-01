package com.zww.constants;

import com.zww.room.vo.MachineVo;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 标志静态常量
 * @author lc
 *
 */
public class SignConstants {
	
	public static final int MAX_RED_PACKET_NUM = 20;
	
	public static final String SIGN_PLUS_ZERO = "0";
	
	public static final String SIGN_PLUS_ONE = "1";
	
	public static final String SIGN_PLUS_TWO = "2";
	
	public static final String SIGN_PLUS_THREE = "3";
	
	public static final String SIGN_PLUS_FOUR = "4";
	
	public static final String SIGN_PLUS_FIVE = "5";
	
	public static final String SIGN_MINUS_ONE = "-1";
	
	public static final String SIGN_MINUS_THREE = "-3";
	
	//直播流 推流终止时间 2018-5-1 0:0:0
	public static final long End_LIVE_TIME = 1525104000L;

	/**
	 * 房间信息一览
	 */
	public static List<MachineVo> MACHINE_INFO_LIST = null;

	/**
	 * appKey
	 */
	public static final String APP_KEY = "0xac,0x71,0x8a,0x2a,0x91,0x1d,0x98,0x41,0x6b,0xaf,0x60,0x8f,0xa8,0x4d,0xf8,0x09,0x5c,0x7a,0xe6,0xcb,0x53,0xd6,0xc0,0xcb,0x4e,0xdd,0x5e,0x8b,0xab,0x3a,0x96,0xea";

	/**
	 * app_id
	 */
	public static final String APP_ID = "3412959418";

	/**
	 * 版本号
	 */
	public static final int VER = 1;

	/**
	 * 密钥
	 */
	public static final String SERVERSECRECT = "b02a4d56edbd2f360847f27fd7dc32d3";

	/**
	 * 娃娃机数量
	 */
	private final static int macNumber = 50;

	/**
	 * 存储房间人数
	 */
	private static Map<String, String> roomUserCount =
			new ConcurrentHashMap<>(macNumber);

	public static Map<String, String> getRoomUserCount() {
		return roomUserCount;
	}

	public static void setRoomUserCount(Map<String, String> roomUserCount) {
		SignConstants.roomUserCount = roomUserCount;
	}
}
