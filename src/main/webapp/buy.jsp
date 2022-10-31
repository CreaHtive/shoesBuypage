<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<form action="payment.do" method = "post">

이름 : <input type = "text" name = "name" >${buy_view.customer_name }<br>
주소 : <input type = "text" name = "address" >${buy_view.customer_address }<br>

제품이름 : ${buy_view.product_name }
제품사이즈 : ${buy_view.product_size }
주문수량 : ${buy_view.cart_product_quantity }
제품가격 : ${buy_view.product_name }


<input type = "submit" value = "결제하기">


</form>










</body>
</html>