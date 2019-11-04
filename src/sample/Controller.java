package sample;

import javafx.beans.property.Property;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {
    @FXML
    private TableColumn<String, Person> firstNameCol;

    @FXML
    private TableView<Person> tvView;

    public void initialize(){
        ObservableList<Person> people = FXCollections.observableArrayList();

        firstNameCol.setCellValueFactory(new PropertyValueFactory("firstName"));
        tvView.setItems(people);
        people.add(new Person("Chris"));
        people.add(new Person("nick"));


    }

}



