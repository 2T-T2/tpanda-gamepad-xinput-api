package tpanda.gamepad.xinput.api;

/**
 * XINPUT API 定数定義
 */
public interface Constants {
    /**
     * 終了ステータス: 正常
     * @return 終了ステータス: 正常
     */
    int ERROR_SUCCESS();
    /**
     * 終了ステータス: デバイス未接続
     * @return 終了ステータス: デバイス未接続
     */
    int ERROR_DEVICE_NOT_CONNECTED();
    /**
     * 終了ステータス: 空データ
     * @return 終了ステータス: 空データ
     */
    int ERROR_EMPTY();

    /**
     * 最大ユーザー数
     * @return 最大ユーザー数
     */
    int XUSER_MAX_COUNT();

    // --- バッテリー対象デバイスタイプ ---
    /**
     * バッテリー対象: ゲームパッド本体
     * @return バッテリー対象: ゲームパッド本体
     */
    byte BATTERY_DEVTYPE_GAMEPAD();
    /**
     * バッテリー対象: ヘッドセット
     * @return バッテリー対象: ヘッドセット
     */
    byte BATTERY_DEVTYPE_HEADSET();

    // --- バッテリーの種類 ---
    /**
     * デバイスが接続されていません。
     * @return デバイスが接続されていません。
     */
    int BATTERY_TYPE_DISCONNECTED();
    /**
     * デバイスは有線デバイスであり、バッテリーがありません。
     * @return デバイスは有線デバイスであり、バッテリーがありません。
     */
    int BATTERY_TYPE_WIRED();
    /**
     * 装置にアルカリ電池がある。
     * @return 装置にアルカリ電池がある。
     */
    int BATTERY_TYPE_ALKALINE();
    /**
     * このデバイスにはニッケル水素電池があります。
     * @return このデバイスにはニッケル水素電池があります。
     */
    int BATTERY_TYPE_NIMH();
    /**
     * デバイスのバッテリーの種類が不明です。
     * @return デバイスのバッテリーの種類が不明です。
     */
    int BATTERY_TYPE_UNKNOWN();

    // --- バッテリー残量 ---
    /**
     * バッテリー残量: 空
     * @return バッテリー残量: 空
     */
    int BATTERY_LEVEL_EMPTY();
    /**
     * バッテリー残量: 低
     * @return バッテリー残量: 低
     */
    int BATTERY_LEVEL_LOW();
    /**
     * バッテリー残量: 中
     * @return バッテリー残量: 中
     */
    int BATTERY_LEVEL_MEDIUM();
    /**
     * バッテリー残量: 満充電
     * @return バッテリー残量: 満充電
     */
    int BATTERY_LEVEL_FULL();

    // --- ゲームパッド ボタンビットマスク ---
    /**
     * 十字キー 上
     * @return 十字キー 上
     */
    int XINPUT_GAMEPAD_DPAD_UP();
    /**
     * 十字キー 下
     * @return 十字キー 下
     */
    int XINPUT_GAMEPAD_DPAD_DOWN();
    /**
     * 十字キー 左
     * @return 十字キー 左
     */
    int XINPUT_GAMEPAD_DPAD_LEFT();
    /**
     * 十字キー 右
     * @return 十字キー 右
     */
    int XINPUT_GAMEPAD_DPAD_RIGHT();
    /**
     * START ボタン
     * @return START ボタン
     */
    int XINPUT_GAMEPAD_START();
    /**
     * BACK ボタン
     * @return BACK ボタン
     */
    int XINPUT_GAMEPAD_BACK();
    /**
     * 左スティック押し込み
     * @return 左スティック押し込み
     */
    int XINPUT_GAMEPAD_LEFT_THUMB();
    /**
     * 右スティック押し込み
     * @return 右スティック押し込み
     */
    int XINPUT_GAMEPAD_RIGHT_THUMB();
    /**
     * 左バンパー (LB)
     * @return 左バンパー (LB)
     */
    int XINPUT_GAMEPAD_LEFT_SHOULDER();
    /**
     * 右バンパー (RB)
     * @return 右バンパー (RB)
     */
    int XINPUT_GAMEPAD_RIGHT_SHOULDER();
    /**
     * A ボタン
     * @return A ボタン
     */
    int XINPUT_GAMEPAD_A();
    /**
     * B ボタン
     * @return B ボタン
     */
    int XINPUT_GAMEPAD_B();
    /**
     * X ボタン
     * @return X ボタン
     */
    int XINPUT_GAMEPAD_X();
    /**
     * Y ボタン
     * @return Y ボタン
     */
    int XINPUT_GAMEPAD_Y();

