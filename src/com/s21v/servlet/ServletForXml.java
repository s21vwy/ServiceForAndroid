package com.s21v.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.s21v.bean.News;
import com.s21v.bean.XMLServer;
import com.s21v.bean.XMLServerBean;

/**
 * Servlet implementation class ServletForXml
 */
@WebServlet("/ServletForXml")
public class ServletForXml extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private XMLServer server = new XMLServerBean();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletForXml() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		List<News> news = server.getLastNews();
		request.setAttribute("newes", news);
		request.getRequestDispatcher("/WEB-INF/page/news.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
