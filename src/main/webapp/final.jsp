<%@page import="java.util.List"%>
<%@page import="domain.model.Offer"%>
<%@page import="domain.model.Seller"%>
<%@page import="domain.model.Car"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Seller seller = (Seller) session.getAttribute("seller");
		Car car = (Car) session.getAttribute("car");
		Offer offer = (Offer) session.getAttribute("offer");
	%>
	<h1>Oferta:</h1>
	<h3><%=offer.getTitle()%></h3>
	<h3><%=offer.getDesc()%></h3>
	<h3><%=offer.getUploaded()%></h3>
	<h1>Samochód:</h1>
	<h3><%=car.getVehtype()%></h3>
	<h3><%=car.getMake()%></h3>
	<h3><%=car.getModel()%></h3>
	<h3><%=car.getYear()%></h3>
	<h1>Sprzedający:</h1>
	<h3><%=seller.getName()%></h3>
	<h3><%=seller.getSurname()%></h3>
	<h3><%=seller.getTel_number()%></h3>
	<h3><%=seller.getMail()%></h3>
	<h3><%=seller.getTown()%></h3>
	<h3><%=seller.getPost_code()%></h3>
	<form action="dbServlet" method="get">
	<input type="submit" value="Dodaj">
	</form>
</body>
</html>