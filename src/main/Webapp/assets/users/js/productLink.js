$(document).ready(function () {          
	//初始化List
	initTable();
    //表单校验及提交
    confirmForm();
});

function initTable(){
    $('#cooperationLinkDg').bootstrapTable({
        class: 'table table-hover table-bordered',
        url:ctx+"/cooperationlinkController/list",
        contentType: 'application/x-www-form-urlencoded; charset=utf-8',
        sidePagination: 'server',
        pagination: false,
        treeView: true,
        treeId: "id",
        treeField: "name",
        columns: [{
                field: 'name',
                title: '名称',
            },
            {
                field: 'level',
                title: '等级',
            },{
                field: 'id',
                title: '操作',
                align: 'center',
                formatter:function(value,row){
                    if(searchBtn!="" && searchBtn!=null){
                        var s = '<a class="btn btn-xs btn-default" onclick="detailBtn(\''+ row.id +'\')">明细</a>';
                    }else{
                        var s = '';
                    }
                    if(updateBtn!="" && updateBtn!=null){
                        var e = '<a class="btn btn-xs btn-warning"  onclick="detailBtn(\''+ row.id +'\')">修改</a>';
                    }else{
                        var e = '';
                    }
                    if(deleteBtn!="" && deleteBtn!=null){
                        var d = '<a class="btn btn-xs btn-danger"  onclick="detailBtn(\''+ row.id +'\')">删除</a>';
                    }else{
                        var d = '';
                    }
                    if(insertBtn!="" && insertBtn!=null && row.level < 3){
                        var i = '<a class="btn btn-xs btn-primary"  onclick="detailBtn(\''+ row.id +'\')">新增下级</a>';
                    }else{
                        var i = '';
                    }
                    return s+e+d+i;
                }
            }
        ]
    });
    $("#expandAllTree").on('click',function(){
        $('#cooperationLinkDg').bootstrapTable("expandAllTree")
    })
    $("#collapseAllTree").on('click',function(){
        $('#cooperationLinkDg').bootstrapTable("collapseAllTree")
    })
}

function detailBtn(Id){
	window.location.href = ctx+"/cooperationlinkController/group"+"?Parent="+Id;
}

function confirmForm() {
    $("#orgForm").validate({
        submitHandler : function() {  //验证通过后的执行方法
            //当前的form通过ajax方式提交（用到jQuery.Form文件）
            var param = $("#orgForm").serialize();
            $.ajax({
                url : ctx+"/cooperationlinkController/addConfirm",
                type : "post",
                dataType : "json",
                data: param,
                success:function(data){
                    if(data.isSuc){
                        document.getElementById("orgForm").reset();
                        $("#orgAdd").modal('hide');
                        swal({title: '成功',
                            text: data.errMsg,
                            type: 'success',
                            confirmButtonText: '确定',
                        },function(){
                            window.location.href = ctx+"/cooperationlinkController/org"+"?Parent="+document.getElementById("Parent").value;
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