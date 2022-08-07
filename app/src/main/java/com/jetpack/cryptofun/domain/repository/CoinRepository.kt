package com.jetpack.cryptofun.domain.repository

import com.jetpack.cryptofun.data.remote.dto.CoinDetailDto
import com.jetpack.cryptofun.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}
