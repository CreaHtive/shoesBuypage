<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">

    <style>
      .apple{
        margin-right: 5px;
      }
      .binfo {
        margin-left: 5px;
      }

      .cardBtm {
        margin-bottom: 24px;
        margin-right: 0px;
        border-radius: 10px;
      }
      .menu {
        background-color: #EAEAEA;
      }

      .btns {
        border: 0 solid black;
        transition: background-color .5s;
      }

      .btns:hover {
        background-color: #6F38C5;
      }
      
      .cardBox {
      	padding: 10px;
      	font-size: 15px;
      }
      td{
      	width:120px;
      }
    </style>

</head>

<body>
	
<nav class="py-2 border-bottom menu">
      <div class="container d-flex flex-wrap">
        <ul class="nav me-auto">
        <li class="nav-item">
            <a href="list.do" class="nav-link link-dark px-2 active" aria-current="page">All</a>
          </li>
          <li class="nav-item">
            <a href="menlist.do" class="nav-link link-dark px-2 active" aria-current="page">Men</a>
          </li>
          <li class="nav-item">
            <a href="womenlist.do" class="nav-link link-dark px-2" aria-current="page">Women</a>
          </li>
          <li class="nav-item">
            <a href="kidslist.do" class="nav-link link-dark px-2">Kids</a>
          </li>
        </ul>
        <ul class="nav">
          <li class="nav-item">
            <a href="#" class="nav-link link-dark px-2">Login</a>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link link-dark px-2">Sign up</a>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link link-dark px-2"><i class="bi bi-person-fill"></i></a>
          </li>
        </ul>
      </div>
    </nav>

    <header class="py-3 mb-4 border-bottom">
      <div class="container d-flex flex-wrap justify-content-center">
        <a href="index.jsp" class="d-flex align-items-center mb-3 mb-lg-0 me-lg-auto text-dark text-decoration-none">
          <i class="bi bi-apple apple"></i>
          <span class="fs-4">AAA Mart Admin</span>
        </a>
        <form class="col-11 col-lg-auto mb-3 mb-lg-0">
          <input type="search" style="border-radius: 15px;" class="form-control a" placeholder="Search..." aria-label="Search" />
        </form>
        <form class="col-1 col-lg-auto mb-3 mb-lg-0">
          <button type="button" style="border-radius: 15px;" class="btn btns btn-secondary binfo">search</button>
        </form>
      </div>
    </header>
    <!-- 헤더 끝 ! -->


	<div class="box container text-center">
		<div class="row justify-container-center">
		
			<c:forEach items="${list}" var="dto">
				<div class="col-md">
				<div class="card cardBtm" style="width: 18rem;">
				<div class="card-body">
					<img style="margin-bottom: 20px; border-radius: 5px; height:250px;" src="images/${dto.product_image}.png" class="card-img-top" alt="...">
					<table class="card cardBox">
						<tr>
							<td>제품번호</td><td>${dto.product_name}</td>
						</tr>
						<tr>
							<td>가격</td><td>${dto.product_price}</td>
						</tr>
						<tr>
							<td>카테고리</td><td>${dto.product_category}</td>
						</tr>
						<tr>
							<td>브랜드</td><td>${dto.product_brand}</td>
						</tr>
						<tr>
							<td>구매갯수</td><td><select name="cart_product_quantity">
							
							<%for(int i =1; i<=10; i++){
							out.println( "<option value ="+i+">"+i+"</option>"); //여기있는 cart_product_quantity 정보를 보내줘야함
							
							} %></select>  
							
							
							 </td>
						</tr>
						
						
					</table>
					<a href="detail_view.do?id=${dto.product_id}" class="btn btns btn-secondary">상세 페이지</a>
					
					
					<a href="cart.do?id=${dto.product_id}" class="btn btns btn-secondary">구매하기</a>
					
					<!-- cart로 정보를 넘겨줌 이후 cart에서 구매하기 창으로 넘어감 -->
					
					<!-- 여기서 구매하는 제품의 숫자도 정보로 넘겨줘야함 -->
					
					
					
					
					
					
				</div>
				</div>
				</div>
			</c:forEach>
			
		</div>
	</div>

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" ></script>
</body>
</html>
