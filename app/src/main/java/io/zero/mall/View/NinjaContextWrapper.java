package io.zero.mall.View;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import io.zero.mall.R;

public class NinjaContextWrapper extends ContextWrapper {
    private Context context;

    public NinjaContextWrapper(Context context) {
        super(context);
        this.context = context;
        this.context.setTheme(R.style.BrowserActivityTheme);
    }

    @Override
    public Resources.Theme getTheme() {
        return context.getTheme();
    }
}
