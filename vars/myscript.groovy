// myScript.groovy

def renameFile(Map scriptParams) {
    def oldName = scriptParams.OldName
    def newName = scriptParams.NewName

    if (oldName && newName) {
        // PowerShell script content
        def powerShellScript = """
            \$oldName = "${'$'}{oldName}"
            \$newName = "${'$'}{newName}"
            
            // Test-Path -Path \$oldName -NewName \$newName 
            // Rename-Item -Path \$oldName -NewName \$newName
            Get-ChildItem *.txt | Rename-Item -NewName { $_.Name -replace '.txt','.log' } 
        """

        // Execute the PowerShell script
        def result = powershell(returnStdout: true, script: powerShellScript)

        // Handle the script execution result if needed
        // ...
    } else {
        error("Invalid parameters. Please provide values for OldName and NewName.")
    }
}

return this
