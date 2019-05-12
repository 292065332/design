package com.pagoda.design.structuralModel.proxy.staticl;


/**
 * 客户调用
 */
public class Client {
	public static void main(String[] args) {

		// 把周杰伦找出来
		Star real = new RealStar();
		// 把周杰伦卖给经纪人
		Star proxy = new ProxyStar(real);

		// 让经纪人和客户去谈
		proxy.confer();
		proxy.signContract();
		proxy.bookTicket();
		proxy.sing();
		proxy.collectMoney();
		
	}
}
