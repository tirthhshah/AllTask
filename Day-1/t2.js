import { initializeApp } from "https://www.gstatic.com/firebasejs/9.23.0/firebase-app.js";
import { getDatabase, ref, push } from "https://www.gstatic.com/firebasejs/9.23.0/firebase-database.js";

const firebaseConfig = {
  apiKey: "YOUR_API_KEY",
  authDomain: "data-storee.firebaseapp.com",
  databaseURL: "https://data-storee-default-rtdb.firebaseio.com",
  projectId: "data-storee",
  storageBucket: "data-storee.firebasestorage.app",
  messagingSenderId: "574860924786",
  appId: "1:574860924786:web:1483615b832a3b00b1afeb"
};

const app = initializeApp(firebaseConfig);
const database = getDatabase(app);

document.querySelector(".footer button").addEventListener("click", function (e) {
  e.preventDefault();

  // 🔹 Get values
  const fname = document.getElementById("fname").value.trim();
  const lname = document.getElementById("lname").value.trim();
  const email = document.getElementById("email").value.trim();
  const password = document.getElementById("password").value;
  const confirmPassword = document.getElementById("confirmpassword").value;
  const gender = document.querySelector('input[name="gender"]:checked');
  const income = document.getElementById("range").value;
  const age = document.getElementById("number").value;
  const bio = document.querySelector("textarea").value.trim();
  const fileInput = document.getElementById("file");
  const file = fileInput.files[0];

  const hobbies = [];
  if (document.getElementById("music").checked) hobbies.push("Music");
  if (document.getElementById("sports").checked) hobbies.push("Sports");
  if (document.getElementById("travel").checked) hobbies.push("Travel");
  if (document.getElementById("movies").checked) hobbies.push("Movies");

  // 🔴 VALIDATION START

  if (fname === "") {
    alert("First name is required");
    return;
  }

  if (lname === "") {
    alert("Last name is required");
    return;
  }

  if (email === "") {
    alert("Email is required");
    return;
  }

  if (!email.includes("@")) {
    alert("Enter valid email");
    return;
  }

  if (password.length < 8) {
    alert("Password must be at least 8 characters");
    return;
  }

  if (password !== confirmPassword) {
    alert("Passwords do not match");
    return;
  }

  if (!gender) {
    alert("Please select gender");
    return;
  }

  if (hobbies.length === 0) {
    alert("Please select at least one hobby");
    return;
  }

  if (age === "" || age <= 0) {
    alert("Enter valid age");
    return;
  }

  if (bio === "") {
    alert("Bio is required");
    return;
  }

  if (!file) {
    alert("Please upload profile picture");
    return;
  }

  const allowedTypes = ["image/jpeg", "image/png"];
  if (!allowedTypes.includes(file.type)) {
    alert("Only JPG and PNG images allowed");
    return;
  }


  push(ref(database, "users"), {
    firstName: fname,
    lastName: lname,
    email: email,
    password: password,
    gender: gender.value,
    hobbies: hobbies,
    income: income + "K",
    age: age,
    bio: bio,
    fileName: file.name
  })
  .then(() => {
    alert("Data saved successfully");
    document.getElementById("form").reset();
  })
  .catch((error) => {
    alert("Error: " + error.message);
  });

});
