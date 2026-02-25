
 
  function show(){
  let input = document.getElementById("num").value;

 
 if(isNaN(input)){
   
    document.writeln("Enter valid input");
           
  }
  else{
  
  let result = "";

 
  let group = input[0];

  
  for (let i = 1; i < input.length; i++) {
  
  
    let current = Number(input[i]);
    let previous = Number(input[i - 1]);
  
   
    if (current === previous + 1) {
      group = group + input[i];
    } else {
      result = result + group + " "; 
      group = input[i];
    }
    
  }

  result = result + group;

 
  document.writeln("<h3>Input: " + input + "</h3>");
  document.writeln("<h3>Output: " + result + "</h3>");
  }

  }