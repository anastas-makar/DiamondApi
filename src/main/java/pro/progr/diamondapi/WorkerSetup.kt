package pro.progr.diamondapi

interface WorkerSetup {
    /**
     * Возвращает true, если нужно запустить WorkManager.
     */
    fun shouldScheduleWork(): Boolean

    /**
     * Запускает (инициализирует и шедулит) WorkManager
     */
    fun scheduleWork()
}