package tpanda.gamepad.xinput.api;

/**
 * コントローラーの状態を表します。
 * <p>
 * packetNumber メンバーは、コントローラーが最後にポーリングされてからコントローラーの状態が変更された場合にのみインクリメントされます。
 * </p>
 * @see XInputGamepad
 * @see XInput
 * @see XInput#getState(int, XInputState)
 */
public interface XInputState {
    /**
     * 状態パケット番号。 パケット番号は、コントローラーの状態に変更があったかどうかを示します。
     * <p>
     * 連続して返される ${@link XInputState} で同じ場合、コントローラーの状態は変更されていません。
     * </p>
     * @return 状態パケット番号。
     */
    int packetNumber();

    /**
     * コントローラーの現在の状態を含む構造体です。
     * @return コントローラーの現在の状態
     */
    XInputGamepad gamepad();
}
