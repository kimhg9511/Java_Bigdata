const formCheck = function (state) {

    // Write - 필수체크 : 작성자 제목 내용 비밀번호

    if(state === 'write' || state === 'update'  || state === 'reply'){
        if($('#bname').val().length === 0){
            $('#bname').focus();
            alert('작성자는 필수 입력 입니다.');
            return;
        }
        if($('#btitle').val().length === 0){
            $('#btitle').focus();
            alert('제목은 필수 입력 입니다.');
            return;
        }
        if($('#bcontent').val().length === 0){
            $('#bcontent').focus();
            alert('내용은 필수 입력 입니다.');
            return;
        }
        if($('#bpw').val().length === 0){
            $('#bpw').focus();
            alert('비밀번호는 필수 입력 입니다.');
            return;
        }
    
    }else if(state === 'delete'){
        if($('#bpw').val().length === 0){
            $('#bpw').focus();
            alert('비밀번호는 필수 입력 입니다.');
            return;
        }
    }
        
    $('form').submit();

}

$('#writeBtn').on('click',function () {
    formCheck('write');
});
$('#updateBtn').on('click',function () {
    formCheck('update');
});
$('#replyBtn').on('click',function () {
    formCheck('reply');
});
$('#deleteBtn').on('click',function () {
    $('form').submit();
});
$('#resetBtn').on('click',function () {
    $('form').each(function(){
        this.reset();
      });
});


