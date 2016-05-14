package org.fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    public void handleOkAction(ActionEvent event) {
        System.out.println("Click ok button :" + username.getText());
    }

    public void handleCancelAction(ActionEvent event) {
        System.out.println("Click cancel button :" + password.getText());
    }
}
