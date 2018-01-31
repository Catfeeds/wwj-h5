package com.zww.constants;

/**
 * 充值、支付相关常量类
 *
 * @author kuang
 * @since 2018.01.30
 * @version 1.0
 */
public class PaymentConstants {

	public final static String PAYMENT_BODY = "幸运抓娃娃充值费用";

	public final static String WXPAY_IP ="120.27.222.98";
	
	public final static String LOG_ALIPAY_SIGN = "支付宝签名：";

	/**
	 * 充值方式-支付宝充值
	 */
	public final static String PAY_KIND_ALI = "0";
	
	/**
	 * 充值方式-微信充值
	 */
	public final static String PAY_KIND_WX = "1";

	/**
	 * 充值方式-积分兑换充值
	 */
	public final static String PAY_KIND_POINT = "2";
	
}
