<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/webpage/include/taglib.jsp"%>
<%@ page isErrorPage="true"%>
<%
response.setStatus(404);
%>
<!DOCTYPE html>
<html>
    <head>
      <title>404 页面</title>
      <link href="${ctxStatic}/common/css/style.css?v=3.2.0" type="text/css" rel="stylesheet" />
    </head>

    <body class="gray-bg">
        <div class="middle-box text-center animated fadeInDown">
            <h1>404</h1>
            <h3 class="font-bold">页面不在家！</h3>
            <div class="error-desc">
                抱歉，页面好像去月球了~
            </div>
        </div>
    </body>

</html>