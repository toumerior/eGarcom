package br.com.pcsist.mobile.restfood.application;

import android.app.Application;

import com.google.gson.Gson;

import br.com.pcsist.mobile.restfood.business.api.ApiManager;

public class App extends Application {

    private static ApiManager apiManager;
    private static Gson gson;

    @Override
    public void onCreate() {
        super.onCreate();
        apiManager = new ApiManager();
    }

    public static ApiManager getApiManager() {
        return apiManager;
    }

    public static Gson getGson() {
        return gson;
    }
}
