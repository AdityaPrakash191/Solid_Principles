public class NotiicationSender {

    public void SendNotifications(List<Notification> notifications){
        for(Notification n : notifications){
            n.send();
        }
    }

}