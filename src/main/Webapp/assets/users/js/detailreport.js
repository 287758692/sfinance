$(document).ready(function () { 
	//初始化List
	initTable(); 
	//表单校验及提交
	confirmForm();
}); 

function initTable(){
	$('#detailReportDg').bootstrapTable('destroy');  
	
	$('#detailReportDg').bootstrapTable({
	    method: 'get',
	    //toolbar: '#phoneTb',    //工具按钮用哪个容器
	    striped: true,           //是否显示行间隔色
	    cache: false,            //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
	    pagination: true,        //是否显示分页（*）
	    sortable: false,         //是否启用排序
	    sortOrder: "asc",        //排序方式
	    pageNumber:1,            //初始化加载第一页，默认第一页
	    pageSize: 10,            //每页的记录行数（*）
	    pageList: [10, 20],      //可供选择的每页的行数（*）
	    url: ctx+"/detailreportController/list",//这个接口需要处理bootstrap table传递的固定参数
	    //设置为undefined可以获取pageNumber，pageSize，searchText，sortName，sortOrder  
	    //设置为limit可以获取limit, offset, search, sort, order  
	    queryParamsType : "undefined",  
        queryParams: function queryParams(params) {   //设置查询参数  
            var param = {    
                pageNumber: params.pageNumber,    
                pageSize: params.pageSize,
                RPType : $("#RPType").val(),
                cooperationId : cooperationId
            };    
            return param;                   
          }, 
	    sidePagination: "server", //分页方式：client客户端分页，server服务端分页（*）
	    //search: true,           //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
	    //strictSearch: true,
	    //showColumns: true,      //是否显示所有的列
	    //showRefresh: true,      //是否显示刷新按钮
	    minimumCountColumns: 2,   //最少允许的列数
	    clickToSelect: false,     //是否启用点击选中行
	    searchOnEnterKey: true,
	    columns: [{
	        field: 'detailId',
	        title: '序号',
	        align: 'center',
	        visible:false
	    },{
	        field: 'cooperationName',
	        title: '商户名称',
	        align: 'center'
	    },{
	        field: 'RPType',
	        title: '统计类型',
	        align: 'center'
	    },{
	        field: 'RPSeq',
	        title: '统计顺序',
	        align: 'center',
	        editable: {
                type: 'text',
                title: '统计顺序',
                validate: function (v) {
                    if (!v) return '不能为空';

                }
            }
	    },{
	        field: 'RPName',
	        title: '统计名称',
	        align: 'center',
	        editable: {
                type: 'text',
                title: '统计名称',
                validate: function (v) {
                    if (!v) return '不能为空';

                }
            }
	    },{
	        field: 'RPDATA',
	        title: '统计数值',
	        align: 'center',
	        editable: {
                type: 'text',
                title: '统计数值',
                validate: function (v) {
                    if (!v) return '不能为空';

                }
            }
	    },],
        onEditableSave: function (field, row, oldValue, $el) {
            $.ajax({
                type: "post",
                url: ctx+"/detailreportController/editTable",
                data: row,
                dataType: 'JSON',
                success: function (data, status) {
                    if (status == "success") {
                        alert('提交数据成功');
                    }
                },
                error: function () {
                    alert('编辑失败');
                },
                complete: function () {

                }

            });
        }
	});
}

function confirmForm() {
    $("#detailReportDgForm").validate({
      submitHandler : function() {  //验证通过后的执行方法
          //当前的form通过ajax方式提交（用到jQuery.Form文件）
      	var param = $("#detailReportDgForm").serialize();
          $.ajax({
              url : ctx+"/detailreportController/addConfirm",
              type : "post",
              dataType : "json",
              data: param,
              success:function(data){
                  if(data.isSuc){
                	  document.getElementById("detailReportDgForm").reset(); 
                	  $("#detailAdd").modal('hide');
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