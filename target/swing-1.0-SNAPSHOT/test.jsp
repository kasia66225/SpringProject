<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: katarzyna
  Date: 29.07.18
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>Strona Główna</title>
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <link rel="stylesheet" type="text/css" href="css/styleresp.css" media="screen and (max-width:800px)" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
</head>
<body>
<div class="container">
    <img src="img/book.jpg" alt="Notebook" width="1200" height="600">
    <div class="content">
        <h1 class="name">Katarzyna Jabłońska</h1>
        <h2 class="a">przygody z edukacją</h2>
    </div>
</div>
<div class="title">
    <p class="memories"> W 2015 roku ukończyłam Liceum Ogólnokształcące Imienia Tadeusza Kościuszki w Wieluniu. Jestem absolwentką profilu matematyczno-fizycznego. Aktualnie studiuję Informatykę na Wydziale Podstawowych Problemów Techniki. Jestem na czwartym semestrze.
    </p>
    <img src="img/me" alt="me" width="200" height="200"/>
</div>
<div id="education">
    <p class="leftcase">Moja edukacja</p>
    <a href="/first" class="elements">
        <span class="glyphicon glyphicon-sort-by-alphabet"></span>
        <p class="link">1. Studia semestr I  (2016/2017)</p>
    </a>
    <a href ="/products">
        <p class="link">2. Studia semestr II  (2016/2017)</p>
    </a>
    <a href ="trzecisemestr.html">
        <p class="link">3. Studia semestr III (2017/2018)</p>
    </a>
</div>
<div id="hobby">
    <p class="rightcase">Moje hobby</p>
    <a href ="ksiazki.html">
        <p class="link">1. Książki</p>
    </a>
    <a href ="seriale.html">
        <p class="link">2. Seriale</p>
    </a>
    <a href ="podroze.html">
        <p class="link">3. Podróże</p>
    </a>
</div>


<a href="/products" class="elements">
    <span class="glyphicon glyphicon-sort-by-alphabet"></span>SORT VT
    </a>
<h1>wstęp</h1>
</body>
</html>
