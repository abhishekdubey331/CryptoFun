package com.jetpack.cryptofun.di

import com.jetpack.cryptofun.common.Constants
import com.jetpack.cryptofun.data.api.CoinPaprikaApi
import com.jetpack.cryptofun.data.repository.CoinRepositoryImpl
import com.jetpack.cryptofun.domain.repository.CoinRepository
import com.jetpack.cryptofun.domain.usecase.get_coins.GetCoinsUseCase
import com.jetpack.cryptofun.domain.usecase.get_coins.IGetCoinsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesPaprikaApi(): CoinPaprikaApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun providesCoinRepository(api: CoinPaprikaApi): CoinRepository {
        return CoinRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun providesGetCoinUseCase(repository: CoinRepository): IGetCoinsUseCase {
        return GetCoinsUseCase(repository)
    }
}
