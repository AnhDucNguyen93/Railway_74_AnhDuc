$(function(){
    console.log("đã vào đây")
})
function login(){
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;
    console.log(username,password)
    if(username=="ADMIN"&& password=="123456"){
        // CHuyen hướng sang trang home
        window.location="http://127.0.0.1:5500/login/home.html"
    }else if (username=="USER"&& password=="123456") {
         // CHuyen hướng sang trang home
        window.location="http://127.0.0.1:5500/login/home.html"
    } else {
        alert("Sai thông tin đăng nhập")
    }

}