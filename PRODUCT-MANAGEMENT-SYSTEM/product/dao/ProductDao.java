package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.product.configuration.ProductHelperClass;
import com.product.dto.Product;

public class ProductDao {
	ProductHelperClass productHelperClass = new ProductHelperClass();
	Connection connection = null;

	// to insert or save the data
	public Product saveProduct(Product product) {
		connection = productHelperClass.getConnection();
		String sql = "INSERT INTO product VALUES(?,?,?,?)";

		// create the statement
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			// passing the values to the delimiters
			preparedStatement.setInt(1, product.getId());
			preparedStatement.setString(2, product.getName());
			preparedStatement.setDouble(3, product.getPrice());
			preparedStatement.setInt(4, product.getQuantity());

			preparedStatement.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return product;
	}
//	=============================================================================

	// TO REMOVE THE DATA
	public boolean deleteProduct(int id) {
		connection = productHelperClass.getConnection();
		String sql = "DELETE FROM product WHERE Id=?";
		int i = 0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id);
			i = preparedStatement.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;

	}

// ========================================================================

	// to Update the data
	public int updateProduct(String name, double price, int id) {
		connection = productHelperClass.getConnection();
		String sql = "UPDATE product SET name = ?, price = ?  WHERE id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setDouble(2, price);
			preparedStatement.setInt(3, id);
			int b = preparedStatement.executeUpdate();
			if (b > 0) {
				return b;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return -1;

	}

//===============================================================================
	// to get all records by id
	public void getALLProductById(int id) {
		connection = productHelperClass.getConnection();
		String sql = "SELECT * FROM product WHERE id= ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getDouble(3));
				System.out.println(resultSet.getInt(4));
				System.out.println("===================================");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

//========================================================================================================
	// to fetch all records
	public Product getAllData(Product product) {
		connection = productHelperClass.getConnection();
		String sql = "SELECT * FROM product";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getDouble(3));
				System.out.println(resultSet.getInt(4));
				System.out.println("===================================");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return product;

	}

}
