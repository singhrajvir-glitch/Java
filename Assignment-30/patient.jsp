
<%@ page import="java.sql.*" %>

<html>
<head>
    <title>Patient Record Management</title>
</head>
<body>

<h2>Patient Record Management System</h2>

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
                    "INSERT INTO patients(name, age, disease, treatment_status) VALUES(?,?,?,?)");

                ps.setString(1, request.getParameter("name"));
                ps.setInt(2, Integer.parseInt(request.getParameter("age")));
                ps.setString(3, request.getParameter("disease"));
                ps.setString(4, request.getParameter("status"));

                ps.executeUpdate();
                message = "Patient added successfully!";
                ps.close();
            }

            else if ("update".equals(action)) {
                PreparedStatement ps = con.prepareStatement(
                    "UPDATE patients SET name=?, age=?, disease=?, treatment_status=? WHERE patient_id=?");

                ps.setString(1, request.getParameter("name"));
                ps.setInt(2, Integer.parseInt(request.getParameter("age")));
                ps.setString(3, request.getParameter("disease"));
                ps.setString(4, request.getParameter("status"));
                ps.setInt(5, Integer.parseInt(request.getParameter("id")));

                ps.executeUpdate();
                message = "Patient updated successfully!";
                ps.close();
            }

            else if ("delete".equals(action)) {
                PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM patients WHERE patient_id=?");

                ps.setInt(1, Integer.parseInt(request.getParameter("id")));
                ps.executeUpdate();

                message = "Patient deleted successfully!";
                ps.close();
            }
        }
%>

<p><b><%= message %></b></p>

<h3>Add / Update Patient</h3>

<form method="post">

    Patient ID (for update):
    <input type="number" name="id"><br><br>

    Name:
    <input type="text" name="name" required><br><br>

    Age:
    <input type="number" name="age" required><br><br>

    Disease:
    <input type="text" name="disease" required><br><br>

    Treatment Status:
    <select name="status">
        <option value="Ongoing">Ongoing</option>
        <option value="Completed">Completed</option>
    </select><br><br>

    <button type="submit" name="action" value="add">
        Add Patient
    </button>

    <button type="submit" name="action" value="update">
        Update Patient
    </button>

</form>

<h3>Delete Patient</h3>

<form method="post">
    Patient ID:
    <input type="number" name="id" required>

    <button type="submit" name="action" value="delete">
        Delete
    </button>
</form>

<h3>Patient Records</h3>

<table border="1" cellpadding="10">

    <tr>
        <th>Patient ID</th>
        <th>Name</th>
        <th>Age</th>
        <th>Disease</th>
        <th>Treatment Status</th>
    </tr>

<%
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM patients");

    while (rs.next()) {
%>

    <tr>
        <td><%= rs.getInt("patient_id") %></td>
        <td><%= rs.getString("name") %></td>
        <td><%= rs.getInt("age") %></td>
        <td><%= rs.getString("disease") %></td>
        <td><%= rs.getString("treatment_status") %></td>
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
