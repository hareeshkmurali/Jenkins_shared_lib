def call(Map config = [:]) {
    def oldName = scriptParams.argument1
    def newName = scriptParams.argument2
    def scriptContent = libraryResource('Powershell/Scripts/script.ps1')
    writeFile file: "new.ps1", text: scriptContent
    // Construct the PowerShell command with arguments
    def powershellCommand = "powershell -Command \"& { ${scriptContent} }\" -ArgumentList '${oldName}', '${newName}'"
    
    // Execute the PowerShell command
    bat(powershellCommand)
}
