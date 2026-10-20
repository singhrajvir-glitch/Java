
<%@ page import="java.sql.*" %>

<html>
<head>
    <title>Employee Management System</title>
</head>
<body>

<h2>Employee Management System</h2>

<%
String url = "jdbc:mysql://localhost:3306/jsp_crud";
String user = "root";
String password = "G12ramdasG12";
String message = "";

try {
    Class.forName("com.mysql.cj.jdbc.Driver");

    try (Connection con = DriverManager.getConnection(url, user, password)) {

        if ("POST".equalsIgnoreCase(request.getMethod())) {

            String action = request.getParameter("action");

            if ("add".equals(action)) {
                PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO employees(name, department, salary) VALUES(?,?,?)");

                ps.setString(1, request.getParameter("name"));
                ps.setString(2, request.getParameter("department"));
                ps.setDouble(3, Double.parseDouble(request.getParameter("salary")));

                ps.executeUpdate();
                message = "Employee added successfully!";
                ps.close();
            }

            else if ("update".equals(action)) {
                PreparedStatement ps = con.prepareStatement(
                    "UPDATE employees SET name=?, department=?, salary=? WHERE id=?");

                ps.setString(1, request.getParameter("name"));
                ps.setString(2, request.getParameter("department"));
                ps.setDouble(3, Double.parseDouble(request.getParameter("salary")));
                ps.setInt(4, Integer.parseInt(request.getParameter("id")));

                ps.executeUpdate();
                message = "Employee updated successfully!";
                ps.close();
            }

            else if ("delete".equals(action)) {
                PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM employees WHERE id=?");

                ps.setInt(1, Integer.parseInt(request.getParameter("id")));
                ps.executeUpdate();

                message = "Employee deleted successfully!";
                ps.close();
            }
        }
%>

<p><b><%= message %></b></p>

<h3>Add / Update Employee</h3>

<form method="post">
    Employee ID (for update):
    <input type="number" name="id"><br><br>

    Name:
    <input type="text" name="name" required><br><br>

    Department:
    <input type="text" name="department" required><br><br>

    Salary:
    <input type="number" step="0.01" name="salary" required><br><br>

    <button type="submit" name="action" value="add">Add Employee</button>
    <button type="submit" name="action" value="update">Update Employee</button>
</form>

<h3>Delete Employee</h3>

<form method="post">
    Employee ID:
    <input type="number" name="id" required>
    <button type="submit" name="action" value="delete">Delete</button>
</form>

<h3>Employee Records</h3>

<table border="1" cellpadding="10">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Department</th>
        <th>Salary</th>
    </tr>

<%
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM employees");

    while (rs.next()) {
%>
    <tr>
        <td><%= rs.getInt("id") %></td>
        <td><%= rs.getString("name") %></td>
        <td><%= rs.getString("department") %></td>
        <td><%= rs.getDouble("salary") %></td>
    </tr>
<%
    }

    rs.close();
    st.close();
    }
} catch (Exception e) {
    message = "Error: " + e.getMessage();
%>
    <p style="color:red"><%= message %></p>
<%
}
%>

</table>

</body>
</html>
