function checkLunchTime() {

 
  let currentTime = new Date();

  let lunchTime = new Date();
  lunchTime.setHours(13, 0, 0, 0); 

  let timeLeft = lunchTime - currentTime;


  if (timeLeft <= 0) {
    document.getElementById("result").innerText = "Lunch time is over!";
    return;
  }
  let totalMinutes = Math.floor(timeLeft / (1000 * 60));
  let hours = Math.floor(totalMinutes / 60);
  let minutes = totalMinutes % 60;

  document.getElementById("result").innerText = "Time remaining: " + hours+ ":"+ minutes
}
