package ucf.assignment;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Erica Joseph
 */

import java.util.ResourceBundle;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import javafx.scene.control.DatePicker;
import javafx.event.ActionEvent;
import java.net.URL;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class toDoListController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //set starting conditions
    }

    private void refresh(){
        //set date to default after each submission
        //set text field to null after each submission
    }

    @FXML
    private TextField toDo_textField;
    @FXML
    private Label toDo_textLabel;
    @FXML
    private ListView<toDoListModel> toDoList;
    @FXML
    private ListView<toDoListModel> toDoList_Done;
    @FXML
    private DatePicker toDoList_Date;
    @FXML

    //create observable list to create array list in collections
    private void addItem (ActionEvent event) {

        //add each item to listen by pulling value in text field and date field
        //add items to general list
        //refresh text field and calendar
    }
    @FXML
    private void removeItem(ActionEvent event) {
        //state selection by clicking
        //get value from the item in the selected field
        //delete selected item
    }
    @FXML
    private void completeItem(ActionEvent event) {
        //run deplete method from removeItem
        //print removed item into "Done" list

    }
    @FXML
    private void editItem(ActionEvent event) {
        //make item editable by cell
    }
    @FXML
    private void saveExternally(ActionEvent event) {
        //write file name into system as new file
        //initialize save

    }
    @FXML
    private void loadExternally(ActionEvent event) {
        //toggle file list and display as own list
        //have file loaded

    }

}

