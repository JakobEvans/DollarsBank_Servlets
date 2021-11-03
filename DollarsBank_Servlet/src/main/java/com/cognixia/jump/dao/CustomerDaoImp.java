package com.cognixia.jump.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cognixia.jump.connection.ConnectionManager;
import com.cognixia.jump.model.Customer;

public class CustomerDaoImp implements CustomerDao {
    
    public static final Connection conn = ConnectionManager.getConnection();

    private static String SELECT_ALL_BOOKS = "select * from book";
    private static String SELECT_BOOK_BY_ISBN = "select * from book where isbn = ?";
    private static String INSERT_BOOK = "insert into book(isbn,title, descr, rented, added_to_library ) values(?, ?, ?, ?, ?)";
    private static String DELETE_BOOK = "delete from book where isbn = ?";
    private static String UPDATE_BOOK = "update book set title = ?, rented = ?, descr = ? where isbn = ?";
    private static String UPDATE_BOOK_AVAILABILITY = "update book set rented = ? where isbn = ?";

    @Override
    public List<Customer> getAllCustomers() {

        List<Customer> allBooks = new ArrayList<Customer>();

        try (PreparedStatement pstmt = conn.prepareStatement(SELECT_ALL_BOOKS); ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String isbn = rs.getString("isbn");
                String title = rs.getString("title");
                boolean rented = rs.getBoolean("rented");
                Date added_to_library = rs.getDate("added_to_library");
                String description = rs.getString("descr");

                allBooks.add(new Customer(isbn, title, description, rented, added_to_library));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return allBooks;
    }
 
    
    @Override
    public boolean addCustomer(Customer customer) {
    	return true;

    }
    

    
  

}
