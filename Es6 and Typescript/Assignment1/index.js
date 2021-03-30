//Q1

const a = 1;
// a=2; throws TypeError: Assignment to constant variable
console.log(a);

//Q2

if (true) {
  let b = 5;
}

// console.log(b); error -> b is not defined

//Q3

let id = 1;
let title = "abc";
let price = 100;

var Order = {
  id,
  title,
  price,
  printOrder(id, title, price) {
    console.log(id + " " + title + " " + price);
  },
  getPrice() {
    return price;
  },
};

var copyOfOrder = Object.assign(Order);

//Q4

let names = ["Tom", "Ivan", "Jerry"];

let arr = new Array();

names.forEach((x) =>
  arr.push({
    name: x,
    length: x.length,
  })
);

console.log(arr);

//Q5

let laptopModel = "hp";
let deskNo = 4;
let userName = "vamsi";

let ticket = `My name is ${userName}, desk no. ${deskNo}. I have an issue with my laptop which is of model ${laptopModel}`;

console.log(ticket);

//Q6

let x, b, c, d;

[x, b, c, d] = [1, 2, 3, 4];
console.log(c);

let organization = {
  name: "xyz",
  address: {
    pincode: 12345,
  },
};

const {
  address: { pincode },
} = organization;
console.log(pincode);
