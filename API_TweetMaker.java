package api_tweetmaker;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Joseph Charland
 * CIT 244 API Final :)
 */
public class API_TweetMaker extends Application {
    
    //left blank, to be overidden in demo class
    @Override
    public void start(Stage primaryStage) {
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    /**
     * Creates a circle profile image
     * 
     * @param url The url of your image
     * @return a Circle with an image inside
     */
    public Pane setProfileImage(String url){
        Pane prof = new Pane();
        Circle cir = new Circle(30,30,20);
        Image im = new Image(url);
        cir.setFill(new ImagePattern(im));
        
        prof.getChildren().add(cir);
        return prof;
    }
    
    
    /**
     * Creates main body of tweet. 
     * 
     * @param tweet
     * @return Pane with text
     */
    public Pane setTweetBody(String tweet){
        Pane tweetBod = new Pane();
        
        
        //for main body text sizing
        double size = 14;
        
        //main body of tweet
        Text tx = new Text(tweet);
        tx.setFont(Font.font(size));
        tx.setLayoutX(15);
        tx.setLayoutY(70);
        tx.setWrappingWidth(380);
        
        //add tx to pane
        tweetBod.getChildren().add(tx);
        return tweetBod;
    }
    /**
     * Creates main body of tweet. 
     * 
     * @param userName
     * @param title
     * @return Pane with text
     */
    public Pane setName(String userName, String title){
        Pane name = new Pane();
        Label lb1 = new Label();
        Label lb2 = new Label();
    
        lb1.setLayoutX(60);
        lb1.setLayoutY(15);
        lb1.setFont(Font.font("Times New Roman", FontWeight.BOLD,12));
    
        lb2.setLayoutX(60);
        lb2.setLayoutY(30);
        lb2.setFont(Font.font("Times New Roman", 10));
    
    
        lb1.setText(title);
        lb2.setText(userName);
    
    
        name.getChildren().add(lb2);
        name.getChildren().add(lb1);
    
        return name;
   }
    /**
     * Creates Timestamp section of tweet. 
     * 
     * 
     * @param retweets
     * @param quoteTweets
     * @param likes
     * @return Pane with timestamp
     */
    public Pane setTimeStamp(String retweets, String quoteTweets, String likes){
        Pane stamp = new Pane();
        
        Label lb1 = new Label(retweets + " RETWEETS");
        lb1.setLayoutX(20);
        lb1.setLayoutY(170);
        
        Label lb2 = new Label(quoteTweets + " QUOTETWEETS");
        lb2.setLayoutX(150);
        lb2.setLayoutY(170);
        
        Label lb3 = new Label(likes + " LIKES");
        lb3.setLayoutX(300);
        lb3.setLayoutY(170);
  
        stamp.getChildren().add(lb1);
        stamp.getChildren().add(lb2);
        stamp.getChildren().add(lb3);

        
        
        
        return stamp;
        
        
    }
    
}
