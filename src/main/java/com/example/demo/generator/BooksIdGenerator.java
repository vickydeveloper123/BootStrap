package com.example.demo.generator;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class BooksIdGenerator implements IdentifierGenerator {

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {

		String prefix = "Book";
		String suffix = "";

		try {

			JdbcConnectionAccess jdbcConnectionAccess = session.getJdbcConnectionAccess();
			Connection obtainConnection = jdbcConnectionAccess.obtainConnection();
			Statement statement = obtainConnection.createStatement();

			String sql = "SELECT * FROM books_id_gen";

			ResultSet execute = statement.executeQuery(sql);

			if (execute.next()) {
				int int1 = execute.getInt(1);

				suffix = String.valueOf(int1);

				System.out.println(suffix);

				String updateSql = "UPDATE  books_id_gen set id=id+1";

				statement.executeUpdate(updateSql);

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return prefix + suffix;
	}

}
