def call(Map config = [:]) { 
    def scriptcontents = libraryResource "Powershell/Scripts/hello.ps1"
    writeFile file: "${config.name}", text: scriptcontents
    bat "powershell -ExecutionPolicy ByPass -File C:\\Users\\devopsdemo123\\AppData\\Local\\Jenkins\\.jenkins\\workspace\\sharelibpipeline3\\first.ps1"
    powershell(script: "${config.name}")
}
