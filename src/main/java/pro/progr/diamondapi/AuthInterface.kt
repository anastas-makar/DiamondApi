package pro.progr.diamondapi

import kotlinx.coroutines.flow.Flow

interface AuthInterface {
    fun getName() : String?

    fun getSessionId() : String?

    fun <T> getHash(content: T) : String

    fun getDeviceId() : String

    fun isAuthorized() : Flow<Boolean>
}