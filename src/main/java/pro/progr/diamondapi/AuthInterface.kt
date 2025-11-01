package pro.progr.diamondapi

interface AuthInterface {
    fun getName() : String?

    fun getSessionId() : String?

    fun getDeviceId() : String

    fun isAuthorized() : Boolean
}