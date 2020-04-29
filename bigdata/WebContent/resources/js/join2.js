const values = [...$('.member')];
const regexrid = /^[A-Za-z0-9_]{3,}$/;  
const regexrnick = /^[A-Za-z0-9]{4,}$|^[가-힣A-Za-z0-9]{2,}$/;
const regexrnick2 = /^[가-힣]{1}[A-Za-z0-9]{1}$|^[A-Za-z0-9]{1}[가-힣]{1}$|^[A-Za-z0-9]{3}$/;
const regexremail = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;

// button
$('#join').on('click',function(){
    var exit = false;
    values.forEach(val => {
        if((val.value.length === 0 || val.value === val.defaultValue)&& !exit){           
            alert(val.previousSibling.innerText + "은(는) 필수 입력 사항입니다.");
            $(val).focus();
            exit = true;
        }
    });
    if(exit)return;
    document.form.submit();
})
$('#uid').on('blur',function(){
    if(!this.value.match(regexrid)){
        this.value = "id양식을 지켜주세요";
        this.defaultValue = this.value;
        this.style.backgroundColor = 'lightcoral';
    }else{
        this.style.backgroundColor = 'lightgreen';
    }
})
$('#nick').on('blur',function(){
    if((!this.value.match(regexrnick))||(!!this.value.match(regexrnick2))){
        this.value = "닉네임 양식을 지켜주세요";
        this.defaultValue = this.value;
        this.style.backgroundColor = 'lightcoral';
    }else{
        this.style.backgroundColor = 'lightgreen';
    }
})
$('#repw').on('blur',function(){
    if(this.value !== $('#upw').val()){
        this.type = 'text';
        this.value = "비밀번호 확인값이 다릅니다."
        this.style.backgroundColor = 'lightcoral';
    }else if($('#upw').val().length !== 0){
        $('#upw')[0].style.backgroundColor = 'lightgreen';
        this.style.backgroundColor = 'lightgreen';
    }
})
$('#email').on('blur',function(){
    if(!this.value.match(regexremail)){
        this.value = "이메일 양식을 지켜주세요";
        this.defaultValue = this.value;
        this.style.backgroundColor = 'lightcoral';
    }else{
        this.style.backgroundColor = 'lightgreen';
    }
})