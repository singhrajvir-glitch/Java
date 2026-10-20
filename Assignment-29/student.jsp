
<html>
<head>
    <title>Student Information</title>
</head>
<body>
    <h2>Student Information Form</h2>

    <form method="post">
        Enter Name:
        <input type="text" name="name" required><br><br>

        Enter Roll Number:
        <input type="text" name="roll" required><br><br>

        Enter Branch:
        <input type="text" name="branch" required><br><br>

        Enter Email:
        <input type="email" name="email" required><br><br>

        <input type="submit" value="Submit">
    </form>

    <%
        String name = request.getParameter("name");
        String roll = request.getParameter("roll");
        String branch = request.getParameter("branch");
        String email = request.getParameter("email");

        if (name != null) {
    %>

    <h2>Student Details</h2>
    <p>Name: <%= name %></p>
    <p>Roll Number: <%= roll %></p>
    <p>Branch: <%= branch %></p>
    <p>Email: <%= email %></p>

    <%
        }
    %>

</body>
</html>
