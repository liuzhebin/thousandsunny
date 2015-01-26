<#include "header.ftl">
<div class="container">
  <div class="row">
    <nav class="navbar navbar-default ">
      <div class="navbar-header">
        <button type="button" class="btn btn-default navbar-toggle collapsed" data-toggle="collapse" data-target="#bar_body"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
        <a class="navbar-brand" href="">ThousandSunny</a> </div>
      <div id="bar_body" class="navbar-collapse collapse">
        <ul class="nav navbar-nav">
          <li class="active"><a href="#">��ҳ</a></li>
          <li><a href="#">����</a></li>
          <li><a href="#">��Ŀ</a></li>
          <li><a href="#">�ĵ�</a></li>
          <li><a href="#">����</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
        <#if Request.user?exists>  
	       	<li><a>���,${Session.user.name}!</a></li>
	       	 <li><a href="#"><span class="glyphicon glyphicon-envelope"></span><span class="badge">42</span></a></li>
	    <#else>
			<li><a href="user/login">��¼</a></li>
          	<li class="divider"></li>
          	<li><a href="#">ע��</a></li>
		 </#if>  
        </ul>
         <form class="navbar-form navbar-right" role="search">
          <div class="form-group-sm input-group">
         	 <span class="input-group-addon"><span class="glyphicon glyphicon-search"></span></span>
            <input type="text" class="form-control form-control-static" placeholder="Search">
          </div>
        </form>
      </div>
    </nav>
  </div>
   <div class="row">
    <div class="col-md-2">
      <div class="row">
        <div class="list-group col-md-11 text-center" id="nav">
          <div class="list-group-item">
            <h4 class="panel-title"><a data-toggle="collapse" data-parent="#nav" href="#nav1">��Ʒ����<span class="caret"></span></a></h4>
            <div id="nav1" class="panel-collapse collapse">
              <div class="panel-body"> <a href="http://www.baidu.com" target="main">body</a><br>
              </div>
            </div>
          </div>
          <div class="list-group-item">
            <h4 class="panel-title"><a data-toggle="collapse" data-parent="#nav" href="#nav2">�ͻ�����<span class="caret"></span></a></h4>
            <div id="nav2" class="panel-collapse collapse">
              <div class="panel-body"> <a href="http://www.baidu.com" target="main">body</a> </div>
            </div>
          </div>
          <div class="list-group-item">
            <h4 class="panel-title"><a data-toggle="collapse" data-parent="#nav" href="#nav3">���ݹ���<span class="caret"></span></a></h4>
            <div id="nav3" class="panel-collapse collapse">
              <div class="panel-body"> <a href="http://www.baidu.com" target="main">body</a> </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class=" col-md-10">
       <div class="row">
        <ol class="breadcrumb">
	        <li><a href="#">Home</a></li>
	        <li><a href="#">Library</a></li>
	        <li class="active">Data</li>
     	 </ol>
          <div class="panel-group col-md-12">
            <div class="panel panel-default">
              <div class="panel-body" style="padding:0px">
                <div class="embed-responsive embed-responsive-4by3">
                  <iframe name="main" class="embed-responsive-item" src="http://www.bootcss.com/"> </iframe>
                </div>
              </div>
            </div>
          </div>

      </div>
    </div>
  </div>
</div>
<#include "footer.ftl">