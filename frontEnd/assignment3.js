
function hellWorld() {
    alert("Hell World")
}
function hellWorld1() {
    document.getElementById("q2").innerHTML = `<p>Hello World</p> `
}
function q3() {
    console.log("Hello world")
}
function q4() {
    if (confirm(`Bạn có đồng ý yêu không?`)) {
        alert("Đồng ý")
    } else {
        alert("Không :)))")
    }
}
function ques4_5() {
    let text = document.getElementById("ques4_5").value
    alert("Thông tin đã nhập: " + text)
}
function ques4_6() {
    let name = prompt("Mời bạn nhập tên")
    let age = prompt("Mời bạn nhập tuổi")
    $("#q6").append(`<p>Chào bạn: <b>${name}</b></p>`)
    $("#q6").append(`<p>Tuổi của bạn là: ${age}</p>`)
}
function ques4_7() {
    const t = Date()
    alert("Bây giờ là:  " + t)
}
function ques4_8() {
    let i = 1
    while (true) {
        let name = prompt("Mời bạn nhập tên")
        let age = prompt("Mời bạn nhập tuổi")
        $("#ques4_8").append(`<p> Thứ tự: <b>${i}</b></p>`)
        $("#ques4_8").append(`<p> Chào bạn: <b>${name}</b></p>`)
        $("#ques4_8").append(`<p>Tuổi của bạn là: ${age}</p>`)
        i++;
        if (confirm(`Bạn có muốn nhập thêm?`)) {
            continue;
        }
        break;
    }
}
function ques4_10c() {
    while (true) {
        let a = prompt("Nhập số a: ")
        a = parseInt(a)
        if (Number.isInteger(a)) {
            while (true) {
                let b = prompt("Nhập số b: ")
                b = parseInt(b)
                if (Number.isInteger(b)) {
                    c = a + b
                    return alert(`Tổng 2 số là:  ` + c);
                    
                } else {
                    alert(`Hãy nhập b là số nguyên`)
                    continue;
                }
            }
        } else {
            alert(`Hãy nhập a là số nguyên`)
            continue;
        }
    }
}
function ques4_10t() {
    while (true) {
        let a = prompt("Nhập số a: ")
        a = parseInt(a)
        if (Number.isInteger(a)) {
            while (true) {
                let b = prompt("Nhập số b: ")
                b = parseInt(b)
                if (Number.isInteger(b)) {
                    c = a - b
                    return alert(`Tổng 2 số là:  ` + c);
                    
                } else {
                    alert(`Hãy nhập b là số nguyên`)
                    continue;
                }
            }
        } else {
            alert(`Hãy nhập a là số nguyên`)
            continue;
        }
    }
}
function ques4_10n() {
    while (true) {
        let a = prompt("Nhập số a: ")
        a = parseInt(a)
        if (Number.isInteger(a)) {
            while (true) {
                let b = prompt("Nhập số b: ")
                b = parseInt(b)
                if (Number.isInteger(b)) {
                    c = a * b
                    return alert(`Tổng 2 số là:  ` + c);
                    
                } else {
                    alert(`Hãy nhập b là số nguyên`)
                    continue;
                }
            }
        } else {
            alert(`Hãy nhập a là số nguyên`)
            continue;
        }
    }
}
function ques4_10ch() {
    while (true) {
        let a = prompt("Nhập số a: ")
        a = parseInt(a)
        if (Number.isInteger(a)) {
            while (true) {
                let b = prompt("Nhập số b: ")
                b = parseInt(b)
                if (Number.isInteger(b)) {
                    c = a / b
                    return alert(`Tổng 2 số là:  ` + c);
                    
                } else {
                    alert(`Hãy nhập b là số nguyên`)
                    continue;
                }
            }
        } else {
            alert(`Hãy nhập a là số nguyên`)
            continue;
        }
    }
}
function cong(){
    let a = document.getElementById("number1").value;
    let b = document.getElementById("number2").value;
    let c = Number(a)+Number(b);
    document.getElementById("kqua").value = c;
}