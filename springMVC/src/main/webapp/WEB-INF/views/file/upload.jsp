<%--
  Created by IntelliJ IDEA.
  User: Dream。
  Date: 2018/7/23
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <h4>文件上传</h4>
    <c:if test="${not empty message}">
        <div style="color: maroon">${message}</div>
    </c:if>

    <form action="" method="post" enctype="multipart/form-data">
        <input type="text" name="fileName"/><br>
        <input type="file" name="file"/><br>
        <button>上传</button>
    </form>
</body>
</html>
