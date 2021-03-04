package PartB;

/*
 * Given the information about employees of an organization, develop a small java
application, using JDBC.
 */

package jdbctest;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;

public class jdbctest2 {
    // JDBC database URL
    static final String DB_URL = "jdbc:mariadb://localhost:3306/emp1";

    // Database credentials
    static final String USER = "test1";
    static final String PASS = "password321";

    private static final String INSERT_EMP_SQL = "INSERT INTO employees" +
        "  (emp_name, age, dept, salary) VALUES " +
        " (?, ?, ?, ?);";

    private static final String DISPLAY_ALL = "SELECT emp_name, age, dept, salary FROM employees;";

    private static final String UPDATE_EMP_SQL = "update employees set salary = ? where emp_name = ?;";

    private static final String DELETE_EMP_SQL = "delete from employees where emp_name = ?;";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        Scanner s = new Scanner(System.in);
        try {
            // Register JDBC driver
            Class.forName("org.mariadb.jdbc.Driver");

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();


            while (true) {
                System.out.println("Enter choices");
                System.out.println("1.Insert\t2.Update\t3.Delete\t4.Display\t5.Exit");
                int choice = s.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter Name: ");
                        String name = s.next();
                        System.out.println("Enter age:");
                        int age = s.nextInt();
                        System.out.println("Enter dept:");
                        String dept = s.next();
                        System.out.println("Enter salary: ");
                        int salary = s.nextInt();

                        try {
                            PreparedStatement preparedStatement = conn.prepareStatement(INSERT_EMP_SQL);
                            preparedStatement.setString(1, name);
                            preparedStatement.setInt(2, age);
                            preparedStatement.setString(3, dept);
                            preparedStatement.setInt(4, salary);

                            System.out.println(preparedStatement);
                            // Execute the query or update query
                            preparedStatement.executeUpdate();
                        } catch (SQLException e) {

                            // print SQL exception information
                            e.printStackTrace();
                        }
                        break;

                    case 2:
                        System.out.println("Enter Name of Employee: ");
                        String e_name = s.next();
                        System.out.println("Enter new salary: ");
                        int new_sal = s.nextInt();
                        try {
                            PreparedStatement preparedStatement = conn.prepareStatement(UPDATE_EMP_SQL);
                            preparedStatement.setInt(1, new_sal);
                            preparedStatement.setString(2, e_name);

                            // Execute the query or update query
                            preparedStatement.executeUpdate();

                        } catch (SQLException e) {

                            // print SQL exception information
                            e.printStackTrace();
                        }
                        break;


                    case 3:
                        System.out.println("Enter emp name to delete: ");
                        String e1 = s.next();
                        try {
                            PreparedStatement statement = conn.prepareStatement(DELETE_EMP_SQL);
                            statement.setString(1, e1);
                            // Execute the query or update query
                            int result = statement.executeUpdate();
                            System.out.println("Number of records affected :: " + result);

                        } catch (SQLException e) {

                            // print SQL exception information
                            e.printStackTrace();
                        }
                        break;

                    case 4:
                        ResultSet rs = stmt.executeQuery(DISPLAY_ALL);

                        // Extract data from result set
                        while (rs.next()) {
                            //Retrieve by column name
                            int emp_age = rs.getInt("age");
                            String emp_dept = rs.getString("dept");
                            String emp_name = rs.getString("emp_name");
                            int emp_salary = rs.getInt("salary");
                            //String last = rs.getString("last")

                            //Display values
                            System.out.print("Name: " + emp_name);
                            System.out.print("\tAge: " + emp_age);
                            System.out.print("\t\tDept: " + emp_dept);
                            System.out.println("\tSalary: " + emp_salary + "\n");
                            //System.out.println(", Last: " + last);
                        }
                        break;

                    default:
                        try {
                            if (stmt != null)
                                stmt.close();
                        } catch (SQLException se2) {} // nothing we can do
                        try {
                            if (conn != null)
                                conn.close();
                        } catch (SQLException se) {
                            se.printStackTrace();
                        }
                        //s.close();
                        System.out.println("Goodbye!");
                        System.exit(0);
                }
            }

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }
}
