package com.example.compound;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileViewer extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		ProfileModel model = new ProfileModel();
		model.initialize();
		getServletContext().setAttribute("model", model);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProfileModel model = (ProfileModel) getServletContext().getAttribute("model");
		
		String nextCommand = req.getParameter("next");
		if(!nextCommand.isEmpty()){
			model.next();
		}
		
		String prevCommand = req.getParameter("prev");
		if(!prevCommand.isEmpty()){
			model.prev();
		}
		
		req.setAttribute("model", model);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/jsp/view.jsp");
		dispatcher.forward(req, resp);
	}
	
}