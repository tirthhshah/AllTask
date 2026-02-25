
function findRepeat(word, index = 0, seen = {}) {


  if (index >= word.length)
     return null;

  let char = word[index];


  if (seen[char] !== undefined) {
    return { [char]: [seen[char], index] };
  }
  seen[char] = index;


  return findRepeat(word, index + 1, seen);
}


function readFile(event) {

  let reader = new FileReader();

  reader.onload = function () {
    let words = reader.result.split("\n");
    let output = "";   

    words.forEach(word => {
      word = word.trim();
      if (word) {
        output += word + " = " + JSON.stringify(findRepeat(word)) + "\n";
      }
    });


    document.getElementById("output").innerText = output;
  };

  reader.readAsText(event.target.files[0]);
}
