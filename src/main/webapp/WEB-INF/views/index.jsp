<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 50px;
        }
        .login-button {
            display: inline-block;
            padding: 10px 20px;
            font-size: 16px;
            color: white;
            background-color: #FFEB00; /* 카카오 대표 색상 */
            border: none;
            border-radius: 5px;
            text-decoration: none;
            cursor: pointer;
        }
        .login-button:hover {
            background-color: #D1C500;
        }
    </style>
</head>
<body>
<h1>Welcome to Kakao Login</h1>
<p>Log in to access more features.</p>
<a href="https://kauth.kakao.com/oauth/authorize?response_type=code&client_id=027af1e1bbd65e2161d454d88f739af6&redirect_uri=http://localhost:8082/kakao" class="login-button">Login with Kakao</a>
</body>
</html>
