package Controller;

import Model.Database;
import View.LoginView;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class LoginController {
    private LoginView loginView;

    public LoginController() {
        loginView = new LoginView();
        submitBtn();
        signUp();
    }

    public void submitBtn() {
        loginView.getSubmit().setOnAction(actionEvent -> {
            String userRoll = Database.check(loginView.getUsername().getText(), loginView.getPassword().getText());
            if (userRoll != null) {
                if (userRoll.equals("admin")) {

                } else if (userRoll.equals("manager")) {

                } else if (userRoll.equals("employee")) {

                } else if (userRoll.equals("passenger")) {

                }
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Database Error");
                alert.setContentText("User doesn't exist. Check username and password.");
                alert.show();
            }
        });
    }

    public void signUp(){
        loginView.getSignUp().setOnAction(actionEvent -> {
            SignUpController signUpController=new SignUpController();
            loginView.getScene().setRoot(signUpController.getSignUpView());
        });
    }

    public LoginView getLoginView() {
        return loginView;
    }
}
