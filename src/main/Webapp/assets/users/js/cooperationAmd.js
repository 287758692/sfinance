$(document).ready(function () {      
	//下拉框初始化
	combobox();
	//表单校验及提交
	confirmForm();
}); 

function combobox(){
	$.ajax({
        url : ctx+"/Province/select",
        type : "post",
        dataType : "json",
        success:function(data){
	        $.each(data, function (i, item) {
	        	if(item.provinceCode == provinceCode){
	        		$("#provinceCode").append("<option value='" + item.provinceCode + "' selected>" + item.provinceName + "</option>");
	        	}else{
	        		$("#provinceCode").append("<option value='" + item.provinceCode + "'>" + item.provinceName + "</option>");
	        	}
	        });
        }
    });
	$.ajax({
        url : ctx+"/Trade/select",
        type : "post",
        dataType : "json",
        success:function(data){
	        $.each(data, function (i, item) {
	        	if(item.tradeCode == tradeCode){
	        		$("#tradeCode").append("<option value='" + item.tradeCode + "' selected>" + item.tradeName + "</option>");
	        	}else{
	        		$("#tradeCode").append("<option value='" + item.tradeCode + "'>" + item.tradeName + "</option>");
	        	}
	        });
        }
    });
}

function countWechat(){
	var Wechat = parseInt($("#BEIJING").val(),10)+parseInt($("#TIANJIN").val(),10)+parseInt($("#SHANGHAI").val(),10)+parseInt($("#CHONGQING").val(),10)
			   + parseInt($("#HEBEI").val(),10)+parseInt($("#HENAN").val(),10)+parseInt($("#YUNNAN").val(),10)+parseInt($("#LIAONING").val(),10)
			   + parseInt($("#HEILONGJIANG").val(),10)+parseInt($("#HUNAN").val(),10)+parseInt($("#ANHUI").val(),10)+parseInt($("#SHANDONG").val(),10)
			   + parseInt($("#XINJIANG").val(),10)+parseInt($("#JIANGSU").val(),10)+parseInt($("#ZHEJIANG").val(),10)+parseInt($("#JIANGXI").val(),10)
			   + parseInt($("#HUBEI").val(),10)+parseInt($("#GUANGXI").val(),10)+parseInt($("#GANSU").val(),10)+parseInt($("#SHANXI1").val(),10)
			   + parseInt($("#NEIMENGGU").val(),10)+parseInt($("#SHANXI2").val(),10)+parseInt($("#JILIN").val(),10)+parseInt($("#FUJIAN").val(),10)
			   + parseInt($("#GUIZHOU").val(),10)+parseInt($("#GUANGDONG").val(),10)+parseInt($("#QINGHAI").val(),10)+parseInt($("#XIZANG").val(),10)
			   + parseInt($("#SICHUANG").val(),10)+parseInt($("#NINGXIA").val(),10)+parseInt($("#HAINAN").val(),10)+parseInt($("#TAIWAN").val(),10)
			   + parseInt($("#XIANGGANG").val(),10)+parseInt($("#AOMEN").val(),10);
	$("#WECHAT").append().val(Wechat);
}

function confirmForm() {
    $("#cooperationAmdForm").validate({
      submitHandler : function() {  //验证通过后的执行方法
          //当前的form通过ajax方式提交（用到jQuery.Form文件）
      	var param = $("#cooperationAmdForm").serialize();
          $.ajax({
              url : ctx+"/Cooperation/amdConfirm",
              type : "post",
              dataType : "json",
              data: param,
              success:function(data){
                  if(data.isSuc){
                	  document.getElementById("cooperationAmdForm").reset(); 
                      swal({title: '成功',
                		  text: data.errMsg,
                		  type: 'success',
                		  confirmButtonText: '确定',
                      },function(){
                    	  history.go(-1);
                      }); 
                  }else{
                  	swal("失败", data.errMsg, "error"); 
                  }
                }
              });
      },
      focusInvalid : true,   //验证提示时，鼠标光标指向提示的input
      rules : {
    	  cooperationName : {  
	            required : true,   //验证非空
        },  
        tradeCode : {  
              required : true,   //验证非空
  	  	}, 
  	  	provinceCode : {  
	          required : true,   //验证非空
	  	}, 
	  	SROBOT : {  
	          required : true,   //验证非空
	  	}, 
      },   
      errorElement : "small",
      errorClass : "font-red",
      highlight : function(element, errorClass,validClass) {
        $(element).closest('.form-control').addClass('border-red');
      },
      success : function(element) {
        $(element).siblings('.form-control').removeClass('border-red');
        $(element).remove();
      }
    });
  }

function fileUploadBtn(file){
	
	var files = $("#"+file).val();
	var strFileName=files.replace(/^.+?\\([^\\]+?)(\.[^\.\\]*?)?$/gi,"$1");  //正则表达式获取文件名，不带后缀
	var FileExt=files.replace(/.+\./,"");   //正则表达式获取后缀
	var fileName = strFileName+"."+FileExt;
	
	$.ajaxFileUpload({
		url : ctx+"/upload/file",
		secureuri : false,
		fileElementId : file,
		type : 'post',
		dataType : 'json',
		data:{
			"filename":fileName,
		},
		success : function(data){
			console.log("picpath:"+data.fileName);
			$("#picpath").val(data.fileName);
		}
	});
}