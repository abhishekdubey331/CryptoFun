package com.jetpack.cryptofun.presentation.coin_detail

import com.jetpack.cryptofun.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
