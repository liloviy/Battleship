import controller.GamePresenter;
import model.Game;
import view.GameInterface;
import view.GameWindow;

public class Main {
    public static void main(String[] args)  {
        //view
        GameInterface gameInterface = GameWindow.getInstance();
        gameInterface.init();

        //presenter
        GamePresenter gamePresenter = GamePresenter.getInstance();
        gamePresenter.setInterface(GameWindow.getInstance());

        //model
        Game game = Game.getInstance();
        game.init();
        game.start();
    }
}