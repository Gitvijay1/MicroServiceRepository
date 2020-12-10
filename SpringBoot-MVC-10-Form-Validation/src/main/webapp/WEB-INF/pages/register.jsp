<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
 <h1>WELCOME TO REGISTRATION PAGE</h1>
    <form:form action="save" method="post" modelAttribute="employee">
    <pre>
    ID:<form:input path="eid"/>
    NAME:<form:input path="ename"/>
        <form:errors path="ename"/>
    JOB:<form:input path="job"/>
    GENDER:<form:radiobutton path="gender" value="male"/>male   
           <form:radiobutton path="gender" value="femal"/>femal
           <form:errors path="gender"/>
    ORGENIZATION:<form:select path="org">
                 <form:option value="">SELECT</form:option>
                 <form:option value="NIT">NIT</form:option>
                 <form:option value="IN-FIELD">IN-FIELD</form:option>
                 <form:option value="NON-IT">NON-IT</form:option>
                 <form:errors path="org"/>
    </form:select>       
    NOTES:<form:textarea path="enpNote"/>
          <form:errors path="empNote"/>
    LIKES:<form:checkbox path="like" value="Edali"/>Edali
          <form:checkbox path="like" value="Dosa"/>Dosa
          <form:checkbox path="like" value="Bonda"/>Bonda
          <input type="submit" value="register"/>
          <form:errors path="like"/>
    </pre>
    </form:form>
 ${Massage}
</body>
</html>