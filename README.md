##  Papilon FingerPrintRecognizer - Android

<br>
Papilon FingerPrintRecognizer is an android app sdk.
</br>
<br>

## Installation
<hr>

* <b>1- Build.gradle (:app)</b>

  ### FingerPrintRecognizer SDK Extra and Sample Dependencies


    <i>

    ```JAVA
        // MAIN PROJECT DEPENDENCIES ----------------
        implementation 'androidx.appcompat:appcompat:1.6.1'
        implementation 'com.google.android.material:material:1.8.0'
        implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
        testImplementation 'junit:junit:4.13.2'
        androidTestImplementation 'androidx.test.ext:junit:1.1.5'
        androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'
        //----------------
    
        //CameraX
        def camerax_version = "1.1.0-beta01"
        implementation "androidx.camera:camera-core:${camerax_version}"
        implementation "androidx.camera:camera-camera2:${camerax_version}"
        implementation "androidx.camera:camera-lifecycle:${camerax_version}"
        implementation "androidx.camera:camera-video:${camerax_version}"
        implementation "androidx.camera:camera-view:${camerax_version}"
        implementation "androidx.camera:camera-extensions:${camerax_version}"
        implementation 'com.google.firebase:firebase-crashlytics-gradle:2.8.1'
        implementation 'com.google.firebase:firebase-crashlytics-buildtools:2.8.1'
    
    
        implementation "com.google.android.datatransport:transport-runtime:3.1.8"
        implementation platform('com.google.firebase:firebase-bom:30.5.0')
        implementation "com.google.firebase:firebase-iid:21.1.0"
        implementation 'com.google.firebase:firebase-crashlytics:18.3.2'
        implementation 'com.google.code.gson:gson:2.8.8'
        implementation 'androidx.multidex:multidex:2.0.1'
        implementation 'androidx.lifecycle:lifecycle-livedata:2.2.0'
        implementation "androidx.lifecycle:lifecycle-viewmodel:2.2.0"
    
        implementation 'com.google.mediapipe:tasks-vision:0.10.0'
        implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    
        //----------------
        implementation files('../app/libs/fingerPrintDetector.aar')
        implementation project(path: ':opencv')
        //----------------
    ```

    </i>

    <br>


    ### Main SDK Dependency

    <i>

    ```JAVA
        implementation files('../app/libs/fingerPrintDetector.aar')
        implementation project(path: ':opencv')
    ```
    </i>

<br>
<br>

* <b> 2- Settings.gradle </b>


    ### Private Usages and Jitsi Meet Components

    <i>

    ```JAVA
        import org.gradle.api.initialization.resolve.RepositoriesMode

        pluginManagement {
            repositories {
                gradlePluginPortal()
                google()
                mavenCentral()
                jcenter()
            }
        }
        dependencyResolutionManagement {
            repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
                repositories {
                    google()
                    mavenCentral()
                    jcenter()
                }
        }
        rootProject.name = "papilonfpdapp"
        include ':app'
        include ':opencv'
    ```

    </i>

<br>

* <b> 3- Gradle.properties </b>
    <br>

    <i>

    ```JAVA
        org.gradle.jvmargs=-Xmx2048m -Dfile.encoding=UTF-8
        android.useAndroidX=true
        android.nonTransitiveRClass=true
        android.enableJetifier=true
        android.overridePathCheck=false
        android.enableDexingArtifactTransform.desugaring=true
        android.useNewApkCreator=true
    ```

    </i>

    <b> Note: Important Field For Private Usage </b>

<br>

<br>

* <b> 4- AndroidManifes.xml </b>
    <br>

    <i>

    ```JAVA
        <?xml version="1.0" encoding="utf-8"?>
        <manifest xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        package="com.papilon.papilonfpdapp">
        
            <application
                android:allowBackup="false"
                android:dataExtractionRules="@xml/data_extraction_rules"
                android:fullBackupContent="@xml/backup_rules"
                android:icon="@mipmap/ic_launcher"
                android:label="@string/app_name"
                android:roundIcon="@mipmap/ic_launcher_round"
                android:supportsRtl="true"
                android:theme="@style/AppThemeLight"
                tools:replace="android:theme,android:allowBackup"
                tools:targetApi="31">
                <activity
                    android:name=".MainActivity"
                    android:exported="true">
                    <intent-filter>
                        <action android:name="android.intent.action.MAIN" />
        
                        <category android:name="android.intent.category.LAUNCHER" />
                    </intent-filter>
                </activity>
            </application>
        
        </manifest>
    ```

    </i>
<br>

## Dependencies
<hr>

* <b> Minimum SDK: 24</b>
* <b> Grade Version: 7.2.2</b>
* <b> Target SDK: 33</b>
* <b> Java Version: 1.8</b>

<br>

<br>

## Used Permissions
<hr>

* <b> android.permission.CAMERA</b>

<br>

## Usage
<hr>

* Firstly, you should create an activity.
* Import sdk and <b>"pap_DetectorActivity"</b> activity in the main activity.
* Define an intent to open sdk pages from main application.
* Put 3 parameters to intent as extra fields.
  a) <b>"calling_package"</b> (It should be the package name of main application)
  b) <b>"calling_class" </b> (It should be the activity class name of main application')
  c) <b>"from_main"</b> (It should be "true")

    <br>

  Then, you can start the activity using startActivity method.

    <br>

  <b>Sample</b>:


    <i>

    ```JAVA
        Intent intent = new Intent(MainActivity.this, pap_DetectorActivity.class);
        intent.putExtra("calling_package", this.getPackageName());
        intent.putExtra("calling_class", this.getClass().getName());
        intent.putExtra("from_main", "true");

        startActivity(intent);
    ```

    </i>

<br>

* <b><i>You can see an example project and "fingerPrintDetector.aar" folder in this sdk</i></b>

<br><br>


## Author
Papilon Savunma