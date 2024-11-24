<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <div class="container">
        <div class="card">
          <h2> Teacher Login</h2>
          <form action="checkTeacherCred" method="post">
            <input type="text" id="username" name="email" placeholder="username" required>
            <input type="password" id="password" name="pass" placeholder="Password" required>
            
            <button type="submit">Login</button><br>
           
           
          </form>
        </div>
</body>
</html>
<style>
    body {
  font-family: "Poppins", sans-serif;
  margin: 0;
  display: flex;
  align-items: center;
  justify-content: center;
  min-height: 100vh;
  background: #f5f5f5;
  color: #333;
  
      background-size: cover;
      background-position: center;
}
a{
    text-decoration: none;
    color: #fff;
}

.container {
  width: 100%;
  max-width: 500px;
}

.card {
  background-color: #fff;
  padding: 20px;
  border-radius: 8px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

h2 {
  text-align: center;
  color: #333;
}

form {
  display: flex;
  flex-direction: column;
}

input {
  padding: 10px;
  margin-bottom: 12px;
  border: 1px solid #ddd;
  border-radius: 4px;
  transition: border-color 0.3s ease-in-out;
  outline: none;
  color: #333;
}

input:focus {
  border-color: #555;
}

button {
  background-color: #3498db;
  color: #fff;
  padding: 10px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  transition: background-color 0.3s ease-in-out;
}

button:hover {
  background-color: #2980b9;
}

body {
  font-family: "Poppins", sans-serif;
  margin: 0;
  display: flex;
  align-items: center;
  justify-content: center;
  min-height: 100vh;
  background: #f5f5f5;
  background-image: url("bg.jpg");
  background-size: cover;
  background-position: center;
  color: #333;
}

a {
  text-decoration: none;
  color: #fff;
}

.container {
  width: 100%;
  max-width: 400px;
  padding: 0 20px;
}

.card {
  background-color: #fff;
  padding: 20px;
  border-radius: 8px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

h2 {
  text-align: center;
  color: #333;
}

form {
  display: flex;
  flex-direction: column;
}

input {
  padding: 10px;
  margin-bottom: 12px;
  border: 1px solid #ddd;
  border-radius: 4px;
  transition: border-color 0.3s ease-in-out;
  outline: none;
  color: #333;
}

input:focus {
  border-color: #555;
}

button {
  background-color: #3498db;
  color: #fff;
  padding: 10px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  transition: background-color 0.3s ease-in-out;
}

button:hover {
  background-color: #2980b9;
}

/* Large screens (Desktop) */
@media (min-width: 1024px) {
  .container {
    max-width: 450px;
  }

  h2 {
    font-size: 2rem;
  }

  button {
    font-size: 1rem;
    padding: 12px;
  }

  input {
    font-size: 1rem;
    padding: 12px;
  }
}

/* Medium screens (Tablet) */
@media (max-width: 1024px) and (min-width: 768px) {
  .container {
    max-width: 90%;
    padding: 0 15px;
  }

  h2 {
    font-size: 1.5rem;
  }

  input {
    font-size: 1rem;
    padding: 10px;
  }

  button {
    font-size: 1rem;
    padding: 10px;
  }
}

/* Small screens (Mobile) */
@media (max-width: 767px) {
  body {
    padding: 10px;
  }

  .container {
    max-width: 100%;
  }

  h2 {
    font-size: 1.25rem;
  }

  input {
    font-size: 0.875rem;
    padding: 8px;
  }

  button {
    font-size: 0.875rem;
    padding: 8px;
  }
}


</style>