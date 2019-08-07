<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>I18n Index</title>
</head>
<body>
<div id="known-message">
    <p>${msg.get("greeting")}</p>
</div>

<div id="fallback-message">
    <p>${msg.get("farewell")}</p>
</div>

<div id="unknown-message">
    <p>${msg.get("something-unknown")}</p>
</div>
</body>
</html>
