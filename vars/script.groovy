def call(String argument1, String argument2) {
    def scriptContent = libraryResource('script.ps1')
    writeFile file: "new.ps1", text: scriptContent
    // Construct the PowerShell command with arguments
    def powershellCommand = "powershell -Command \"& { ${scriptContent} }\" -ArgumentList '${argument1}', '${argument2}'"
    
    // Execute the PowerShell command
    bat(powershellCommand)
}
