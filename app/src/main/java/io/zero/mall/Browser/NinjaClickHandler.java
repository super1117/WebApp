package io.zero.mall.Browser;

import android.os.Handler;
import android.os.Message;
import io.zero.mall.View.NinjaWebView;

public class NinjaClickHandler extends Handler {
    private NinjaWebView webView;

    public NinjaClickHandler(NinjaWebView webView) {
        super();
        this.webView = webView;
    }

    @Override
    public void handleMessage(Message message) {
        super.handleMessage(message);
        webView.getBrowserController().onLongPress(message.getData().getString("url"));
    }
}
