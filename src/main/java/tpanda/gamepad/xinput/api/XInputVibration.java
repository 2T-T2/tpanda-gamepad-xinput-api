package tpanda.gamepad.xinput.api;

/**
 * コントローラの振動機能のモータ速度レベルを指定します。
 * <p>
 * 左モータは、低周波数ランブルモータです。 右のモーターは高周波ランブルモーターである。 2つのモーターは同じではなく、異なる振動効果を生み出します。
 * </p>
 * @see XInputGamepad
 * @see XInput
 * @see XInput#getCapabilities(int, int, XInputCapabilities)
 * @see XInput#setState(int, XInputVibration)
 */
public interface XInputVibration {
    /**
     * 左モーターの速度。 有効な値の範囲は 0 ~ 65,535 です。 ゼロはモーターの使用を意味しない;65,535 は、100% のモーター使用量を示します。
     * @return 左モーターの速度。
     */
    int leftMotorSpeed();

    /**
     * 右モーターの速度。 有効な値の範囲は 0 ~ 65,535 です。 ゼロはモーターの使用を意味しない;65,535 は、100% のモーター使用量を示します。
     * @return 右モーターの速度。
     */
    int rightMotorSpeed();
}
