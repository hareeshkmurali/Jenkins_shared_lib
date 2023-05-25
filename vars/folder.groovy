def call(Map config = [:]) { 
    def scriptcontents = libraryResource "Powershell/Scripts/folder.ps1"
    writeFile file: "sample.ps1", text: scriptcontents 
    powershell(script: "sample.ps1", args: "${config.oldname} ${config.newname}")
}
