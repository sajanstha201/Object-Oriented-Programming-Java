package javaFx;
import javafx.application.Application;
import javafx.scene.shape.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class first_fx extends Application{
	String checkbox="";
	public void start(Stage primarystage) {
		//Image im=new Image("url");
		//ImageView ig=new ImageView(im);
		Canvas c=new Canvas(100,100);
		GraphicsContext gc=c.getGraphicsContext2D();
		gc.fillRect(10, 10, 100, 20);
		gc.setFill(Color.RED);
		gc.fillText("my name is sajns shdlfjdlfjsldfjlsdfj", 10, 10);
		gc.fillRect(0, 0, 100, 100);
		gc.setFill(Color.BLACK);
		gc.fillOval(0, 0, 20, 20);
		gc.strokeLine(0,0,200,200);

		gc.clearRect(0, 0,200, 200);
		gc.strokeRect(20, 20, 10,10);
		Label lb=new Label();
		lb.setText("my name is sajan shrestha");
		lb.setTextFill(Color.RED);
		Button btn=new Button("click me");
		ToggleGroup g=new ToggleGroup();
		RadioButton r1=new RadioButton("sajan");
		RadioButton r2=new RadioButton("deep");
		RadioButton r3=new RadioButton("devraj");
		CheckBox c1=new CheckBox("1");
		CheckBox c2=new CheckBox("2");
		CheckBox c3=new CheckBox("3");
		r1.setToggleGroup(g);
		r2.setToggleGroup(g);
		r3.setToggleGroup(g);
		Button b=new Button("click");
		ToggleButton tb=new ToggleButton("toggle button");
		TextField text=new TextField();
		tb.setOnAction(event->{
			text.setText("clicked Toggle Button");
			System.out.println(text.getText());
		});
		ComboBox <String>cb=new ComboBox<>();
		cb.getItems().add("ajaya");
		cb.getItems().add("dev");
		cb.getItems().add("sajan");
		Label label=new Label("here");
		b.setOnAction(event->{
			label.setText(cb.getValue());
		});
		ListView<String> lv=new ListView<>();
		Label l2=new Label("list view");
		Button b2=new Button("click me for list view");
		b2.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e) {
				
			}
		});
		lv.getItems().add("sajan shrestha");
		lv.getItems().add("devraj silwal");
		lv.getItems().add("deep khadka");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				checkbox="Selected items: ";
				lb.setText("shrestha");;
				if(r1.isSelected())
					lb.setText(r1.getText());
				else if(r2.isSelected())
					lb.setText(r2.getText());
				else if(r3.isSelected())
					lb.setText(r3.getText());
				if(c1.isSelected())
					checkbox+=c1.getText();
				if(c2.isSelected())
					checkbox+=c2.getText();
				if(c3.isSelected())
					checkbox+=c3.getText();
				lb.setText(checkbox);
					
			}
		});
		GridPane gp=new GridPane();
		gp.add(lb, 0, 0);
		gp.add(btn, 0, 1);
		gp.setHgap(10);
		gp.setVgap(10);
		VBox v=new VBox(lb,btn,tb,b,r1,r2,r3,c1,c2,c3,text,cb,label,l2,b2,c,lv);
		Circle t=new Circle(50,50,50);
		t.setStroke(Color.RED);
		t.setFill(Color.RED);
		Canvas cv=new Canvas(400,400);
		GraphicsContext gcc=cv.getGraphicsContext2D();
		gcc.setFill(Color.BLUE);
		gcc.fillRect(100, 100, 600, 600);
		VBox h=new VBox(cv);
		Scene sc=new Scene(h,1000,1000);
		primarystage.setScene(sc);
		primarystage.setTitle("sajan shrestha");
		primarystage.show();
	}
public static void main(String [] args) {
	String name=new String("sajan");
	System.out.println(name);
	launch();
}
}
