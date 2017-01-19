package ua.com.rozetka.config;

import org.openqa.selenium.WebElement;

import java.sql.SQLException;
import java.util.List;

public class InsertToDB extends DataBase{

    public static void popularitySmartphones(List<WebElement> names, List<WebElement> prices){
        connectToDB();
        try {
            for(int i = 0; i < names.size(); i++){
                String query = "INSERT INTO selenium.popularity_smartphones (id, name, price) VALUES (?, ?, ?)";

                statement = connection.prepareStatement(query);

                statement.setInt(1, 0);
                statement.setString(2, names.get(i).getText());
                statement.setString(3, prices.get(i).getText());

                statement.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        disconnectDB();
    }
}
