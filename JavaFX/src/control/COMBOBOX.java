package javaFx;
import javafx.scene.canvas.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.application.*;
import javafx.stage.*;
import javafx.collections.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class COMBOBOX extends Application{
	public void start(Stage primarystage) {
		Canvas c=new Canvas(200,200);
		GraphicsContext gc=c.getGraphicsContext2D();
		GridPane gp=new GridPane();
		ObservableList<String> ob=FXCollections.observableArrayList("circle","rectangle");
		ComboBox <String> cb=new ComboBox<>(ob);
		cb.valueProperty().addListener((observable,oldvalue,newvalue)->{
			gc.clearRect(0,0,gp.getWidth(),gp.getHeight());
			if(newvalue=="circle")
				gc.fillOval(0.5, 0.5, 100,100);
			if(newvalue=="rectangle")
				gc.fillRect(0.5, 0.5, 100, 100);
		});
		Button btn=new Button("change color");
		btn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e) {
				System.out.println("sajan");
				if(Math.random()>0.5)
					gc.setFill(Color.RED);
				else
					gc.setFill(Color.BLUE);	
			}
		});
		
		
		//another way to do it using button
		ComboBox<String> cb2=new ComboBox<>();
		cb2.getItems().add("sajan");
		cb2.getItems().add("deep");
		Button b2=new Button("click name");
		Label lb=new Label("heer");
		b2.setOnAction(event->{
			String selectedName=cb2.getValue();
			lb.setText("Selected Name is "+selectedName);
		});
		gp.add(btn, 0, 0);
		gp.add(cb, 1, 0);
		gp.add(c, 2, 0);
		gp.add(cb2,0,1);
		gp.add(b2,1,1);
		gp.add(lb,2,1);
		
		Scene sc=new Scene(gp);
		primarystage.setScene(sc);
		primarystage.setTitle("shape");
		primarystage.show();
	}
public static void main(String [] args) {
	launch(args);
}
}

