<!doctype html>
<%@page import="java.util.Map"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.qa.models.Book"%>
<html class="no-js" lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Shopping Cart | Week 3</title>
    <link rel="stylesheet" href="css/style.css">
    
    
  </head>
  <body>
    
    <form action="/checkoutProcess" method="post">
    
    
    <%
    
    double orderTotal = (Double) request.getAttribute("order_total");
    
   
    %>
    
   

<!-- Start Top Bar -->
    <div class="top-bar">
      <div class="top-bar-left">
        <ul class="menu">
          <li class="menu-text" style="color:red">Online Shopping</li>
          <li><a href="#">Home</a></li>
          
        </ul>
      </div>
      <div class="top-bar-right">
        
             <ul class="dropdown menu" data-dropdown-menu>
            <li id="cart_items"></li>
            <li class="has-submenu">
              <a href="/viewCart"> <img src="images/cart.jpg" width="50" height="50"/></a>
              <ul class="submenu menu vertical" data-submenu>
                <li><a href="/viewCart"><img src="images/cart.jpg" width="50" height="50"/> View Cart </a></li>
                <li><a href="/login">Register | Login</a></li>
              </ul>
            </li>
            <li><a href="#">About Us</a></li>
            <li><a href="#">Contact</a></li>
          </ul>
          
      </div>
    </div>
    <!-- End Top Bar -->
    <br>
    <!-- You can now combine a row and column if you just need a 12 column row -->
    <div class="row columns">
      <nav aria-label="You are here:" role="navigation">
        <ul class="breadcrumbs">
         
          <li><a href="/">Home</a></li>
          <li>
            <span class="show-for-sr">Current: </span> Payment Details
          </li>
        </ul>
      </nav>
    </div>

    <div class="row">
 
      <div class="medium-6 columns">
      
       <h2> Payment Details  </h2>
        
        <div class="row small-up-shiping">
        
          <div class="columns">
            <label> Firstname * </label>
            <input type="text" name="firstName" id="firstName" size="30"/> 
          </div>
          <div class="columns">
             <label> Lastname * </label>
            <input type="text" name="lastName" id="lastName" size="30"/>
          </div>
          
          <div class="column">
           <label> Address 1 * </label>
            <input type="text" name="addressLine1" id="addressLine1" size="30"/>
          </div>
          <div class="column">
            <label> Address 2 * </label>
            <input type="text" name="addressLine2" id="addressLine2" size="30"/>
          </div>
          <div class="column">
            <label> City * </label>
            <input type="text" name="city" id="city" size="30"/>
          </div>
          
       <!--    <div class="column">
            <label> Postcode / Zip code * </label>
            <input type="text" name="postcode" id="postcode" size="30"/>
          </div>
          
          <div class="column">
            <label> State/Province * </label>
            <input type="text" name="state" id="state" size="30"/>
          </div> -->
          
   <!--        <div class="column">
            <label> Country</label>
            <input type="text" name="country" id="country" size="30"/>
          </div>
          
           <div class="column">
            <label> Phone Number</label>
            <input type="text" name="phone" id="phone" size="30"/>
          </div>
          
          
           <div class="column">
            <label> Email * </label>
            <input type="text" name="email" id="email" size="30"/>
          </div>
          
          
          <div class="column">
            <input type="checkbox" name="same" id="same"/> My billing and shipping address are the same
          </div> -->
          
        </div>
        
        <div class="row small-up-4">
          
          <div class="column">
           
          </div>
        
        </div>
        
        <hr>
      
      </div>
      <div class="medium-6 large-5 columns">
        <%-- <h3>Order Summary </h3>
        <p> </p>

        <div class="row">
          <div class="small-3 columns">
            <label for="middle-label" class="middle">Cart Total</label>
          </div>
          <div class="small-3 columns">
             
            <label for="middle-label" class="middle" id="cart_total_label">$<%=orderTotal %></label>
           </div>
           
       </div>



          <div class="row">
          <div class="small-3 columns">
            <label for="middle-label" class="middle">VAT </label>
          </div>
          <div class="small-3 columns">
            <label for="middle-label" class="middle">Applicable Tax </label>
           </div>
           
        </div>
    
        <div class="row">
          <div class="small-3 columns">
            <label for="middle-label" class="middle">Order Total  </label>
          </div>
          <div class="small-3 columns">
          
            <label for="middle-label" class="middle" id="order_total_label">$<%=orderTotal%></label>
           </div>
      
        </div>

		  
		<input type="hidden" name="order_total" value="<%=orderTotal %>"/>   
        <input type="submit" class="button large expanded" value="Checkout"/>
        --%>
      </div>  
   
 </div>
    <script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
    <script src="js/elsevier.js"></script>
    <script src="js/update_cart.js"></script>
    
    <script src="js/validations.js"></script>
    <script>
      $(document).foundation();
    </script> 
    
   </form>
  </body>
</html>


    