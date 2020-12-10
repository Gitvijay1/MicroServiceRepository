<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
  <tr>
    <a href="reg">Register</a>
    <a href="all">ViewAll</a> 
  </tr>
  <hr>
</table>
<h1>WELCOME TO DATA PAGE</h1>
<table border="1">
 <tr>
   <th>EID</th>
   <th>ENAME</th>
   <th>JOB</th>
   <th>SAL</th>
   <th>BONAS</th>
   <th>OPRATION</th>
   <th>EDITE</th>   
 </tr>
 <c:forEach items="${list}" var="ob">
    <tr>
       <td>${ob.eid}</td>
       <td>${ob.ename}</td>
       <td>${ob.job}</td>
       <td>${ob.sal}</td>
       <td>${ob.bonas}</td>
       <td><a href="delete?eid=${ob.eid}">DELETE</a></td>
       <td><a href="edit?eid=${ob.eid}">UPDATE</a></td>
    </tr>
 </c:forEach>
</table>
${godata}
</body>
</html>