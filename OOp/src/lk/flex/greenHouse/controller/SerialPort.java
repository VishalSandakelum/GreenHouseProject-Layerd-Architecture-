

/*
public class lk.flex.greenHouse.controller.Main extends Application {

    private static final int BAUD_RATE = 9600;
    private static final int DATA_BITS = 8;
    private static final int STOP_BITS = 1;
    private static final int PARITY = SerialPort.NO_PARITY;

    private SerialPort serialPort;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("Data from Arduino: ");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Find available serial ports
        SerialPort[] ports = SerialPort.getCommPorts();

        // Choose a port to connect to
        serialPort = ports[0];

        // Set serial port parameters (baud rate, data bits, stop bits, parity)
        serialPort.setComPortParameters(BAUD_RATE, DATA_BITS, STOP_BITS, PARITY);

        // Open the serial port
        if (serialPort.openPort()) {
            System.out.println("Serial port opened.");
        } else {
            System.out.println("Failed to open serial port.");
        }

        // Set up a data listener to receive data from the serial port
        serialPort.addDataListener(new SerialPortDataListener() {
            @Override
            public int getListeningEvents() {
                return SerialPort.LISTENING_EVENT_DATA_AVAILABLE;
            }

            @Override
            public void serialEvent(SerialPortEvent event) {
                if (event.getEventType() == SerialPort.LISTENING_EVENT_DATA_AVAILABLE) {
                    byte[] buffer = new byte[serialPort.bytesAvailable()];
                    int numRead = serialPort.readBytes(buffer, buffer.length);
                    String data = new String(buffer, StandardCharsets.UTF_8);
                    System.out.println("Received data: " + data);

                    // Update the label on the JavaFX application thread
                    Platform.runLater(() -> {
                        label.setText("Data from Arduino: " + data);
                    });
                }
            }
        });

        // Send data to the Arduino
        byte[] bytesToSend = "Hello, Arduino!".getBytes(StandardCharsets.UTF_8);
        serialPort.writeBytes(bytesToSend, bytesToSend.length);

        // Wait for data to be received and keep the JavaFX application running
        while (true) {
            Thread.sleep(1000);
        }
    }

    @Override
    public void stop() throws Exception {
        super.stop();

        // Close the serial port when the application exits
        if (serialPort != null && serialPort.isOpen()) {
            serialPort.closePort();
        }
    }


}
*/
