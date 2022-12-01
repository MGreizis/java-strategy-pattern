public class Main {
    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();

        Chatbot bot = new Chatbot();
        bot.setChatbotMode(new GoogleStrategy());
//        bot.setChatbotMode(new BeNiceStrategy());

        while(true) {
            String input = reader.read();

            String text = bot.getResponse();

            writer.write(text);
        }
    }
}