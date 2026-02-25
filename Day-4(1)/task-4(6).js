function loadCSV(event) {

  let reader = new FileReader();

  reader.onload = function () {
    let lines = reader.result.split("\n");
    let table = document.getElementById("table");

    lines.forEach(url => {
      url = url.trim();
      if (url) {
        let row = table.insertRow();
        row.innerHTML =`<td><img src="${"https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832_1280.jpg"}"></td>
                        <td><a href="${url}" download="https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832_1280.jpg">Download</a></td>;`           
                           
      
                      }
    });
   };
                                            
  reader.readAsText(event.target.files[0]); 
}
