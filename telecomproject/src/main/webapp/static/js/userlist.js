$(function(){
	
	$('#tt').datagrid({
		url:'users/page',
		method:'GET',
		loadMsg:'玩命的加载中……',
		queryParams:queryParams()
	});
	
	
	function queryParams(){
		var userName = $('#userName').val();
		var loginName = $('#loginName').val();
		var gender = $('#gender').val();
		var age = $('#age').val();
		var datas = {userName:userName,loginName:loginName,gender:gender,age:age};
		return datas;
	}
	
	//修改保存
	$('#update-user-btn').bind('click', function(){   
    	
		
		
		//使用ajax，在回调中，判断结果是否为true,
		//如果是为真,请关闭弹出窗体，并使用$('#tt').datagrid('load');刷新当前数据列表
		//如果是为假，请提示客户
		
		
    }); 
	
	//添加保存
	$('#save-user-btn').bind('click', function(){   
    	
		//使用ajax，在回调中，判断结果是否为true,
		//如果是为真,请关闭弹出窗体，并使用$('#tt').datagrid('load');刷新当前数据列表
		//如果是为假，请提示客户
		
		
		
		
		
    }); 
	
	
	
	
	
	
	
	
	//条件查询就OK
    $('#query').bind('click', function(){   
    	$('#tt').datagrid('load',queryParams());
    }); 
	
    $('#add').bind('click', function(){   
    	$('#user-save-dialog').dialog('open');//打开窗体
    	$('#user-add-form').form('clear');//清除表单缓存
    });
    
    $('#update').bind('click', function(){   
    	var rows = $('#tt').datagrid('getSelections');
    	var row = $('#tt').datagrid('getSelected');
    	if(!row){
    		$.messager.show({
    			title:'温馨提示',
    			msg:'请选择需要修改的列表项！',
    			timeout:5000,
    			showType:'slide'
    		});
    	}else{
    		var lenth = rows.length;//获取选择的行数
    		if(lenth > 1){
    			$.messager.show({
        			title:'温馨提示',
        			msg:'每次只能修改一条列表项！',
        			timeout:5000,
        			showType:'slide'
        		});
    		}else{
    			$('#user-update-dialog').dialog('open');
    			//通过row.属性，获取对应的值，然后再调用val(row.属性)去设值，
    			//或者attr('value',row.属性)
    			//或者用prop('value',row.属性)
    			
    			
    			
    		}
    	}
    }); 
    
    $('#delete').bind('click', function(){   
    	var rows = $('#tt').datagrid('getSelections');
    	var lenth = rows.length;
    	if(lenth > 0){
    		var ids = [];
        	for(var i = 0 ; i < lenth; i ++){
        		var id = rows[i].id;
        		ids.push(id);
        	}
        	
        	$.messager.confirm('确认信息', '你真的确认需要删除这些选项吗?', function(r){
        		if (r){
        			//如果对方点击的是“确认”，此处代码将执行
        			//接下来，这里就应该ajax提交删除
        			
        			
        			$('#tt').datagrid('load');
        			//然后在回调中，刷新当前页面中的“数据列表”
        			//$('#tt').datagrid('load');
        		}
        	});
    	}else{
    		$.messager.show({
    			title:'温馨提示',
    			msg:'请选择需要删除的列表项！',
    			timeout:5000,
    			showType:'slide'
    		});
    	}
    });
    
    
    $('#cancel-save-btn').bind('click', function(){   
    	$('#user-add-form').form('clear');//清除表单缓存
    	$('#user-save-dialog').dialog('close');//关闭窗体
    });
    
    $('#cancel-update-btn').bind('click', function(){   
    	$('#user-update-form').form('clear');//清除表单缓存
    	$('#user-update-dialog').dialog('close');//关闭窗体
    });
    
    
    Date.prototype.format = function(fmt) { 
        var o = { 
           "M+" : this.getMonth()+1,                 //月份 
           "d+" : this.getDate(),                    //日 
           "h+" : this.getHours(),                   //小时 
           "m+" : this.getMinutes(),                 //分 
           "s+" : this.getSeconds(),                 //秒 
           "q+" : Math.floor((this.getMonth()+3)/3), //季度 
           "S"  : this.getMilliseconds()             //毫秒 
       }; 
       if(/(y+)/.test(fmt)) {
               fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length)); 
       }
        for(var k in o) {
           if(new RegExp("("+ k +")").test(fmt)){
                fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
            }
        }
       return fmt; 
   }
	
});