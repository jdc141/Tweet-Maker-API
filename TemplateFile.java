import api_tweetmaker.API_TweetMaker;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TemplateFile extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
    @Override
    public void start(Stage primaryStage) {
        //Initialization - every element added will be added to pane 
        API_TweetMaker tweet = new API_TweetMaker();
        Pane pane = new Pane();
        
        //Add an Image to your tweet
//        Pane img = new Pane(tweet.setProfileImage("EDIT ME!!!"));
//        pane.getChildren().add(img);
        
        //Add a tweet body to your tweet (the main content)
//        Pane text = new Pane(tweet.setTweetBody("EDIT ME!!!"));
//        pane.getChildren().add(text);
        
        //Add your username and title - make sure to use an @ for a username!
//        Pane userName = new Pane(tweet.setName("EDIT ME!!!", "EDIT ME!!!"));
//        pane.getChildren().add(userName);
        
        //Add your user 
//        Pane timestamp = new Pane(tweet.setTimeStamp("EDIT ME!!!", "EDIT ME!!!", "EDIT ME!!!"));
//        pane.getChildren().add(timestamp);
        
//      editing below line this line is not needed. 
        Scene scene = new Scene(pane, 400, 200);
        primaryStage.setTitle("Tweet Image");
        
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.show();
    }
    
}

    
    