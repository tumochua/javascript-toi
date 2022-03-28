// function welcomeTheUsar() {
//   // Some code borrowed and rewritten from UNKNOWN's lessons

//   let firstName = document.getElementById("first-name").value;
//   let lastName = document.getElementById("last-name").value;
//   let fullName = `${firstName} ${lastName}`;
//   console.log(fullName);
//   alert("Welcome " + fullName);
// }

function Tinhdiemtb() {
  var x1 = document.getElementById("diem1");
  var x2 = document.getElementById("diem2");
  //   document.getElementById("fullName").innerHTML =
  //     document.getElementById("fullNameInnerText").value;
  var fullName = document.getElementById("fullName");

  document.getElementById("fullNameInnerText").innerHTML = fullName.value;
  //   console.log("check fullName ", fullName.value);

  if (!fullName.value) {
    alert("bạn nhập thiếu giá trị fullName");
  } else if (x1.value == "" && x2.value == "") {
    alert("Bạn đã nhập thiếu giá trị vào ô nhập liệu");
  } else if (x1.value == "") {
    alert("Bạn đã nhập thiếu giá trị ô nhập liệu thứ 1");
  } else if (x2.value == "") {
    alert("Bạn đã nhập thiếu giá trị ô nhập liệu thứ 2");
  } else if (isNaN(x1.value) && isNaN(x2.value)) {
    alert("Kí tự bạn nhập không phải là số");
  } else if (isNaN(x1.value)) {
    alert("Kí tự bạn nhập không phải là số");
  } else if (isNaN(x2.value)) {
    alert("Kí tự bạn nhập không phải là số");
  }
  var tb = document.getElementById("dtb");
  tb = (parseFloat(x1.value) + parseFloat(x2.value) * 2) / 3;
  var tbfix = tb.toFixed(2); //Lấy 2 số thập phân sau dấu phẩy và làm tròn
  var xltb = document.getElementById("xeploai");
  if (tbfix >= 8) {
    xltb.innerText = "Giỏi";
  } else if (tbfix >= 6.5) {
    xltb.innerText = "Khá";
  } else if (tbfix >= 5) {
    xltb.innerText = "Trung bình";
  } else xltb.innerText = "Kém";

  return tbfix;
}
