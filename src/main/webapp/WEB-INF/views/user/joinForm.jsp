<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
   <form action="/join" method="post">
      <div class="form-group">
         <input type="text" name="username" class="form-control" placeholder="Enter UserName" required="required">
      </div>
      <div class="form-group">
         <input type="password" name="password" class="form-control" placeholder="Enter password" required="required">
      </div>
      <div class="from-group">
         <input type="email" name="email" class="form-control" placeholder="Enter email">
      </div>
      <button type="submit" class="btn btn-primary">회원가입</button>
      <!-- 버튼이 submit 타입이어야 사용 됨. button 안됨. type 설정 없으면 Default는 Submit -->
   </form>
</div>


<%@ include file="../layout/footer.jsp"%>