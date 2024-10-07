package Default;

interface MessageService{
    void SendMessage();
    default void ReceiveMessage(){
        System.out.println("update version inside the message service platform");
    }
}
class MessageServiceImpl implements MessageService{
    @Override
    public void SendMessage(){
        System.out.println("send message available for message service platform ");
    }
    @Override
    public  void ReceiveMessage(){
        MessageService.super.ReceiveMessage();
        System.out.println("Addition features you have added to your own logic ");

    }
}
public class DemoMessageService {
    public static void main(String[] args) {
        MessageServiceImpl ms = new MessageServiceImpl();
        ms.SendMessage();
        ms.ReceiveMessage();
    }
}
