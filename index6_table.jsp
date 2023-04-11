<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<jsp:useBean id="s1" class="com.model.student"></jsp:useBean>
<jsp:setProperty property="sid"  name="s1" value="12"/>
<jsp:setProperty property="sname"  name="s1" value="hinal"/>
<jsp:setProperty property="city"  name="s1" value="a'bad"/>

<jsp:useBean id="s2" class="com.model.student"></jsp:useBean>
<jsp:setProperty property="sid"  name="s2" value="12"/>
<jsp:setProperty property="sname"  name="s2" value="vani"/>
<jsp:setProperty property="city"  name="s2" value="rajkot"/>



<table border="1">
<tr>
<th>SID</th>
<th>SNAME</th>
<th>CITY</th>



</tr>
<tr>

<td><jsp:getProperty property="sid" name="s1"/></td>
<td><%= s1.getSname() %></td>
<td><jsp:getProperty property="city" name="s1"/></td>

</tr>


<tr>

<td><jsp:getProperty property="sid" name="s2"/></td>
<td><%= s2.getSname() %></td>
<td><jsp:getProperty property="city" name="s2"/></td>

</tr>











</table>
</body>
</html>