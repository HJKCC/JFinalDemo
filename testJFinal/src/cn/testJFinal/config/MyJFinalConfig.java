package cn.testJFinal.config;

import cn.testJFinal.controller.IndexController;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.render.ViewType;

public class MyJFinalConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants constants) {
		constants.setDevMode(true);
		constants.setEncoding("utf-8");
		constants.setViewType(ViewType.JSP);
	}

	@Override
	public void configHandler(Handlers handlers) {
		handlers.add(new ContextPathHandler("basePath"));

	}

	@Override
	public void configInterceptor(Interceptors arg0) {
		
	}

	@Override
	public void configPlugin(Plugins arg0) {
	}

	@Override
	public void configRoute(Routes routes) {
		routes.add("/", IndexController.class);		
	}
}
