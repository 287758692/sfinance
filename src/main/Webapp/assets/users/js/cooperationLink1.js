$(document).ready(function () {          
	//初始化List
	initTable();  
}); 

function initTable(){
	
	$('#cooperationLinkDg').bootstrapTable('destroy');
	
	$('#cooperationLinkDg').bootstrapTable({
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
	    url: ctx+"/cooperationlinkController/list",//这个接口需要处理bootstrap table传递的固定参数
	    //设置为undefined可以获取pageNumber，pageSize，searchText，sortName，sortOrder  
	    //设置为limit可以获取limit, offset, search, sort, order  
	    queryParamsType : "undefined",  
        queryParams: function queryParams(params) {   //设置查询参数  
            var param = {    
                pageNumber: params.pageNumber,    
                pageSize: params.pageSize,
                Parent: 0,
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
	        field: 'Id',
	        title: '序号',
	        align: 'center',
	        formatter:function(value,row,index){
                return '<a class="btn btn-xs btn-success" onclick="detailBtn(\''+ row.Id +'\')">明细</a>';
             }
	    },{
	        field: 'Name',
	        title: '名称',
	        align: 'center'
	    },{
	        field: 'Link',
	        title: '推广链接',
	        align: 'center'
	    },{
	        field: 'QRcode',
	        title: 'LOGO',
            align: 'center',
            formatter: function(value,row) {
                return '<img src="'+ctx+'/assets/users/img/haiergouhua.png" style="width: 30px;height: 30px">';
            }
	    }]
	});
}

function detailBtn(Id){
	window.location.href = ctx+"/cooperationlinkController/org"+"?Parent="+Id;
}