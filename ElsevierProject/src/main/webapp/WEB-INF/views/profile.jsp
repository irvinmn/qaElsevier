<!doctype html>
<%@page import="com.qa.models.Customer"%>
<html class="no-js" lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Online Shopping </title>
    <link rel="stylesheet" href="css/style.css">
  </head>
  <body>
  
  <%!
  
  Customer c;
  
  %>
  
  
  <%
 		c = (Customer) session.getAttribute("logged_in_customer");
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
            
            <li><a href="/profile">Personal Details</a></li>
            <li><a href="/addressBook">Address Book</a></li>
            <li><a href="#">Change Password </a></li>
            <li><a href="#">Order History </a></li>
             <li><a href="/logout">Logout</a></li>
            <li class="has-submenu">
              <a href="/viewCart"> <img src="images/cart.jpg" width="50" height="50"/></a>
              <ul class="submenu menu vertical" data-submenu>
                <li><a href="/viewCart"><img src="images/cart.jpg" width="50" height="50"/></a></li>
               
              </ul>
            </li>
            
          </ul>
          
      </div>
    </div>
    <!-- End Top Bar -->

    <div class="callout large">
      <div class="row column text-center">
        
        <h3>You have logged in as <%=c.getFirstName() %></h3>
       </div>
       
       
       <div class="row column">
        
        <form action="/updateProfile" method="post">
        <div class="medium-6">
           <h3> Account details </h3>
                
                
               <label>Firstname * </label>
               <input type="text" placeholder="Enter firstname" name="firstName" id="firstName" value="<%=c.getFirstName() %>"/> 
               <label>Lastname * </label>
               <input type="text" placeholder="Enter lastname" name="lastName" id="lastName" value="<%=c.getLastName()%>"/> 
               <label>Email ID * </label>
                <input type="text" placeholder="Enter email" name="email" id="email" value="<%=c.getEmail()%>"/> 
                
            </div>
            
          
      		
      		<input type="submit" class="button create account" value="Update Account">
              
              </form>
    
      
      
      </div>
       
       
       
       
       
       
       
    </div>
    
    <script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
    <script src="js/elsevier.js"></script>
    <script>
      $(document).foundation();
    </script>
  </body>
</html>


    