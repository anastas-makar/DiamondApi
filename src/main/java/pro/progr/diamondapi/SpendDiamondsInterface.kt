package pro.progr.diamondapi

interface SpendDiamondsInterface {

    suspend fun spendDiamonds(diamonds : Int) : Result<Boolean>
}