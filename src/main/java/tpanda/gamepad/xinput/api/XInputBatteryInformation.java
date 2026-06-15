package tpanda.gamepad.xinput.api;

/**
 * バッテリーの種類と充電状態に関する情報が含まれています。
 */
public interface XInputBatteryInformation {
    /**
     * バッテリーの種類。
     * @return バッテリーの種類。
     * @see Constants#BATTERY_TYPE_DISCONNECTED
     * @see Constants#BATTERY_TYPE_WIRED
     * @see Constants#BATTERY_TYPE_ALKALINE
     * @see Constants#BATTERY_TYPE_NIMH
     * @see Constants#BATTERY_TYPE_UNKNOWN
     */
    int batteryType();

    /**
     * バッテリーの充電状態。 この値は、既知のバッテリーの種類を持つワイヤレス デバイスでのみ有効です。
     * @return バッテリーの充電状態。
     * @see Constants#BATTERY_LEVEL_EMPTY
     * @see Constants#BATTERY_LEVEL_LOW
     * @see Constants#BATTERY_LEVEL_MEDIUM
     * @see Constants#BATTERY_LEVEL_FULL
     */
    int batteryLevel();
}
