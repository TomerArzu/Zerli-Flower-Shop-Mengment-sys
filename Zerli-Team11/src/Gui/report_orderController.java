/************************************************************************** 
 * Copyright (�) Zerli System 2017-2018 - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Edo Notes <Edoono24@gmail.com>
 * 			  Tomer Arzuan <Tomerarzu@gmail.com>
 * 			  Matan Sabag <19matan@gmail.com>
 * 			  Ido Kalir <idotehila@gmail.com>
 * 			  Elinor Faddoul<elinor.faddoul@gmail.com
 **************************************************************************/
package Gui;

import java.awt.Label;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.TreeMap;

import Entities.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class report_orderController 
{
	
	public TreeMap<String, String> directory = new TreeMap<String, String>();


	@FXML
	TextField tx1;


	@FXML
	public void BackBtn(ActionEvent event) throws IOException
	{
		((Node)event.getSource()).getScene().getWindow().hide();//Hide Menu
		Stage primaryStage=new Stage();
		Parent root=FXMLLoader.load(getClass().getResource("/Gui/ShopManagerMenu.fxml"));
		Scene Scene = new Scene(root);
		Scene.getStylesheets().add(getClass().getResource("ShopManagerMenu.css").toExternalForm());
		primaryStage.setScene(Scene);
		primaryStage.show();
	}
	public void setdirectory(TreeMap<String, String> d)
	{
		this.directory=d;
	}
	

	
	public void load_dir(TreeMap<String, String> directory)
	{this.directory=directory;
	String t="";
	int j=0;
	String s="";
	this.tx1.setText(this.directory.toString());
	 System.out.print(s);
	 

	}


}
