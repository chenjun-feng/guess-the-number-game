package academy.learnprogramming;

// do not add component annotation here, Game interface shoudl be decoupled with Spring
public interface Game {

    int getNumber();

    int getGuess();

    int setGuess(int guess);

    int getSmallest();

    int getBiggest();

    int getRemainingGuesses();

    void reset();

    void check();

    boolean isValidNumberRange();

    boolean isGameWon();

    boolean isGameLost();
}
