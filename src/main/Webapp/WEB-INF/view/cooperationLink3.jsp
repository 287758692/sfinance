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
    <script src="${ctx}/assets/users/js/cooperationLink3.js" type="text/javascript"></script>
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
        <div class="caption">推广用户列表</div>
    </div>
    <div class="portlet-body">
        <div id="sample_2_wrapper" class="dataTables_wrapper no-footer">
            <div class="row margin-bottom-10">
                <div class="col-md-12 text-right">
                    <a href="#orgAdd" data-toggle="modal" class="btn green"><i class="fa fa-plus"></i> 新增 </a>
                </div>
            </div>
           	<table id="cooperationLinkDg" class="table table-striped table-bordered table-hover"></table>
        </div>
    </div>
</div>
</div>
<!-- END CONTAINER -->
<!--BEGIN MODEL-->
<div id="orgAdd" class="modal fade" tabindex="-1">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">
                    <span>新增</span>
                </h4>
            </div>
            <div class="modal-body">
                <form id="orgForm" name="orgForm" novalidate="novalidate">
                    <div class="form-body">
                        <input type="hidden" class="form-control" id="Parent" name="Parent" value="${Parent}">
                        <div class="form-group form-md-line-input form-md-floating-label">
                            <input type="text" id="name" name="name" class="form-control" aria-required="true">
                            <label>名称</label>
                        </div>
                    </div>
                    <div class="form-actions">
                        <button type="button" class="btn default close-button" data-dismiss="modal">取消</button>
                        <button type="submit" class="btn green "><span>保存</span></button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<!--END MODEL-->
</body>
</html>