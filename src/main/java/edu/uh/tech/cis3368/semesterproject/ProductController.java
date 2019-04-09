package edu.uh.tech.cis3368.semesterproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

@Controller
public class ProductController implements Initializable {

    @Autowired
    private ComponentRepository componentRepository;

    @FXML
    public ListView<Component> componentList;
    @FXML
    public Slider componentSlider;
    @FXML
    public TextField jobName;
    @FXML
    public TextField productName;


    private Scene returnScene;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<Component> observableList = FXCollections.observableArrayList();
        componentRepository.findAll().forEach(observableList::add);
        componentList.setItems(observableList);
    }

    public void handleDone(ActionEvent actionEvent) {
        componentSlider.getValue();

    }

    public void setReturnScene(Scene scene) {
        this.returnScene = scene;
    }
}
