package com.s21v.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.s21v.bean.News;
import com.s21v.bean.XMLServerBean;

/**
 * Servlet implementation class ServletForJson
 */
@WebServlet("/ServletForJson")
public class ServletForJson extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private XMLServerBean newsServer = new XMLServerBean();
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletForJson() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		List<News> newes = newsServer.getLastNews();
		StringBuilder json = new StringBuilder();
		json.append('[');
		for(News news : newes){
			json.append("{id:").append(news.getId()).append(',');
			json.append("title:\"").append(news.getTitle()).append("\",");
			json.append("timelength:").append(news.getTimelength()).append("},");
		}
		json.deleteCharAt(json.length()-1);
		json.append(']');
		request.setAttribute("json", json.toString());
		request.getRequestDispatcher("/WEB-INF/page/jsonnewslist.jsp").forward(request, response);
	}

}
