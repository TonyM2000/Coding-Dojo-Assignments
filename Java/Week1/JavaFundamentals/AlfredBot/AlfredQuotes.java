import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello %s lovely to see you",name);
    }
    
    public String dateAnnouncement() {
         // YOUR CODE HERE
        Date date = new java.util.Date();
        return String.format("Todays date is %s",date);
    }
    
    public String answeringBeforeAlexis(String phrase) {
        if(phrase.indexOf("Alexis") > -1) {
            return "She's really of no help. What can I get for you?";
        }
        if (phrase.indexOf("Alfred") > -1) {
            return "At your service, naturally. How may I be of assistance?";
        }
        return "Right. And with that I shall retire.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}


