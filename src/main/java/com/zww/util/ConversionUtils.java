package com.zww.util;


/**
 * 转换工具类
 * 
 * @author john
 * @since 2017.10.12
 */
public class ConversionUtils {

	/**
	 * 初始化经验列表
	 */
	private static final	int[] I = {30, 70, 120, 200, 300, 430, 610, 810, 1050, 1350,
			1700, 2100, 2550, 3060, 3660, 4360, 5140, 5990, 6870, 7790, 8770,
			9820, 10940, 12190, 13690, 15390, 17240, 19340, 21790};
	
	
	/**
	 * 经验值转换成等级
	 * 
	 * @param exp 经验值
	 * @return 等级
	 */
	public static String expToLevel(String exp) {
		
		return expToLevel(Integer.valueOf(exp));
		
	}
	
	/**
	 * 经验值转换成等级
	 * 
	 * @param exp 经验值
	 * @return 等级
	 */
	public static String expToLevel(int exp) {
		
		for(int j=0; j<I.length; j++) {
			
			if(exp < I[j]) {
				return String.valueOf(j+1);
			}
			
		}
		
		return "30";
	}
	
}
