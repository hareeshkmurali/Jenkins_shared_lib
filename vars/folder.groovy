def call() { 
    def scriptcontents = libraryResource "Powershell/Scripts/folder.ps1"
    writeFile file: "sample.ps1", text: scriptcontents 
    powershell(script: "sample.ps1" )
}
