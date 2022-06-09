package com.co.ias.market.infranstructure.adapters.output;

import com.co.ias.market.categories.application.domain.Category;
import com.co.ias.market.categories.application.domain.valueObjs.CategoryId;
import com.co.ias.market.categories.application.ports.output.CategoryRepository;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Optional;

@Repository
public class PostgresSqlCategoryRepository implements CategoryRepository {

    private final DataSource dataSource;

    public PostgresSqlCategoryRepository(DataSource dataSource) {this.dataSource = dataSource;}

    @Override
    public void store(Category category) {

        String sql = "INSERT INTO categories (name, quantity, available) values (?, ?, ?)";
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, category.getName().getValue());
            preparedStatement.setInt(2, category.getQuantityProducts().getValue());
            preparedStatement.setInt(3, category.getAvailable().getValue());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error DB....: "  + e.getMessage());
            throw new RuntimeException("Error querying database", e);
        }
    }

    @Override
    public Optional<Category> get(Long categoryId) {

        return Optional.empty();
    }

    @Override
    public void update(Category category) {

    }

    @Override
    public Boolean delete(CategoryId categoryId) {
        String sql = "DELETE FROM categories WHERE id = (?)";
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setLong(1, categoryId.getValue());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error DB....: "  + e.getMessage());
            throw new RuntimeException("Error querying database", e);
        }
        return null;
    }
}
