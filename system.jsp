<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content= "width=device-width, initial-scale=1.0">
<title>Insert title here</title>
</head>
<body>
<!-- <img src="https://media.tenor.com/UJakVJChQGEAAAAi/quickbooks-backing-you.gif" class="a"> -->
<img src="https://media.tenor.com/ZdW6XbAuAa0AAAAj/youtube-superchat.gif" class="a">
<!-- <h1 class="fade-in-text">"LUCK UNLEASHED WITH YOUR CLICK"<br><br>You Sealed Your Victory</h1> -->
<div class="container">
  <div class="row">
    <div class="col-md-12 text-center">
      <h3 class="animate-charcter">"OOPS ! NOT YOUR MOMENT"</h3>
      
    </div>
  </div>
</div>
<!--  <p  class="b">You Sealed Your Victory</p> -->
</body>

<style>
.a {
  margin-top: 100px;
  margin-left: 570px;
  width: 350px;
}

h1 {
  margin-top: 80px;
  text-align: center;
  color: yellow;
  opacity: 0; /* Initial opacity set to 0 for the fade-in effect */
}

body {
  background-color: #99cae7; /* Light gray background color */
}

@keyframes fadeIn {
  0% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}

.fade-in-text {
  animation: fadeIn 2s forwards; /* Change 2s to the desired duration */
}

.animate-charcter
{
   text-transform: uppercase;
  background-image: linear-gradient(
    -225deg,
    #231557 0%,
    #44107a 29%,
    #ff1361 67%,
    #fff800 100%
  );
  background-size: auto auto;
  background-clip: border-box;
  background-size: 200% auto;
  color: #fff;
  background-clip: text;
  text-fill-color: transparent;
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  animation: textclip 2s linear infinite;
  display: inline-block;
      font-size: 50px;
      margin-left:370px;
}

@keyframes textclip {
  to {
    background-position: 200% center;
  }
  
 
</style>
</html>