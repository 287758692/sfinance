<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" /> 
<!DOCTYPE html >
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!--> <html lang="en" class="no-js"> <!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
    <meta charset="utf-8" />
    <link href="${ctx}/assets/users/img/logo.png" rel="shortcut icon" />
    <title>忻铭科技</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1" name="viewport" />
    <meta content="" name="description" />
    <meta content="" name="author" />
    
	<script type="text/javascript">
		var ctx = "${ctx}";
	</script>
	
	<%@ include file="common/importCss.jsp"%>
    <%@ include file="common/importJs.jsp"%>
    <script src="${ctx}/assets/users/js/cooperationList.js" type="text/javascript"></script>
</head>
<!-- END HEAD -->

<!-- BEGIN BODY -->
<body class="page-container-bg-solid page-header-fixed page-sidebar-closed-hide-logo">

<!-- BEGIN HEADER & CONTENT DIVIDER -->
<div class="clearfix"> </div>
<!-- END HEADER & CONTENT DIVIDER -->

<!-- BEGIN CONTAINER -->
<div class="page-content">
<div class="portlet box green">
    <div class="portlet-title">
        <div class="caption">合作商户列表</div>
    </div>
    <div class="portlet-body">
        <div id="sample_2_wrapper" class="dataTables_wrapper no-footer">
        	<div id="userTb">
             <div class="row">
                 <div class="col-md-3">
                     <label class="control-label">商户名称</label>
                     <input type="text" class="form-control" id="cooperationName">
                 </div>
             </div>
             <div class="row margin-bottom-10">
                 <div class="col-md-12 text-right">
                     <button class="btn default" onclick="initTable()"><i class=" fa fa-search"></i> 查询 </button>
                     <a href="${ctx}/Cooperation/addView" data-toggle="modal" class="btn green"><i class="fa fa-plus"></i> 新增 </a>
                    </div>
             </div>
            </div>
           	<table id="cooperationDg" class="table table-striped table-bordered table-hover"></table>
        </div>
    </div>
</div>
</div>
<!-- END CONTAINER -->
</body>
</html>