function function_name2() {
    console.log("Đã vào đây 2")
}

const user1 = { username: "Nguyễn Văn A, age:8" }

function User(id, username, age) {
    this.id = id;
    this.username = username;
    this.myAge = age;
}
const user3 = new User(1, "Duc", 9);
console.log(user1)
console.log(user3)

function getInFor() {
    let input = document.getElementById("demo1").value;
    alert("Bạn vừa nhập:   " + input)
}
function demo2() {
    document.getElementById("demo2").innerHTML = `<h1>"Hello"</h1> `
    // document.getElementById("hello").style.value
}
function login() {
    document.getElementById("demo1_1").innerHTML = `<button onclick="logout()">Logout</button>`
}
function logout() {
    document.getElementById("demo1_1").innerHTML = `<button onclick="login()">Login</button>`
}
function demo3() {
    const element = document.createElement(`h2`);
    element.textContent = `test`;
    document.getElementById("demo3").append(element);
}
function demo4() {
    let a = Math.floor(Math.random() * 256);
    let b = Math.floor(Math.random() * 256);
    let c = Math.floor(Math.random() * 256);
    document.getElementById("demo4").style.backgroundColor = `rgb(${a},${b},${c})`;
}
function demo5(){
    // document.getElementById("demo5").value= `default`; code js thuần
    $("#demo5").val("Ajax");
}
function demo6(){
    document.getElementById("demo6").classList.add(`abc`);
}