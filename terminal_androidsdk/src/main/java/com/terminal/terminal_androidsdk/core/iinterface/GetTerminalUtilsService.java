package com.terminal.terminal_androidsdk.core.iinterface;
import static com.terminal.terminal_androidsdk.utils.Constant.BASE_TERMINAL_UTILS;
import com.terminal.terminal_androidsdk.core.model.utils.TerminalRealMerchant;
import com.terminal.terminal_androidsdk.core.network.BaseData;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by AYODEJI on 10/10/2020.
 * This represent the interface which prepares the connection to the backEnd
 */
public interface GetTerminalUtilsService {


    @GET(BASE_TERMINAL_UTILS)
    Call<BaseData<TerminalRealMerchant>> getUtilsData();

}

