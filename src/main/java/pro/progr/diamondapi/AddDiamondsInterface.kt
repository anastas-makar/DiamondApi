package pro.progr.diamondapi

interface AddDiamondsInterface {
    suspend fun add(diamonds: Int) : Result<Boolean>
}