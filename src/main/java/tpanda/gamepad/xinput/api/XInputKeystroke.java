package tpanda.gamepad.xinput.api;

/**
 * {@link XInput#getKeystroke(int, int, XInputKeystroke)} によって返されるキーストローク データを指定します。
 * <p>
 * 今後のデバイスでは、現在のデバイスではサポートされておらず、現在は未定義の HID コードと仮想キー値が返される可能性があります。 アプリケーションでは、これらの予期しない値を無視する必要があります。
 * 仮想キー コードは、キーボードの状態に基づいてキーをマップできる文字 (存在しない場合もある) ではなく、
 * キーボード上の特定の物理キーを表すバイト値です。 仮想キーが押された時点のキーボードの状態によって、報告された文字が変更されます。
 * たとえば、shift キーの状態によっては、VK_4 が "4" または "$" を表している場合があります。
 * 報告されたキーボード イベントには、イベントの原因となった仮想キー、キーが押されたか離されたか (または繰り返されている)、
 * およびイベント時のキーボードの状態が含まれます。 キーボードの状態には、Ctrl キー、Alt キー、
 * または Shift キーがダウンしているかどうかに関する情報が含まれます。
 * キーボード イベントが Unicode 文字を表す場合 (たとえば、"A" キーを押すと)、 Unicode メンバーにはその文字が含まれます。 それ以外の場合、 Unicode には値 0 が含まれます。
 * 有効な仮想キー (VK_xxx) コードは、{@link Constants} で定義されています。 キーの押下を示すコードに加えて、次のコードはコントローラーの入力を示します。
 * </p>
 * @see XInput#getKeystroke(int, int, XInputKeystroke)
 */
public interface XInputKeystroke {

    /**
     * キー、ボタン、またはスティックの移動の仮想キー コードを取得します。
     * 有効な仮想キー (VK_xxx) コードの一覧については、「{@link Constants}」を参照してください。
     * @return 仮想キーコード
     */
    int virtualKey();

    /**
     * このメンバーは使用されず、値は 0（または空文字）です。
     * @return Unicode文字列
     */
    char unicode();

    /**
     * 入力イベント時のキーボードの状態を示すフラグを取得します。
     * このメンバーは、次のフラグの任意の組み合わせにすることができます。
     * <ul>
     *   <li>{@link Constants#XINPUT_KEYSTROKE_KEYDOWN}</li>
     *   <li>{@link Constants#XINPUT_KEYSTROKE_KEYUP}</li>
     *   <li>{@link Constants#XINPUT_KEYSTROKE_REPEAT}</li>
     * </ul>
     * @return フラグ
     */
    int flags();

    /**
     * デバイスに関連付けられているサインインしているゲーマーのインデックスを取得します。
     * 0 ~ 3 の範囲の値を指定できます。
     * @return ユーザーインデックス
     */
    int userIndex();

    /**
     * 入力に対応する HID コードを取得します。
     * 対応する HID コードがない場合、この値は 0 です。
     * @return HIDコード
     */
    int hidCode();
}