    // --- スティック・トリガーのしきい値 (デッドゾーン) ---
    /**
     * 左スティックのデッドゾーンデフォルト値
     * @return 左スティックのデッドゾーンデフォルト値
     */
    int XINPUT_GAMEPAD_LEFT_THUMB_DEADZONE();
    /**
     * 右スティックのデッドゾーンデフォルト値
     * @return 右スティックのデッドゾーンデフォルト値
     */
    int XINPUT_GAMEPAD_RIGHT_THUMB_DEADZONE();
    /**
     * トリガーの識別しきい値デフォルト値
     * @return トリガーの識別しきい値デフォルト値
     */
    int XINPUT_GAMEPAD_TRIGGER_THRESHOLD();

    // --- デバイスタイプとサブタイプ (GetCapabilities用) ---
    /**
     * デバイスタイプ: ゲームパッド
     * @return デバイスタイプ: ゲームパッド
     */
    int XINPUT_DEVTYPE_GAMEPAD();
    /**
     * サブタイプ: 不明。コントローラーの種類が不明です。
     * @return サブタイプ: 不明。コントローラーの種類が不明です。
     */
    int XINPUT_DEVSUBTYPE_UNKNOWN();
    /**
     * サブタイプ: ゲームパッド コントローラー。
     * <p>
     * 左右スティック、左右トリガー、方向パッド、およびすべての標準ボタン
     * (A、B、X、Y、START、BACK、LB、RB、LSB、RSB) が含まれます。
     * </p>
     * @return サブタイプ: ゲームパッド コントローラー。
     */
    int XINPUT_DEVSUBTYPE_GAMEPAD();
    /**
     * サブタイプ: レーシング ホイール コントローラー。
     * <p>
     * 左スティックXはホイールの回転を報告し、右トリガーは加速ペダル、左トリガーはブレーキペダルです。
     * 方向パッドとほとんどの標準ボタン (A、B、X、Y、START、BACK、LB、RB) が含まれています。 LSB と RSB は省略可能です。
     * </p>
     * @return サブタイプ: レーシング ホイール コントローラー。
     */
    int XINPUT_DEVSUBTYPE_WHEEL();
    /**
     * サブタイプ: アーケード スティック コントローラー。
     * <p>
     * DPAD (上、下、左、右)、およびほとんどの標準ボタン (A、B、X、Y、START、BACK)
     * としてレポートするデジタル スティックが含まれています。 左トリガーと右トリガーはデジタル ボタンとして実装され、0 または0xFFを報告します。
     * LB、LSB、RB、および RSB は省略可能です。
     * </p>
     * @return サブタイプ: アーケード スティック コントローラー。
     */
    int XINPUT_DEVSUBTYPE_ARCADE_STICK();
    /**
     * サブタイプ: フライト スティック
     * <p>
     * コントローラー。左スティックとして報告するピッチとロールスティック、右スティックとして報告するPOVハット、左トリガーとして報告するラダー(ハンドルツイストまたはロッカー)、右トリガーとしてのスロットルコントロールが含まれます。
     * 主武器 (A)、セカンダリ武器 (B)、その他の標準ボタン (X、Y、START、BACK) のサポートが含まれています。 LB、LSB、RB、および
     * RSB は省略可能です。
     * </p>
     * @return サブタイプ: フライト スティック
     */
    int XINPUT_DEVSUBTYPE_FLIGHT_STICK();
    /**
     * サブタイプ: ダンスパッドコントローラ。
     * <p>
     * パッドの方向パッドと標準ボタン (A、B、X、Y) に加えて、BACK と START が含まれます。
     * </p>
     * @return サブタイプ: ダンスパッドコントローラ。
     */
    int XINPUT_DEVSUBTYPE_DANCE_PAD();
    /**
     * サブタイプ: ギターコントローラー。
     * <p>
     * ストルム バーは DPAD (上下) にマップされ、フレットは A (緑)、B (赤)、Y (黄色)、X (青)、LB
     * (オレンジ) に割り当てられます。 右スティックYは垂直方向のセンサーに関連付けられています。右スティックXは、ワミーバーです。
     * BACK、START、DPAD (左、右) のサポートが含まれています。 左トリガー (ピックアップ セレクター)、右トリガー、RB、LSB
     * (フレット修飾子)、RSB は省略可能です。
     * </p>
     * @return サブタイプ: ギターコントローラー。
     */
    int XINPUT_DEVSUBTYPE_GUITAR();
    /**
     * サブタイプ: 代替ギターコントローラ。
     * <p>
     * 垂直方向センサーのより広い範囲の移動をサポートします。
     * </p>
     * @return サブタイプ: 代替ギターコントローラ。
     */
    int XINPUT_DEVSUBTYPE_GUITAR_ALTERNATE();
    /**
     * サブタイプ: ドラムコントローラー。
     * <p>
     * ドラムパッドは、A for green (Floor Tom)、B for red (Snare Drum)、X
     * for blue (Low Tom)、Y for yellow (High Tom)、LB for the pedal (Bass Drum)
     * の各ボタンに割り当てられます。 方向パッド、BACK、START が含まれます。 RB、LSB、および RSB は省略可能です。
     * </p>
     * @return サブタイプ: ドラムコントローラー。
     */
    int XINPUT_DEVSUBTYPE_DRUM_KIT();
    /** サブタイプ: ベースギターコントローラ
     * <p>
     * セットアップを簡素化するための異なるサブタイプを持つギターと同じです。
     * </p>
     * @return サブタイプ: ベースギターコントローラ
     */
    int XINPUT_DEVSUBTYPE_GUITAR_BASS();
    /**
     * サブタイプ: アーケード パッド コントローラー。
     * <p>
     * 方向パッドとほとんどの標準ボタン (A、B、X、Y、START、BACK、LB、RB)
     * が含まれています。 左トリガーと右トリガーはデジタル ボタンとして実装され、0 または0xFFを報告します。 左スティック、右スティック、LSB、および
     * RSB は省略可能です。
     * </p>
     * @return サブタイプ: アーケード パッド コントローラー。
     */
    int XINPUT_DEVSUBTYPE_ARCADE_PAD();

