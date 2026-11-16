<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../include/title.jsp" />
</head>
<body>

    <h2>SIGN-UP FORM</h2>
  
  <jsp:include page="../include/nav.jsp" />
  
  <br><br>
  
  <form action="/firstpjt/signup_confirm.mem" method="post">
      <input type="text" name="memId" placeholder="Input new member ID!!">
      <br>
      <input type="password" name="memPw" placeholder="Input new member PW!!">
      <br>
      <input type="email" name="memMail" placeholder="Input new member MAIL!!">
      <br>
      <input type="phone" name="memPhone" placeholder="Input new member PHONE!!">
      <br>
      <input type="submit" value="SIGNUP">
      <input type="reset" value="RESET">
  </form>

</body>
</html>