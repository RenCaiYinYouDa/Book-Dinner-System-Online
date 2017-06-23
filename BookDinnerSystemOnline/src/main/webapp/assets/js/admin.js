/**
 * Author：zzy
 */
$(document).ready(function(){
	$('#statusSelection').change(function(){
		var status = $(this).children('option:selected').val();
		location.href = "showOrders?type=" + status;
	});
	$('.acceptBtn').click(function(){
		//得到当前所在行
		var rows = $(this).parents('tr');
		//得到所在行的第一列的内容
		var orderid = $(rows).children().eq(1).text();
		var ordernum = $(rows).children().eq(2).text();
		var statusid = $(rows).children().eq(3).text();
		var userid = $(rows).children().eq(4).text();
		var addrid = $(rows).children().eq(5).text();
		var date = $(rows).children().eq(6).text();
		var page = getUrlParam('page');
		if (page == null){
			page = 1;
		}
		var url = 'updateOrderStatus?page=' + page + '&type=' + status + '&orderid=' + orderid + '&ordernum=' + ordernum + '&statusid=' + 1 + '&userid=' + userid + '&addrid=' + addrid + '&date=' + date;
		location.href = url;
	});
	$('.rejectBtn').click(function(){
		//得到当前所在行
		var rows = $(this).parents('tr');
		//得到所在行的第一列的内容
		var orderid = $(rows).children().eq(1).text();
		var ordernum = $(rows).children().eq(2).text();
		var statusid = $(rows).children().eq(3).text();
		var userid = $(rows).children().eq(4).text();
		var addrid = $(rows).children().eq(5).text();
		var date = $(rows).children().eq(6).text();
		var page = getUrlParam('page');
		if (page == null){
			page = 1;
		}
		var url = 'updateOrderStatus?page=' + page + '&type=' + status + '&orderid=' + orderid + '&ordernum=' + ordernum + '&statusid=' + 2 + '&userid=' + userid + '&addrid=' + addrid + '&date=' + date;
		location.href = url;
	});
	$('.editBtn').click(function(){
		var text = $(this).parents('.tpl-table-images-content').find('.dishid').text();
		//alert(text);
		var url = 'updateDish?dishid=' + text;
		location.href = url;
	});
	$('.deleteBtn').click(function(){
		var text = $(this).parents('.tpl-table-images-content').find('.dishid').text();
		var url = 'deleteDish?dishid=' + text;
		location.href = url;
	});
});

function getUrlParam(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
    var r = window.location.search.substr(1).match(reg);  //匹配目标参数
    if (r != null) return unescape(r[2]); return null; //返回参数值
}

function imgChange(){
	var img = document.getElementById('dishimg');
	img.src = document.getElementById('doc-form-file').value;
}

