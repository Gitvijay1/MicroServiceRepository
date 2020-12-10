<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
 <h1>WELCOME TO UPDATE PAGE</h1>
 <form action="#" method="post">
 <pre>
   EMP ID:<input type="text" name="eid" value="${ob. }" readonly="readonly"/>
   EMP NAME:<input type="text" name="ename" value="${ob.ename}"/>
   JOB:<input type="text" name="job" value="${ob.job}"/>
    SAL:<input type="text" name="sal" value="${ob.sal}"/>
    <input type="submit" value="update"/>
   </pre>
 </form>
 ${Massage}
</body>
</html>