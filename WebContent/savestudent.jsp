<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  	添加学员信息:
    <form action="./studentAction_save.action" method="post">
    	学生名:<input type="text" name="student.name" /><br />
    	班级编号:<select name="student.grade.id">
    		<option value="1">java</option>
    		<option value="2">net</option>
    	</select>
    	<input type="submit" value="提交" />
    </form>
    <a href="http://localhost:8000/admin">111</a>
  </body>
</html>