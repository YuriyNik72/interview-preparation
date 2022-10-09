<%@ page language="java" contentType="text/html charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
  <head>
    <meta charset="UTF-8"></meta>
    <title>students list</title>
  </head>

  <body>
    <h1>Students list</h1>

    <ul>
      <c:forEach var="student" items="${students}">
        <li>Id : ${student.id}; Name : ${student.name}; Age : ${student.age}</li>
      </c:forEach>
    </ul>

  </body>
</html>
