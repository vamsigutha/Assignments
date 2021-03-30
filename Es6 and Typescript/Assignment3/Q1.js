//Q1

var x = Promise.resolve(2);
var y = Promise.resolve(4);

Promise.all([x, y]).then((values) =>
  console.log(values.reduce((accu, ele) => accu + ele))
);
