package pro.progr.diamondapi

import kotlinx.coroutines.flow.Flow

interface DiamondInterface {

    fun getDiamondsCount(): Flow<Int>

    suspend fun purchase(diamonds : Int) : Result<Boolean>
}