package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.cache.SyncCacheApi;
import play.libs.ws.WSClient;
import play.mvc.Controller;
import play.mvc.Result;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private final Config config;
    private final SyncCacheApi cache;
    private final WSClient wsClient;

    @Inject
    public HomeController(Config config, SyncCacheApi cache, WSClient wsClient) {
        this.config = config;
        this.cache = cache;
        this.wsClient = wsClient;
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }

    /**
     * This is where the test will be coded
     * @return Result
     */
    public CompletionStage<Result> test() {

        // TODO This is where you'll put the controller code for the test

        return CompletableFuture.completedFuture(ok("Work in progress"));
    }

}
