package cn.testJFinal.controller;

import com.jfinal.core.Controller;

public class IndexController extends Controller {
	public void index() {
		this.render("/index.jsp");
	}

	public void sayHello() {
		String userName = this.getPara("userName");
		String sayHello = "Hello " + userName;
		this.setAttr("sayHello", sayHello);
		this.render("/hello.jsp");
		System.out.println("我的第一个JFinalDemo！");
	}
}
