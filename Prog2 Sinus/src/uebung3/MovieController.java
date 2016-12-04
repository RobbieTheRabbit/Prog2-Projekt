package uebung3;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller class of the FXML File

 * Created by
 * Author: Sven Böhrnsen
 * IDE: Eclipse Neon
 * Date: 22.11.2016
 * 
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MovieController implements Initializable {

	@FXML // fx:id="lv_Movies"
	private ListView<?> lv_Movies; // Value injected by FXMLLoader

	@FXML // fx:id="tv_Movies"
	private TableView<?> tv_Movies; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Titel"
	private TableColumn<?, ?> tc_Titel; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Original"
	private TableColumn<?, ?> tc_Original; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Haupt"
	private TableColumn<?, ?> tc_Haupt; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Regie"
	private TableColumn<?, ?> tc_Regie; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Buch"
	private TableColumn<?, ?> tc_Buch; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Musik"
	private TableColumn<?, ?> tc_Musik; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Jahr"
	private TableColumn<?, ?> tc_Jahr; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Laenge"
	private TableColumn<?, ?> tc_Laenge; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Genre"
	private TableColumn<?, ?> tc_Genre; // Value injected by FXMLLoader

	@FXML // fx:id="tf_Search"
	private TextField tf_Search; // Value injected by FXMLLoader

	@FXML // fx:id="b_Search"
	private Button b_Search; // Value injected by FXMLLoader

	@FXML // fx:id="tf_Titel"
	private TextField tf_Titel; // Value injected by FXMLLoader

	@FXML // fx:id="tf_Haupt"
	private TextField tf_Haupt; // Value injected by FXMLLoader

	@FXML // fx:id="tf_Original"
	private TextField tf_Original; // Value injected by FXMLLoader

	@FXML // fx:id="tf_Jahr"
	private TextField tf_Jahr; // Value injected by FXMLLoader

	@FXML // fx:id="b_Change"
	private Button b_Change; // Value injected by FXMLLoader

	@FXML // fx:id="tf_Regie"
	private TextField tf_Regie; // Value injected by FXMLLoader

	@FXML // fx:id="cb_Genre"
	private ComboBox<?> cb_Genre; // Value injected by FXMLLoader

	@FXML // fx:id="tf_Laenge"
	private TextField tf_Laenge; // Value injected by FXMLLoader

	@FXML // fx:id="tv_Buch"
	private TextField tv_Buch; // Value injected by FXMLLoader

	@FXML // fx:id="tv_Movies1"
	private TableView<?> tv_Movies1; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Titel1"
	private TableColumn<?, ?> tc_Titel1; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Original1"
	private TableColumn<?, ?> tc_Original1; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Haupt1"
	private TableColumn<?, ?> tc_Haupt1; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Regie1"
	private TableColumn<?, ?> tc_Regie1; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Buch1"
	private TableColumn<?, ?> tc_Buch1; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Musik1"
	private TableColumn<?, ?> tc_Musik1; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Jahr1"
	private TableColumn<?, ?> tc_Jahr1; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Laenge1"
	private TableColumn<?, ?> tc_Laenge1; // Value injected by FXMLLoader

	@FXML // fx:id="tc_Genre1"
	private TableColumn<?, ?> tc_Genre1; // Value injected by FXMLLoader

	@FXML
	void ChangeClick(ActionEvent event) {

	}

	@FXML
	void searchMovieClick(ActionEvent event) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javafx.fxml.Initializable#initialize(java.net.URL,
	 * java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}