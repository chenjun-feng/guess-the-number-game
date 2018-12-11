package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageGeneratorImpl implements MessageGenerator{

    // == constants ==
    private final static Logger log = LoggerFactory.getLogger(MessageGenerator.class);

    @Autowired
    private Game game;
    private int guessCount = 10;

    @Override
    public String getMainMessage() {
        return "getMainMessage() is called";
    }

    @Override
    public String getResultMessage() {
        return "gerResultMessage() is called";
    }
}
