package learning_java.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

interface DatabaseOperations {
    void performOperation(Connection con, BufferedReader br) throws IOException;
}

abstract class BaseOperation implements DatabaseOperations {
    protected String query;

    @Override
    public abstract void performOperation(Connection con, BufferedReader br) throws IOException;
}

class ShowTableOperation extends BaseOperation {
    @Override
    public void performOperation(Connection con, BufferedReader br) throws IOException {
        try {
            query = "SELECT * FROM students";
            PreparedStatement pstm = con.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            System.out.println("ROLL -- NAME ----- STATE ");
            while (rs.next()) {
                int roll = rs.getInt("roll");
                String name = rs.getString("name");
                String state = rs.getString("state");

                System.out.println(roll + " . " + name + " - " + state);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    static class InsertionOperation extends BaseOperation {
        @Override
        public void performOperation(Connection con, BufferedReader br) throws IOException {
            try {
                query = "INSERT INTO students(name, state, branch) VALUES (?, ?, ?)";
                PreparedStatement pstm = con.prepareStatement(query);

                System.out.println("Enter the name (text), state (text), branch ( b/w 1-6) : ");
                String name = br.readLine();
                String state = br.readLine();
                int branch = Integer.parseInt(br.readLine());


                pstm.setString(1, name);
                pstm.setString(2, state);
                pstm.setInt(3, branch);

                int executed = pstm.executeUpdate();

                if (executed > 0) {
                    System.out.println("Done");
                } else {
                    System.out.println("Some problem occurred");
                }
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

    static class DeletionOperation extends BaseOperation {
        @Override
        public void performOperation(Connection con, BufferedReader br) throws IOException {
            try {
                PreparedStatement pstm = con.prepareStatement(query);

                System.out.println("Enter the roll number (in integer format) : ");

                int roll = Integer.parseInt(br.readLine());

                pstm.setInt(1, roll); // Set the roll number parameter

                int executed = pstm.executeUpdate(); // Execute the deletion query

                if (executed > 0) {
                    System.out.println("Record deleted successfully!");
                } else {
                    System.out.println("No record found with the given roll number.");
                }
            } catch (Exception e) {
                System.err.println("Error" + e.getMessage());
            }
        }
    }

    static class UpdateOperation extends BaseOperation {

        @Override
        public void performOperation(Connection con, BufferedReader br) throws IOException {
            try {
                System.out.println("Enter which section you want to update: ");
                String secName = br.readLine();

                System.out.println("Enter the new detail in " + secName + ": ");
                String newDetail = br.readLine();

                System.out.println("Enter the roll number (in integer format): ");
                int roll = Integer.parseInt(br.readLine());

                query = "UPDATE students SET " + secName + " = ? WHERE roll = ?";
                PreparedStatement pstm = con.prepareStatement(query);
                pstm.setString(1, newDetail);
                pstm.setInt(2, roll);

                int executed = pstm.executeUpdate();

                if (executed > 0) {
                    System.out.println("Record updated successfully!");
                } else {
                    System.out.println("No record found with the given roll number.");
                }
            } catch (SQLException e) {
                System.err.println("Error connecting to database: " + e.getMessage());
            } catch (IOException e) {
                System.err.println("Error with user input or file operations: " + e.getMessage());
            }
        }
    }

    public static class SecureCURD {
        public static void main(String[] args) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                String url = "jdbc:mysql://localhost:3306/univ";
                String username = "root";
                System.out.println("Enter the password for accessing DATABASE");
                String password = br.readLine();
                Connection con = DriverManager.getConnection(url, username, password);

                DatabaseOperations operation;

                String userInput = "";

                while (!userInput.equalsIgnoreCase("exit")) {
                    System.out.println("What do you want to perform : \n See table \n Insertion  \n Deletion \n Update  \n Exit ");
                    userInput = br.readLine();

                    if (userInput.equalsIgnoreCase("see table")) {
                        operation = new ShowTableOperation();
                    } else if (userInput.equalsIgnoreCase("insertion") ) {
                        operation = new InsertionOperation();
                    } else if (userInput.equalsIgnoreCase( "deletion")) {
                        operation = new DeletionOperation();
                    } else if (userInput.equalsIgnoreCase("update")  ) {
                        operation = new UpdateOperation();
                    } else {
                        System.out.println("Invalid input. Please try again.");
                        continue;
                    }

                    try {
                        operation.performOperation(con, br);
                    } catch (Exception e) {
                        System.err.println("Error performing operation: " + e.getMessage());
                    }
                }
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}