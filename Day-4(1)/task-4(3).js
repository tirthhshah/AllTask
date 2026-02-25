function checkTime() {

 
  let currentDate = new Date();

  let selectedDate = document.getElementById("futureDate").value;

  if (selectedDate === "") {
    document.getElementById("output").innerText = "Please select a date";
    return;
  }

  let futureDate = new Date(selectedDate);


  let timeDifference = futureDate - currentDate;


  if (timeDifference <= 0) {
    document.getElementById("output").innerText = "Date already passed";
    return;
  }


  let totalMinutes = Math.floor(timeDifference / (1000 * 60));
  let days = Math.floor(totalMinutes / (60 * 24));
  let hours = Math.floor((totalMinutes % (60 * 24)) / 60);
  let minutes = totalMinutes % 60;

  
  document.getElementById("output").innerText =
    days + " days " + hours + " hours " + minutes + " minutes remaining";
}
