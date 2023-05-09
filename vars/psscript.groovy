def call() {
    def scriptcontents = libraryResource "Powershell/Scripts/hello.ps1"    
    writeFile file: hello.ps1
    powershell(script: 'Powershell/Scripts/hello.ps1')
}
