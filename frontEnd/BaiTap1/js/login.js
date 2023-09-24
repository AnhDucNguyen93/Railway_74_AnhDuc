$(function () {
    console.log("Đã vào")
})
function login() {
    event.preventDefault();
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;

    if (username == `USER` && password == `123456`) {
        // CHuyển hướng sang trang home và luu thông tin
        localStorage.setItem("username", username)
        window.location = `http://127.0.0.1:5500/home.html`
    } else if (username == `ADMIN` && password == `123456`) {

        localStorage.setItem("username", username)
        window.location = `http://127.0.0.1:5500/home.html`
    } else {
        alert("Thông tin nhập vào không đúng!")
    }
}