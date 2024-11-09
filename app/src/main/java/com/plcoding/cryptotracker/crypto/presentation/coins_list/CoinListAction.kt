package com.plcoding.cryptotracker.crypto.presentation.coins_list

import com.plcoding.cryptotracker.crypto.presentation.models.CoinUI

sealed interface CoinListAction {
    data class OnCoinClick(val coinUI: CoinUI) : CoinListAction
}