// alert('hit');
var body = document.body;

// // body append
var div1 = document.createElement('div');

div1.innerHTML = '<strong>One Hello </strong> World';
body.append(div1);
// // div.innerText = '<strong> Hello World </strong>';
// div1.innerHTML = '<strong> One Hello </strong> World';

// var parent = document.getElementById('parent');
// var elmByClass = Array.from(document.getElementByClassName('parent-cl'));
// for(var i = 0; i < elmByClass.length; i ++) {
//     console.log(elmByClass[i].id);
// }
// elmByClass.forEach(function(elem) {
//     console.log(elem);
// });
// console.log(parent)

var parent = document.querySelector('#parent');
parent.style.background = 'green';
parent.style.width = "500px";
parent.classList.add('red-background');
parent.classList.remove('red-background');
parent.classList.toggle('red-background');

// Types of Request
//GET
//POST
// PUT/PATCH
//DELETE

var xmlHttp = new XMLHttpRequest();
var url ="";
xmlHttp.open('GET', url);
xmlHttp.onreadystatechange = function()
