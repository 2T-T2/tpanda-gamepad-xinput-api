package tpanda.gamepad.xinput.api;

public interface XInputProvider {
    XInput getXInput();
    XInputBatteryInformation newBatteryInformation();
    XInputCapabilities newCapabilities();
    XInputGamepad newGamepad();
    XInputKeystroke newKeystroke();
    XInputState newState();
    XInputVibration newVibration(int leftMotorSpeed, int rightMotorSpeed);
}
