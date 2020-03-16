package latihann.coba2.test;

import org.checkerframework.dataflow.qual.TerminatesExecution;

import jdk.jfr.Timestamp;
import latihann.coba2.consumer.Consumer;
import latihann.coba2.consumer.MyDIApplication;
import latihann.coba2.injector.MessageServiceInjector;
import latihann.coba2.service.MessageService;

public class MyDIApplicationJUnitTest
{
    private MessageServiceInjector injector;
    @Before
    public void setUp()
    {
        //mock injector dengan class anonim
        injector = new MessageServiceInjector(){
        
            @Override
            public Consumer getConsumer() {
                //mock layanan pesan
                return new MyDIApplication(new MessageService(){
                
                    @Override
                    public void sendMessage(String msg, String rec) {
                        System.out.println("Implementasi Layanan Pesan Mock");
                    }
                });
            }
        };
    }

    @Test
    public void test()
    {
        Consumer consumer = injector.getConsumer();
        consumer.processMessage("hallo", "regina1700016024@webmail.uad.ac.id");
    }

    @After
    public void tear()
    {
        injector = null;
    }
}
