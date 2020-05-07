var placeHolders = [...$('input[type="text"]')];

$('input[type="text"]').on('focus',function(){
    placeHolders.forEach(ph => {
        if(this.value === ph.value){
            this.value= "";    
            this.style.color = "#222";
        }
    });
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
        alert('비밀번호는 필수 입력입니다.')
        $('#upw').focus()
    }else{
        location.href = '../index1.jsp';
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
        location.href = 'list.jsp';
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
            location.href = '../index1.jsp'
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