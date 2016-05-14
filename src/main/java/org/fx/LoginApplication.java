package org.fx;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginApplication extends Application {
    @Override
    public void start(final Stage stage) {
        try {
            final FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));

            final Parent root = fxmlLoader.load();
            stage.setScene(new Scene(root));
            stage.setTitle("Login");
            stage.show();
        } catch (final IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public static void main(final String[] args) {
        launch();
    }
}
