var getTextLength = function (nickname) {
    var len = 0;
    for(var i=0;i<nickname.length;i++){
      if(escape(nickname.charAt(i)).length === 6){// 한글이라면
        len++;
      }
      len++;
    }
    return len;
}

const formCheck = function () {
    
    
    if($('#uid').val().length === 0){
        $('#uid').focus();
        alert('아이디는 필수 입력 입니다.');
        return;
    }
    if($('#uid').val().length <= 2){
        $('#uid').focus();
        alert('아이디는 최소 3자 이상입니다');
        return;
    }
    if($('#upw').val().length === 0){
        $('#upw').focus();
        alert('비밀번호 필수 입력 입니다.');
        return;
    }
    if($('#repw').val().length === 0){
        $('#repw').focus();
        alert('비밀번호확인은 필수 입력 입니다.');
        return;
    }
    if($('#upw').val() !== $('#repw').val()){
        $('#upw').focus();
        alert('비밀번호와 비밀번호확인 값은 같아야 합니다');
        return;
    }
    if($('#uname').val().length === 0){
        $('#uname').focus();
        alert('이름은 필수 입력 입니다.');
        return;
    }
    if($('#unickname').val().length === 0){
        $('#unickname').focus();
        alert('닉네임은 필수 입력 입니다.');
        return;
    }
    if(getTextLength($('#unickname').val()) < 4 ){
        $('#unickname').focus();
        alert('닉네임은 한글 2글자 또는 영문숫자 4글자 이상입니다.');
        return;
    }
    if($('#uemail').val().length === 0 ){
        $('#uemail').focus();
        alert('E-mail은 필수 입력 입니다.');
        return;
    }

    $('form').submit();
}


$('#procBtn').on('click',formCheck);

$('#updateBtn').on('click',function (){
	$('form').submit();
});
$('#deleteBtn').on('click',function (){
	$('form').submit();
});

