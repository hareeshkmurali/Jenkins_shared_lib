def call(Map config = [:]) { 
    def scriptcontents = libraryResource "Powershell/Scripts/folder.ps1"
    writeFile file: "${config.name}", text: scriptcontents
    powershell(script: "${config.name}" oldname: "${config.oldname}" newname: "${config.newname}")
}
