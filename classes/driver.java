package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.ScrollPane;
import javafx.scene.canvas.Canvas;

/**
 *
 * @author Andrew
 */
public class driver extends Application {
    static Timeline theTimeline = new Timeline("Kurt");
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Timeline_fxml.fxml"));
        timelineRender tlr = new timelineRender();
        Canvas can = tlr.getTimelineRender(theTimeline);
        
        //pane.setVmax(200);
        //pane.setPrefSize(300,600);
        
        
       // pane.setContent(can);
        Scene scene = new Scene(root, 500, 320);
        
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        
        AtomicEvent Born =  new AtomicEvent();
        Born.setEvent("Born", 1992, 11, 22, 00, 00, 00, "Kurt was Born.");
        theTimeline.addEvent(Born);
       
        AtomicEvent curesCancer =  new AtomicEvent();
        curesCancer.setEvent("CancerCure", 1994, 11, 22, 00, 00, 00, "Cured cancer on his second birthday.");
        theTimeline.addEvent(curesCancer);
        
        AtomicEvent poops =  new AtomicEvent();
        poops.setEvent("poops", 1994, 12, 22, 00, 00, 00, "poops on his second birthday.");
        theTimeline.addEvent(poops);
                
        DurationEvent strugglesSocially =  new DurationEvent();
        strugglesSocially.setEvent("Struggle", 1993, 05, 13, 2014, 2, 12, "Continues to struggle with his social life.");
        theTimeline.addEvent(strugglesSocially);

        
                
        launch(args);
        
    }
    
}
//test of synchronization of commits from lab computer
