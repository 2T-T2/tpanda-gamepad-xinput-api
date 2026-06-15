package tpanda.gamepad.xinput.api;

/**
 * コントローラーの現在の状態について説明します。
 * <p>
 * コントローラーの状態の変化をポーリングするときに 、${@link XInputState} によって使用されます。
 * ゲーム機能へのボタンの特定のマッピングは、ゲームの種類によって異なります。
 * 定数 {@link Constants#XINPUT_GAMEPAD_TRIGGER_THRESHOLD} は、 leftTrigger と rightTrigger を押された状態で
 * 登録するよりも大きくする必要がある値として使用できます。 これは省略可能ですが、多くの場合、望ましいです。
 * コントローラー ボタンはクロストークをマニフェストしません。
 * </p>
 * @see XInputState
 * @see XInput
 * @see XInput#getState(int, XInputState)
 */
public interface XInputGamepad {
    /**
     * デバイスのデジタルボタンのビットマスクを次に示します。 設定されたビットは、対応するボタンが押されていることを示します。
     * <ul>
     *   <li>${@link Constants#XINPUT_GAMEPAD_DPAD_UP}</li>
     *   <li>${@link Constants#XINPUT_GAMEPAD_DPAD_DOWN}</li>
     *   <li>${@link Constants#XINPUT_GAMEPAD_DPAD_LEFT}</li>
     *   <li>${@link Constants#XINPUT_GAMEPAD_DPAD_RIGHT}</li>
     *   <li>${@link Constants#XINPUT_GAMEPAD_START}</li>
     *   <li>${@link Constants#XINPUT_GAMEPAD_BACK}</li>
     *   <li>${@link Constants#XINPUT_GAMEPAD_LEFT_THUMB}</li>
     *   <li>${@link Constants#XINPUT_GAMEPAD_RIGHT_THUMB}</li>
     *   <li>${@link Constants#XINPUT_GAMEPAD_LEFT_SHOULDER}</li>
     *   <li>${@link Constants#XINPUT_GAMEPAD_RIGHT_SHOULDER}</li>
     *   <li>${@link Constants#XINPUT_GAMEPAD_A}</li>
     *   <li>${@link Constants#XINPUT_GAMEPAD_B}</li>
     *   <li>${@link Constants#XINPUT_GAMEPAD_X}</li>
     *   <li>${@link Constants#XINPUT_GAMEPAD_Y}</li>
     * </ul>
     * @return デバイスのデジタルボタンのビットフラグ
     */
    int  buttons();

    /**
     * 左トリガー アナログ コントロールの現在の値。 値は 0 から 255 の間です。
     * @return 左トリガー アナログ コントロールの現在の値
     */
    short leftTrigger();

    /**
     * 右側のトリガー アナログ コントロールの現在の値。 値は 0 から 255 の間です。
     * @return 右側のトリガー アナログ コントロールの現在の値
     */
    short rightTrigger();

    /**
     * 左拇棒 x 軸の値。 サムスティック軸の各メンバーは、サムスティックの位置を記述する -32768 から 32767 までの符号付き値です。
     * <p>
     * 値 0 は中央揃えです。 負の値は、下または左を示します。 正の値は、上または右に示します。
     * 定数 {@link Constants#XINPUT_GAMEPAD_LEFT_THUMB_DEADZONE} または {@link Constants#XINPUT_GAMEPAD_RIGHT_THUMB_DEADZONE} は、サムスティック入力をフィルター処理するために正と負の値として使用できます。
     * </p>
     * @return 左拇棒 x 軸の値
     */
    short thumbLX();

    /**
     * 左拇棒 y 軸の値。 値は -32768 から 32767 の間です。
     * @return 左拇棒 y 軸の値
     */
    short thumbLY();

    /**
     * 右拇棒 x 軸の値。 値は -32768 から 32767 の間です。
     * @return 右拇棒 x 軸の値
     */
    short thumbRX();

    /**
     * 右拇棒 y 軸の値。 値は -32768 から 32767 の間です。
     * @return 右拇棒 y 軸の値
     */
    short thumbRY();
}
