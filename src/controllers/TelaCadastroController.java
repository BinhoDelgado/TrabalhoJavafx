package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TelaCadastroController{
	@FXML
	private BorderPane telaCadastroRoot;
	@FXML
	private TextField textFieldNomePeca;
	//private TextField textFieldEmail;
	@FXML
	private TextField textFieldValor;
	//private TextField textFieldSenha;
	@FXML
	private TextField textFieldQuantidade;
	//private TextField textFieldIdade;
	
	public void cadastrar() throws IOException{
		String nomePeca = textFieldNomePeca.getText().trim();
		System.out.println(nomePeca);
		int valor = Integer.parseInt(textFieldValor.getText());
		System.out.println(valor);
		int quantidade = Integer.parseInt(textFieldQuantidade.getText().trim());
		System.out.println(quantidade);
		//String email = textFieldEmail.getText().trim();
		//System.out.println(email);
		//String senha = textFieldSenha.getText();
		//System.out.println(senha);
		//int idade = Integer.parseInt(textFieldIdade.getText().trim());
		//System.out.println(idade);
//-----------------------------------------------------------------------------------------------------		
		/*
		Usuario usuario = new Usuario();
		usuario.setEmail(email);
		usuario.setSenha(senha);
		
		DaoUsuario daoUsuario = new DaoUsuario();
		try {
			daoUsuario.cadastrar(usuario);
		}catch(Exception e) {
			Alert a = new Alert(AlertType.ERROR);
			a.setHeaderText("Atenção!!");
			a.setContentText("Erro ao carregar usuários: " + e.getMessage);
		}
		*/
	}

	public void clickCancelar() throws IOException{				
		Stage stage = (Stage) this.telaCadastroRoot.getScene().getWindow();
		
		BorderPane bp = new FXMLLoader(getClass().getResource("/views/TelaInicial.fxml")).load();

		Scene cena = new Scene(bp);
		
		stage.setScene(cena);
		stage.show();
	}
}