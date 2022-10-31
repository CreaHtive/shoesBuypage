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
  

<style>
   @import url('https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800,900&display=swap');
   
   *{
	  margin:0;
	  padding:0;
	  box-sizing:border-box;
	  font-family: 'Poppins',sans-serif;  	
   }
   body{
   display:flex;
   flex-direction:column;
   	justify-content: center;
   	align-items:center;
   	min-height: 100vh;
   	background: linear-gradient(lightgray,lightgray 50%,#fff 50%,#fff 100%);
   }
   .card{
   	position:relative;
   	width:400px;
   	height: 500px;
   	background:#000;
   	box-shadow: 0 15px 45px rgba(0,0,0,0.1);
   	display: flex;
   	overflow: hidden;
   	transition:0.5s ease-in-out;
   }
   .card:hover{
   	width: 800px;
   }
   .card .imgBx{
   	position:relative;
   	min-width:400px;
   	height:100%;
   	background:#fff;
   	display:flex;
   	justify-content: center;
   	align-items:center;
   	overflow: hidden;
   }
   .card .imgBx img{
   	width:400px;
   	max-width:250px;
   	transition: 0.5s ease-in-out;
   }
   .card:hover .imgBx img{
   
   	transform:rotate(-35deg) translateX(-20px);
   	
   }
   .card .details{
   	position: relative;
   	min-width:400px;
   	height: 100%;
   	background:lightgray;
   	display:flex;
   	justify-content: center; 
   	/* align-items: center; */
   	padding:20px;
   	flex-direction:column;
   }
   .card .details::before{
   	content: '';
   	position:absolute;
   	left:0;
   	width:0;
   	height:0;
   	border-top: 10px solid transparent;
   	border-bottom: 10px solid transparent;
   	border-left: 10px solid #fff;
   	
   }
   .card .details h3{
   	color: black;
   	text-transform: uppercase;
   	font-weight:600;
   	font-size:1.5em;
   	line-height:1em;
   }
    .card .details h3 span{
    	font-size: 0.65em;
    	font-weight:300;
    	text-transfom:none;
    	opacity:0.85;
    
    }
    .card .details h4{
    	color:black;
    	text-transform:uppercase;
    	font-weight:600px;
    	font-size:0.9em;
    	margin-top:20px;
    	margin-bottom:10px;
    	line-height: 1em;
    }
      .card .details .size{
      	display:flex;
      	gap:10px;
      }
      .card .details .size li{
      	list-style:none;
      	color:black;
      	font-size:0.9em;
      	width:40px;
      	height:40px;
      	border:2px solid #000;
      	display:flex;
      	justify-content: center;
      	align-items: center;
      	font-weight: 500;
      	opacity:0.65;
      	cursor: pointer;
      }
      .card .details .size li:hover{
      	color: #black;
      	background: #fff;
      }
      .card .details .group{
      	position:relative;
      	display:flex;
      	justify-content: space-between;
      	align-items: center;
		margin-top:20px;
      }
      .card .details .group a{
      	display:inline-flex;
      	padding: 10px 25px;
      	background:#fff;
      	text-decoration:none;
      	text-tansform: uppercase;
      	font-weight: 500;
      	color: black;
      }
      .explain{
      	max-width:800px;
      }
      
</style>

</head>

<body>
	
	<div class="card">
		<div class="imgBx">
		<img src="images/${detail_view.product_image }.png">
		</div>
		<div class="details">
			<h3>product-name: ${detail_view.product_name }<br><span>product-brand:${detail_view.product_brand }</span></h3>
			
			<p>이걸 신은 사람은 멋있어요~</p>
			<h4>Size</h4>
			<ul class="size">
				<li>230</li>
				<li>240</li>
				<li>250</li>
				<li>260</li>
				<li>270</li>
				<li>280</li>
				<li>290</li>
			</ul>
			<div class="group">
				<h4>price:&#8361;${detail_view.product_price }</h4>
				<a href="#">Buy Now</a>
			</div>
			
		</div>
	</div>
	<div class="explain">
		<h2>product_detail</h2>
		<h4>${detail_view.product_info }</h4>
	</div>
	


</body>
</html>