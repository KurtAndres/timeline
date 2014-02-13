package classes;

import java.util.*;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.input.MouseEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.control.ScrollPane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Conner
 */
public class timelineRender {
    static Timeline tl;
    static ArrayList<clickSpace> csArray = new ArrayList<clickSpace>();
    static clickSpace cs;
    
    public Canvas getTimelineRender(Timeline timeline){
        tl = timeline;
        /*
        Event ev;
        
        tl = new drawingtest.Timeline("Timeline Name");
        for(int i = 0; i<25; i++){
            ev = new drawingtest.AtomicEvent();
            ev.setEvent("190"+i+" info","190"+i,""+i,""+i);
            tl.addEvent(ev);
        }
        */
     
      
         int begin = tl.timelineEvents.firstEntry().getValue().getStartYear();
        int end = tl.timelineEvents.lastEntry().getValue().getStartYear();
        int length = end - begin;
        
        Canvas canvas = new Canvas(100+(length+2)*100, 1000);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        
        /*
        canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, 
                new EventHandler<MouseEvent>(){
 
            @Override
            public void handle(MouseEvent event) {
               int x = (int)event.getX();
               int y = (int)event.getY();
               for(int i =0; i<csArray.size(); i++){
                   cs = csArray.get(i);
                   if(x > cs.x && x < cs.x+15 && y > cs.y && y < cs.y+15){
                       
                       (new Thread(new PopUp())).start();
                        

                   }
               }
                
            }
        });
        */
        return canvas;
        
      
    }
    private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(1);
        gc.fillText(tl.name, 40, 20);
        int begin = tl.timelineEvents.firstEntry().getValue().getStartYear();
        int end = tl.timelineEvents.lastEntry().getValue().getStartYear();
        
        int length = end - begin;
        
         System.out.println("begin "+begin+" end "+end+" length "+length);
         
        gc.strokeLine(40, 100, (length+2)*100, 100);
        for(int i = 0; i < length+2; i++){
            gc.strokeLine(40+i*100, 80, 40+i*100, 120);
            gc.fillText(""+(begin+i), 40+i*100, 60);
            
        }
        
        Iterator it = tl.timelineEvents.keySet().iterator();
        for(int i = 0; i < tl.timelineEvents.size(); i++ ){
            
            
            
            Event next = tl.timelineEvents.get(it.next());
            gc.setStroke(Color.RED);
            gc.setFill(Color.RED);
            int offset = (next.getStartDay()+(next.getStartMonth()*30))/4;
            gc.strokeLine(40+(next.getStartYear()-begin)*100+offset, 90, 40+(next.getStartYear()-begin)*100+offset, 110);
            //clickSpace cls = new clickSpace(35+i*100, 25, next);
            //csArray.add(cls);
            gc.fillText(""+next.getStartYear()+"/"+next.getStartMonth()+"/"+next.getStartDay(), 50+(next.getStartYear()-begin)*100, 135);
            gc.fillText(next.getName(), 50+(next.getStartYear()-begin)*100, 150);
        }
        
    }
    /*
     public class PopUp implements Runnable {
         
     public void run() {
        //showStage();
        JOptionPane.showMessageDialog(null, cs.ev.getDescription());
     }

     }
     public static void showStage(){
        Stage newStage = new Stage();
        VBox comp = new VBox(8);
        //TextField month = new TextField("Month");
        //TextField month = new TextField("Month");
        TextField sYear = new TextField("Start Year");
        TextField eYear = new TextField("End Year");
        TextField month = new TextField("Month");
        //TextField month = new TextField("Month");
        //TextField month = new TextField("Month");
        //TextField month = new TextField("Month");
        comp.getChildren().add(sYear);
        comp.getChildren().add(month);

        Scene stageScene = new Scene(comp, 300, 300);
        newStage.setScene(stageScene);
        newStage.show();
    
}
    */
}
