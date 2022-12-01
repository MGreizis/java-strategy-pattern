public class Chatbot {
    private ChatbotMode strategy;

    public void setChatbotMode(ChatbotMode strategy) {
        this.strategy = strategy;
    }

    public String getResponse() {
        return strategy.getMessage();
    }
}
