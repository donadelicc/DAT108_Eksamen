
// const root = document.getElementById("root");
// root.getElementsByTagName("button")[0].addEventListener("click", regnut);


// function regnut() {

//     console.log("Skjerm bredde: " + screen.width);
//     console.log("Skjerm høyde: " + screen.height);
//     console.log("Color depth: " + screen.colorDepth);

//     const tallElement = root.getElementsByTagName("input")[0];
//     const radixElement = root.getElementsByTagName("input")[1];
//     const tall = parseInt(tallElement.value);
//     const radix = parseInt(radixElement.value);
//     resultatElement = root.getElementsByTagName("p")[0];
//     if ((tall > 0) && (radix >= 2) && (radix <= 36)) {
//         resultatElement.getElementsByTagName("span")[0].textContent = tall;
//         resultatElement.getElementsByTagName("span")[1].textContent = radix;
//         resultatElement.getElementsByTagName("span")[2].textContent = tall.toString(radix);
//         resultatElement.classList.remove("hidden");
//     } else {
//         resultatElement.classList.add("hidden");
//     }
// }


let variabel = 5;       // variabel er nå av typen Number
variabel = "Hei";       // samme variabel er nå en String
let sum = 3 + "3";     // sum blir "33", ikke 6
// console.log(variabel);
// console.log(sum);
// console.log(typeof sum);

const student = {
    id: Symbol(),
    navn: "Ola",
};

const student2 = {
    id: Symbol(),
    navn: "Kari",
};

if(student.id === student2.id) {
    console.log("Like");
} else {
    console.log("Ikke like");
}
