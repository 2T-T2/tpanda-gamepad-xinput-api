package tpanda.gamepad.xinput.api;

/**
 * 接続されたコントローラーの機能について説明します。
 * <p>
 * {@link XInput#getCapabilities(int, int, XInputCapabilities)} は 、指定 したコントローラーの特性と使用可能な機能を示す {@link XInputCapabilities} を返します。
 * {@link XInput#getCapabilities(int, int, XInputCapabilities)} は、デバイスがサポートする入力を示す構造体メンバーを設定します。
 * デジタルボタンなどのバイナリ状態コントロールの場合、対応するビットは、コントロールがデバイスでサポートされているかどうかを反映します。
 * サムスティックなどの比例コントロールの場合、値はそのコントロールの解像度を示します。 最下位ビットの一部の数を設定することはできません
 * これは、コントロールがそのレベルに対する解像度を提供しないことを示します。
 * {@link #subType} メンバーは、存在するコントローラーの特定のサブタイプを示します。 ゲームでは、コントローラーのサブタイプを検出し、ゲームのジャンルに適したサブタイプに基づいてコントローラーの入力または出力の処理を調整できます。
 * たとえば、車のレース ゲームは、駆動中の車の細かい制御を提供するホイール コントローラーの存在のためにチェック可能性があります。
 * ただし、タイトルは、そのサブタイプに基づいてデバイスを無効にしたり無視したりすることはできません。
 * ゲームによって認識されないサブタイプ、またはゲームが特に調整されていないサブタイプは、標準コントローラー {@link Constants#XINPUT_DEVSUBTYPE_GAMEPAD} として扱う必要があります。
 * 以前の XUSB Windows ドライバーでは、特にワイヤレス デバイスの不完全な機能情報が報告されます。
 * 最新の XUSB Windows ドライバーは、有線およびワイヤレス デバイスの完全なサポートと、より完全で正確な機能フラグを提供します
 * </p>
 * @see XInputGamepad
 * @see XInputVibration
 * @see XInput
 * @see XInput#getCapabilities(int, int, XInputCapabilities)
 */
public interface XInputCapabilities {
    /**
     * コントローラーの種類。 次のいずれかの値を指定する必要があります。
     * <ul>
     *   <li>${@link Constants#XINPUT_DEVTYPE_GAMEPAD} デバイスはゲーム コントローラーです。</li>
     * </ul>
     * @return コントローラーの種類。
     */
    int type();

    /**
     * ゲームコントローラーのサブタイプ。 次のいずれかの値を指定する必要があります。
     * <ul>
     *   <li>${@link Constants#XINPUT_DEVSUBTYPE_UNKNOWN}</li>
     *   <li>${@link Constants#XINPUT_DEVSUBTYPE_GAMEPAD}</li>
     *   <li>${@link Constants#XINPUT_DEVSUBTYPE_WHEEL}</li>
     *   <li>${@link Constants#XINPUT_DEVSUBTYPE_ARCADE_STICK}</li>
     *   <li>${@link Constants#XINPUT_DEVSUBTYPE_FLIGHT_STICK}</li>
     *   <li>${@link Constants#XINPUT_DEVSUBTYPE_DANCE_PAD}</li>
     *   <li>${@link Constants#XINPUT_DEVSUBTYPE_GUITAR}</li>
     *   <li>${@link Constants#XINPUT_DEVSUBTYPE_GUITAR_ALTERNATE}</li>
     *   <li>${@link Constants#XINPUT_DEVSUBTYPE_DRUM_KIT}</li>
     *   <li>${@link Constants#XINPUT_DEVSUBTYPE_GUITAR_BASS}</li>
     *   <li>${@link Constants#XINPUT_DEVSUBTYPE_ARCADE_PAD}</li>
     * </ul>
     * @return ゲームコントローラーのサブタイプ。
     */
    int subType();

    /**
     * コントローラーの機能。
     * <ul>
     *   <li>${@link Constants#XINPUT_CAPS_VOICE_SUPPORTED}</li>
     *   <li>${@link Constants#XINPUT_CAPS_FFB_SUPPORTED}</li>
     *   <li>${@link Constants#XINPUT_CAPS_WIRELESS}</li>
     *   <li>${@link Constants#XINPUT_CAPS_PMD_SUPPORTED}</li>
     *   <li>${@link Constants#XINPUT_CAPS_NO_NAVIGATION}</li>
     * </ul>
     * @return コントローラーの機能。
     */
    int flags();

    /**
     * 使用可能なコントローラーの機能と制御の解像度を説明する構造です。
     * @return 使用可能なコントローラーの機能と制御の解像度。
     */
    XInputGamepad gamepad();

    /**
     * 使用可能な振動機能と解像度を記述する構造です。
     * @return 使用可能な振動機能と解像度
     */
    XInputVibration vibration();
}