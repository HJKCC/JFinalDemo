package cn.testJFinal.controller;

import com.jfinal.core.Controller;

public class IndexController extends Controller {
	public void index() {
		this.render("/index.jsp");
	}

	public void testJFinal() {
		String userName = this.getPara("userName");
		String helloUser = "Hello " + userName;
		this.setAttr("helloUser", helloUser);
		this.render("/hello.jsp");
		System.out.println("JFinalDemo！");
	}
}
