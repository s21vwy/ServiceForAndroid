<%@ page language="java" contentType="text/xml; charset=utf-8" pageEncoding="utf-8"%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><?xml version="1.0" encoding="utf-8"?>
<videonews>
	<c:forEach items="${newes}" var="news">
		<news id="${news.id}">
			<title>${news.title}</title>
			<timelength>${news.timelength}</timelength>
		</news>
	</c:forEach>
</videonews>