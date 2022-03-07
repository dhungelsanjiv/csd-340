/*
Assignment:

Write a program that displays four images randomly selected from a deck of 52 cards. The attached zip file has card files titled 1.png, 2.png, 3.png, 4.png, …, 52.png. For this application:

        Store the images in a “cards” sub directory.
        Using these cards, randomly select four cards for display.
        You may use a different set of images you either have or decide to make.

*/

package redomodule8;

import java.util.Random;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author sanjiv dhungel
 */
public class RedoModule8 extends Application {
    private final ImageView imv1 = new ImageView();
    private final ImageView imv2 = new ImageView();
    private final ImageView imv3 = new ImageView();
    private final ImageView imv4 = new ImageView();
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Random rand = new Random();
        int firstCard = 1 + rand.nextInt(54);
        int secondCard = 1 + rand.nextInt(54);
        int thirdCard = 1 + rand.nextInt(54);
        int fourthCard = 1 + rand.nextInt(54);
        
        imv1.setImage(new Image("src/remodule8.cards/"+firstCard+".png"));
        imv2.setImage(new Image("src/remodule8.cards/"+secondCard+".png"));
        imv3.setImage(new Image("src/remodule8.cards/"+thirdCard+".png"));
        imv4.setImage(new Image("src/remodule8.cards/"+fourthCard+".png"));
        imv1.relocate(5,5);
        imv2.relocate(75,5);
        imv3.relocate(145,5);
        imv4.relocate(215,5);
        StackPane root = new StackPane();
        pane.getChildren().addAll(imv1,imv2,imv3,imv4);
        root.getChildren().add(pane);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("RandomPlayingCardsREDOModule8");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

