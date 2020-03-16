package latihann.coba2.injector;

import latihann.coba2.consumer.Consumer;
import latihann.coba2.consumer.MyDIApplication;
import latihann.coba2.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector
{
    @Override
    public Consumer getConsumer()
    {
        return new MyDIApplication(new SMSServiceImpl());
    }
}
