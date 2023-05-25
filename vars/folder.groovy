def call() { 
    def scriptcontents = libraryResource "Powershell/Scripts/folder.ps1"
    powershell(script: scriptcontents)
}
