package com.s21v.bean;

import java.util.ArrayList;
import java.util.List;

public class XMLServerBean implements XMLServer{
	@Override
	public List<News> getLastNews() {
		// TODO Auto-generated method stub
		ArrayList<News> news = new ArrayList<>();
		news.add(new News(1, "android", 20));
		news.add(new News(2, "s21v", 10));
		news.add(new News(3, "王弈", 50));
		return news;
	}

}
