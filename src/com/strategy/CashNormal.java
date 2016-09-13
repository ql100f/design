/**
 * CashNormal.java
 * com.gratedu
 * Copyright (c) 2016, 北京聚智未来科技有限公司版权所有.
*/

package com.strategy;

/**
 * 正常收费
 *
 * @author   chenqinglong
 * @Date	 2016年9月13日 	 
 */
public class CashNormal extends CashSuper {
	@Override
	public double acceptCash(double money) {
		return money;
	}
}
