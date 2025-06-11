package pro.progr.diamondapi

import kotlinx.coroutines.flow.Flow

interface GetDiamondsCountInterface {

    fun getDiamondsCount(): Flow<Int>
}