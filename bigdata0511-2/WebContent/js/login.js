
const formCheck = function () {
    if($('#uid').val().length === 0){
        $('#uid').focus();
        alert('아이디는 필수 입력 입니다.');
        return;
    }
    if($('#upw').val().length === 0){
        $('#upw').focus();
        alert('비밀번호 필수 입력 입니다.');
        return;
    }

    $('form').submit();

}

$('#procBtn').on('click',formCheck);

