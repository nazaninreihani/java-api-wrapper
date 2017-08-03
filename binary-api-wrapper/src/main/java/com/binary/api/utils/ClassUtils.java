package com.binary.api.utils;

import com.binary.api.models.requests.ForgetAllResponse;
import com.binary.api.models.responses.*;

import java.lang.reflect.Type;

/**
 * Created by morteza on 7/19/2017.
 */

public class ClassUtils {
    public static Type getClassType(String type){
        switch (type){
            case "tick":
                return TickResponse.class;
            case "authorize":
                return AuthorizeResponse.class;
            case "active_symbols":
                return ActiveSymbolResponse.class;
            case "asset_index":
                return AssetIndexResponse.class;
            case "contracts_for":
                return ContractsForSymbolResponse.class;
            case "forget":
                return ForgetResponse.class;
            case "forget_all":
                return ForgetAllResponse.class;
            case "landing_company":
                return LandingCompanyResponse.class;
            case "new_account_virtual":
                return NewVirtualAccountResponse.class;
            case "landing_company_details":
                return LandingCompanyDetailsResponse.class;
            case "ping":
                return PingResponse.class;
            case "paymentagent_list":
                return PaymentAgentListResponse.class;
            case "payout_currencies":
                return PayoutCurrenciesResponse.class;
            case "proposal":
                return PriceProposalResponse.class;
            case "residence_list":
                return ResidenceListResponce.class;
            case "states_list":
                return StatesListResponse.class;
            case "candles":
                return TickHistoryResponse.class;
            case "history":
                return TickHistoryResponse.class;
            case "time":
                return TimeResponse.class;
            case "trading_times":
                return TradingTimesResponse.class;
            case "verify_email":
                return EmailVerificationResponse.class;
            case "website_status":
                return WebsiteStatusResponse.class;
        }
        return null;
    }
}
