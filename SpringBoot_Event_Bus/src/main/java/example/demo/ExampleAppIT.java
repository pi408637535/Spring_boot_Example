package example.demo;

/**
 * Created by piguanghua on 6/1/18.
 */
import java.util.concurrent.TimeUnit;


public class ExampleAppIT {

    /*private static final Logger LOG = LoggerFactory.getLogger(ExampleAppIT.class);

    @Autowired
    private MultiEventBusSender multiEventBusSender;

    @Autowired
    private SimpleEventSender simpleEventSender;

    @Autowired
    private EventBusSupportSender eventBusSupportSender;

    @Autowired
    private SimpleAsyncEventSender simpleAsyncEventSender;

    @Autowired
    private SimpleSubscriber subscriber;

    @Autowired
    private LoggingDeadEventListener deadEventListener;

    @Autowired
    private AbstractApplicationContext aac;

    @Test
    public void testEventBus() throws InterruptedException {
        LOG.info("Send Events ....");
        this.multiEventBusSender.sendEvents();
        this.simpleEventSender.sendEvents();
        this.simpleAsyncEventSender.sendEvents();
        this.eventBusSupportSender.sendEvents();
        subscriber.getLatch().await(10, TimeUnit.SECONDS);
        deadEventListener.getLatch().await(5, TimeUnit.SECONDS);
        aac.close();
    }*/
}
