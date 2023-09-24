$(function () {
    //KHi load trang thì sẽ được chạy vào đây
    checkLogin();
    $("#body").load("./html/account-page.html");
    getListAccount();
})

let apiBaseAccount =`http://localhost:8888/api/v1/account`;
let accountList = []

function checkLogin() {
    let username = localStorage.getItem("username")
    if (username) {
        // nếu đã đăng nhập thì ở lại here
        if(username == `ADMIN`){
            document.getElementById("navDepartment").style.display = "block";
        }
    } else {
        window.location = `http://127.0.0.1:5500/login.html`
    }
}
function getListAccount(){
    // Lấy ra được danh sách Account từ API
    //Gắn danh sách vào accountList
    $.ajax({
        url: apiBaseAccount + "/get-all",
        type: "GET",
        contentType: "application/json", //Định nghĩa định dạng dữ liệu truyền vào là Json
        error: function(err){
            //Hành động khi API bị lỗi
            console.log(err);
            alert(err.resposeJSON);
        }
    })
}

function logout(){
    localStorage.clear();
    window.location =  `http://127.0.0.1:5500/login.html`
}
function clickNaviViewListAccount(){
    $("#body").load("./html/account-page.html")
}
function clickNavihome(){
    $("#body").load("./html/home-page.html")
}
