package latihann.coba2.test;

import latihann.coba2.consumer.Consumer;
import latihann.coba2.injector.MessageServiceInjector;
import latihann.coba2.injector.SMSServiceInjector;

public class MyMessageDITest
{
    public static void main(String[] args) 
    {
        String msg = "hallo" ;
        String email = "regina1700016024@webmail.uad.ac.id";
        String phone = "2301345";
        MessageServiceInjector injector = null;
        Consumer app = null;

        //Kirim email
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessage(msg, email);

        //Kirim SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessage(msg, phone);
    }
}
