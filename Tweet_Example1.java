import api_tweetmaker.API_TweetMaker;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Tweet_Example1 extends Application {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    @Override
    public void start(Stage primaryStage) {
        API_TweetMaker tweet = new API_TweetMaker();
        
        Pane pane = new Pane();
        
        //tweet Image 
        Pane img = new Pane(tweet.setProfileImage("https://dev.java/assets/images/java-logo-vert-blk.png"));
        pane.getChildren().add(img);
        
        //tweet body
        Pane text = new Pane(tweet.setTweetBody("I hear CIT 244 has a final?"));
        pane.getChildren().add(text);
        
        //UserName & Title
        Pane userName = new Pane(tweet.setName("@JavaGuru", "James Winyard"));
        pane.getChildren().add(userName);
        
        //TimeStamp 
        Pane timestamp = new Pane(tweet.setTimeStamp("12354", "1235", "639645"));
        pane.getChildren().add(timestamp);
        
        Scene scene = new Scene(pane, 400, 200);
        primaryStage.setTitle("Tweet Image");
        
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    
    
}
