<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
   <form action="SaveStudentInfo" method="post">
    <div class="form-container">
        <div class="success-message" id="successMessage">
            Thank you! Sign up successfully.
        </div>
        
        <h1>Student Profile</h1>
        
            
                Name
                <input type="text" id="name" name="name" value="${kk.name}" required><br><br>
                

           
                Email
                <input type="email" id="email" name="email" value="${kk.email}" required><br><br>
                

             
               
            
                 Age
                <input type="number" id="Age" name="age" value="${kk.age}" required><br><br>
                

                 Password
                <input type="text" id="password" name="pass" value="${kk.pass}"  required><br><br>
               
            
            
            
        

            <button type="submit" value="ok"><a href="">ok</a></button>

            
       
    </div>
     </form>
     </body>
</html>

<style>
     :root {
            --primary: #4f46e5;
            --primary-dark: #4338ca;
            --gray: #6b7280;
            --error: #ef4444;
            --success: #22c55e;
        }

        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
            
        }

        a{
          text-decoration: none;
           color: #fff;
        }

        body {
            font-family: system-ui, -apple-system, sans-serif;
            background: #f3f4f6;
            color: #1f2937;
            line-height: 1.5;
            padding: 2rem;
            background-image: url("background.jpg");
             background-size: cover;
             background-position: center;
        }

        .form-container {
            max-width: 600px;
            margin: 0 auto;
            background: white;
            padding: 2rem;
            border-radius: 1rem;
            box-shadow: 0 4px 6px -1px rgb(0 0 0 / 0.1);
        }

        h1 {
            font-size: 1.5rem;
            margin-bottom: 1.5rem;
            color: #111827;
        }

        .form-group {
            margin-bottom: 1.5rem;
            position: relative;
        }

        label {
            display: block;
            margin-bottom: 0.5rem;
            font-weight: 500;
        }

        input, textarea {
            width: 100%;
            padding: 0.75rem;
            border: 1px solid #d1d5db;
            border-radius: 0.5rem;
            font-size: 1rem;
            transition: all 0.15s ease;
        }

        input:focus, textarea:focus {
            outline: none;
            border-color: var(--primary);
            box-shadow: 0 0 0 3px rgba(79, 70, 229, 0.1);
        }

        .error-message {
            color: var(--error);
            font-size: 0.875rem;
            margin-top: 0.25rem;
            display: none;
        }

        .validation-icon {
            position: absolute;
            right: 1rem;
            top: 2.5rem;
            display: none;
        }

        .validation-icon.success {
            color: var(--success);
            display: block;
        }

        .validation-icon.error {
            color: var(--error);
            display: block;
        }

        input.success, textarea.success {
            border-color: var(--success);
        }

        input.error, textarea.error {
            border-color: var(--error);
        }

        .checkbox-group {
            display: flex;
            align-items: start;
            gap: 0.75rem;
            margin-top: 1rem;
        }

        .checkbox-group input[type="checkbox"] {
            width: auto;
            margin-top: 0.25rem;
        }

        .checkbox-group label {
            font-size: 0.875rem;
            color: var(--gray);
        }

        button {
            background: var(--primary);
            color: white;
            padding: 0.75rem 1.5rem;
            border: none;
            border-radius: 0.5rem;
            font-size: 1rem;
            font-weight: 500;
            cursor: pointer;
            transition: background-color 0.15s ease;
        }

        button:hover {
            background: var(--primary-dark);
        }

        .privacy-notice {
            font-size: 0.875rem;
            color: var(--gray);
            margin-top: 2rem;
            padding-top: 1rem;
            border-top: 1px solid #e5e7eb;
        }

        .success-message {
            display: none;
            background: #dcfce7;
            color: #166534;
            padding: 1rem;
            border-radius: 0.5rem;
            margin-bottom: 1rem;
        }
        
/* Responsive Design */
@media (min-width: 1024px) {
    /* Desktop View */
    .form-container {
        max-width: 600px;
        margin: 2rem auto;
    }

    h1 {
        font-size: 2rem;
    }

    button {
        font-size: 1rem;
        padding: 1rem;
    }
}

@media (max-width: 1024px) and (min-width: 768px) {
    /* Tablet View */
    .form-container {
        max-width: 80%;
        padding: 1.5rem;
    }

    h1 {
        font-size: 1.5rem;
    }

    input, textarea {
        font-size: 1rem;
    }

    button {
        font-size: 1rem;
        padding: 0.75rem 1.5rem;
    }
}

@media (max-width: 767px) {
    /* Mobile View */
    body {
        padding: 1rem;
    }

    .form-container {
        width: 100%;
        padding: 1rem;
        border-radius: 0.5rem;
    }

    h1 {
        font-size: 1.25rem;
    }

    input, textarea {
        font-size: 0.875rem;
        padding: 0.5rem;
    }

    button {
        font-size: 0.875rem;
        padding: 0.5rem 1rem;
    }

    label {
        font-size: 0.875rem;
    }
}

</style>

