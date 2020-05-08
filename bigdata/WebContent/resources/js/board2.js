$('input[type="text"]').on('focus', function(){
    if(this.id === "upw" || this.id === "repw"){
        this.type = "password";
        return;
    };
});

$('#regist').on('click',function(){
    if($('#writer').val().length === 0){
        alert('작성자는 필수 입력입니다.');
        $('#writer').focus();
    }else if($('#btitle').val().length === 0){
        alert('제목은 필수 입력입니다.');
        $('#btitle').focus()
    }else if($('#bcontent').val().length ===0){
        alert('내용은 필수 입력입니다.');
        $('#bcontent').focus()
    }else if($('#upw').val().length ===0){
        alert('비밀번호는 필수 입력입니다.');
        $('#upw').focus();
    }else{
        document.form.submit();
    }
});
$('#update').on('click',function(){
    if($('#writer').val().length === 0){
        alert('작성자는 필수 입력입니다.');
        $('#writer').focus()
    }else if($('#btitle').val().length === 0){
        alert('제목은 필수 입력입니다.');
        $('#btitle').focus()
    }else if($('#bcontent').val().length ===0){
        alert('내용은 필수 입력입니다.');
        $('#bcontent').focus()
    }else if($('#upw').val().length ===0){
        alert('비밀번호는 필수 입력입니다.')
        $('#upw').focus()
    }else{
    	if(confirm("수정하시겠습니까?")){
    		document.form.submit();
    	}
    }
});
$('#reset').on('click',function(){
    location.reload();
})
$('#delete').on('click',function(){
    if($('#upw').val().length === 0){
        alert("비밀번호를 입력하세요.");
        $('#upw').focus()
    } else{
        if(confirm("삭제하시겠습니까?")){
            document.form.submit();
        }
    }
})
$('#userdelete').on('click',function(){
    if($('#upw').val().length === 0){
        alert("비밀번호를 입력하세요.");
        $('#upw').focus()
    } else{
        if(confirm("삭제하시겠습니까?")){
            document.del_form.submit();
        }
    }
})
$('#userupdate').on('click',function(){
	document.form.submit()
})