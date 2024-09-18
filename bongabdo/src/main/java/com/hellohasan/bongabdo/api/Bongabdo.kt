package com.hellohasan.bongabdo.api

import com.hellohasan.bongabdo.bongabdo_method.bangla_academy.BanglaAcademyBongabdo
import com.hellohasan.bongabdo.bongabdo_method.india_drik_siddhanta.IndiaDrikSiddhantaBongabdo
import com.hellohasan.bongabdo.localization_config.BengaliLocalizationConfig
import com.hellohasan.bongabdo.localization_config.BongabdoLocalizationConfig
import java.util.Calendar

abstract class Bongabdo {

    var mLocalizationConfig: BongabdoLocalizationConfig = BengaliLocalizationConfig()

    companion object {

        /**
         * We have two available calculation methods: [BongabdoMethod.BANGLA_ACADEMY] and [BongabdoMethod.INDIA_DRIK_SIDDHANTA].
         * We already implemented these methods and logics. So you can easily use these methods by
         * calling [getInstance] method.
         * But if you need any other calculation method, just extend [Bongabdo] class and implement
         * your own logic inside [getBongabdoData] method.
         */
        fun getInstance(method: BongabdoMethod): Bongabdo {
            return when (method) {
                BongabdoMethod.BANGLA_ACADEMY -> BanglaAcademyBongabdo()
                BongabdoMethod.INDIA_DRIK_SIDDHANTA -> IndiaDrikSiddhantaBongabdo()
            }
        }
    }

    abstract fun getBongabdoData(calendar: Calendar): BongabdoData
}