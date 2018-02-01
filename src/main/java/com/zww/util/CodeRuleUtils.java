package com.zww.util;

import java.util.Random;

/**
 * 编码生成规则
 * 
 * @author john
 * @since 2017.10.12
 */
public class CodeRuleUtils {
	
	/**
	 * 生成邀请码
	 * 
	 * @param id 用户id
	 * @return 个人邀请码
	 */
	public static String inviteCode(String id) {
		
		return transform(Integer.valueOf(id)*3 + 17654321, 27);
	}
  
	/**
	 * 生成邀请码
	 * 
	 * @param id 用户id
	 * @return 个人邀请码
	 */
	public static String getPortrait(String id) {
		
		return transform(Integer.valueOf(id)*5 + 233, 25);
	}
	
	/**
	 * 生成点券码
	 * 
	 * 
	 * @param id 用户id
	 * @return 个人邀请码
	 */
	public static String coupons(String id) {
		
		Random r = new Random();
		int i = r.nextInt(32);
		int j = r.nextInt(32);
		int k = r.nextInt(32);
		return "" + DIGITS[i] + transform(Integer.valueOf(id)*3 +321, 23) 
			+ DIGITS[j] + DIGITS[k];
	}
	
    private static String transform(int num,int n){  
    	
        //参数num为输入的十进制数，参数n为要转换的进制  
        int array[]=new int[100];  
        int location=0;  
        
        //当输入的数不为0时循环执行求余和赋值 
        while(num!=0){ 
            int remainder=num%n;  
            num=num/n;  
            //将结果加入到数组中去 
            array[location]=remainder; 
            location++;  
        }  
        
        return show(array,location-1);  

    }  
    
    private static String show(int[] arr,int n){
    	
    		StringBuffer sb = new StringBuffer();
    		
        for(int i=n;i>=0;i--){  
            if(arr[i]>9){  
            		sb.append((char)(arr[i]+55));
            }  
            else { 
            		sb.append(arr[i]+"");  
            }
        } 
        return sb.toString();
    }  
   
    private final static char[] DIGITS = {
    	      '0', '1', '2', '3', '4', '5', '6', '7',
    	      '8','9', 'A', 'B', 'C', 'D', 'E', 'F', 
    	      'G', 'H','J', 'K', 'L','M', 'N',  'P',
    	      'R', 'S', 'T', 'U', 'W', 'X', 'Y','Z' };
    
    public static void main(String[] args) {
    		System.out.println(getPortrait("18223"));
	}
    
    
}
