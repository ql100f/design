/**
 * CashSuper.java
 * com.gratedu
 * Copyright (c) 2016, 北京聚智未来科技有限公司版权所有.
*/

package com.strategy;

/**
 * 现金收费抽象类
 *
 * @author   chenqinglong
 * @Date	 2016年9月13日 	 
 */
public abstract class CashSuper {
	/**
	 * 现金收取超类的抽象方法，收取现金，参数为原价，返回当前价
	*/
	public abstract double acceptCash(double money);
}
