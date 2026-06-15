package tpanda.gamepad.xinput.api;

/**
 * XInput 関数はすべて、設定または照会されるコントローラーを識別するために渡される
 * userIndex パラメーターを必要とします。 この ID は 0 から {@link Constants#XUSER_MAX_COUNT} の範囲になり、XInput によって自動的に設定されます。
 * この番号は、コントローラーが接続されているポートに対応しており、変更できません。
 * 各コントローラーは、コントローラーの中央にある "光のリング" にクアドラントを点灯することによって、使用している ID を表示します。
 * userIndex 値 0 は、左上のクアドラントに対応します。番号はリングの周りを時計回りの順序で進みます。
 * アプリケーションでは、複数のコントローラーをサポートする必要があります。
 */
public interface XInput {
    /**
     * XInput のレポートの状態を設定します。
     * <p>
     * この関数は、アプリケーションがフォーカスを取得または失ったときに呼び出されます。
     * この関数を使用すると、XInput が無効になっている場合にニュートラルデータが常に報告されるため、アプリケーションで XInput クエリループを変更する必要はありません。
     * </p>
     * 振動効果をサポートするコントローラーの場合:
     * <ul>
     *   <li>FALSE 渡すと、現在再生中の振動効果が停止します。 この状態では、{@link #setState(int, XInputVibration)} の呼び出しは登録されますが、デバイスには渡されません。</li>
     *   <li>TRUE  渡すと、デバイスに送信された最後の振動要求 (0 の場合でも) {@link #setState(int, XInputVibration)} が渡されます。</li>
     * </ul>
     * Windows 10 以降:非推奨の。ゲーム コントローラーの入力は、アプリケーション ウィンドウのフォーカスに基づいてシステムによって自動的に有効または無効になります。
     * @param enable FALSE場合、XInput は、{@link #getState(int, XInputState)} (すべてのボタンの上、軸の中央揃え、0 のトリガー) に応答してニュートラルデータのみを送信します。
     *                         {@link #setState(int, XInputVibration)} 呼び出しは登録されますが、デバイスには送信されません。
     *               FALSE 以外の値を送信すると、読み取りと書き込みの機能が正常に復元されます。
     *
     * @see XInputGamepad
     * @see XInputState
     * @see #getState(int, XInputState)
     * @see #setState(int, XInputVibration)
     */
    void enable(boolean enable);

    /**
     * 指定したコントローラーに接続されているヘッドセットに関連付けられているサウンドレンダリングと
     * サウンドキャプチャオーディオ デバイス ID を取得します。
     * @param userIndex デバイスに関連付けられているゲーマーのインデックス。
     * @param renderDeviceId レンダリング (スピーカー) 用の Windows Core オーディオ デバイス ID 文字列。
     * @param renderCount レンダー デバイス ID 文字列バッファーのサイズ (ワイド文字)。
     * @param captureDeviceId キャプチャ用の Windows Core オーディオ デバイス ID 文字列 (マイク)。
     * @param captureCount キャプチャ デバイス ID 文字列バッファーのサイズ (ワイド文字)。
     * @return 関数がレンダリングおよびキャプチャ用のデバイス ID を正常に取得した場合、リターンコードは {@link Constants#ERROR_SUCCESS} 。
     *         コントローラーに接続されているヘッドセットがない場合、関数は renderDeviceId と captureDeviceId の値として NULL の {@link Constants#ERROR_SUCCESS} も取得します。
     *         コントローラーポートデバイスが物理的に接続されていない場合、関数は {@link Constants#ERROR_DEVICE_NOT_CONNECTED} を返します。
     *         関数が失敗すると、有効な Win32 エラーコードが返されます。
     */
    int getAudioDeviceIds(int userIndex, StringBuffer renderDeviceId, int renderCount, StringBuffer captureDeviceId, int captureCount);
    /**
     * ワイヤレスコントローラーのバッテリーの種類と充電状態を取得します。
     * @param userIndex デバイスに関連付けられているサインインしているゲーマーのインデックス。 0 ~ {@link Constants#XUSER_MAX_COUNT} - 1 の範囲の値を指定できます。
     * @param devType このユーザー インデックスに関連付けられているデバイスを照会する必要があることを指定します。 {@link Constants#BATTERY_DEVTYPE_GAMEPAD} または {@link Constants#BATTERY_DEVTYPE_HEADSET} する必要があります。
     * @param batteryInformation バッテリ情報を受け取る {@link XInputBatteryInformation} へのポインター。
     * @return 関数が成功した場合、戻り値は {@link Constants#ERROR_SUCCESS} 。
     */
    int getBatteryInformation(int userIndex, int devType, XInputBatteryInformation batteryInformation);

