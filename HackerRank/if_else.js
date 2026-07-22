function processData(input) {
    var marks = Number(input);
    var MARKS_TEST = marks;
    //Head Ends Here

//Do not declare variable marks.
//Write your code below this line.
if (input > 90) {
    console.log("AA");
} else if (input > 80 && input <= 90) {
    console.log("AB");
} else if (input > 70 && input <= 80) {
    console.log("BB");
} else if (input > 60 && input <= 70) {
    console.log("BC");
} else if (input > 50 && input <= 60) {
    console.log("CC");
} else if (input > 40 && input <= 50) {
    console.log("CD");
} else if (input > 30 && input <= 40) {
    console.log("DD");
} else if (input <= 30 ){
    console.log("FF");
} 
//Tail Begins
    try {
        if(marks != MARKS_TEST){
            console.log("It seems you have edited the value of variable 'marks'. Please try again.");
        } 
    } 
    catch(err) {
        console.log(err.message);
    }
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});