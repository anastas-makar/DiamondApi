package pro.progr.diamondapi

import kotlinx.coroutines.flow.Flow

interface AuthInterface {
    fun getName() : String?

    fun getSessionId() : String?

    fun getHash(bytes: ByteArray) : String

    fun getDeviceId() : String

    fun isAuthorized() : Flow<Boolean>
}