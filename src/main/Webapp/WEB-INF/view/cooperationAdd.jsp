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
    <script src="${ctx}/assets/users/js/cooperationAdd.js" type="text/javascript" charset="UTF-8"></script>
</head>
<!-- END HEAD -->

<!-- BEGIN BODY -->
<body class="page-container-bg-solid page-header-fixed page-sidebar-closed-hide-logo">
<!-- BEGIN HEADER & CONTENT DIVIDER -->
<div class="clearfix"> </div>
<!-- END HEADER & CONTENT DIVIDER -->
<div class="page-content">
	<div class="portlet box green">
	    <div class="portlet-title">
	        <div class="caption">商户新增</div>
	    </div>
	    <div class="portlet-body">
	     <form class="form-horizontal" id="cooperationAddForm" name="cooperationAddForm" >
	     	<div class="form-body">
		        <div class="form-group">
		        	<label class="control-label col-md-1"> 商户名称</label>
			         <div class="col-md-3">
			             <input type="text" class="form-control" id="cooperationName" name="cooperationName" >
			         </div>
		        	<label class="control-label col-md-1"> 所属省份</label>
		            <div class="col-md-3">
		                <select class="form-control" id="provinceCode" name="provinceCode">
		                	<option >请选择...</option>
		                </select>
		            </div>
		         	<label class="control-label col-md-1"> 所属行业</label>
		            <div class="col-md-3">
		                <select class="form-control" id="tradeCode" name="tradeCode">
		                	<option >请选择...</option>
		                </select>
		            </div>
		        </div>
		        <div class="form-group">
		            <label class="control-label col-md-1"> SROBOT</label>
		            <div class="col-md-3">
			             <input type="number" class="form-control" id="SROBOT" name="SROBOT" >
			         </div>
			         <label class="control-label col-md-1"> 微信客户</label>
		            <div class="col-md-3">
			             <input type="number" class="form-control" id="WECHAT" name="WECHAT" readonly>
			         </div>
			         <label class="control-label col-md-1"> 商户图片</label>
			         <div class="col-md-3">
                         <input type="file" id ="paperFile" name="file" onchange="fileUploadBtn('paperFile');">
                         <input type="hidden" class="form-control" id="picpath" name="picpath" readonly>
                     </div>
		        </div>
		        <hr>
		        <div class="form-group">
		        	<label class="control-label col-md-1"> 北京 </label>
			         <div class="col-md-2">
			             <input type="number" class="form-control" id="BEIJING" name="BEIJING" value="0">
			         </div>
		        	<label class="control-label col-md-1"> 天津 </label>
		            <div class="col-md-2">
		                <input type="number" class="form-control" id="TIANJIN" name="TIANJIN" value="0">
		            </div>
		         	<label class="control-label col-md-1"> 上海 </label>
		            <div class="col-md-2">
		                <input type="number" class="form-control" id="SHANGHAI" name="SHANGHAI" value="0">
		            </div>
		            <label class="control-label col-md-1"> 重庆 </label>
		            <div class="col-md-2">
			             <input type="number" class="form-control" id="CHONGQING" name="CHONGQING" value="0">
			         </div>
		        </div>
		        <div class="form-group">
		        	<label class="control-label col-md-1"> 河北 </label>
			         <div class="col-md-2">
			             <input type="number" class="form-control" id="HEBEI" name="HEBEI" value="0">
			         </div>
		        	<label class="control-label col-md-1"> 河南 </label>
		            <div class="col-md-2">
		                <input type="number" class="form-control" id="HENAN" name="HENAN" value="0">
		            </div>
		         	<label class="control-label col-md-1"> 云南 </label>
		            <div class="col-md-2">
		                <input type="number" class="form-control" id="YUNNAN" name="YUNNAN" value="0">
		            </div>
		            <label class="control-label col-md-1"> 辽宁 </label>
		            <div class="col-md-2">
			             <input type="number" class="form-control" id="LIAONING" name="LIAONING" value="0">
			         </div>
		        </div>
		        <div class="form-group">
		        	<label class="control-label col-md-1"> 黑龙江 </label>
			         <div class="col-md-2">
			             <input type="number" class="form-control" id="HEILONGJIANG" name="HEILONGJIANG" value="0">
			         </div>
		        	<label class="control-label col-md-1"> 湖南 </label>
		            <div class="col-md-2">
		                <input type="number" class="form-control" id="HUNAN" name="HUNAN" value="0">
		            </div>
		         	<label class="control-label col-md-1"> 安徽 </label>
		            <div class="col-md-2">
		                <input type="number" class="form-control" id="ANHUI" name="ANHUI" value="0">
		            </div>
		            <label class="control-label col-md-1"> 山东 </label>
		            <div class="col-md-2">
			             <input type="number" class="form-control" id="SHANDONG" name="SHANDONG" value="0">
			         </div>
		        </div>
		        <div class="form-group">
		        	<label class="control-label col-md-1"> 新疆 </label>
			         <div class="col-md-2">
			             <input type="number" class="form-control" id="XINJIANG" name="XINJIANG" value="0">
			         </div>
		        	<label class="control-label col-md-1"> 江苏 </label>
		            <div class="col-md-2">
		                <input type="number" class="form-control" id="JIANGSU" name="JIANGSU" value="0">
		            </div>
		         	<label class="control-label col-md-1"> 浙江 </label>
		            <div class="col-md-2">
		                <input type="number" class="form-control" id="ZHEJIANG" name="ZHEJIANG" value="0">
		            </div>
		            <label class="control-label col-md-1"> 江西 </label>
		            <div class="col-md-2">
			             <input type="number" class="form-control" id="JIANGXI" name="JIANGXI" value="0">
			         </div>
		        </div>
		        <div class="form-group">
		        	<label class="control-label col-md-1"> 湖北 </label>
			         <div class="col-md-2">
			             <input type="number" class="form-control" id="HUBEI" name="HUBEI" value="0">
			         </div>
		        	<label class="control-label col-md-1"> 广西 </label>
		            <div class="col-md-2">
		                <input type="number" class="form-control" id="GUANGXI" name="GUANGXI" value="0">
		            </div>
		         	<label class="control-label col-md-1"> 甘肃 </label>
		            <div class="col-md-2">
		                <input type="number" class="form-control" id="GANSU" name="GANSU" value="0">
		            </div>
		            <label class="control-label col-md-1"> 山西 </label>
		            <div class="col-md-2">
			             <input type="number" class="form-control" id="SHANXI1" name="SHANXI1" value="0">
			         </div>
		        </div>
		        <div class="form-group">
		        	<label class="control-label col-md-1"> 内蒙古 </label>
			         <div class="col-md-2">
			             <input type="number" class="form-control" id="NEIMENGGU" name="NEIMENGGU" value="0">
			         </div>
		        	<label class="control-label col-md-1"> 陕西 </label>
		            <div class="col-md-2">
		                <input type="number" class="form-control" id="SHANXI2" name="SHANXI2" value="0">
		            </div>
		         	<label class="control-label col-md-1"> 吉林 </label>
		            <div class="col-md-2">
		                <input type="number" class="form-control" id="JILIN" name="JILIN" value="0">
		            </div>
		            <label class="control-label col-md-1"> 福建 </label>
		            <div class="col-md-2">
			             <input type="number" class="form-control" id="FUJIAN" name="FUJIAN" value="0">
			         </div>
		        </div>
		        <div class="form-group">
		        	<label class="control-label col-md-1"> 贵州 </label>
			         <div class="col-md-2">
			             <input type="number" class="form-control" id="GUIZHOU" name="GUIZHOU" value="0">
			         </div>
		        	<label class="control-label col-md-1"> 广东 </label>
		            <div class="col-md-2">
		                <input type="number" class="form-control" id="GUANGDONG" name="GUANGDONG" value="0">
		            </div>
		         	<label class="control-label col-md-1"> 青海 </label>
		            <div class="col-md-2">
		                <input type="number" class="form-control" id="QINGHAI" name="QINGHAI" value="0">
		            </div>
		            <label class="control-label col-md-1"> 西藏 </label>
		            <div class="col-md-2">
			             <input type="number" class="form-control" id="XIZANG" name="XIZANG" value="0">
			         </div>
		        </div>
		        <div class="form-group">
		        	<label class="control-label col-md-1"> 四川 </label>
			         <div class="col-md-2">
			             <input type="number" class="form-control" id="SICHUANG" name="SICHUANG" value="0">
			         </div>
		        	<label class="control-label col-md-1"> 宁夏 </label>
		            <div class="col-md-2">
		                <input type="number" class="form-control" id="NINGXIA" name="NINGXIA" value="0">
		            </div>
		         	<label class="control-label col-md-1"> 海南 </label>
		            <div class="col-md-2">
		                <input type="number" class="form-control" id="HAINAN" name="HAINAN" value="0">
		            </div>
		            <label class="control-label col-md-1"> 台湾 </label>
		            <div class="col-md-2">
			             <input type="number" class="form-control" id="TAIWAN" name="TAIWAN" value="0">
			         </div>
		        </div>
		        <div class="form-group">
		        	<label class="control-label col-md-1"> 香港 </label>
			         <div class="col-md-2">
			             <input type="number" class="form-control" id="XIANGGANG" name="XIANGGANG" value="0">
			         </div>
		        	<label class="control-label col-md-1"> 澳门 </label>
		            <div class="col-md-2">
		                <input type="number" class="form-control" id="AOMEN" name="AOMEN" value="0">
		            </div>
		            <div class="col-md-1">
		            </div>
		            <div class="col-md-1">
			             <a class="btn green" onclick="countWechat()">微信客户数汇总</a>
			         </div>
		        </div>
	        </div>
	        <div class="form-actions">
	            <div class="row">
	                <div class="col-md-offset-5 col-md-7">
	                    <a class="btn default" onclick="window.location.href='../';">返回</a>&nbsp;
					 	<button class="btn green" onclick="countWechat()">保存</button>
	                    </div>
	                </div>
	            </div>
	        </form>
        </div>
    </div>
</div>
</body>
</html>