const ele = ["TUMOCHUA", "nguyen van tu", "18"];

const nameFull = document.getElementById("name");

for (let item in ele) {
  nameFull.innerHTML += `<li>${ele[item]}</li>`;
}
