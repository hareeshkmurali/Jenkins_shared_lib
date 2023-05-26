def call(String oldName, String newName) {
    def scriptContent = libraryResource('Powershell/Scripts/script.ps1')
    
    // Construct the PowerShell command
    def powershellCommand = "powershell -Command \"& { ${scriptContent} }\""
    
    // Pass the parameters as arguments to the PowerShell command
    def arguments = "-oldName '${oldName}' -newName '${newName}'"
    
    // Execute the PowerShell command
    bat("${powershellCommand} ${arguments}}\"")
}
