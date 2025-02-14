package pro.progr.diamondapi

import kotlinx.coroutines.flow.Flow

interface DiamondInterface {
    fun getDiamondsCount(): Flow<Int>

    fun updateDianodsCount(substract : Int) : Boolean
}