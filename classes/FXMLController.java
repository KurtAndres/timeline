package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import static classes.driver.theTimeline;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.input.KeyEvent;
/**
 *
 * @author Andrew
 */
public class FXMLController implements Initializable {
    private int month;
    private int day;
    private Timeline timeline = theTimeline;
    
    @FXML
    private ResourceBundle resources;

    
    @FXML
    private URL location;

    @FXML
    private MenuItem Apr;

    @FXML
    private MenuItem Aug;

    @FXML
    private MenuItem Dec;

    @FXML
    private MenuItem Feb;

    @FXML
    private MenuItem Jan;

    @FXML
    private MenuItem Jul;

    @FXML
    private MenuItem Jun;

    @FXML
    private MenuItem Mar;

    @FXML
    private MenuItem May;

    @FXML
    private MenuItem Nov;

    @FXML
    private MenuItem Oct;

    @FXML
    private MenuItem Sep;

    @FXML
    private TextField born;

    @FXML
    private MenuButton dayMenu;


    @FXML
    private MenuItem day_1;

    @FXML
    private MenuItem day_10;

    @FXML
    private MenuItem day_11;

    @FXML
    private MenuItem day_12;

    @FXML
    private MenuItem day_13;

    @FXML
    private MenuItem day_14;

    @FXML
    private MenuItem day_15;

    @FXML
    private MenuItem day_16;

    @FXML
    private MenuItem day_17;

    @FXML
    private MenuItem day_18;
    
    @FXML
    private MenuItem day_19;

    @FXML
    private MenuItem day_2;

    @FXML
    private MenuItem day_20;

    @FXML
    private MenuItem day_21;

    @FXML
    private MenuItem day_22;

    @FXML
    private MenuItem day_23;

    @FXML
    private MenuItem day_24;

    @FXML
    private MenuItem day_25;

    @FXML
    private MenuItem day_26;

    @FXML
    private MenuItem day_27;

    @FXML
    private MenuItem day_28;

    @FXML
    private MenuItem day_29;

    @FXML
    private MenuItem day_3;

    @FXML
    private MenuItem day_30;

    @FXML
    private MenuItem day_31;

    @FXML
    private MenuItem day_4;

    @FXML
    private MenuItem day_5;

    @FXML
    private MenuItem day_6;

    @FXML
    private MenuItem day_7;

    @FXML
    private MenuItem day_8;

    @FXML
    private MenuItem day_9;

    @FXML
    private TextField died;

    @FXML
    private Label label;

    @FXML
    private MenuButton monthMenu;


    @FXML
    private TextField yearInput;
    
    @FXML
    private ScrollPane timelineRender;
    
    @FXML
    void handleDayAction(ActionEvent event) {
        Object source = event.getSource();
        if (source.equals(day_1)){ 
            day = 1;
            updateTimeline();
           
        }
        else if (source.equals(day_2)){ 
            day = 2;
            DurationEvent walk =  new DurationEvent();
            walk.setEvent("Walk", 2010, 12, 01, 2013, 12, 31, "Learned the slow process of walking a little late");
            timeline.addEvent(walk);
            updateTimeline();
        }
        else if (source.equals(day_3)) day = 3;
        else if (source.equals(day_4)) day = 4;
        else if (source.equals(day_5)) day = 5;
        else if (source.equals(day_6)) day = 6;
        else if (source.equals(day_7)) day = 7;
        else if (source.equals(day_8)) day = 8;
        else if (source.equals(day_9)) day = 9;
        else if (source.equals(day_10)) day = 10;
        else if (source.equals(day_11)) day = 11;
        else if (source.equals(day_12)) day = 12;
        else if (source.equals(day_13)) day = 13;
        else if (source.equals(day_14)) day = 14;
        else if (source.equals(day_15)) day = 15;
        else if (source.equals(day_16)) day = 16;
        else if (source.equals(day_17)) day = 17;
        else if (source.equals(day_18)) day = 18;
        else if (source.equals(day_19)) day = 19;
        else if (source.equals(day_20)) day = 20;
        else if (source.equals(day_21)) day = 21;
        else if (source.equals(day_22)) day = 22;
        else if (source.equals(day_23)) day = 23;
        else if (source.equals(day_24)) day = 24;
        else if (source.equals(day_25)) day = 25;
        else if (source.equals(day_26)) day = 26;
        else if (source.equals(day_27)) day = 27;
        else if (source.equals(day_28)) day = 28;
        else if (source.equals(day_29)) day = 29;
        else if (source.equals(day_30)) day = 30;
        else if (source.equals(day_31)) day = 31;
        else day = -1;
        System.out.println(day);
        
    }
    public int getDay(){
        return day;
    }
    
    public ScrollPane getScrollPane()
    {
        
        return timelineRender;
    }



    @FXML
    private void handleMonthAction(ActionEvent event) {
        Object source  = event.getSource();
        if (source.equals(Jan)) month = 1;
        else if (source.equals(Feb)) month = 2;
        else if (source.equals(Mar)) month = 3;
        else if (source.equals(Apr)) month = 4;
        else if (source.equals(May)) month = 5;
        else if (source.equals(Jun)) month = 6;
        else if (source.equals(Jul)) month = 7;
        else if (source.equals(Aug)) month = 8;
        else if (source.equals(Sep)) month = 9;
        else if (source.equals(Oct)) month = 10;
        else if (source.equals(Nov)) month = 11;
        else if (source.equals(Dec)) month = 12;
        else month = -1;
        
    }
    public int getMonth(){
        return month;
    }
    
    
    

    
    
    
    @FXML
    private void handleDateBornAction(ActionEvent ae){
    }
   
    public void handleYearBorn(){
        String year = yearInput.getText();
        System.out.println(year);
    }
    public void updateTimeline(){
         timelineRender tlr = new timelineRender();
         Canvas can = tlr.getTimelineRender(timeline);
         timelineRender.setContent(can);
    }
                
       
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        assert Apr != null : "fx:id=\"Apr\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert Aug != null : "fx:id=\"Aug\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert Dec != null : "fx:id=\"Dec\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert Feb != null : "fx:id=\"Feb\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert Jan != null : "fx:id=\"Jan\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert Jul != null : "fx:id=\"Jul\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert Jun != null : "fx:id=\"Jun\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert Mar != null : "fx:id=\"Mar\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert May != null : "fx:id=\"May\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert Nov != null : "fx:id=\"Nov\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert Oct != null : "fx:id=\"Oct\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert Sep != null : "fx:id=\"Sep\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert dayMenu != null : "fx:id=\"dayMenu\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert day_1 != null : "fx:id=\"day_1\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert day_2 != null : "fx:id=\"day_2\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert day_3 != null : "fx:id=\"day_3\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert day_4 != null : "fx:id=\"day_4\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert day_5 != null : "fx:id=\"day_5\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert day_6 != null : "fx:id=\"day_6\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert day_7 != null : "fx:id=\"day_7\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert monthMenu != null : "fx:id=\"monthMenu\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";
        assert timelineRender != null : "fx:id=\"timelineRender\" was not injected: check your FXML file 'Timeline_fxml.fxml'.";

        // TODO
                
    }    
    
}
                
        
    
    
    