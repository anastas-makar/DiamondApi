package pro.progr.diamondapi

import kotlinx.coroutines.flow.Flow

interface AuthInterface {
    fun getName() : String?

    fun setName(name : String?)

    fun getSessionId() : String?

    fun setSessionId(sessionId : String)

    /**
     * Секрет, который сохраняется в зашифрованном виде один раз при авторизации
     */
    fun setSessionSecret(sessionSecret : String)

    fun clearSession()

    fun getNonce() : String

    fun getHash(sessionId: String,
                deviceId: String,
                nonce: String,
                bodyBytes: ByteArray) : String

    fun getDeviceId() : String

    fun isAuthorized() : Flow<Boolean>
}