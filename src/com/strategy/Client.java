/**
 * HelloWorld.java
 * com.gratedu
 * Copyright (c) 2016, 北京聚智未来科技有限公司版权所有.
*/

package com.strategy;

/**
 * 客户端
 *
 * @author   chenqinglong
 * @Date	 2016年9月13日 	 
 */
public class Client {
	public static void main(String[] args) {
		double total = 0.0d;
		//		CashSuper csuper = CashFactory.createCashAccept("打8折");
		CashSuper csuper = CashFactory.createCashAccept("正常收费");
		total = csuper.acceptCash(500);
		System.out.println(total);
	}
}
