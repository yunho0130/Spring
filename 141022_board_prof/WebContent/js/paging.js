/**
 * 
 */

function viewData(bno){
	document.form1.action = "view";
	document.form1.bno.value = bno;
	document.form1.submit();
}

function deleteData(bno){
	document.form1.action = "delete";
	document.form1.bno.value = bno;
	document.form1.submit();
}


function goPage(pageNo){
	document.form1.page.value = pageNo;
	document.form1.submit();
}

function goSearch(){
	document.form1.page.value = 1;
	document.form1.submit();
}
