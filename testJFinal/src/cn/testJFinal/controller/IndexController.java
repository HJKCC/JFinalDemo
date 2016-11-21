package cn.testJFinal.controller;

import com.jfinal.core.Controller;

public class IndexController extends Controller {
	public void index() {
		this.render("/index.jsp");
	}

	public void testJFinal() {
		String userName = this.getPara("userName");
		this.setAttr("helloUser", "Hello " + userName);
		this.render("/hello.jsp");
	}
}
