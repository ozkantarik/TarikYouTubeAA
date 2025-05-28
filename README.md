# TarikYouTubeAA

This project is a proof-of-concept Android Auto application for playing YouTube content. It provides a simple Home screen, Playlists view, and Search functionality. User authentication is delegated to the connected phone so that the app can leverage an existing logged-in session.

## Features

- **Home** – Shows suggested videos and recently played items.
- **Playlists** – Displays the user's YouTube playlists and allows playback within Android Auto.
- **Search** – Basic search interface to look up videos.
- **Login via phone** – The app retrieves credentials from the connected device (phone) so the user does not need to sign in separately in the car.

## Prerequisites

- Android Studio Flamingo or newer
- Android SDK with minimum API level 23
- Kotlin 1.8+

## Building and Running

```bash
./gradlew assembleDebug
```

Install the `app-debug.apk` on an Android device with Android Auto capabilities or a compatible emulator.

## License

This project is released under the MIT License. See [LICENSE](LICENSE) for details.

## Contributing

Contributions are welcome! Please open issues or pull requests to improve the project.