    /**
     * 接続されたコントローラーの機能と機能を取得します。
     * @param userIndex ユーザーのコントローラーのインデックス。 0 ~ {@link Constants#XUSER_MAX_COUNT} の範囲の値を指定できます。
     * @param flags コントローラーの種類を識別する入力フラグ。 この値が 0 の場合は、システムに接続されているすべてのコントローラーの機能が返されます。 現在、サポートされている値は {@link Constants#XINPUT_FLAG_GAMEPAD} 1つだけです。
     * @param capabilities コントローラー機能を受け取る {@link XInputCapabilities} へのポインター。
     * @return 関数が成功した場合、戻り値は {@link Constants#ERROR_SUCCESS} 。
     *         コントローラーが接続されていない場合、戻り値は {@link Constants#ERROR_DEVICE_NOT_CONNECTED}。
     *         関数が失敗した場合、戻り値は WinError.h で定義されたエラーコードです。
     *         関数は、呼び出し元スレッドの最後のエラーコードを設定するために SetLastError を使用しません。
     * @see #getState(int, XInputState)
     * @see #setState(int, XInputVibration)
     */
    int getCapabilities(int userIndex, int flags, XInputCapabilities capabilities);
    /**
     * 指定したコントローラーに接続されているヘッドセットに関連付けられているサウンド レンダリングおよびサウンド キャプチャ デバイス GUID を取得します。
     * @param userIndex ユーザーのコントローラーのインデックス。 0 ~ {@link Constants#XUSER_MAX_COUNT} の範囲の値を指定できます。
     * @param dSoundRenderGuid ヘッドセット サウンド レンダリング デバイスの GUID を受け取るバイト配列、16バイト。
     * @param dSoundCaptureGuid ヘッドセット サウンド キャプチャ デバイスの GUID を受け取るバイト配列、16バイト。
     * @return 関数がレンダリングおよびキャプチャ用のデバイス ID を正常に取得した場合、戻りコードは {@link Constants#ERROR_SUCCESS} 。
     *         コントローラーに接続されているヘッドセットがない場合、関数は dSoundRenderGuid と dSoundCaptureGuid の値として NULL を持つ {@link Constants#ERROR_SUCCESS} も取得します。
     *         コントローラー ポート デバイスが物理的に接続されていない場合、関数は {@link Constants#ERROR_DEVICE_NOT_CONNECTED} を返します。
     *         関数が失敗すると、有効な Win32 エラーコードが返されます。
     * @see #getState(int, XInputState)
     * @throws IllegalArgumentException {@code dSoundRenderGuid} 及び {@code dSoundRenderGuid} が、null または 長さが16以下
     */
    int getDSoundAudioDeviceGuids(int userIndex, byte[] dSoundRenderGuid, byte[] dSoundCaptureGuid) throws IllegalArgumentException;

    /**
     * ゲームパッド入力イベントを取得します。
     * <p>
     * ワイヤレス コントローラーはシステムの起動時にアクティブとは見なされず、ワイヤレス コントローラーがアクティブに戻る前に
     * XInput 関数を呼び出 {@link Constants#ERROR_DEVICE_NOT_CONNECTED} 。 ゲーム タイトルはリターンコードを調べて、
     * この条件を処理する準備をする必要があります。 有線コントローラーは、挿入されると自動的にアクティブ化されます。
     * ワイヤレス コントローラーは、ユーザーがコントローラーの電源をオンにするとアクティブになります。
     * </p>
     * @param userIndex ユーザーのコントローラーのインデックス。 0 ~ {@link Constants#XUSER_MAX_COUNT} の範囲の値を指定できます。
     * @param reserved 予約
     * @param keystroke 入力イベントを受け取る {@link XInputKeystroke} 構造体へのポインター。
     * @return 関数が成功した場合、戻り値は {@link Constants#ERROR_SUCCESS} 。
     *         新しいキーが押されていない場合、戻り値は {@link Constants#ERROR_EMPTY} 。
     *         コントローラーが接続されていない場合、またはユーザーがコントローラーをアクティブ化していない場合、戻り値は {@link Constants#ERROR_DEVICE_NOT_CONNECTED} 。
     *         関数が失敗した場合、戻り値は Winerror.h で定義されたエラーコードです。
     *         関数は、呼び出し元スレッドの最後のエラー コードを設定するために SetLastError を使用しません。
     * @see XInputKeystroke
     */
    int getKeystroke(int userIndex, int reserved, XInputKeystroke keystroke);

    /**
     * 指定したコントローラーの現在の状態を取得します。
     * <p>
     * コントローラー データを取得する場合、左右のトリガーはそれぞれ個別に報告されます。
     * 従来の理由から、DirectInput がコントローラー データを取得すると、2 つのトリガーは同じ軸を共有します。
     * 従来の動作は、コントローラーの状態に DirectInput を使用する現在の Game Device コントロール パネルで顕著です。
     * </p>
     * @param userIndex ユーザーのコントローラーのインデックス。 0 ~ {@link Constants#XUSER_MAX_COUNT} の範囲の値を指定できます。
     * @param state コントローラーの現在の状態を受け取る {@link XInputState} 構造体へのポインター。
     * @return 関数が成功した場合、戻り値は {@link Constants#ERROR_SUCCESS} 。
     *         コントローラーが接続されていない場合、戻り値は {@link Constants#ERROR_DEVICE_NOT_CONNECTED} 。
     *         関数が失敗した場合、戻り値は Winerror.h で定義されたエラー コードです。
     *         関数は、呼び出し元のスレッドの最後のエラー コードを設定するために SetLastError を使用しません。
     * @see XInputGamepad
     * @see XInputState
     * @see #setState(int, XInputVibration)
     */
    int getState(int userIndex, XInputState state);

    /**
     * 接続されているコントローラーにデータを送信します。 この関数は、コントローラーの振動機能をアクティブにするために使用されます。
     * @param userIndex ユーザーのコントローラーのインデックス。 0 ~ {@link Constants#XUSER_MAX_COUNT} の範囲の値を指定できます。
     * @param vibration コントローラーに送信する振動情報を含む {@link XInputVibration} 構造体へのポインター。
     * @return 関数が成功した場合、戻り値は {@link Constants#ERROR_SUCCESS} 。
     *         コントローラーが接続されていない場合、戻り値は {@link Constants#ERROR_DEVICE_NOT_CONNECTED} 。
     *         関数が失敗した場合、戻り値は WinError.h で定義されたエラー コードです。
     *         関数は、呼び出し元スレッドの最後のエラー コードを設定するために SetLastError を使用しません。
     * @see XInputVibration
     * @see #getState(int, XInputState)
     */
    int setState(int userIndex, XInputVibration vibration);
}
