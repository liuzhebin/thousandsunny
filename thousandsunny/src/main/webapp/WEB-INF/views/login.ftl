<#include "header.ftl">
<div class="container">
  <div class="row">
    	<h1 class="page-header col-md-4 col-xs-offset-4">��¼</h1>
  </div> 
  <form class="form-horizontal col-md-4 col-xs-push-4" action="/springdemo/user/login_validate" method="post">
    <div class="form-group">
      <label class="col-sm-3 control-label">�û���:</label>
      <div class="col-sm-9">
        <input type="text" class="form-control" id="name" name="name">
      </div>
    </div>
    <div class="form-group">
      <label class="col-sm-3 control-label">����:</label>
      <div class="col-sm-9">
        <input type="password" class="form-control" id="password" name="password">
      </div>
    </div>
    <div class="checkbox col-xs-offset-3">
      <label>
        <input type="checkbox" > ��ס���� 
      </label>
    </div>
    <div class="form-group">
    	 <button type="submit" class="btn btn-default  col-xs-offset-3">�ύ</button>
    </div>
  </form>
  <div class="row">
    	<h1 class="page-header col-md-4 col-xs-offset-4"></h1>
    </div> 
</div>
<#include "footer.ftl">