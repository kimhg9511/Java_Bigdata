$('input[type="text"]').on('focus',function(){
    if(this.value==="아이디"||this.value==="비밀번호"){
    this.value= "";    
    this.style.color = "#222";
    }
    if(this.id === "upw"){
        this.type = "password";
    };
});

$('#login').on('click',function(){
    var id = $('#uid');
    var pw = $('#upw');

    if(id.val().length === 0 || id.val() === id[0].defaultValue){
        alert("아이디는 필수 입력 입니다.")
        id.focus();
    } else if(pw.val().length === 0 || pw.val() === pw[0].defaultValue){
        alert("비밀번호는 필수 입력 입니다.")
        pw.focus();
    } else{
        location.href = '../index1.jsp';
    }
})