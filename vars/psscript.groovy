def runPowerShellScript(String scriptName) {
    def scriptContents = libraryResource("Powershell/Scripts/${scriptName}")
    powershell(script: scriptContents)
}
