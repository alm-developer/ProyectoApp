package org.example.ui.seguridad;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;


public class InicioSesionUI extends BorderPane {


    public InicioSesionUI(){
        this.setStyle("-fx-background-color: linear-gradient(to right, #000000 10%, #2a220d 100%);");

        HBox hbox1 = new HBox();
        hbox1.setStyle("-fx-background-color: blue");
        hbox1.setAlignment(Pos.CENTER);
        setCenter(hbox1);

        VBox vbox1 = new VBox();
        vbox1.setStyle("-fx-background-color: red");
        vbox1.setAlignment(Pos.CENTER);
        vbox1.setPrefWidth(150);
        vbox1.setPrefWidth(100);

        VBox vbox2 = new VBox();
        vbox2.setStyle("-fx-background-color: yellow");


        vbox2.setAlignment(Pos.CENTER);
        vbox2.setPrefWidth(150);
        vbox2.setPrefWidth(100);


        HBox.setHgrow(vbox1, Priority.ALWAYS);
        HBox.setHgrow(vbox2, Priority.ALWAYS);


        hbox1.getChildren().add(vbox1);
        hbox1.getChildren().add(vbox2);

    }



}
