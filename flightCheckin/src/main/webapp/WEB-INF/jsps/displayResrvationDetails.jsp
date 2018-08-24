<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reservation Deatails: </title>
</head>
<body>
<h2>Flight Details: </h2>
 <c:forEach items="${reservations}" var="reservation.flight">
<tr>
	<td>Airlines: ${reservation.flight.operatingAirlines}</td>
	<td>Flight No: ${reservation.flight.flightNumber}</td>
	<td>Departure City: ${reservation.flight.departureCity}</td>
	<td>Arrival City: ${reservation.flight.arrivalCity}</td>
	<td>Date of Departure: ${reservation.flight.dateOfDeparture}</td>
	<td>Estimate Departure Time: ${reservation.flight.estimatedDepartureTime}</td>
</tr>
</c:forEach>

<h2>Passanger Details: </h2>
<c:forEach items="${reservations}" var="reservation.passanger">
<tr>
	<td>First Name: ${reservation.passanger.firstName}</td>
	<td>Last Name: ${reservation.passanger.lastName}</td>
	<td>Email: ${reservation.passanger.email}</td>
	<td>Phone: ${reservation.passanger.phone}</td>
</tr>
</c:forEach>

<form action="completeCheckIn" method="post">
Enter the Number Of Bags You want to check in: <input type="text" name="numberOfBags"/>
<input type="hidden" value="${reservation.id}"/>
<input type="submit" value="Check In"/>

</form>

</body>
</html>
