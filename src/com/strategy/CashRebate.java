/**
 * CashRebate.java
 * com.gratedu
 * Copyright (c) 2016, 北京聚智未来科技有限公司版权所有.
*/

package com.strategy;

/**
 * TODO(这里用一句话描述这个类的作用)
 * <p>
 * TODO(这里描述这个类补充说明 – 可选)
 *
 * @author   chenqinglong
 * @Date	 2016年9月13日 	 
 */
public class CashRebate extends CashSuper {

	private double moneyRebate = 1d;

	/**
	 * 初始化时必须要输入折扣率，如八折，就是0.8
	 *
	 * @param moneyRebate
	 */
	public CashRebate(String moneyRebate) {
		this.moneyRebate = Double.parseDouble(moneyRebate);
	}

	@Override
	public double acceptCash(double money) {
		return money * moneyRebate;
	}
}
