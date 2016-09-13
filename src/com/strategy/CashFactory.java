/**
 * CashFactory.java
 * com.gratedu
 * Copyright (c) 2016, 北京聚智未来科技有限公司版权所有.
*/

package com.strategy;

/**
 * 现金收费工厂
 *
 * @author   chenqinglong
 * @Date	 2016年9月13日 	 
 */
public class CashFactory {
	public static CashSuper createCashAccept(String type) {
		CashSuper cs = null;
		switch (type) {
		case "正常收费":
			cs = new CashNormal();
			break;
		case "打8折":
			cs = new CashRebate("0.8");
			break;
		}
		return cs;
	}
}
