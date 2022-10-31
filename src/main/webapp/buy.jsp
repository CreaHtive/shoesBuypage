<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.104.2">
    <title>Checkout example · Bootstrap v5.2</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/checkout/">

    

    

<link href="	https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }

      .b-example-divider {
        height: 3rem;
        background-color: rgba(0, 0, 0, .1);
        border: solid rgba(0, 0, 0, .15);
        border-width: 1px 0;
        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
      }

      .b-example-vr {
        flex-shrink: 0;
        width: 1.5rem;
        height: 100vh;
      }

      .bi {
        vertical-align: -.125em;
        fill: currentColor;
      }

      .nav-scroller {
        position: relative;
        z-index: 2;
        height: 2.75rem;
        overflow-y: hidden;
      }

      .nav-scroller .nav {
        display: flex;
        flex-wrap: nowrap;
        padding-bottom: 1rem;
        margin-top: -1px;
        overflow-x: auto;
        text-align: center;
        white-space: nowrap;
        -webkit-overflow-scrolling: touch;
      }
    </style>

    
    <!-- Custom styles for this template -->
    <link href="form-validation.css" rel="stylesheet">
  </head>
  <body class="bg-light">
    
<div class="container">
  <main>
    <div class="py-5 text-center">
      <img class="d-block mx-auto mb-4" src="../assets/brand/bootstrap-logo.svg" alt="" width="72" height="57">
      <h2>결제하기</h2>
      
    </div>

    <div class="row g-5">
      <div class="col-md-5 col-lg-4 order-md-last">
        <h4 class="d-flex justify-content-between align-items-center mb-3">
          <span class="text-primary">Your cart</span>
          <span class="badge bg-primary rounded-pill">3</span>
        </h4>
        <ul class="list-group mb-3">
          
        	<!-- 제품이름이랑 가격 -->
          <li class="list-group-item d-flex justify-content-between lh-sm">
            <div>
              <h6 class="my-0">product name</h6>
              <small class="text-muted">${dto.product_name }</small>
            </div>
          </li>
          
           <li class="list-group-item d-flex justify-content-between lh-sm">
            <div>
              <h6 class="my-0">product size</h6>
              <small class="text-muted">${dto.product_size }</small>
            </div>
          </li>
           <li class="list-group-item d-flex justify-content-between lh-sm">
            <div>
              <h6 class="my-0">product price</h6>
              <small class="text-muted">${dto.product_price }</small>
            </div>
          </li>
          
          
           <li class="list-group-item d-flex justify-content-between lh-sm">
            <div>
              <h6 class="my-0">product quantity</h6>
              <small class="text-muted">${dto.cart_product_quantity }</small>
            </div>
          </li>
          
          
          
          
          <li class="list-group-item d-flex justify-content-between">
            <span>Total price</span>
            <strong>${dto.product_price * dto.cart_product_quantity }</strong>
          </li>
        </ul>

        
      </div>
      
      
      
      
      <div class="col-md-7 col-lg-8">
        <h4 class="mb-3">Billing address</h4>
        
        
        <form class="needs-validation" action="payment.do" method="post" novalidate>
        
        								<!--  payment.o 실행시켜서 order에 insert함 -->
        								
          <div class="row g-3">

            <div class="col-12">
              <label for="username" class="form-label">Username</label>
              <div class="input-group has-validation">
            
                <input type="text" class="form-control" id="username" placeholder="Username" required>
              <div class="invalid-feedback">
                  Your username is required.
                </div>
              </div>
            </div>

            
            <div class="col-12">
              <label for="address" class="form-label">Address</label>
              <input type="text" class="form-control" id="address" placeholder="1234 Main St" required>
              <div class="invalid-feedback">
                Please enter your shipping address.
              </div>
            </div>

            
          </div>

          <hr class="my-4">

          <button class="w-100 btn btn-primary btn-lg" type="submit">결제하기</button>
          									<!--  payment.o 실행시켜서 order에 insert함 -->
        </form>
      </div>
    </div>
  </main>

  
</div>


    <script src="../assets/dist/js/bootstrap.bundle.min.js"></script>

      <script src="form-validation.js"></script>
  </body>
</html>
