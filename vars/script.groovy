def call(Map<String, String> parameters) {
    def scriptContent = libraryResource('Powershell/Scripts/script.ps1')
    
    // Construct the PowerShell command
    def powershellCommand = "powershell -Command \"& { ${scriptContent} }\""
    
    // Construct the arguments for the PowerShell command
    def arguments = parameters.collect { oldanme, newname ->
        "-${oldname} '${newname}'"
    }.join(' ')
    
    // Execute the PowerShell command
    bat("${powershellCommand} ${arguments}")
}
