# OpenCamera Launcher

Mini app Android con un solo tasto per aprire Open Camera.

## Come compilare (3 modi)

### Modo 1 — Android Studio (più semplice)
1. Scarica Android Studio da https://developer.android.com/studio
2. Apri questo progetto: File → Open → seleziona la cartella
3. Aspetta il sync di Gradle
4. Clicca ▶ Run (oppure Build → Build APK)
5. L'APK si trova in: app/build/outputs/apk/debug/app-debug.apk

### Modo 2 — Terminale con Gradle
```bash
cd OpenCameraLauncher
./gradlew assembleDebug
# APK → app/build/outputs/apk/debug/app-debug.apk
```

### Modo 3 — Online con GitHub + Buildozer/GitHub Actions
Carica questo progetto su GitHub e aggiungi un workflow per la build automatica.

## Installazione sul telefono
1. Copia l'APK sul telefono (via USB o cloud)
2. Apri il file → Abilita "Origini sconosciute" se richiesto
3. Installa e avvia

## Note
- Open Camera deve essere già installata (package: net.sourceforge.opencamera)
- Se non la trova, mostra un avviso
