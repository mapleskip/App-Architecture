package com.frodo.app.framework.net;

import com.frodo.app.framework.controller.ChildSystem;
import com.frodo.app.framework.exception.HttpException;

import java.util.List;

/**
 * Created by frodo on 2015/6/20. network request master
 */
public interface NetworkTransport extends ChildSystem {
    boolean isNetworkAvailable();

    boolean isGpsEnabled();

    boolean isWifiEnabled();

    boolean is3rd();

    boolean isWifi();

    String getAPIUrl();

    void setAPIUrl(String apiUrl);

    HttpModule getHttpModule();

    void resetHttpModule(HttpModule httpModule);

    Response execute(Request request) throws HttpException;

    List<NetworkInterceptor> interceptorList();

    void addInterceptor(NetworkInterceptor interceptor);
}