    // --- デバイス機能フラグ ---
    /**
     * デバイス機能フラグ: デバイスには統合された音声デバイスがあります。
     * @return デバイス機能フラグ: デバイスには統合された音声デバイスがあります。
     */
    int XINPUT_CAPS_VOICE_SUPPORTED();
    /**
     * デバイス機能フラグ: デバイスでは、強制フィードバック機能がサポートされています。
     * これらの強制フィードバック機能は、現在、Windows 上の
     * XINPUT ではサポートされていないことに注意してください。
     * @return デバイス機能フラグ: デバイスでは、強制フィードバック機能がサポートされています。
     */
    int XINPUT_CAPS_FFB_SUPPORTED();
    /**
     * デバイス機能フラグ: デバイスはワイヤレスです。
     * @return デバイス機能フラグ: デバイスはワイヤレスです。
     */
    int XINPUT_CAPS_WIRELESS();
    /**
     * デバイス機能フラグ: デバイスはプラグイン モジュールをサポートしています。
     * テキスト入力デバイス (TID) などのプラグイン
     * モジュールは、Windows 上の XINPUT では現在サポートされていないことに注意してください。
     * @return デバイス機能フラグ: デバイスはプラグイン モジュールをサポートしています。
     */
    int XINPUT_CAPS_PMD_SUPPORTED();
    /**
     * デバイス機能フラグ: デバイスにメニュー ナビゲーション ボタン (START、BACK、DPAD) がありません。
     * @return デバイス機能フラグ: デバイスにメニュー ナビゲーション ボタン (START、BACK、DPAD) がありません。
     */
    int XINPUT_CAPS_NO_NAVIGATION();

    // --- キーボード状態フラグ。 ---
    /**
     * キーボード状態フラグ。: キーが押されました。
     * @return キーボード状態フラグ。: キーが押されました。
     */
    int XINPUT_KEYSTROKE_KEYDOWN();
    /**
     * キーボード状態フラグ。: キーが解放されました。
     * @return キーボード状態フラグ。: キーが解放されました。
     */
    int XINPUT_KEYSTROKE_KEYUP();
    /**
     * キーボード状態フラグ。: 保持されているキーの繰り返し。
     * @return キーボード状態フラグ。: 保持されているキーの繰り返し。
     */
    int XINPUT_KEYSTROKE_REPEAT();

