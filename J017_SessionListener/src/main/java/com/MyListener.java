package com;



import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class MyListener implements HttpSessionListener {

	int totalUser = 0;
	int currentUser=0;
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		
		totalUser++;
		currentUser++;
		
		ServletContext cx = se.getSession().getServletContext();
		cx.setAttribute("tuser", totalUser+"");
		cx.setAttribute("cuser", currentUser+"");
		
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		
		currentUser--;
		ServletContext cx = se.getSession().getServletContext();
		cx.setAttribute("cuser", currentUser+"");
		
	}
	
	
	
	
}
