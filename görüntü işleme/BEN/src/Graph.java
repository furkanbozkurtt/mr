import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
 
public class Graph extends Application {
 
    @Override public void start(Stage stage) {
        stage.setTitle("Line Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Photos");
        yAxis.setLabel("Intensities");
        
        final LineChart<String,Number> lineChart = 
                new LineChart<String,Number>(xAxis,yAxis);
                
        lineChart.setTitle(" Intensýty Values of Photos ");
                                
        XYChart.Series series = new XYChart.Series();
    
        if(SelectedArea.values[0]!=0 && SelectedArea.values[1]!=0 && SelectedArea.values[2]!=0 && SelectedArea.values[3]!=0) {
        series.getData().add(new XYChart.Data("Photo1", SelectedArea.values[0]));
        series.getData().add(new XYChart.Data("Photo2", SelectedArea.values[1]));
        series.getData().add(new XYChart.Data("Photo3", SelectedArea.values[2]));
        series.getData().add(new XYChart.Data("Photo4", SelectedArea.values[3]));
        }
        
        
        
        if(SelectedArea.values[0]!=0 && SelectedArea.values[1]!=0 && SelectedArea.values[2]!=0 && SelectedArea.values[3]==0) {
            series.getData().add(new XYChart.Data("Photo1", SelectedArea.values[0]));
            series.getData().add(new XYChart.Data("Photo2", SelectedArea.values[1]));
            series.getData().add(new XYChart.Data("Photo3", SelectedArea.values[2]));
           
            }
        
        if(SelectedArea.values[0]!=0 && SelectedArea.values[1]!=0 && SelectedArea.values[2]==0 && SelectedArea.values[3]==0) {
            series.getData().add(new XYChart.Data("Photo1", SelectedArea.values[0]));
            series.getData().add(new XYChart.Data("Photo2", SelectedArea.values[1]));
            
           
            }
        
        if(SelectedArea.values[0]!=0 && SelectedArea.values[1]==0 && SelectedArea.values[2]==0 && SelectedArea.values[3]==0) {
            series.getData().add(new XYChart.Data("Photo1", SelectedArea.values[0]));
           
            
           
            }
     
        
        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().add(series);
       
        stage.setScene(scene);
        stage.show();
     
    }
 
    public static void main(String[] args) {
        launch(args);
    }
    
}