    // --- 入力取得フラグ ---
    /**
     * 入力取得フラグ: ゲームパッドのデータのみを取得
     * @return 入力取得フラグ: ゲームパッドのデータのみを取得
     */
    int XINPUT_FLAG_GAMEPAD();

    // --- 仮想キー ---
    /**
     * Aボタン
     * @return Aボタン
     */
    int VK_PAD_A();
    /**
     * B ボタン
     * @return B ボタン
     */
    int VK_PAD_B();
    /**
     * X ボタン
     * @return X ボタン
     */
    int VK_PAD_X();
    /**
     * Y ボタン
     * @return Y ボタン
     */
    int VK_PAD_Y();
    /**
     * 右肩ボタン
     * @return 右肩ボタン
     */
    int VK_PAD_RSHOULDER();
    /**
     * 左肩ボタン
     * @return 左肩ボタン
     */
    int VK_PAD_LSHOULDER();
    /**
     * 左トリガー
     * @return 左トリガー
     */
    int VK_PAD_LTRIGGER();
    /**
     * 右トリガー
     * @return 右トリガー
     */
    int VK_PAD_RTRIGGER();
    /**
     * 方向パッドアップ
     * @return 方向パッドアップ
     */
    int VK_PAD_DPAD_UP();
    /**
     * 下方向パッド
     * @return 下方向パッド
     */
    int VK_PAD_DPAD_DOWN();
    /**
     * 方向パッドの左
     * @return 方向パッドの左
     */
    int VK_PAD_DPAD_LEFT();
    /**
     * 方向パッド右
     * @return 方向パッド右
     */
    int VK_PAD_DPAD_RIGHT();
    /**
     * [スタート ] ボタン
     * @return [スタート ] ボタン
     */
    int VK_PAD_START();
    /**
     * [戻る ] ボタン
     * @return [戻る ] ボタン
     */
    int VK_PAD_BACK();
    /**
     * 左サムスティッククリック
     * @return 左サムスティッククリック
     */
    int VK_PAD_LTHUMB_PRESS();
    /**
     * 右拇棒のクリック
     * @return 右拇棒のクリック
     */
    int VK_PAD_RTHUMB_PRESS();
    /**
     * 左サムスティックアップ
     * @return 左サムスティックアップ
     */
    int VK_PAD_LTHUMB_UP();
    /**
     * 左サムスティックダウン
     * @return 左サムスティックダウン
     */
    int VK_PAD_LTHUMB_DOWN();
    /**
     * 左サムスティック右
     * @return 左サムスティック右
     */
    int VK_PAD_LTHUMB_RIGHT();
    /**
     * 左拇棒左
     * @return 左拇棒左
     */
    int VK_PAD_LTHUMB_LEFT();
    /**
     * 左拇棒の上下左
     * @return 左拇棒の上下左
     */
    int VK_PAD_LTHUMB_UPLEFT();
    /**
     * 左拇棒の上下
     * @return 左拇棒の上下
     */
    int VK_PAD_LTHUMB_UPRIGHT();
    /**
     * 左サムスティックの下と右
     * @return 左サムスティックの下と右
     */
    int VK_PAD_LTHUMB_DOWNRIGHT();
    /**
     * 左拇棒を下にして左へ
     * @return 左拇棒を下にして左へ
     */
    int VK_PAD_LTHUMB_DOWNLEFT();
    /**
     * 右スティックを上
     * @return 右スティックを上
     */
    int VK_PAD_RTHUMB_UP();
    /**
     * 右スティックを下
     * @return 右スティックを下
     */
    int VK_PAD_RTHUMB_DOWN();
    /**
     * 右スティックを右
     * @return 右スティックを右
     */
    int VK_PAD_RTHUMB_RIGHT();
    /**
     * 右スティックを左
     * @return 右スティックを左
     */
    int VK_PAD_RTHUMB_LEFT();
    /**
     * 左右のサムスティック
     * @return 左右のサムスティック
     */
    int VK_PAD_RTHUMB_UPLEFT();
    /**
     * 右拇棒を上下左右に
     * @return 右拇棒を上下左右に
     */
    int VK_PAD_RTHUMB_UPRIGHT();
    /**
     * 右拇棒の下と右
     * @return 右拇棒の下と右
     */
    int VK_PAD_RTHUMB_DOWNRIGHT();
    /**
     * 右サムスティックを下にして左へ
     * @return 右サムスティックを下にして左へ
     */
    int VK_PAD_RTHUMB_DOWNLEFT();
}
