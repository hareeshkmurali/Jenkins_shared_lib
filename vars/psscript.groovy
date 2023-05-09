def call() {
    def scriptcontents = libraryResource "Powershell/Scripts/hello.ps1"    
    writeFile file: 'Powershell/Scripts/hello.ps1', text: scriptcontents
    powershell(script: 'Powershell/Scripts/hello.ps1')
}
