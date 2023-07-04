package controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import models.VendaPeca;
import models.VendaPecaDAOMySQL;

public class TelaInicialController implements Initializable {
	@FXML
	private BorderPane telaInicial;
	
	@FXML
	private TableView tabelaVendaPeca;
	
	@FXML
	private TableColumn<VendaPeca, Integer> colunaValor;
	@FXML
	private TableColumn<VendaPeca, Integer> colunaQuantidade;
	@FXML
	private TableColumn<VendaPeca, String> colunaNomePeca;

	public void initialize(URL arg0, ResourceBundle arg1) {
		
		colunaValor.setCellValueFactory( new PropertyValueFactory<>("valor") );
		colunaQuantidade.setCellValueFactory( new PropertyValueFactory<>("quantidade") );
		colunaNomePeca.setCellValueFactory( new PropertyValueFactory<>("nomePeca") );
		
		VendaPecaDAOMySQL vendaPecaDAOMySQL = new VendaPecaDAOMySQL();
		
			List<VendaPeca> vendaPecas = vendaPecaDAOMySQL.listar();
			
			tabelaVendaPeca.setItems( FXCollections.observableArrayList( vendaPecas ) ); 
			
	}
	
	public void clickCadastrar() throws IOException{				
		Stage stage = (Stage) this.telaInicial.getScene().getWindow();
		
		BorderPane bp = new FXMLLoader(getClass().getResource("/views/TelaCadastro.fxml")).load();

		Scene cena = new Scene(bp);
		
		stage.setScene(cena);
		stage.show();
	}
}