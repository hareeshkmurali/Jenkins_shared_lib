def call(String oldName, String newName) {
    writeFile file: 'tempFile.ps1', text: "${libraryResource 'Powershell/Scripts/script.ps1'}"
    bat "powershell -ExecutionPolicy ByPass -File tempFile.ps1 $oldName $newName"
}
