def call(String oldname, String newname) { 
    def scriptcontents = libraryResource "Powershell/Scripts/folder.ps1"
    powershell(script: scriptcontents)
}
