<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Complete Registration</title>
</head>
<body>
	<h2>Complete Reservation</h2>
<c:forEach items="${flights}" var="flight">
<tr>
	<td>Airline: ${flight.operatingAirlines}</td> 
	<td>Departure City: ${flight.departureCity}</td>
	<td>Arrival City City: ${flight.arrivalCity}</td>

</tr>
</c:forEach>
<h2>Passanger Details: </h2>	
	<form action="completeReservation" method="post">
	<pre>
First Name:<input type="text" name="firstName" />
Last Name:<input type="text" name="lastName" />
Email:<input type="text" name="email" />
Phone:<input type="text" name="phone" />


Name on the Card:<input type="text" name="nameOnTheCard" />
LCard Number:<input type="text" name="cardNumber" />
EExpire date:<input type="text" name="expirationDate" />
PThree Dig Security Code:<input type="text" name="securityCode" />

<input type="hidden" name="flightId"  value="${flight.id}"/>
<input type="submit" value="confirm"/>
</pre>

</form>
</body>
</html>