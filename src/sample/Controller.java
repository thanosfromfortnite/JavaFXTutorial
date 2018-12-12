package sample;
import javafx.scene.control.*;
import javafx.event.ActionEvent;

public class Controller {
    public Label helloWorld;

    public void sayHelloWorld(ActionEvent actionEvent) {
        helloWorld.setText("No you're not");

    }
}
